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

statement : (
          pointStmt
          | lineStmt
          | circleStmt
          | functionCall
          | assignStmt
          ) ';'
          ;

assignStmt: ID '=' expr ;

pointStmt : 'point' ID '=' '(' x=expr ',' y=expr ')' ;

lineStmt : 'line' ID '=' 'from' '(' e1=expr ',' e2=expr ')' 'to' '(' e3=expr ',' e4=expr ')' |
           'line' ID '=' 'from' '(' p1=ID ')' 'to' '(' p2=ID ')' ;

circleStmt : 'circle' ID '=' 'center' '(' e1=expr ',' e2=expr ')' 'radius' '=' r=expr |
             'circle' ID '=' 'center' '(' p=ID ')' 'radius' '=' r=expr ;

functionCall : ID '(' args ')' ;

args : (expr (',' expr)*)? ;

expr : NUMBER
     | ID
     | functionCall // Allow nested function calls
     ;