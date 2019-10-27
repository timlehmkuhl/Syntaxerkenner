grammar Syntaxerkenner;

prog: stat | prog stat;

stat: expr NEWLINE | NEWLINE;

expr: expr ('*'|'/') expr | expr ('+'|'-') expr | INT | '(' expr ')';




INT: DIGIT+;
DIGIT: [0-9];
NEWLINE:'\r'? '\n' ;