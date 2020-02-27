package ast;

public abstract class Expr extends Ast {
    public abstract <T> T accept(Visitor<T> visitor);
}
