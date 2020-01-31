grammar Simple; //Encabezado. PUede llevar otras configuraciones.


//             PARSER -> Usa la gramática libre de contexto

start
:
HELLO WORLD
;

//              LEXER -> Usa la gramática Regular
/*El Lexer solo se limita a identificar los tokens, no verifica si el orden es correcto, eso lo hace el parser */
//Los Tokens se deben definir de una cadena especifica a cadenas generales, el orden es importante. Si pusiera el program al final y el ID al principio no identificaria program como palabra clave.
//T-> {Identificador:Estructura(Exp. Reg)}
//Tokens de palabras reservadas 
PROGRAM:'program';
VAR:'var';
PRINTLN:'println';

//O. Aritméticos
PLUS:'+';
MIN:'-';
MULT:'*';
DIV:'/';
//Agregar el operador módulo

//O. Lógicos
AND:'&&';
OR:'||';
NOT:'|';

//O. Comparación
GT:'>';
LT:'<';
GEQ:'>=';
LEQ:'<=';
EQ:'==';
NEQ:'!=';

//Asignación
ASSIGN:'=';

//LLaves
BRACKET_OPEN:'{';
BRACKET_CLOSE:'}';

//Parentesis
PAR_OPEN:'(';
PAR_CLOSE:')';

//Signos de puntuación
SEMICOLON:';';

//Identificadores (nombre del programa, clases, variables, funciones) 
//Variables
ID:[a-zA-Z_][a-zA-Z0-9_]*; //El primer carácter puede ser una letra o guion, lo que le sigue puede ser cero o más letras, números o guion

//Constantes
NUMBER:[0-9]+; //Un número entero es uno o más digitos

//Identificar espacios en blanco, tabuladores, saltos de lineas
//Estos caracteres no tienen ninbún significado y sirven solo para separar los tokens, por eso el interprete debe ignorar
WS:[ \t\n\r]+ -> skip; //El flujo de tokens generado por el analizador léxico va a excluir estos






