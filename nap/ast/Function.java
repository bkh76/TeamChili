package ast;

public abstract class Function extends Ast {
    public abstract <T> T accept(Visitor<T> visitor);
}
