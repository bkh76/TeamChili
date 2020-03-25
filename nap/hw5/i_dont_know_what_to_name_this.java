// Using the new grammar he gave to us, the one in the man.

//expr
@Override
public Ast visitEMuls(napParser.EMulsContext ctx) {
    Expression e0 = (Expression)visit(ctx.expression(0));
    Expression e1 = (Expression)visit(ctx.expression(1));
    if(ctx.op.getType() == napParser.MUL)
        return new ExpBinop(position(ctx), e0, OpBinary.MUL, e1);
    else if(ctx.op.getType() == napParser.DIV)
        return new ExpBinop(position(ctx), e0, OpBinary.DIV, e1);
    else
        return new ExpBinop(position(ctx), e0, OpBinary.MOD, e1);
}

@Override
public Ast visitEAdds(napParser.EAddsContext ctx) {
    Expression e0 = (Expression)visit(ctx.expression(0));
    Expression e1 = (Expression)visit(ctx.expression(1));
    if(ctx.op.getType() == napParser.ADD)
        return new ExpBinop(position(ctx), e0, OpBinary.ADD, e1);
    else
        return new ExpBinop(position(ctx), e0, OpBinary.SUB, e1);
}

@Override
public Ast visitEOpp(napParser.EOpp ctx) {
    Expression e = (Expression)visit(ctx.expressin(0));
    return new ExpUnop(position(ctx), e, OpUnary.SUB);
}

@Override
public Ast visitECmp(napParser.ECmp ctx) {
    Expression e0 = (Expression)visit(ctx.expression(0));
    Expression e1 = (Expression)visit(ctx.expression(1)); 
    if(ctx.op.getType() == napParser.EQ)
        return new ExpBinop(position(ctx), e0, OpBinary.EQ, e1);
    else if(ctx.op.getType() == napParser.NEQ)
        return new ExpBinop(position(ctx), e0, OpBinary.NEQ, e1);
    else if(ctx.op.getType() == napParser.LT)
        return new ExpBinop(position(ctx), e0, OpBinary.LT, e1);
    else if(ctx.op.getType() == napParser.LE)
        return new ExpBinop(position(ctx), e0, OpBinary.LE, e1);
    else if(ctx.op.getType() == napParser.GT)
        return new ExpBinop(position(ctx), e0, OpBinary.GT, e1);
    else
        return new ExpBinop(position(ctx), e0, OpBinary.GE, e1);
}

@Override
public Ast visitEAnd(napParser.EAnd ctx) {
    Expression e0 = (Expression)visit(ctx.expression(0));
    Expression e1 = (Expression)visit(ctx.expression(1));
    return new ExpBinop(position(ctx), e0, OpBinary.AND, e1);
}

@Override 
public Ast visitEOr(napParser.EOr ctx) {
    Expression e0 = (Expression)visit(ctx.expression(0));
    Expression e1 = (Expression)visit(ctx.expression(1));
    return new ExpBinop(position(ctx), e0, OpBinary.OR, e1);
}

@Override 
public Ast visitENot(napParser.ENot ctx) {
    Expression e = (Expression)visit(ctx.expressin(0));
    return new ExpUnop(position(ctx), e, OpUnary.NOT);
}

@Override
public Ast visitEPostfix(napParser)
