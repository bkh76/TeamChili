package ast;

public class Return extends Instruction {
    public Expr expr;
    public Return(Position pos, Expr expr) {
        this.pos = pos;
        this.expr = expr;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
