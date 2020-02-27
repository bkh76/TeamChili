package ast;

public class ExprString extends Expr {
    public String value;
    public ExprString(Position pos, String value) {
        this.pos = pos;
        this.value = value;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
