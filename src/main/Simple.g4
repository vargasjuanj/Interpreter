parser grammar Simple;

options{
tokenVocab= VocabularyLexer;
language= Java;
}

@header {
import ast.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
}
@members {
	
		 List<ASTNode> body= new ArrayList();
	Map<String,Object> symbolTable= new HashMap<String,Object>();

	 
}

program returns [ASTNode node]:
 
	PROGRAM ID BRACKET_OPEN ( sentence {   
	try{
	$sentence.node.execute(symbolTable);
	}catch(Exception e){}

	

	} )* BRACKET_CLOSE
	
 	;

sentence returns [ASTNode node]:
  println {$node=$println.node;} 
  	|
   conditional 
   |
   var_decl {$node= $var_decl.node;}
   |
   var_assign {$node= $var_assign.node;}
 	;



println returns [ASTNode node]:
	PRINTLN expression {$node= new Println($expression.node);} SEMICOLON 
	;

conditional :
{
   Map<String,Object> conditionalSymbolTable= new HashMap<String,Object>();
	 List<ASTNode> conditionalBody= new ArrayList();

	 }
			 IF PAR_OPEN expression  PAR_CLOSE BRACKET_OPEN
			 { List<ASTNode> body = new ArrayList();}
			 (s1=sentence {body.add($s1.node);})*
			 BRACKET_CLOSE
			 ELSE BRACKET_OPEN
			 { List<ASTNode> elsebody = new ArrayList();}
			(s2=sentence {elsebody.add($s2.node);} )*
			 BRACKET_CLOSE
			{ASTNode node= new If($expression.node,body,elsebody);
			try{
			node.execute(conditionalSymbolTable);		
			}catch(Exception e){
				
			node.execute(symbolTable);
			}

			}

			
;

var_decl returns [ASTNode node]:
VAR ID SEMICOLON {$node= new VarDecl($ID.text);}
;


var_assign returns [ASTNode node]:
ID ASSIGN expression SEMICOLON {$node= new VarAssign($ID.text, $expression.node);}
;

expression returns [ASTNode node]:
	t1 = factor {$node=$t1.node;}
	(PLUS t2 = factor {$node=new Addition($node, $t2.node);})*
	;

factor returns [ASTNode node]:
	t1 = term  {$node=$t1.node;}
	(MULT t2 = term {$node=new Multiplication($node, $t2.node);})*
	;
term returns [ASTNode node]:
    NUMBER {$node= new Constant(Integer.parseInt($NUMBER.text));}
	|
	PAR_OPEN expression PAR_CLOSE {$node=$expression.node;} 
    |
	BOOLEAN {$node= new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	|
	ID {$node = new VarRef($ID.text);}
	|
	NUMBER {$node= new Constant(Integer.parseInt($NUMBER.text));}
	 (POW n=NUMBER {
		 ASTNode node2= new Constant(Integer.parseInt($n.text));
		 
	 $node= new Power($node,node2);}
	  )*

	  |
	  ID {$node = new VarRef($ID.text);}
	 (POW n=ID {
		 ASTNode node2= new VarRef($n.text);
		 
	 $node= new Power($node,node2);}
	  )*

    ;



