grammar Test2;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser::members { 
Map<String,Object> symbolTable = new HashMap<String,Object>();
 }

program: PROGRAM ID BRACKET_OPEN sentencias* BRACKET_CLOSE;

sentencias: var_decl | var_assign | println;

var_decl: VAR ID SEMICOLON 
{symbolTable.put($ID.text,0);}
;

var_assign: ID ASSIGN expresion SEMICOLON
{symbolTable.put($ID.text, $expresion.value);}
 ;

println: PRINTLN expresion SEMICOLON 
{System.out.println($expresion.value);}
;

expresion 	returns[Object value]:
t1 = potencia {$value=(int)$t1.value;} 
{System.out.println("aca 1");}


  ( 
  MULT t2 = potencia 
  {$value=(int)$value*(int)$t2.value;} 
  )*

  (
    (
        PLUS t3 = factor_o_division {$value=(int)$value+(int)$t3.value;}
        {System.out.println("aca 2");}
        |
        PLUS t4 = potencia {$value=(int)$value+(int)$t3.value;}
     {System.out.println("aca 3");}
    )
  
    |
    MIN t3 = factor_o_division {$value=(int)$value-(int)$t3.value;} 
  )+


;
potencia returns[Object value]:

 t1 = term {$value=(int)$t1.value; } 

   ( POWER t2 = term {
       for(int i=1; i<(int)$t2.value; i++){
           $value=(int)$value*(int)$t1.value;
        }
        $t1.value=$value;
   })*

 ;

factor_o_division returns[Object value]:

   (
	    MULT t2 = term {$value=(int)$value*(int)$t2.value;}
   |
    DIV t2 = term {$value=(int)$value/(int)$t2.value;}
														)*

|
 t1 = term {$value=(int)$t1.value; } 

   ( MULT t2 = term {$value=(int)$value*(int)$t2.value;}
   |
     DIV t2 = term {$value=(int)$value/(int)$t2.value;})*


 ;







term returns[Object value]:
MIN NUMBER {$value=-Integer.parseInt( $NUMBER.text) ;}
|
    NUMBER {$value=Integer.parseInt( $NUMBER.text) ;}
	| 
	ID {$value=symbolTable.get($ID.text);}
	|
	PAR_OPEN expresion {$value=$expresion.value;} PAR_CLOSE
    ;

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

PLUS: '+';
MIN: '-';
MULT: '*';
DIV: '/';
POWER: '**';

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

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;



