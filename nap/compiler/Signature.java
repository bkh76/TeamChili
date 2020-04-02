package compiler;
import ast.TypBasic;
import ast.*;
import java.util.*;
import util.Pair;

public class Signature {
    public List<Pair<Type, Boolean>> argTypes;
    public Type returnType;

    public Signature() {}

    public Signature(List<Pair<Type, Boolean>> argTypes, Type returnType) {
        this.argTypes = argTypes;
        this.returnType = returnType;
    }
    
    private static Signature buildBinary(Type t1, Type t2, Type rt) {
        List<Pair<Type, Boolean>> argTypes = new ArrayList<>();
        argTypes.add(new Pair(t1, false));
        argTypes.add(new Pair(t2, false));
        return new Signature(argTypes, rt);
    }
    private static Signature buildUnary(Type type, Type rt) {
        List<Pair<Type, Boolean>> argTypes = new ArrayList<>();
        argTypes.add(new Pair(type, false));
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

    public boolean check(List<Pair<Type, Boolean>> types) {
        if (types.size() == argTypes.size()) {
            for(int counter = 0; counter < types.size(); counter++)
                if (!types.get(counter).getFst().equals(argTypes.get(counter).getFst()))
                    return false;
            return true;
        }
        return false;   
    }
    public boolean check(Type type, Boolean isRef) {
        List<Pair<Type, Boolean>> types = new ArrayList<>();
        types.add(new Pair(type, isRef));
        return check(types);
    }
    
    public boolean check(Type t1, Boolean isRef1, Type t2, Boolean isRef2) {
        List<Pair<Type, Boolean>> types = new ArrayList<>();
        types.add(new Pair(t1, isRef1));
        types.add(new Pair(t2, isRef2));
        return check(types);
    }
}
