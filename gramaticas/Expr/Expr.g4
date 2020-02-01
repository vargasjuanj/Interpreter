grammar Expr;
s : e;
e: e MUL e  #mult
 | e ADD e  #Add 
 | INT		#Int
 ;

MUL:'*';
ADD:'+';
INT: [0-9]+;
WS:	[ \t\n\r]+ -> skip;