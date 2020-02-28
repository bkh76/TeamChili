package ast;

public class ExprFuncCall extends Expr {
    Position pos;
    String funcName;
    List<Expr> params;

    public ExprFuncCall(Position pos, String funcName, List<Expr> params) {
        this.pos = pos;
        this.funcName = funcName;
        this.params = params;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
