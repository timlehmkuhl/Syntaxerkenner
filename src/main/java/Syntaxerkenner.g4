grammar Syntaxerkenner;

prog: stat | prog stat;

stat: expr NEWLINE | NEWLINE;

expr:  term | expr ('+'|'-') term;

term: fact | term ('*'|'/') fact;

fact: INT | '(' expr ')';


INT: DIGIT+;
DIGIT: [0-9];
NEWLINE:'\r'? '\n' ;