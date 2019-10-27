grammar Expr;

prog: stat+;

stat: expr NL | NL;

expr: INT | expr ('+'|'-'|'*'|'/') expr | '(' expr ')';





INT: DIGIT+;
DIGIT: [0-9];
NL:'\r'? '\n' ;
