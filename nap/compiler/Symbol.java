package compiler;

// A symbol is either a signature or a simple type
public class Symbol {
    public final Signature signature;
    public final Type type;
    public final String binding;

    public Symbol() {
        binding = null;
        signature = null;
        type = null;
    }
    
    public Symbol(String binding, Type type) {
        this.binding = binding;
        signature = null;
        this.type = type;
    }

    public Symbol(String binding, Signature signature) {
        this.binding = binding;
        this.signature = signature;
        type = null;
    }

    public Boolean isEmpty() {
        if (type == null && signature == null)
            return true;
        else
            return false;
    }
    
    public Boolean isType() {
        if (type != null && signature == null)
            return true;
        else
            return false;
    }

    public Boolean isSignature() {
        if (type == null && signature != null)
            return true;
        else
            return false;
    }
}
