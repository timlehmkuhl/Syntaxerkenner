grammar Exprit;

prog : stat | prog stat;

stat : expr NL | NL;

expr : term (('+'|'–') term)*| term;

term : fact (('*'|'/') fact)* | fact;

fact : '+' fact | '-' fact | '(' expr ')' | INT;

INT: DIGIT+;
DIGIT: [0-9];
NL:'\r'? '\n' ;
