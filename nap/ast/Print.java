package ast;

public class Print extends Instruction {
    public Type type;
    public Expr expr;
    public Print(Position pos, Type type, Expr expr) {
        this.pos = pos;
        this.type = type;
        this.expr = expr;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
