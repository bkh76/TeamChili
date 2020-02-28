grammar nap;

program : (function_definition)* EOF;

block : '{' (instruction)* '}';

function_definition : 'func' Identifier '(' (arg_list',')*(arg_list)? ')' ('->' typeIdentifier)? block #FunctionDeclaration;

arg_list : ('ref' typeIdentifier Identifier | typeIdentifier Identifier | 'array<' typeIdentifier '>' Identifier) #Argument;

instruction : 'var' (typeIdentifier Identifier | 'array<' typeIdentifier '>') ('=' expr)? #Assignment
           | Identifier '=' instruction #Assign
           | expr  ('[' expr ']')+ '=' expr #ArrayAssignment
           | Identifier op=('*=' | '/=') expr  #MulEqDivEq
           | Identifier op=('++' | '--') expr  #IncDec
           | Identifier op=('+=' | '-=') expr  #IncEqDecEq
           | ('var') ('array<' typeIdentifier '>')? Identifier '=' 'new (' typeIdentifier ',' Constant ')' #NewInline
           | 'read' '(' typeIdentifier ',' Identifier ')' #Read
           | 'print' '(' typeIdentifier ',' expr ')' #Print
           | 'new' '(' typeIdentifier ',' expr ')' #New
           | '->' expr #Return
           | conditional #CondExpr
           | Identifier '=' Identifier '(' (expr',')*(expr)? ')' #AssignmentFunctionCall
           | expr #InstructionToExpr
           ;

expr :      expr op=('*'|'/') expr #MulDiv
          | expr op=('+'|'-') expr #AddSub
          | expr op=('<='|'>='|'>'|'<') expr #Inequality
          | expr op=('==' | '!=') expr #Equality
          | expr op=('&&' | '||' | '!') expr #Logical
          | op=('-'|'!') expr #Negation
          | expr 'mod' expr #Mod
          | expr  ('[' expr ']')+ #ArrayAccess
          | Identifier '(' (expr',')*(expr)? ')' #FunctionCall
          | Identifier #Identifier
          | Constant #Constant
          | CharacterConstant #CharacterConstant
          | BooleanConstant #BooleanConstant
          | StringConstant #StringConstant
          | '{' (expr',')*(expr)? '}' #ConstantArray
          | '(' expr ')' #Parenthesis
          ;

conditional : 'while' '(' expr ')' block #WhileLoop
           | 'do' block 'while' '(' expr ')' #DoWhileLoop
           | 'for' '(' typeIdentifier Identifier 'in' instruction ')' block #ForLoop
           | 'if' '(' instruction ')' block #IfCond
           | 'else if' '(' expr ')' block #ElseIfCond
           | 'else' block #ElseCond
           ;

Identifier : [a-zA-Z_] [a-zA-Z0-9_]*;

typeIdentifier : 'char' #Char
               | 'byte' #Byte
               | 'int' #Int
               | 'bool' #Bool
               | 'array<' typeIdentifier '>' #Array
               ;

Constant : [0-9]+;

BooleanConstant : 'T' | 'F';

CharacterConstant : '\'' ('\\')?[a-zA-Z0-9_!?@#$%^&*\-=+,.<>\\/~`;"':()[\]{} ] '\''; 

StringConstant : '"' [a-zA-Z0-9_!?@#$%^&*\-=+,.<>\\/~`;"':()[\]{} ]* '"';

Comment : '//' -> skip;

WS : [ \t\r\n;]+ -> skip;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';
LOR: '||';
LAND: '&&';
LNOT: '!';
EQ: '==';
NEQ: '!=';
