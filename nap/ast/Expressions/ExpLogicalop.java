package ast;

public class ExpLogicalop extends Expr {
    public Expression left;
    public Expression right;
    public Logicalop op;
    public ExpBinop(Position pos, Expression left,
		    Logicalop op, Expression right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }
    
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
