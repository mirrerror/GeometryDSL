grammar GeometryDSL;

// Define tokens
EQUALS   : '=' ;
COMMA    : ',' ;
LPAREN   : '(' ;
RPAREN   : ')' ;
SEMI     : ';' ;
FROM     : 'from' ;
TO       : 'to' ;
CENTER   : 'center' ;
RADIUS   : 'radius' ;
FUNCTION : 'function' ;

ID       : [a-zA-Z-] [a-zA-Z0-9-]* ;
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

lineStmt : 'line' ID '=' 'from' '(' x1=NUMBER ',' y1=NUMBER ')' 'to' '(' x2=NUMBER ',' y2=NUMBER ')' ';' |
           'line' ID '=' 'from' '(' p1=ID ')' 'to' '(' p2=ID ')' ';' ;

circleStmt : 'circle' ID '=' 'center' '(' x=NUMBER ',' y=NUMBER ')' 'radius' '=' r=NUMBER ';' |
             'circle' ID '=' 'center' '(' p=ID ')' 'radius' '=' r=NUMBER ';' ;

functionCall : ID '(' args ')' ';' ;

args : (expr (',' expr)*)? ;

expr : NUMBER
     | ID
     | functionCall // Allow nested function calls
     ;