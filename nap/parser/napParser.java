// Generated from nap.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class napParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Identifier=36, Constant=37, BooleanConstant=38, 
		CharacterConstant=39, StringConstant=40, Comment=41, WS=42, ADD=43, SUB=44, 
		MUL=45, DIV=46, GT=47, LT=48, GTEQ=49, LTEQ=50, LOR=51, LAND=52, LNOT=53, 
		EQ=54, NEQ=55;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_function_definition = 2, RULE_arg_list = 3, 
		RULE_instruction = 4, RULE_expr = 5, RULE_conditional = 6, RULE_typeIdentifier = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "function_definition", "arg_list", "instruction", 
			"expr", "conditional", "typeIdentifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'func'", "'('", "','", "')'", "'->'", "'ref'", "'array<'", 
			"'var'", "'='", "'['", "']'", "'*='", "'/='", "'++'", "'--'", "'+='", 
			"'-='", "'new ('", "'read'", "'print'", "'new'", "'mod'", "'while'", 
			"'do'", "'for'", "'in'", "'if'", "'else if'", "'else'", "'char'", "'byte'", 
			"'int'", "'bool'", null, null, null, null, null, "'//'", null, "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'||'", "'&&'", "'!'", 
			"'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Identifier", "Constant", "BooleanConstant", "CharacterConstant", "StringConstant", 
			"Comment", "WS", "ADD", "SUB", "MUL", "DIV", "GT", "LT", "GTEQ", "LTEQ", 
			"LOR", "LAND", "LNOT", "EQ", "NEQ"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "nap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public napParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(napParser.EOF, 0); }
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(16);
				function_definition();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant) | (1L << SUB) | (1L << LNOT))) != 0)) {
				{
				{
				setState(25);
				instruction();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	 
		public Function_definitionContext() { }
		public void copyFrom(Function_definitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationContext extends Function_definitionContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Arg_listContext> arg_list() {
			return getRuleContexts(Arg_listContext.class);
		}
		public Arg_listContext arg_list(int i) {
			return getRuleContext(Arg_listContext.class,i);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public FunctionDeclarationContext(Function_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		int _la;
		try {
			int _alt;
			_localctx = new FunctionDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__2);
			setState(34);
			match(Identifier);
			setState(35);
			match(T__3);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					arg_list();
					setState(37);
					match(T__4);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				setState(44);
				arg_list();
				}
			}

			setState(47);
			match(T__5);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(48);
				match(T__6);
				setState(49);
				typeIdentifier();
				}
			}

			setState(52);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	 
		public Arg_listContext() { }
		public void copyFrom(Arg_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentContext extends Arg_listContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public TerminalNode GT() { return getToken(napParser.GT, 0); }
		public ArgumentContext(Arg_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg_list);
		try {
			_localctx = new ArgumentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(54);
				match(T__7);
				setState(55);
				typeIdentifier();
				setState(56);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(58);
				typeIdentifier();
				setState(59);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(61);
				match(T__8);
				setState(62);
				typeIdentifier();
				setState(63);
				match(GT);
				setState(64);
				match(Identifier);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewContext extends InstructionContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulEqDivEqContext extends InstructionContext {
		public Token op;
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MulEqDivEqContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterMulEqDivEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitMulEqDivEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitMulEqDivEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends InstructionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncDecContext extends InstructionContext {
		public Token op;
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncDecContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitIncDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExprContext extends InstructionContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public CondExprContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitCondExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends InstructionContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public TerminalNode GT() { return getToken(napParser.GT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends InstructionContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public ReadContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewInlineContext extends InstructionContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public TerminalNode Constant() { return getToken(napParser.Constant, 0); }
		public TerminalNode GT() { return getToken(napParser.GT, 0); }
		public NewInlineContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterNewInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitNewInline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitNewInline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends InstructionContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentFunctionCallContext extends InstructionContext {
		public List<TerminalNode> Identifier() { return getTokens(napParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(napParser.Identifier, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentFunctionCallContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterAssignmentFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitAssignmentFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitAssignmentFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncEqDecEqContext extends InstructionContext {
		public Token op;
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncEqDecEqContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterIncEqDecEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitIncEqDecEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitIncEqDecEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends InstructionContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public AssignContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstructionToExprContext extends InstructionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionToExprContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterInstructionToExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitInstructionToExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitInstructionToExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentContext extends InstructionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAssignmentContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		int _la;
		try {
			int _alt;
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__9);
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(69);
					typeIdentifier();
					setState(70);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(72);
					match(T__8);
					setState(73);
					typeIdentifier();
					setState(74);
					match(GT);
					}
					break;
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(78);
					match(T__10);
					setState(79);
					expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(Identifier);
				setState(83);
				match(T__10);
				setState(84);
				instruction();
				}
				break;
			case 3:
				_localctx = new ArrayAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				expr(0);
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					match(T__11);
					setState(87);
					expr(0);
					setState(88);
					match(T__12);
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(94);
				match(T__10);
				setState(95);
				expr(0);
				}
				break;
			case 4:
				_localctx = new MulEqDivEqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(Identifier);
				setState(98);
				((MulEqDivEqContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((MulEqDivEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				expr(0);
				}
				break;
			case 5:
				_localctx = new IncDecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(Identifier);
				setState(101);
				((IncDecContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
					((IncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				expr(0);
				}
				break;
			case 6:
				_localctx = new IncEqDecEqContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(Identifier);
				setState(104);
				((IncEqDecEqContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((IncEqDecEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				expr(0);
				}
				break;
			case 7:
				_localctx = new NewInlineContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(106);
				match(T__9);
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(107);
					match(T__8);
					setState(108);
					typeIdentifier();
					setState(109);
					match(GT);
					}
				}

				setState(113);
				match(Identifier);
				setState(114);
				match(T__10);
				setState(115);
				match(T__19);
				setState(116);
				typeIdentifier();
				setState(117);
				match(T__4);
				setState(118);
				match(Constant);
				setState(119);
				match(T__5);
				}
				break;
			case 8:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(T__20);
				setState(122);
				match(T__3);
				setState(123);
				typeIdentifier();
				setState(124);
				match(T__4);
				setState(125);
				match(Identifier);
				setState(126);
				match(T__5);
				}
				break;
			case 9:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				match(T__21);
				setState(129);
				match(T__3);
				setState(130);
				typeIdentifier();
				setState(131);
				match(T__4);
				setState(132);
				expr(0);
				setState(133);
				match(T__5);
				}
				break;
			case 10:
				_localctx = new NewContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				match(T__22);
				setState(136);
				match(T__3);
				setState(137);
				typeIdentifier();
				setState(138);
				match(T__4);
				setState(139);
				expr(0);
				setState(140);
				match(T__5);
				}
				break;
			case 11:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				match(T__6);
				setState(143);
				expr(0);
				}
				break;
			case 12:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				conditional();
				}
				break;
			case 13:
				_localctx = new AssignmentFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(145);
				match(Identifier);
				setState(146);
				match(T__10);
				setState(147);
				match(Identifier);
				setState(148);
				match(T__3);
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						expr(0);
						setState(150);
						match(T__4);
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant) | (1L << SUB) | (1L << LNOT))) != 0)) {
					{
					setState(157);
					expr(0);
					}
				}

				setState(160);
				match(T__5);
				}
				break;
			case 14:
				_localctx = new InstructionToExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(161);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharacterConstantContext extends ExprContext {
		public TerminalNode CharacterConstant() { return getToken(napParser.CharacterConstant, 0); }
		public CharacterConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitCharacterConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(napParser.SUB, 0); }
		public TerminalNode LNOT() { return getToken(napParser.LNOT, 0); }
		public NegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantArrayContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConstantArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterConstantArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitConstantArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitConstantArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(napParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(napParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(napParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(napParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public TerminalNode Constant() { return getToken(napParser.Constant, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LAND() { return getToken(napParser.LAND, 0); }
		public TerminalNode LOR() { return getToken(napParser.LOR, 0); }
		public TerminalNode LNOT() { return getToken(napParser.LNOT, 0); }
		public LogicalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanConstantContext extends ExprContext {
		public TerminalNode BooleanConstant() { return getToken(napParser.BooleanConstant, 0); }
		public BooleanConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(napParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(napParser.NEQ, 0); }
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConstantContext extends ExprContext {
		public TerminalNode StringConstant() { return getToken(napParser.StringConstant, 0); }
		public StringConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InequalityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(napParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(napParser.GTEQ, 0); }
		public TerminalNode GT() { return getToken(napParser.GT, 0); }
		public TerminalNode LT() { return getToken(napParser.LT, 0); }
		public InequalityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterInequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitInequality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitInequality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165);
				((NegationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==LNOT) ) {
					((NegationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				expr(11);
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(Identifier);
				setState(168);
				match(T__3);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						expr(0);
						setState(170);
						match(T__4);
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant) | (1L << SUB) | (1L << LNOT))) != 0)) {
					{
					setState(177);
					expr(0);
					}
				}

				setState(180);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(Identifier);
				}
				break;
			case 4:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(Constant);
				}
				break;
			case 5:
				{
				_localctx = new CharacterConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(CharacterConstant);
				}
				break;
			case 6:
				{
				_localctx = new BooleanConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(BooleanConstant);
				}
				break;
			case 7:
				{
				_localctx = new StringConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(StringConstant);
				}
				break;
			case 8:
				{
				_localctx = new ConstantArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(T__0);
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(187);
						expr(0);
						setState(188);
						match(T__4);
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant) | (1L << SUB) | (1L << LNOT))) != 0)) {
					{
					setState(195);
					expr(0);
					}
				}

				setState(198);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(T__3);
				setState(200);
				expr(0);
				setState(201);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(206);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(209);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new InequalityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(212);
						((InequalityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((InequalityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(215);
						((EqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(218);
						((LogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOR) | (1L << LAND) | (1L << LNOT))) != 0)) ) {
							((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(221);
						match(T__23);
						setState(222);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(228); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(224);
								match(T__11);
								setState(225);
								expr(0);
								setState(226);
								match(T__12);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(230); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfCondContext extends ConditionalContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfCondContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterIfCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitIfCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitIfCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends ConditionalContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseCondContext extends ConditionalContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseCondContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterElseCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitElseCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitElseCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileLoopContext extends ConditionalContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileLoopContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends ConditionalContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseIfCondContext extends ConditionalContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfCondContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterElseIfCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitElseIfCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitElseIfCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__24);
				setState(238);
				match(T__3);
				setState(239);
				expr(0);
				setState(240);
				match(T__5);
				setState(241);
				block();
				}
				break;
			case T__25:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__25);
				setState(244);
				block();
				setState(245);
				match(T__24);
				setState(246);
				match(T__3);
				setState(247);
				expr(0);
				setState(248);
				match(T__5);
				}
				break;
			case T__26:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(T__26);
				setState(251);
				match(T__3);
				setState(252);
				typeIdentifier();
				setState(253);
				match(Identifier);
				setState(254);
				match(T__27);
				setState(255);
				instruction();
				setState(256);
				match(T__5);
				setState(257);
				block();
				}
				break;
			case T__28:
				_localctx = new IfCondContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(T__28);
				setState(260);
				match(T__3);
				setState(261);
				instruction();
				setState(262);
				match(T__5);
				setState(263);
				block();
				}
				break;
			case T__29:
				_localctx = new ElseIfCondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				match(T__29);
				setState(266);
				match(T__3);
				setState(267);
				expr(0);
				setState(268);
				match(T__5);
				setState(269);
				block();
				}
				break;
			case T__30:
				_localctx = new ElseCondContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				match(T__30);
				setState(272);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
	 
		public TypeIdentifierContext() { }
		public void copyFrom(TypeIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayContext extends TypeIdentifierContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode GT() { return getToken(napParser.GT, 0); }
		public ArrayContext(TypeIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends TypeIdentifierContext {
		public BoolContext(TypeIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends TypeIdentifierContext {
		public CharContext(TypeIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ByteContext extends TypeIdentifierContext {
		public ByteContext(TypeIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterByte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitByte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitByte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends TypeIdentifierContext {
		public IntContext(TypeIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeIdentifier);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new ByteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__32);
				}
				break;
			case T__33:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(T__34);
				}
				break;
			case T__8:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				match(T__8);
				setState(280);
				typeIdentifier();
				setState(281);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2"+
		"\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\5\4\60\n\4\3\4\3\4"+
		"\3\4\5\4\65\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\5\6S\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6]\n\6\r\6\16\6^\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\5\6\u00a1\n\6\3\6\3\6\5\6"+
		"\u00a5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2"+
		"\13\7\3\7\5\7\u00b5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c1"+
		"\n\7\f\7\16\7\u00c4\13\7\3\7\5\7\u00c7\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ce"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00e7\n\7\r\7\16\7\u00e8\7\7\u00eb\n\7"+
		"\f\7\16\7\u00ee\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0114\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u011e\n\t\3\t\2\3\f\n\2\4\6\b\n\f\16\20\2\13\3\2\20\21\3\2\22\23"+
		"\3\2\24\25\4\2..\67\67\3\2/\60\3\2-.\3\2\61\64\3\289\3\2\65\67\2\u014e"+
		"\2\25\3\2\2\2\4\32\3\2\2\2\6#\3\2\2\2\bD\3\2\2\2\n\u00a4\3\2\2\2\f\u00cd"+
		"\3\2\2\2\16\u0113\3\2\2\2\20\u011d\3\2\2\2\22\24\5\6\4\2\23\22\3\2\2\2"+
		"\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2"+
		"\30\31\7\2\2\3\31\3\3\2\2\2\32\36\7\3\2\2\33\35\5\n\6\2\34\33\3\2\2\2"+
		"\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7"+
		"\4\2\2\"\5\3\2\2\2#$\7\5\2\2$%\7&\2\2%+\7\6\2\2&\'\5\b\5\2\'(\7\7\2\2"+
		"(*\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2"+
		".\60\5\b\5\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\64\7\b\2\2\62\63\7"+
		"\t\2\2\63\65\5\20\t\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\5\4\3\2\67\7\3\2\2\289\7\n\2\29:\5\20\t\2:;\7&\2\2;E\3\2\2\2<=\5\20\t"+
		"\2=>\7&\2\2>E\3\2\2\2?@\7\13\2\2@A\5\20\t\2AB\7\61\2\2BC\7&\2\2CE\3\2"+
		"\2\2D8\3\2\2\2D<\3\2\2\2D?\3\2\2\2E\t\3\2\2\2FN\7\f\2\2GH\5\20\t\2HI\7"+
		"&\2\2IO\3\2\2\2JK\7\13\2\2KL\5\20\t\2LM\7\61\2\2MO\3\2\2\2NG\3\2\2\2N"+
		"J\3\2\2\2OR\3\2\2\2PQ\7\r\2\2QS\5\f\7\2RP\3\2\2\2RS\3\2\2\2S\u00a5\3\2"+
		"\2\2TU\7&\2\2UV\7\r\2\2V\u00a5\5\n\6\2W\\\5\f\7\2XY\7\16\2\2YZ\5\f\7\2"+
		"Z[\7\17\2\2[]\3\2\2\2\\X\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2"+
		"\2\2`a\7\r\2\2ab\5\f\7\2b\u00a5\3\2\2\2cd\7&\2\2de\t\2\2\2e\u00a5\5\f"+
		"\7\2fg\7&\2\2gh\t\3\2\2h\u00a5\5\f\7\2ij\7&\2\2jk\t\4\2\2k\u00a5\5\f\7"+
		"\2lq\7\f\2\2mn\7\13\2\2no\5\20\t\2op\7\61\2\2pr\3\2\2\2qm\3\2\2\2qr\3"+
		"\2\2\2rs\3\2\2\2st\7&\2\2tu\7\r\2\2uv\7\26\2\2vw\5\20\t\2wx\7\7\2\2xy"+
		"\7\'\2\2yz\7\b\2\2z\u00a5\3\2\2\2{|\7\27\2\2|}\7\6\2\2}~\5\20\t\2~\177"+
		"\7\7\2\2\177\u0080\7&\2\2\u0080\u0081\7\b\2\2\u0081\u00a5\3\2\2\2\u0082"+
		"\u0083\7\30\2\2\u0083\u0084\7\6\2\2\u0084\u0085\5\20\t\2\u0085\u0086\7"+
		"\7\2\2\u0086\u0087\5\f\7\2\u0087\u0088\7\b\2\2\u0088\u00a5\3\2\2\2\u0089"+
		"\u008a\7\31\2\2\u008a\u008b\7\6\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7"+
		"\7\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\b\2\2\u008f\u00a5\3\2\2\2\u0090"+
		"\u0091\7\t\2\2\u0091\u00a5\5\f\7\2\u0092\u00a5\5\16\b\2\u0093\u0094\7"+
		"&\2\2\u0094\u0095\7\r\2\2\u0095\u0096\7&\2\2\u0096\u009c\7\6\2\2\u0097"+
		"\u0098\5\f\7\2\u0098\u0099\7\7\2\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5\f\7\2\u00a0\u009f\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\7\b\2\2\u00a3"+
		"\u00a5\5\f\7\2\u00a4F\3\2\2\2\u00a4T\3\2\2\2\u00a4W\3\2\2\2\u00a4c\3\2"+
		"\2\2\u00a4f\3\2\2\2\u00a4i\3\2\2\2\u00a4l\3\2\2\2\u00a4{\3\2\2\2\u00a4"+
		"\u0082\3\2\2\2\u00a4\u0089\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4\u0092\3\2"+
		"\2\2\u00a4\u0093\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\13\3\2\2\2\u00a6\u00a7"+
		"\b\7\1\2\u00a7\u00a8\t\5\2\2\u00a8\u00ce\5\f\7\r\u00a9\u00aa\7&\2\2\u00aa"+
		"\u00b0\7\6\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7\7\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\5\f"+
		"\7\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00ce\7\b\2\2\u00b7\u00ce\7&\2\2\u00b8\u00ce\7\'\2\2\u00b9\u00ce\7)\2"+
		"\2\u00ba\u00ce\7(\2\2\u00bb\u00ce\7*\2\2\u00bc\u00c2\7\3\2\2\u00bd\u00be"+
		"\5\f\7\2\u00be\u00bf\7\7\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ce\7\4\2\2\u00c9\u00ca\7\6"+
		"\2\2\u00ca\u00cb\5\f\7\2\u00cb\u00cc\7\b\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00a6\3\2\2\2\u00cd\u00a9\3\2\2\2\u00cd\u00b7\3\2\2\2\u00cd\u00b8\3\2"+
		"\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00ba\3\2\2\2\u00cd\u00bb\3\2\2\2\u00cd"+
		"\u00bc\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00ec\3\2\2\2\u00cf\u00d0\f\22"+
		"\2\2\u00d0\u00d1\t\6\2\2\u00d1\u00eb\5\f\7\23\u00d2\u00d3\f\21\2\2\u00d3"+
		"\u00d4\t\7\2\2\u00d4\u00eb\5\f\7\22\u00d5\u00d6\f\20\2\2\u00d6\u00d7\t"+
		"\b\2\2\u00d7\u00eb\5\f\7\21\u00d8\u00d9\f\17\2\2\u00d9\u00da\t\t\2\2\u00da"+
		"\u00eb\5\f\7\20\u00db\u00dc\f\16\2\2\u00dc\u00dd\t\n\2\2\u00dd\u00eb\5"+
		"\f\7\17\u00de\u00df\f\f\2\2\u00df\u00e0\7\32\2\2\u00e0\u00eb\5\f\7\r\u00e1"+
		"\u00e6\f\13\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00e4\5\f\7\2\u00e4\u00e5\7"+
		"\17\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00cf\3\2"+
		"\2\2\u00ea\u00d2\3\2\2\2\u00ea\u00d5\3\2\2\2\u00ea\u00d8\3\2\2\2\u00ea"+
		"\u00db\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e1\3\2\2\2\u00eb\u00ee\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\r\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f1\7\6\2\2\u00f1\u00f2\5\f\7\2"+
		"\u00f2\u00f3\7\b\2\2\u00f3\u00f4\5\4\3\2\u00f4\u0114\3\2\2\2\u00f5\u00f6"+
		"\7\34\2\2\u00f6\u00f7\5\4\3\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\7\6\2\2"+
		"\u00f9\u00fa\5\f\7\2\u00fa\u00fb\7\b\2\2\u00fb\u0114\3\2\2\2\u00fc\u00fd"+
		"\7\35\2\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\5\20\t\2\u00ff\u0100\7&\2\2"+
		"\u0100\u0101\7\36\2\2\u0101\u0102\5\n\6\2\u0102\u0103\7\b\2\2\u0103\u0104"+
		"\5\4\3\2\u0104\u0114\3\2\2\2\u0105\u0106\7\37\2\2\u0106\u0107\7\6\2\2"+
		"\u0107\u0108\5\n\6\2\u0108\u0109\7\b\2\2\u0109\u010a\5\4\3\2\u010a\u0114"+
		"\3\2\2\2\u010b\u010c\7 \2\2\u010c\u010d\7\6\2\2\u010d\u010e\5\f\7\2\u010e"+
		"\u010f\7\b\2\2\u010f\u0110\5\4\3\2\u0110\u0114\3\2\2\2\u0111\u0112\7!"+
		"\2\2\u0112\u0114\5\4\3\2\u0113\u00ef\3\2\2\2\u0113\u00f5\3\2\2\2\u0113"+
		"\u00fc\3\2\2\2\u0113\u0105\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\17\3\2\2\2\u0115\u011e\7\"\2\2\u0116\u011e\7#\2\2\u0117\u011e"+
		"\7$\2\2\u0118\u011e\7%\2\2\u0119\u011a\7\13\2\2\u011a\u011b\5\20\t\2\u011b"+
		"\u011c\7\61\2\2\u011c\u011e\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3"+
		"\2\2\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011e"+
		"\21\3\2\2\2\31\25\36+/\64DNR^q\u009c\u00a0\u00a4\u00b0\u00b4\u00c2\u00c6"+
		"\u00cd\u00e8\u00ea\u00ec\u0113\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}