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
          | functionCall
          ;

pointStmt : 'point' ID '=' '(' x=NUMBER ',' y=NUMBER ')' ';' ;

lineStmt : 'line' ID '=' 'from' '(' x1=NUMBER ',' y1=NUMBER ')' 'to' '(' x2=NUMBER ',' y2=NUMBER ')' ';' ;

circleStmt : 'circle' ID '=' 'center' '(' x=NUMBER ',' y=NUMBER ')' 'radius' '=' r=NUMBER ';' ;

functionCall : ID '(' args ')' ';' ;

args : (expr (',' expr)*)? ;

expr : NUMBER
     | ID
     | functionCall // Allow nested function calls
     ;

// Define predefined functions
distance : 'distance' '(' x1=NUMBER ',' y1=NUMBER ',' x2=NUMBER ',' y2=NUMBER ')' ;

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

// New lexer rule for function keyword
FUNCTION : 'function' ;
