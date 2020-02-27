package ast;

public class ExprChar extends Expr {
    public char value;
    public ExprChar(Position pos, char value) {
        this.pos = pos;
        this.value = value;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
