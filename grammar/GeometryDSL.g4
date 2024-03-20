grammar GeometryDSL;

// Define tokens
EQUALS      : '=' ;
COMMA       : ',' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
SEMI        : ';' ;
FROM        : 'from' ;
TO          : 'to' ;
CENTER      : 'center' ;
RADIUS      : 'radius' ;
FUNCTION    : 'function' ;
FOR         : 'for' ;
WHILE       : 'while' ;
PLUS        : '+' ;
MINUS       : '-' ;
MULTIPLY    : '*' ;
DIVIDE      : '/' ;
GREATER     : '>' ;
LESS        : '<' ;
EQUAL       : '==' ;
GREATER_EQ  : '>=' ;
LESS_EQ     : '<=' ;

ID          : [a-zA-Z-] [a-zA-Z0-9-]* ;
NUMBER      : [0-9]+ ('.' [0-9]+)? ;
WS          : [ \t\r\n]+ -> skip ;

// Define parser rules
geometry     : statement+ ;

statement    : singleStatement
             | blockStatement
             ;

singleStatement   : (pointStmt
             | lineStmt
             | circleStmt
             | functionCall
             | assignStmt
             | forLoop
             | whileLoop
             | expr)
             ';'
             ;

blockStatement    : LBRACE statement* RBRACE ;

assignStmt   : ID EQUALS expr ;

pointStmt    : 'point' ID EQUALS LPAREN x=expr COMMA y=expr RPAREN ;

lineStmt     : 'line' ID EQUALS 'from' LPAREN e1=expr COMMA e2=expr RPAREN 'to' LPAREN e3=expr COMMA e4=expr RPAREN |
               'line' ID EQUALS 'from' LPAREN p1=ID RPAREN 'to' LPAREN p2=ID RPAREN ;

circleStmt   : 'circle' ID EQUALS 'center' LPAREN e1=expr COMMA e2=expr RPAREN 'radius' EQUALS r=expr |
               'circle' ID EQUALS 'center' LPAREN p=ID RPAREN 'radius' EQUALS r=expr ;

functionCall : ID LPAREN args RPAREN ;

args         : (expr (COMMA expr)*)? ;

expr         : NUMBER
             | ID
             | functionCall
             | expr (PLUS | MINUS | MULTIPLY | DIVIDE) expr
             | expr (GREATER | LESS | EQUAL | GREATER_EQ | LESS_EQ) expr
             ;

forLoop      : 'for' LPAREN init=assignStmt SEMI condition=expr SEMI update=assignStmt RPAREN statement ;

whileLoop    : 'while' LPAREN condition=expr RPAREN statement ;
