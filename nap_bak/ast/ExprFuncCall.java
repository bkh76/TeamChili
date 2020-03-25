package ast;

import java.util.*;

public class ExprFuncCall extends Expr {
    Position pos;
    String funcName;
    ArrayList<Expr> params;

    public ExprFuncCall(Position pos, String funcName, ArrayList<Expr> params) {
        this.pos = pos;
        this.funcName = funcName;
        this.params = params;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
