package ast;

public class ExprInt extends Expr {
    public int value;
    public ExprInt(Position pos, int value) {
        this.pos = pos;
        this.value = value;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
