package compiler;
import ast.TypBasic;
import java.util.*;

public class Signature {
    public List<Type, Boolean> argTypes;
    public Type returnType;

    public Signature() {}
    
    public Signature(List<Type, Boolean> argTypes, Type returnType) {
        this.argTypes = argTypes;
        this.returnType = returnType;
    }
    
    private static Signature buildBinary(Type t1, Type t2, Type rt) {
        List<Type, Binary> argTypes = new ArrayList<>();
        argTypes.add(t1, false);
        argTypes.add(t2, false);
        return new Signature(argTypes, rt);
    }
    private static Signature buildUnary(Type type, Type rt) {
        List<Type, Boolean> argTypes = new ArrayList<>();
        argTypes.add(type, false);
        return new Signature(argTypes, rt);
    }
    public final static Signature binaryArithmetic =
        buildBinary(Type.integer, Type.integer, Type.integer);
    public final static Signature binaryBoolean =
        buildBinary(Type.bool, Type.bool, Type.bool);
    public final static Signature unaryArithmetic =
        buildUnary(Type.integer, Type.integer);
    public final static Signature unaryBoolean =
        buildUnary(Type.bool, Type.bool);
    public final static Signature comparison =
        buildBinary(Type.integer, Type.integer, Type.bool);

    public boolean check(List<Type> types) {
        if (types.size() == argTypes.size()) {
            for(int counter = 0; counter < types.size(); counter++)
                if (!types.get(counter).equals(argTypes.get(counter)))
                    return false;
            return true;
        }
        return false;   
    }
    public boolean check(Type type) {
        List<Type> types = new ArrayList<>();
        types.add(type);
        return check(types);
    }
    
    public boolean check(Type t1, Type t2) {
        List<Type> types = new ArrayList<>();
        types.add(t1);
        types.add(t2);
        return check(types);
    }
}
