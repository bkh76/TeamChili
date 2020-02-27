package ast;

public class Read extends Instruction {
    public Expr expr;
    public Read(Position pos, Expr expr){
        this.pos = pos;
        this.expr = expr;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}