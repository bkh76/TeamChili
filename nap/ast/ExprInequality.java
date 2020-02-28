package ast;

public class ExprInequality extends Expr {
    public Expr left;
    public Expr right;
    public Inequality op;
    public ExprInequality(Position pos, Expr left,
		                  Inequality op, Expr right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }
    
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
