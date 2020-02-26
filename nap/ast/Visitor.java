package ast;

public interface Visitor<T> {
    public T visit(ExpBinop expression);
    public T visit(ExpInt number);
    public T visit(ExpVar variable);
    public T visit(Write instruction);
    public T visit(Assign instruction);
    public T visit(Program program);
}
