lexer grammar VocabularyLexer;
import FragmentLexer;

@header{ 
 package main; 
 }

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';
IF:'if';
ELSE:'else';

PLUS: '+';
MIN: '-';
MULT: '*';
DIV: '/';
POW:'**';

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

ID: GUION? LETRA| LETRA (LETRA|NUMBER|GUION)*;



NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;
