grammar Simple; //Encabezado. PUede llevar otras configuraciones.

// Analizador Sitactico ->   PARSER   -> Usa la gramática libre de contexto. Al flujo de tokens lo convierte en un Parser tree o árbol de sintaxis concreta, donde cada hoja representa un tokens. Este árbol está ordenado jerarquicamente.
/*
 La gramatica libre de contexto tiene 3 elementos escenciales:
 Simbolos no terminales -> (en
 minuscula) Elementos dentro del programa que se componen de otras partes más pequeñas.
 Simbolos
 terminales -> (mayúsculas) Elementos de un programa que no tiene sentido dividirlo en partes más
 pequeñas ya que perdería su significado.
 Producción -> Es una relación entre un simbolo no
 terminal y una secuencia de simbolos terminales o no terminales de los cuales se compone.
 Ejemplo:
 start: HELLO WORLD; -> Este simbolo no terminal es una producción porque se compone de un
 simbolo no terminal y otro simbolo tambien no terminal.
 */

//El primer símbolo no terminal debe especificar la estructura completa del programa, también llamado símbolo de inicio
/* Para cada simbolo no terminal de la gramatica libre de contexto antlr genera un método dentro de la clase que implementa el analizador sintactico,

Cada vez que cambiemos el simbolo inicial de nuestra gramatica cambiamos el main.

 */
program:
	PROGRAM ID BRACKET_OPEN sentencias* BRACKET_CLOSE;
	//sentencias* (con simbolo de clausura) es un simbolo no terminal, el cual es una producción que se expande
sentencias:
	var_decl
	| var_assign
	| println;
	//Definición de la producción para sentencia. En este caso de 3 tipos, declaracion, asignación o impresión por pantalla, para refelejar esta producción usamos el operador union "|" 
var_decl: VAR ID SEMICOLON; //Definición de producción.
var_assign: ID ASSIGN NUMBER SEMICOLON;
println: PRINTLN expresion SEMICOLON
{System.out.println("Imprimiendo por pantalla");}; //Acordarse de ponerle el punto y coma a la sentencia, si no salta error en el SimpleLexer
expresion: NUMBER | ID;
/*  SEMANTICA
Grámatica de atributo es escencialmente libre de contexto.
Libre de contexto con informacion adicional:
1-Podemos agregarle atributo a cada simbolo terminal o no terminal,
2- O agregarle codigo ejecutable para manipular dichos atributos.


 */
// Analizador Léxico ->   LEXER   ->  Usa la gramática Regular. Genera un flujo de Tokens (tokens stream) que se los pasa al parser
/*El Lexer solo se limita a identificar los tokens, no verifica si el orden es correcto, eso lo hace el parser */
//Los Tokens se deben definir de una cadena especifica a cadenas generales, el orden es importante.
// Si pusiera el program al final y el ID al principio no identificaria program como palabra clave.
// T-> {Identificador:Estructura(Exp. Reg)} Tokens de palabras reservadas
PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

//O. Aritméticos
PLUS: '+';
MIN: '-';
MULT: '*';
DIV: '/';
//Agregar el operador módulo

//O. Lógicos
AND: '&&';
OR: '||';
NOT: '|';

//O. Comparación
GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

//Asignación
ASSIGN: '=';

//LLaves
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

//Parentesis
PAR_OPEN: '(';
PAR_CLOSE: ')';

//Signos de puntuación
SEMICOLON: ';';

//Identificadores (nombre del programa, clases, variables, funciones) Variables
ID:
	[a-zA-Z_][a-zA-Z0-9_]*;
	//El primer carácter puede ser una letra o guion, lo que le sigue puede ser cero o más letras, números o guion

//Constantes
NUMBER: [0-9]+; //Un número entero es uno o más digitos

//Identificar espacios en blanco, tabuladores, saltos de lineas Estos caracteres no tienen ninbún
// significado y sirven solo para separar los tokens, por eso el interprete debe ignorar
WS:
	[ \t\n\r]+ -> skip; //El flujo de tokens generado por el analizador léxico va a excluir estos

