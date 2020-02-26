package ast;

public class Assign extends Instruction {
    public String var;
    public Expression exp;
    public Assign(Position pos,String var, Expression exp) {
        this.pos = pos;
        this.var = var;
        this.exp = exp;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
