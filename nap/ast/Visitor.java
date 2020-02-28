package ast;

public interface Visitor<T> {
    public T visit(ExpBinop expression);
    public T visit(ExpEqualityop expression);
    public T visit(ExpLogicalop expression);
    public T visit(ExpNegop expression);
    public T visit(ExpRelationop expression);
    public T visit(ExpInt number);
    public T visit(ExprIdentifier variable);
    public T visit(Print instruction);
    public T visit(Read instruction);
    public T visit(Assign instruction);
    public T visit(Program program);
}
