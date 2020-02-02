grammar Testear;

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
t1 = factor_o_division {$value=(int)$t1.value;} 
(
(PLUS t2 = factor_o_division {$value=(int)$value+(int)$t2.value;})
|
(MULT t2 = factor_o_division {$value=(int)$value+(int)$t2.value;})
|
(DIV t2 = factor_o_division {$value=(int)$value+(int)$t2.value;})
)*
;

factor_o_division returns[Object value]:

 t1 = term {$value=(int)$t1.value; } 

   ( MULT t2 = term {$value=(int)$value*(int)$t2.value;}
   |
     DIV t2 = term {$value=(int)$value/(int)$t2.value;})*


 ;







term returns[Object value]:
    NUMBER {$value=Integer.parseInt( $NUMBER.text) ;}
	| 
	ID {$value=symbolTable.get($ID.text);}
    ;

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

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

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;



