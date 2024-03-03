grammar GeometryDSL;

// Define tokens
ID       : [a-zA-Z_\-] [a-zA-Z0-9_-]* ;
NUMBER   : [0-9]+ ('.' [0-9]+)? ;
WS       : [ \t\r\n]+ -> skip ;

// Define parser rules
geometry : statement+ ;

statement : pointStmt
          | lineStmt
          | circleStmt
          ;

pointStmt : 'point' ID '=' '(' x=NUMBER ',' y=NUMBER ')' ';' ;

lineStmt : 'line' ID '=' 'from' '(' x1=NUMBER ',' y1=NUMBER ')' 'to' '(' x2=NUMBER ',' y2=NUMBER ')' ';' ;

circleStmt : 'circle' ID '=' 'center' '(' x=NUMBER ',' y=NUMBER ')' 'radius' '=' r=NUMBER ';' ;

// Define lexer rules for operators
EQUALS   : '=' ;
COMMA    : ',' ;
LPAREN   : '(' ;
RPAREN   : ')' ;
SEMI     : ';' ;
FROM     : 'from' ;
TO       : 'to' ;
CENTER   : 'center' ;
RADIUS   : 'radius' ;