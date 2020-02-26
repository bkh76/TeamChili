grammar nap;

program : (function_definition)* EOF;

block : '{' (instruction)* '}';

function_definition : 'func' Identifier '(' (arg_list',')*(arg_list)? ')' ('->' typeIdentifier)? block #FunctionDeclaration;

arg_list : ('ref' typeIdentifier Identifier | typeIdentifier Identifier | 'array<' typeIdentifier '>' Identifier) #Argument;

instruction : 'var' (typeIdentifier Identifier | 'array<' typeIdentifier '>') ('=' instruction)? #Assignment
           | Identifier '=' instruction #ReAssignment
           | Identifier ('[' expr ']')+ ('=' instruction)? #ArrayAssignment
           | Identifier op=('*=' | '/=') instruction  #MulEqDivEq
           | Identifier op=('++' | '--') instruction  #IncDec
           | Identifier op=('+=' | '-=') instruction  #IncEqDecEq
           | ('var') ('array<' typeIdentifier '>') Identifier '=' 'new (' typeIdentifier ',' Constant ')' #NewOp
           | 'read' '(' typeIdentifier ',' Identifier ')' #Read
           | 'print' '(' typeIdentifier ',' instruction ')' #Print
           | 'new' '(' typeIdentifier ',' instruction ')' #ConstNew
           | conditional #CondExpr
           | Identifier '(' (instruction',')*(instruction)? ')' #FunctionCall
           | Identifier '=' Identifier '(' (instruction',')*(instruction)? ')' #AssignmentFunctionCall
           | expr #InstructionToExpr
           ;

expr :  expr op=('*'|'/') instruction #MulDiv
          | expr op=('+'|'-') instruction #AddSub
          | expr op=('<'|'>') instruction #GtLt
          | expr op=('<='|'>=') instruction #GteqLteq
          | expr op=('==' | '!=') instruction #EqualNotEq
          | expr 'mod' instruction #Mod
          | expr op=('||' | '&&' | '!') instruction #LOrLAndLNot
          | '-' instruction #Negation
          | '!' instruction #LNegation
          | 'mod' instruction #ConstMod
          | Identifier #Identifier
          | Constant #Constant
          | CharacterConstant #CharacterConstant
          | BooleanConstant #BooleanConstant
          | StringConstant #StringConstant
          | '(' instruction ')' #Parenthesis
          |	'{' (instruction',')*(instruction)? '}' #ConstantArray
          | '->' instruction #Return
          ;

conditional : 'while' '(' instruction ')' block #WhileLoop
           | 'do' block 'while' '(' expr ')' #DoWhileLoop
           | 'for' '(' typeIdentifier Identifier 'in' instruction ')' block #ForLoop
           | 'if' '(' instruction ')' block #IfCond
           | 'else if' '(' instruction ')' block #ElseIfCond
           | 'else' block #ElseBlock
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

WS: [ \t\r\n;]+ -> skip;
