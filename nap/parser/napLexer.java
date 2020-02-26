// Generated from nap.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class napLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "Identifier", "Constant", "BooleanConstant", "CharacterConstant", 
			"StringConstant", "WS"
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


	public napLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "nap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\7\65\u0124\n\65\f\65\16\65\u0127\13\65\3\66\6\66\u012a"+
		"\n\66\r\66\16\66\u012b\3\67\3\67\38\38\58\u0132\n8\38\38\38\39\39\79\u0139"+
		"\n9\f9\169\u013c\139\39\39\3:\6:\u0141\n:\r:\16:\u0142\3:\3:\2\2;\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2HHVV\4\2\"}\177\u0080\6\2"+
		"\13\f\17\17\"\"==\2\u014a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2"+
		"\5w\3\2\2\2\7y\3\2\2\2\t~\3\2\2\2\13\u0080\3\2\2\2\r\u0082\3\2\2\2\17"+
		"\u0084\3\2\2\2\21\u0087\3\2\2\2\23\u008b\3\2\2\2\25\u0092\3\2\2\2\27\u0094"+
		"\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009e\3"+
		"\2\2\2!\u00a1\3\2\2\2#\u00a4\3\2\2\2%\u00a7\3\2\2\2\'\u00aa\3\2\2\2)\u00ad"+
		"\3\2\2\2+\u00b0\3\2\2\2-\u00b6\3\2\2\2/\u00bb\3\2\2\2\61\u00c1\3\2\2\2"+
		"\63\u00c5\3\2\2\2\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce"+
		"\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00d5\3\2\2\2C\u00d8\3\2\2\2E"+
		"\u00db\3\2\2\2G\u00de\3\2\2\2I\u00e2\3\2\2\2K\u00e5\3\2\2\2M\u00e8\3\2"+
		"\2\2O\u00ea\3\2\2\2Q\u00ec\3\2\2\2S\u00ee\3\2\2\2U\u00f4\3\2\2\2W\u00f7"+
		"\3\2\2\2Y\u00fb\3\2\2\2[\u00fe\3\2\2\2]\u0101\3\2\2\2_\u0109\3\2\2\2a"+
		"\u010e\3\2\2\2c\u0113\3\2\2\2e\u0118\3\2\2\2g\u011c\3\2\2\2i\u0121\3\2"+
		"\2\2k\u0129\3\2\2\2m\u012d\3\2\2\2o\u012f\3\2\2\2q\u0136\3\2\2\2s\u0140"+
		"\3\2\2\2uv\7}\2\2v\4\3\2\2\2wx\7\177\2\2x\6\3\2\2\2yz\7h\2\2z{\7w\2\2"+
		"{|\7p\2\2|}\7e\2\2}\b\3\2\2\2~\177\7*\2\2\177\n\3\2\2\2\u0080\u0081\7"+
		".\2\2\u0081\f\3\2\2\2\u0082\u0083\7+\2\2\u0083\16\3\2\2\2\u0084\u0085"+
		"\7/\2\2\u0085\u0086\7@\2\2\u0086\20\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7h\2\2\u008a\22\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f\u0090\7{\2\2\u0090"+
		"\u0091\7>\2\2\u0091\24\3\2\2\2\u0092\u0093\7@\2\2\u0093\26\3\2\2\2\u0094"+
		"\u0095\7x\2\2\u0095\u0096\7c\2\2\u0096\u0097\7t\2\2\u0097\30\3\2\2\2\u0098"+
		"\u0099\7?\2\2\u0099\32\3\2\2\2\u009a\u009b\7]\2\2\u009b\34\3\2\2\2\u009c"+
		"\u009d\7_\2\2\u009d\36\3\2\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7?\2\2\u00a0"+
		" \3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\7?\2\2\u00a3\"\3\2\2\2\u00a4"+
		"\u00a5\7-\2\2\u00a5\u00a6\7-\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8"+
		"\u00a9\7/\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"(\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\7?\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
		"\7p\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7\"\2\2\u00b4"+
		"\u00b5\7*\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7f\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7r\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2"+
		"\u00c0\60\3\2\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7"+
		"y\2\2\u00c4\62\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\u00c7\7,\2\2\u00c7\64"+
		"\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb"+
		"8\3\2\2\2\u00cc\u00cd\7-\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7/\2\2\u00cf<"+
		"\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4@\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6\u00d7\7?\2\2\u00d7B\3"+
		"\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00daD\3\2\2\2\u00db\u00dc"+
		"\7#\2\2\u00dc\u00dd\7?\2\2\u00ddF\3\2\2\2\u00de\u00df\7o\2\2\u00df\u00e0"+
		"\7q\2\2\u00e0\u00e1\7f\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7~\2\2\u00e3\u00e4"+
		"\7~\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7(\2\2\u00e6\u00e7\7(\2\2\u00e7L\3"+
		"\2\2\2\u00e8\u00e9\7#\2\2\u00e9N\3\2\2\2\u00ea\u00eb\7~\2\2\u00ebP\3\2"+
		"\2\2\u00ec\u00ed\7(\2\2\u00edR\3\2\2\2\u00ee\u00ef\7y\2\2\u00ef\u00f0"+
		"\7j\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"T\3\2\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7q\2\2\u00f6V\3\2\2\2\u00f7\u00f8"+
		"\7h\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00faX\3\2\2\2\u00fb\u00fc"+
		"\7k\2\2\u00fc\u00fd\7p\2\2\u00fdZ\3\2\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100"+
		"\7h\2\2\u0100\\\3\2\2\2\u0101\u0102\7g\2\2\u0102\u0103\7n\2\2\u0103\u0104"+
		"\7u\2\2\u0104\u0105\7g\2\2\u0105\u0106\7\"\2\2\u0106\u0107\7k\2\2\u0107"+
		"\u0108\7h\2\2\u0108^\3\2\2\2\u0109\u010a\7g\2\2\u010a\u010b\7n\2\2\u010b"+
		"\u010c\7u\2\2\u010c\u010d\7g\2\2\u010d`\3\2\2\2\u010e\u010f\7e\2\2\u010f"+
		"\u0110\7j\2\2\u0110\u0111\7c\2\2\u0111\u0112\7t\2\2\u0112b\3\2\2\2\u0113"+
		"\u0114\7d\2\2\u0114\u0115\7{\2\2\u0115\u0116\7v\2\2\u0116\u0117\7g\2\2"+
		"\u0117d\3\2\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7v\2"+
		"\2\u011bf\3\2\2\2\u011c\u011d\7d\2\2\u011d\u011e\7q\2\2\u011e\u011f\7"+
		"q\2\2\u011f\u0120\7n\2\2\u0120h\3\2\2\2\u0121\u0125\t\2\2\2\u0122\u0124"+
		"\t\3\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126j\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\t\4\2\2"+
		"\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012cl\3\2\2\2\u012d\u012e\t\5\2\2\u012en\3\2\2\2\u012f\u0131"+
		"\7)\2\2\u0130\u0132\7^\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\t\6\2\2\u0134\u0135\7)\2\2\u0135p\3\2\2\2\u0136"+
		"\u013a\7$\2\2\u0137\u0139\t\6\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\7$\2\2\u013er\3\2\2\2\u013f\u0141\t\7\2\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b:\2\2\u0145t\3\2\2\2\b\2\u0125\u012b"+
		"\u0131\u013a\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}