package ast;

public abstract class Ast {
    public Position pos;
    public abstract <T> T accept(Visitor<T> visitor);
}
