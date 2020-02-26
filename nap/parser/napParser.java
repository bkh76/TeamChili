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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, Identifier=52, 
		Constant=53, BooleanConstant=54, CharacterConstant=55, StringConstant=56, 
		WS=57;
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
			"'>'", "'var'", "'='", "'['", "']'", "'*='", "'/='", "'++'", "'--'", 
			"'+='", "'-='", "'new ('", "'read'", "'print'", "'new'", "'**'", "'*'", 
			"'/'", "'+'", "'-'", "'<'", "'<='", "'>='", "'=='", "'!='", "'mod'", 
			"'||'", "'&&'", "'!'", "'|'", "'&'", "'while'", "'do'", "'for'", "'in'", 
			"'if'", "'else if'", "'else'", "'char'", "'byte'", "'int'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Identifier", "Constant", "BooleanConstant", 
			"CharacterConstant", "StringConstant", "WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__34) | (1L << T__37) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant))) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) {
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
	public static class SingleArgContext extends Arg_listContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public SingleArgContext(Arg_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterSingleArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitSingleArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitSingleArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg_list);
		try {
			_localctx = new SingleArgContext(_localctx);
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
				match(T__9);
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
	public static class MulEqDivEqContext extends InstructionContext {
		public Token op;
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
	public static class IncDecContext extends InstructionContext {
		public Token op;
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
	public static class PrintContext extends InstructionContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
	public static class NewOpContext extends InstructionContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public TerminalNode Constant() { return getToken(napParser.Constant, 0); }
		public NewOpContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterNewOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitNewOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitNewOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends InstructionContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public FunctionCallContext(InstructionContext ctx) { copyFrom(ctx); }
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
	public static class ConstNewContext extends InstructionContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ConstNewContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterConstNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitConstNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitConstNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReAssignmentContext extends InstructionContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ReAssignmentContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterReAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitReAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitReAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentContext extends InstructionContext {
		public TerminalNode Identifier() { return getToken(napParser.Identifier, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__10);
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
					match(T__9);
					}
					break;
				}
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(78);
					match(T__11);
					setState(79);
					instruction();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ReAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(Identifier);
				setState(83);
				match(T__11);
				setState(84);
				instruction();
				}
				break;
			case 3:
				_localctx = new ArrayAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(Identifier);
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(86);
						match(T__12);
						setState(87);
						expr(0);
						setState(88);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(94);
					match(T__11);
					setState(95);
					instruction();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new MulEqDivEqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(Identifier);
				setState(99);
				((MulEqDivEqContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((MulEqDivEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				instruction();
				}
				break;
			case 5:
				_localctx = new IncDecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(Identifier);
				setState(102);
				((IncDecContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
					((IncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				instruction();
				}
				break;
			case 6:
				_localctx = new IncEqDecEqContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(Identifier);
				setState(105);
				((IncEqDecEqContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
					((IncEqDecEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				instruction();
				}
				break;
			case 7:
				_localctx = new NewOpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(107);
				match(T__10);
				}
				{
				setState(108);
				match(T__8);
				setState(109);
				typeIdentifier();
				setState(110);
				match(T__9);
				}
				setState(112);
				match(Identifier);
				setState(113);
				match(T__11);
				setState(114);
				match(T__20);
				setState(115);
				typeIdentifier();
				setState(116);
				match(T__4);
				setState(117);
				match(Constant);
				setState(118);
				match(T__5);
				}
				break;
			case 8:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				match(T__21);
				setState(121);
				match(T__3);
				setState(122);
				typeIdentifier();
				setState(123);
				match(T__4);
				setState(124);
				match(Identifier);
				setState(125);
				match(T__5);
				}
				break;
			case 9:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(T__22);
				setState(128);
				match(T__3);
				setState(129);
				typeIdentifier();
				setState(130);
				match(T__4);
				setState(131);
				instruction();
				setState(132);
				match(T__5);
				}
				break;
			case 10:
				_localctx = new ConstNewContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(T__23);
				setState(135);
				match(T__3);
				setState(136);
				typeIdentifier();
				setState(137);
				match(T__4);
				setState(138);
				instruction();
				setState(139);
				match(T__5);
				}
				break;
			case 11:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(141);
				conditional();
				}
				break;
			case 12:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(142);
				match(Identifier);
				setState(143);
				match(T__3);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(144);
						instruction();
						setState(145);
						match(T__4);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__34) | (1L << T__37) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant))) != 0)) {
					{
					setState(152);
					instruction();
					}
				}

				setState(155);
				match(T__5);
				}
				break;
			case 13:
				_localctx = new AssignmentFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(156);
				match(Identifier);
				setState(157);
				match(T__11);
				setState(158);
				match(Identifier);
				setState(159);
				match(T__3);
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						instruction();
						setState(161);
						match(T__4);
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__34) | (1L << T__37) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant))) != 0)) {
					{
					setState(168);
					instruction();
					}
				}

				setState(171);
				match(T__5);
				}
				break;
			case 14:
				_localctx = new InstructionToExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(172);
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
	public static class LNegationContext extends ExprContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LNegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterLNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitLNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitLNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends ExprContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ReturnContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class ModContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
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
	public static class GteqLteqContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public GteqLteqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterGteqLteq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitGteqLteq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitGteqLteq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LOrLAndLNotContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LOrLAndLNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterLOrLAndLNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitLOrLAndLNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitLOrLAndLNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
	public static class GtLtContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public GtLtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterGtLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitGtLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitGtLt(this);
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
	public static class EqualNotEqContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public EqualNotEqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterEqualNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitEqualNotEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitEqualNotEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrAndContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public OrAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterOrAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitOrAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitOrAnd(this);
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
	public static class ExpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstModContext extends ExprContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ConstModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterConstMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitConstMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitConstMod(this);
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(176);
				match(T__28);
				setState(177);
				instruction();
				}
				break;
			case T__37:
				{
				_localctx = new LNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__37);
				setState(179);
				instruction();
				}
				break;
			case T__34:
				{
				_localctx = new ConstModContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(T__34);
				setState(181);
				instruction();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(Identifier);
				}
				break;
			case Constant:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(Constant);
				}
				break;
			case CharacterConstant:
				{
				_localctx = new CharacterConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(CharacterConstant);
				}
				break;
			case BooleanConstant:
				{
				_localctx = new BooleanConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(BooleanConstant);
				}
				break;
			case StringConstant:
				{
				_localctx = new StringConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(StringConstant);
				}
				break;
			case T__3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(T__3);
				setState(188);
				instruction();
				setState(189);
				match(T__5);
				}
				break;
			case T__0:
				{
				_localctx = new ConstantArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__0);
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						instruction();
						setState(193);
						match(T__4);
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__34) | (1L << T__37) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << Identifier) | (1L << Constant) | (1L << BooleanConstant) | (1L << CharacterConstant) | (1L << StringConstant))) != 0)) {
					{
					setState(200);
					instruction();
					}
				}

				setState(203);
				match(T__1);
				}
				break;
			case T__6:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(T__6);
				setState(205);
				instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						{
						setState(209);
						((ExpContext)_localctx).op = match(T__24);
						}
						setState(210);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(212);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						instruction();
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(215);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						instruction();
						}
						break;
					case 4:
						{
						_localctx = new GtLtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(218);
						((GtLtContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__29) ) {
							((GtLtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						instruction();
						}
						break;
					case 5:
						{
						_localctx = new GteqLteqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(221);
						((GteqLteqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((GteqLteqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						instruction();
						}
						break;
					case 6:
						{
						_localctx = new EqualNotEqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(224);
						((EqualNotEqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((EqualNotEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						instruction();
						}
						break;
					case 7:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(227);
						match(T__34);
						setState(228);
						instruction();
						}
						break;
					case 8:
						{
						_localctx = new LOrLAndLNotContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(230);
						((LOrLAndLNotContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
							((LOrLAndLNotContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						instruction();
						}
						break;
					case 9:
						{
						_localctx = new OrAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(233);
						((OrAndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((OrAndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						instruction();
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
	public static class ElseBlockContext extends ConditionalContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof napListener ) ((napListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof napVisitor ) return ((napVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__40);
				setState(241);
				match(T__3);
				setState(242);
				instruction();
				setState(243);
				match(T__5);
				setState(244);
				block();
				}
				break;
			case T__41:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__41);
				setState(247);
				block();
				setState(248);
				match(T__40);
				setState(249);
				match(T__3);
				setState(250);
				expr(0);
				setState(251);
				match(T__5);
				}
				break;
			case T__42:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(T__42);
				setState(254);
				match(T__3);
				setState(255);
				typeIdentifier();
				setState(256);
				match(Identifier);
				setState(257);
				match(T__43);
				setState(258);
				instruction();
				setState(259);
				match(T__5);
				setState(260);
				block();
				}
				break;
			case T__44:
				_localctx = new IfCondContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(T__44);
				setState(263);
				match(T__3);
				setState(264);
				instruction();
				setState(265);
				match(T__5);
				setState(266);
				block();
				}
				break;
			case T__45:
				_localctx = new ElseIfCondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(T__45);
				setState(269);
				match(T__3);
				setState(270);
				instruction();
				setState(271);
				match(T__5);
				setState(272);
				block();
				}
				break;
			case T__46:
				_localctx = new ElseBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(T__46);
				setState(275);
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
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__47);
				}
				break;
			case T__48:
				_localctx = new ByteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(T__49);
				}
				break;
			case T__50:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(T__50);
				}
				break;
			case T__8:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(T__8);
				setState(283);
				typeIdentifier();
				setState(284);
				match(T__9);
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
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2"+
		"\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\5\4\60\n\4\3\4\3\4"+
		"\3\4\5\4\65\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\5\6S\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6]\n\6\r\6\16\6^\3\6\3\6\5\6c\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0096\n\6\f"+
		"\6\16\6\u0099\13\6\3\6\5\6\u009c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u00a6\n\6\f\6\16\6\u00a9\13\6\3\6\5\6\u00ac\n\6\3\6\3\6\5\6\u00b0\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00c6\n\7\f\7\16\7\u00c9\13\7\3\7\5\7\u00cc\n\7\3\7\3"+
		"\7\3\7\5\7\u00d1\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ee\n"+
		"\7\f\7\16\7\u00f1\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0117\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0121\n\t\3\t\2\3\f\n\2\4\6\b\n\f\16\20\2\f\3\2\21\22\3\2\23\24"+
		"\3\2\25\26\3\2\34\35\3\2\36\37\4\2\f\f  \3\2!\"\3\2#$\3\2&(\3\2)*\2\u0154"+
		"\2\25\3\2\2\2\4\32\3\2\2\2\6#\3\2\2\2\bD\3\2\2\2\n\u00af\3\2\2\2\f\u00d0"+
		"\3\2\2\2\16\u0116\3\2\2\2\20\u0120\3\2\2\2\22\24\5\6\4\2\23\22\3\2\2\2"+
		"\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2"+
		"\30\31\7\2\2\3\31\3\3\2\2\2\32\36\7\3\2\2\33\35\5\n\6\2\34\33\3\2\2\2"+
		"\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7"+
		"\4\2\2\"\5\3\2\2\2#$\7\5\2\2$%\7\66\2\2%+\7\6\2\2&\'\5\b\5\2\'(\7\7\2"+
		"\2(*\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2"+
		"\2.\60\5\b\5\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\64\7\b\2\2\62\63"+
		"\7\t\2\2\63\65\5\20\t\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\5\4\3\2\67\7\3\2\2\289\7\n\2\29:\5\20\t\2:;\7\66\2\2;E\3\2\2\2<=\5\20"+
		"\t\2=>\7\66\2\2>E\3\2\2\2?@\7\13\2\2@A\5\20\t\2AB\7\f\2\2BC\7\66\2\2C"+
		"E\3\2\2\2D8\3\2\2\2D<\3\2\2\2D?\3\2\2\2E\t\3\2\2\2FN\7\r\2\2GH\5\20\t"+
		"\2HI\7\66\2\2IO\3\2\2\2JK\7\13\2\2KL\5\20\t\2LM\7\f\2\2MO\3\2\2\2NG\3"+
		"\2\2\2NJ\3\2\2\2OR\3\2\2\2PQ\7\16\2\2QS\5\n\6\2RP\3\2\2\2RS\3\2\2\2S\u00b0"+
		"\3\2\2\2TU\7\66\2\2UV\7\16\2\2V\u00b0\5\n\6\2W\\\7\66\2\2XY\7\17\2\2Y"+
		"Z\5\f\7\2Z[\7\20\2\2[]\3\2\2\2\\X\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2"+
		"\2_b\3\2\2\2`a\7\16\2\2ac\5\n\6\2b`\3\2\2\2bc\3\2\2\2c\u00b0\3\2\2\2d"+
		"e\7\66\2\2ef\t\2\2\2f\u00b0\5\n\6\2gh\7\66\2\2hi\t\3\2\2i\u00b0\5\n\6"+
		"\2jk\7\66\2\2kl\t\4\2\2l\u00b0\5\n\6\2mn\7\r\2\2no\7\13\2\2op\5\20\t\2"+
		"pq\7\f\2\2qr\3\2\2\2rs\7\66\2\2st\7\16\2\2tu\7\27\2\2uv\5\20\t\2vw\7\7"+
		"\2\2wx\7\67\2\2xy\7\b\2\2y\u00b0\3\2\2\2z{\7\30\2\2{|\7\6\2\2|}\5\20\t"+
		"\2}~\7\7\2\2~\177\7\66\2\2\177\u0080\7\b\2\2\u0080\u00b0\3\2\2\2\u0081"+
		"\u0082\7\31\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7"+
		"\7\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7\b\2\2\u0087\u00b0\3\2\2\2\u0088"+
		"\u0089\7\32\2\2\u0089\u008a\7\6\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7"+
		"\7\2\2\u008c\u008d\5\n\6\2\u008d\u008e\7\b\2\2\u008e\u00b0\3\2\2\2\u008f"+
		"\u00b0\5\16\b\2\u0090\u0091\7\66\2\2\u0091\u0097\7\6\2\2\u0092\u0093\5"+
		"\n\6\2\u0093\u0094\7\7\2\2\u0094\u0096\3\2\2\2\u0095\u0092\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009c\5\n\6\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00b0\7\b\2\2\u009e\u009f\7\66"+
		"\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\7\66\2\2\u00a1\u00a7\7\6\2\2\u00a2"+
		"\u00a3\5\n\6\2\u00a3\u00a4\7\7\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\5\n\6\2\u00ab\u00aa\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\7\b\2\2\u00ae"+
		"\u00b0\5\f\7\2\u00afF\3\2\2\2\u00afT\3\2\2\2\u00afW\3\2\2\2\u00afd\3\2"+
		"\2\2\u00afg\3\2\2\2\u00afj\3\2\2\2\u00afm\3\2\2\2\u00afz\3\2\2\2\u00af"+
		"\u0081\3\2\2\2\u00af\u0088\3\2\2\2\u00af\u008f\3\2\2\2\u00af\u0090\3\2"+
		"\2\2\u00af\u009e\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00b2"+
		"\b\7\1\2\u00b2\u00b3\7\37\2\2\u00b3\u00d1\5\n\6\2\u00b4\u00b5\7(\2\2\u00b5"+
		"\u00d1\5\n\6\2\u00b6\u00b7\7%\2\2\u00b7\u00d1\5\n\6\2\u00b8\u00d1\7\66"+
		"\2\2\u00b9\u00d1\7\67\2\2\u00ba\u00d1\79\2\2\u00bb\u00d1\78\2\2\u00bc"+
		"\u00d1\7:\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf\5\n\6\2\u00bf\u00c0\7\b"+
		"\2\2\u00c0\u00d1\3\2\2\2\u00c1\u00c7\7\3\2\2\u00c2\u00c3\5\n\6\2\u00c3"+
		"\u00c4\7\7\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cc\5\n\6\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\7\4\2\2\u00ce\u00cf\7\t\2\2\u00cf"+
		"\u00d1\5\n\6\2\u00d0\u00b1\3\2\2\2\u00d0\u00b4\3\2\2\2\u00d0\u00b6\3\2"+
		"\2\2\u00d0\u00b8\3\2\2\2\u00d0\u00b9\3\2\2\2\u00d0\u00ba\3\2\2\2\u00d0"+
		"\u00bb\3\2\2\2\u00d0\u00bc\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0\u00c1\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00ef\3\2\2\2\u00d2\u00d3\f\26\2\2\u00d3"+
		"\u00d4\7\33\2\2\u00d4\u00ee\5\f\7\27\u00d5\u00d6\f\25\2\2\u00d6\u00d7"+
		"\t\5\2\2\u00d7\u00ee\5\n\6\2\u00d8\u00d9\f\24\2\2\u00d9\u00da\t\6\2\2"+
		"\u00da\u00ee\5\n\6\2\u00db\u00dc\f\23\2\2\u00dc\u00dd\t\7\2\2\u00dd\u00ee"+
		"\5\n\6\2\u00de\u00df\f\22\2\2\u00df\u00e0\t\b\2\2\u00e0\u00ee\5\n\6\2"+
		"\u00e1\u00e2\f\21\2\2\u00e2\u00e3\t\t\2\2\u00e3\u00ee\5\n\6\2\u00e4\u00e5"+
		"\f\20\2\2\u00e5\u00e6\7%\2\2\u00e6\u00ee\5\n\6\2\u00e7\u00e8\f\17\2\2"+
		"\u00e8\u00e9\t\n\2\2\u00e9\u00ee\5\n\6\2\u00ea\u00eb\f\16\2\2\u00eb\u00ec"+
		"\t\13\2\2\u00ec\u00ee\5\n\6\2\u00ed\u00d2\3\2\2\2\u00ed\u00d5\3\2\2\2"+
		"\u00ed\u00d8\3\2\2\2\u00ed\u00db\3\2\2\2\u00ed\u00de\3\2\2\2\u00ed\u00e1"+
		"\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\r\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5"+
		"\5\n\6\2\u00f5\u00f6\7\b\2\2\u00f6\u00f7\5\4\3\2\u00f7\u0117\3\2\2\2\u00f8"+
		"\u00f9\7,\2\2\u00f9\u00fa\5\4\3\2\u00fa\u00fb\7+\2\2\u00fb\u00fc\7\6\2"+
		"\2\u00fc\u00fd\5\f\7\2\u00fd\u00fe\7\b\2\2\u00fe\u0117\3\2\2\2\u00ff\u0100"+
		"\7-\2\2\u0100\u0101\7\6\2\2\u0101\u0102\5\20\t\2\u0102\u0103\7\66\2\2"+
		"\u0103\u0104\7.\2\2\u0104\u0105\5\n\6\2\u0105\u0106\7\b\2\2\u0106\u0107"+
		"\5\4\3\2\u0107\u0117\3\2\2\2\u0108\u0109\7/\2\2\u0109\u010a\7\6\2\2\u010a"+
		"\u010b\5\n\6\2\u010b\u010c\7\b\2\2\u010c\u010d\5\4\3\2\u010d\u0117\3\2"+
		"\2\2\u010e\u010f\7\60\2\2\u010f\u0110\7\6\2\2\u0110\u0111\5\n\6\2\u0111"+
		"\u0112\7\b\2\2\u0112\u0113\5\4\3\2\u0113\u0117\3\2\2\2\u0114\u0115\7\61"+
		"\2\2\u0115\u0117\5\4\3\2\u0116\u00f2\3\2\2\2\u0116\u00f8\3\2\2\2\u0116"+
		"\u00ff\3\2\2\2\u0116\u0108\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\17\3\2\2\2\u0118\u0121\7\62\2\2\u0119\u0121\7\63\2\2\u011a"+
		"\u0121\7\64\2\2\u011b\u0121\7\65\2\2\u011c\u011d\7\13\2\2\u011d\u011e"+
		"\5\20\t\2\u011e\u011f\7\f\2\2\u011f\u0121\3\2\2\2\u0120\u0118\3\2\2\2"+
		"\u0120\u0119\3\2\2\2\u0120\u011a\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c"+
		"\3\2\2\2\u0121\21\3\2\2\2\30\25\36+/\64DNR^b\u0097\u009b\u00a7\u00ab\u00af"+
		"\u00c7\u00cb\u00d0\u00ed\u00ef\u0116\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}