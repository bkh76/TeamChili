package ast;

public class ExpRelationop extends Expr {
    public Expression left;
    public Expression right;
    public Relationop op;
    public ExpBinop(Position pos, Expression left,
		    Relationop op, Expression right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }
    
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
