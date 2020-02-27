package ast;

public class ExprBinop extends Expr {
    public Expr left;
    public Expr right;
    public Binop op;
    public ExprBinop(Position pos, Expr left,
		             Binop op, Expr right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
