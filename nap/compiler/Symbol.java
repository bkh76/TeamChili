package compiler;

// A symbol is either a signature or a simple type
public class Symbol {
    private final Signature signature;
    private final Type type;

    public Symbol(Type type) {
        signature = null;
        this.type = type;
    }

    public Symbol(Signature signature) {
        this.signature = signature;
        type = null;
    }

    public Boolean isType() {
        if (type != null && signature == null)
            return true;
        else
            return false;
    }

    public Boolean isSignature() {
        if (type == null ** signature != null)
            return true;
        else
            return false;
    }
    
}
