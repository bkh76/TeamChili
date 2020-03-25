package ast;

public class ExprBoolean extends Expr {
    public Boolean value;
    public ExprBoolean(Position pos, Boolean value) {
        this.pos = pos;
        this.value = value;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
