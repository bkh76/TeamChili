package ast;

public interface Visitor<T> {
    //expressions
    public T visit(ExprArray expression);
    public T visit(ExprArrayInit expression);
    public T visit(ExprBinop expression);
    public T visit(ExprBoolean expression);
    public T visit(ExprChar expression);
    public T visit(ExprEquality expression);
    public T visit(ExprIdentifier variable);
    public T visit(ExprInequality expression);
    public T visit(ExprInt number);
    public T visit(ExprLogical expression);
    public T visit(ExprNegation expression);
    public T visit(ExprString expression);
    
    //instructions
    public T visit(Assign instruction);
    public T visit(Conditional instruction);
    public T visit(ElseCond instruction);
    public T visit(ElseIfCond instruction);
    public T visit(IfCond instruction);
    public T visit(New instruction);
    public T visit(Print instruction);
    public T visit(Read instruction);
    public T visit(Return instruction);
    public T visit(WhileCond instruction);
        
    //program
    public T visit(Program program);
}
