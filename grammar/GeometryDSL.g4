grammar GeometryDSL;

// Tokens
EQUALS      : '=' ;
COMMA       : ',' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
SEMI        : ';' ;
POINT       : 'point' ;
LINE        : 'line' ;
CIRCLE      : 'circle' ;
TRIANGLE    : 'triangle' ;
RECTANGLE   : 'rectangle' ;
FROM        : 'from' ;
TO          : 'to' ;
CENTER      : 'center' ;
RADIUS      : 'radius' ;
FUNCTION    : 'function' ;
FOR         : 'for' ;
WHILE       : 'while' ;
IF          : 'if' ;
ELSE        : 'else' ;
PLUS        : '+' ;
MINUS       : '-' ;
MULTIPLY    : '*' ;
DIVIDE      : '/' ;
GREATER     : '>' ;
LESS        : '<' ;
EQUAL       : '==' ;
NOT_EQUAL   : '!=' ;
GREATER_EQ  : '>=' ;
LESS_EQ     : '<=' ;

ID          : [a-zA-Z-] [a-zA-Z0-9-]* ;
NUMBER      : [0-9]+ ('.' [0-9]+)? ;
WS          : [ \t\r\n]+ -> skip ;

// Parser rules
geometry     : statement+ ;

statement    : singleStatement
             | blockStatement
             | forLoop
             | whileLoop
             | ifStmt
             ;

singleStatement   : (pointStmt
             | lineStmt
             | circleStmt
             | triangleStmt
             | rectangleStmt
             | functionCall
             | assignStmt
             | expr)
             SEMI
             ;

blockStatement    : LBRACE statement* RBRACE ;

assignStmt   : ID EQUALS expr ;

pointStmt    : POINT ID EQUALS LPAREN x=expr COMMA y=expr RPAREN ;

lineStmt     : LINE ID EQUALS FROM LPAREN e1=expr COMMA e2=expr RPAREN TO LPAREN e3=expr COMMA e4=expr RPAREN |
               LINE ID EQUALS FROM LPAREN p1=ID RPAREN TO LPAREN p2=ID RPAREN ;

circleStmt   : CIRCLE ID EQUALS CENTER LPAREN e1=expr COMMA e2=expr RPAREN RADIUS EQUALS r=expr |
               CIRCLE ID EQUALS CENTER LPAREN p=ID RPAREN RADIUS EQUALS r=expr ;

triangleStmt : TRIANGLE ID EQUALS LPAREN e1=expr COMMA e2=expr COMMA e3=expr COMMA e4=expr COMMA e5=expr COMMA e6=expr RPAREN |
               TRIANGLE ID EQUALS LPAREN p1=ID COMMA p2=ID COMMA p3=ID RPAREN ;

rectangleStmt: RECTANGLE ID EQUALS LPAREN e1=expr COMMA e2=expr COMMA e3=expr COMMA e4=expr RPAREN |
               RECTANGLE ID EQUALS LPAREN p=ID COMMA e1=expr COMMA e2=expr RPAREN ;

functionCall : ID LPAREN args RPAREN ;

args         : (expr (COMMA expr)*)? ;

expr         : NUMBER
             | ID
             | functionCall
             | expr (PLUS | MINUS | MULTIPLY | DIVIDE) expr
             ;

booleanExpr  : expr (GREATER | LESS | EQUAL | NOT_EQUAL | GREATER_EQ | LESS_EQ) expr ;

forLoop      : FOR LPAREN init=assignStmt SEMI condition=booleanExpr SEMI update=assignStmt RPAREN statement ;

whileLoop    : WHILE LPAREN condition=booleanExpr RPAREN statement ;

ifStmt       : IF LPAREN condition=booleanExpr RPAREN statement (ELSE statement)? ;
