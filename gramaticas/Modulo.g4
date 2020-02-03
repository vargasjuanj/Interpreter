grammar Modulo;

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
(
	MIN t1 = potencia {$value=-(int)$t1.value;} 
	|
t1 = potencia {$value=(int)$t1.value;} 

)

(
POWER t = term {
    $value=(int) Math.pow((int)$value,(int)$t.value); 

    }
    (
    MULT t = term {$value=(int)$value*(int)$t.value;}
    |
  DIV t = term {$value=(int)$value/(int)$t.value;}

    )*

    |
    MOD t0 = suma_o_resta {$value=(int)$value%(int)$t0.value;}
    |
   MOD MIN t0 = suma_o_resta {$value=(int)$value%-(int)$t0.value;}

    |
MIN PLUS t2 = factor_o_division {$value=(int)$value-(int)$t2.value;}

|
PLUS MIN t2 = factor_o_division {$value=(int)$value-(int)$t2.value;}
|
PLUS t2 = factor_o_division {$value=(int)$value+(int)$t2.value;}
|
MIN t2 = factor_o_division {$value=(int)$value-(int)$t2.value;}

|
MULT t3 = potencia {$value=(int)$value*(int)$t3.value;}
|
DIV t3 = potencia {$value=(int)$value/(int)$t3.value;}
)*

;

potencia returns[Object value]:

 t1 = term{$value=(int)$t1.value; } 

   (
       
       POWER      
        (MIN t2 = term 
{ $value=-(int)Math.pow((int)$value,(int)$t2.value);}
        |
     t2 = term 
{ $value=(int)Math.pow((int)$value,(int)$t2.value);})


   )*
   
   
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


suma_o_resta returns[Object value]:
t1 = term {$value=(int)$t1.value; } 

   ( PLUS t2 = term {$value=(int)$value+(int)$t2.value;}
   |
     MIN t2 = term {$value=(int)$value-(int)$t2.value;})*

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
MOD:'%';

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



