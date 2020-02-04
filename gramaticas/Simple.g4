grammar Simple;
@parser::header {
import ast.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
}
@parser::members {
}

program returns [ASTNode node]:
 	{
		 List<ASTNode> body= new ArrayList();
	 	Map<String,Object> symbolTable= new HashMap<String,Object>();
	 }
	PROGRAM ID BRACKET_OPEN ( sentence {body.add($sentence.node);} )* BRACKET_CLOSE
	{for (ASTNode n : body){
		n.execute(symbolTable);
	}}
 	;

sentence returns [ASTNode node]:
  println {$node=$println.node;} 
  	|
   conditional {$node=$conditional.node;}
   |
   var_decl {$node= $var_decl.node;}
   |
   var_assign {$node= $var_assign.node;}
 	;



println returns [ASTNode node]:
	PRINTLN expression {$node= new Println($expression.node);} SEMICOLON 
	;

conditional returns [ASTNode node]:
			 IF PAR_OPEN expression  PAR_CLOSE BRACKET_OPEN
			 { List<ASTNode> body = new ArrayList();}
			 (s1=sentence {body.add($s1.node);})*
			 BRACKET_CLOSE
			 ELSE BRACKET_OPEN
			 { List<ASTNode> elsebody = new ArrayList();}
			(s2=sentence {elsebody.add($s2.node);})*
			 BRACKET_CLOSE
			{$node= new If($expression.node,body,elsebody);}
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
    ;


PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';
IF:'if';
ELSE:'else';

PLUS: '+';
MIN: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '|';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

BOOLEAN: 'true' | 'false';

ID: [a-zA-Z_][a-zA-Z0-9_]*;



NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;

