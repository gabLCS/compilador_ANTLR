// Generated from C:/Users/gabriel/Downloads/Compressed/Trab_SimpAlg/projeto1/projeto1/src/SimpAlg.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpAlgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INT=4, BOOL=5, COMMENT=6, STRING=7, FLOAT=8, PRINT=9, 
		SCAN=10, IF=11, ELSE=12, WHILE=13, ID=14, NUM=15, NUMREAL=16, PLUS=17, 
		MINUS=18, MULT=19, DIV=20, MOD=21, GT=22, LT=23, GE=24, LE=25, EQ=26, 
		NEQ=27, NOT=28, AND=29, OR=30, SEMI=31, LBRACE=32, RBRACE=33, LPAREN=34, 
		RPAREN=35, COMMA=36, WS=37;
	public static final int
		RULE_program = 0, RULE_declaracoes = 1, RULE_declaracao = 2, RULE_comandos = 3, 
		RULE_comando = 4, RULE_atribuicao = 5, RULE_comandoPrint = 6, RULE_printParams = 7, 
		RULE_printParam = 8, RULE_comandoScan = 9, RULE_comandoIf = 10, RULE_comandoWhile = 11, 
		RULE_iDList = 12, RULE_expLogica = 13, RULE_expressaoOR = 14, RULE_expressaoAND = 15, 
		RULE_expressaoIGUAL = 16, RULE_expressaoRelacional = 17, RULE_expressao = 18, 
		RULE_start = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaracoes", "declaracao", "comandos", "comando", "atribuicao", 
			"comandoPrint", "printParams", "printParam", "comandoScan", "comandoIf", 
			"comandoWhile", "iDList", "expLogica", "expressaoOR", "expressaoAND", 
			"expressaoIGUAL", "expressaoRelacional", "expressao", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'program'", "'='", "'int'", null, null, null, "'float'", 
			"'print'", "'scan'", "'if'", "'else'", "'while'", null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'!'", "'and'", "'or'", "';'", "'{'", "'}'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT", "BOOL", "COMMENT", "STRING", "FLOAT", 
			"PRINT", "SCAN", "IF", "ELSE", "WHILE", "ID", "NUM", "NUMREAL", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "GT", "LT", "GE", "LE", "EQ", "NEQ", "NOT", 
			"AND", "OR", "SEMI", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COMMA", 
			"WS"
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
	public String getGrammarFileName() { return "SimpAlg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Integer> tabela = new HashMap<String, Integer>();
	    ArrayList<String> code = new ArrayList<String>();
	    int cont = 0;
	    int linhaV, linhaF;
	    String newTemp() {
	        cont++;
	        return "_t" + Integer.toString(cont);
	    }
	    String newLabel() {
	        cont++;
	        return ".l" + Integer.toString(cont);
	    }
	    boolean isVariavel(String str) {
	        return tabela.containsKey(str);
	    }

	    boolean isNumero(String str) {
	        return str.matches("^-?\\d*\\.?\\d+$");
	    }
	    boolean isIntType(String str) {
	        return str.matches("^-?\\d+$");
	    }

	public SimpAlgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(SimpAlgParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SimpAlgParser.LBRACE, i);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SimpAlgParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SimpAlgParser.RBRACE, i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(LBRACE);
			setState(42);
			declaracoes();
			setState(43);
			match(RBRACE);
			setState(44);
			match(T__1);
			setState(45);
			match(LBRACE);
			setState(46);
			comandos();
			setState(47);
			match(RBRACE);

			System.out.println("\nfrom goto import with_goto");
			System.out.println("@with_goto");
			System.out.println("def main(): ");
			for (int i = 0; i < code.size() ; i++)
			System.out.println(code.get(i));
			System.out.println("main()");

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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SimpAlgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SimpAlgParser.SEMI, i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				declaracao();
				setState(51);
				match(SEMI);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==FLOAT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode INT() { return getToken(SimpAlgParser.INT, 0); }
		public TerminalNode ID() { return getToken(SimpAlgParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(SimpAlgParser.FLOAT, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(INT);
				setState(58);
				((DeclaracaoContext)_localctx).ID = match(ID);

				            if (!tabela.containsKey((((DeclaracaoContext)_localctx).ID!=null?((DeclaracaoContext)_localctx).ID.getText():null))) tabela.put((((DeclaracaoContext)_localctx).ID!=null?((DeclaracaoContext)_localctx).ID.getText():null), 1);
				            else throw new ArithmeticException("variavel ja declarada");
				            
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(FLOAT);
				setState(61);
				((DeclaracaoContext)_localctx).ID = match(ID);

				            if (!tabela.containsKey((((DeclaracaoContext)_localctx).ID!=null?((DeclaracaoContext)_localctx).ID.getText():null))) tabela.put((((DeclaracaoContext)_localctx).ID!=null?((DeclaracaoContext)_localctx).ID.getText():null), 2);
				            else throw new ArithmeticException("variavel ja declarada");
				            
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public String code;
		public ComandoContext a;
		public List<TerminalNode> COMMENT() { return getTokens(SimpAlgParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SimpAlgParser.COMMENT, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ComandosContext)_localctx).code =  "";
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28160L) != 0)) {
				{
				{
				setState(66);
				((ComandosContext)_localctx).a = comando();
				_localctx.code += ((ComandosContext)_localctx).a.code;
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(74);
				match(COMMENT);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public String code;
		public ComandoPrintContext comandoPrint() {
			return getRuleContext(ComandoPrintContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpAlgParser.SEMI, 0); }
		public ComandoScanContext comandoScan() {
			return getRuleContext(ComandoScanContext.class,0);
		}
		public ComandoIfContext comandoIf() {
			return getRuleContext(ComandoIfContext.class,0);
		}
		public ComandoWhileContext comandoWhile() {
			return getRuleContext(ComandoWhileContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				comandoPrint();
				setState(81);
				match(SEMI);
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				comandoScan();
				setState(84);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				comandoIf();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				comandoWhile();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				atribuicao();
				setState(89);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public String code;
		public Token ID;
		public ExpressaoContext expressao;
		public TerminalNode ID() { return getToken(SimpAlgParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((AtribuicaoContext)_localctx).ID = match(ID);
			setState(94);
			match(T__2);
			setState(95);
			((AtribuicaoContext)_localctx).expressao = expressao(0);

			if(!tabela.containsKey((((AtribuicaoContext)_localctx).ID!=null?((AtribuicaoContext)_localctx).ID.getText():null))){
			throw new ArithmeticException("variavel não declarada");
			}

			code.add("\t" + (((AtribuicaoContext)_localctx).ID!=null?((AtribuicaoContext)_localctx).ID.getText():null) + " = " +  ((AtribuicaoContext)_localctx).expressao.var);



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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoPrintContext extends ParserRuleContext {
		public String code;
		public PrintParamsContext a;
		public TerminalNode PRINT() { return getToken(SimpAlgParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(SimpAlgParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpAlgParser.RPAREN, 0); }
		public PrintParamsContext printParams() {
			return getRuleContext(PrintParamsContext.class,0);
		}
		public ComandoPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterComandoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitComandoPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitComandoPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoPrintContext comandoPrint() throws RecognitionException {
		ComandoPrintContext _localctx = new ComandoPrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandoPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PRINT);
			setState(99);
			match(LPAREN);
			setState(100);
			((ComandoPrintContext)_localctx).a = printParams();
			setState(101);
			match(RPAREN);

			String VarA = new String();
			VarA = ((ComandoPrintContext)_localctx).a.var;
			code.add("\tprint (" + VarA + ");");

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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintParamsContext extends ParserRuleContext {
		public String var;
		public PrintParamContext a;
		public PrintParamContext b;
		public List<PrintParamContext> printParam() {
			return getRuleContexts(PrintParamContext.class);
		}
		public PrintParamContext printParam(int i) {
			return getRuleContext(PrintParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpAlgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpAlgParser.COMMA, i);
		}
		public PrintParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterPrintParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitPrintParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitPrintParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintParamsContext printParams() throws RecognitionException {
		PrintParamsContext _localctx = new PrintParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((PrintParamsContext)_localctx).a = printParam();
			String test = new String();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				((PrintParamsContext)_localctx).b = printParam();
				test = test + "," + ((PrintParamsContext)_localctx).b.var;
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			String temp = new String();
			temp = ((PrintParamsContext)_localctx).a.var;
			((PrintParamsContext)_localctx).var =  newTemp();
			if(((PrintParamsContext)_localctx).b.var!=null){
			temp = temp  + test;
			}
			((PrintParamsContext)_localctx).var =  temp;

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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintParamContext extends ParserRuleContext {
		public String var;
		public ExpressaoContext a;
		public Token b;
		public Token c;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SimpAlgParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(SimpAlgParser.NUM, 0); }
		public PrintParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterPrintParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitPrintParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitPrintParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintParamContext printParam() throws RecognitionException {
		PrintParamContext _localctx = new PrintParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printParam);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((PrintParamContext)_localctx).a = expressao(0);
				((PrintParamContext)_localctx).var =  ((PrintParamContext)_localctx).a.var;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				((PrintParamContext)_localctx).b = match(STRING);
				((PrintParamContext)_localctx).var =  (((PrintParamContext)_localctx).b!=null?((PrintParamContext)_localctx).b.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				((PrintParamContext)_localctx).c = match(NUM);
				((PrintParamContext)_localctx).var =  (((PrintParamContext)_localctx).c!=null?((PrintParamContext)_localctx).c.getText():null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(SimpAlgParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(SimpAlgParser.LPAREN, 0); }
		public IDListContext iDList() {
			return getRuleContext(IDListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpAlgParser.RPAREN, 0); }
		public ComandoScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoScan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterComandoScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitComandoScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitComandoScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoScanContext comandoScan() throws RecognitionException {
		ComandoScanContext _localctx = new ComandoScanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comandoScan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SCAN);
			setState(127);
			match(LPAREN);
			setState(128);
			iDList();
			setState(129);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoIfContext extends ParserRuleContext {
		public String code;
		public ExpLogicaContext c;
		public ComandosContext a;
		public ComandosContext b;
		public TerminalNode IF() { return getToken(SimpAlgParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SimpAlgParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpAlgParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(SimpAlgParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SimpAlgParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SimpAlgParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SimpAlgParser.RBRACE, i);
		}
		public ExpLogicaContext expLogica() {
			return getRuleContext(ExpLogicaContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpAlgParser.ELSE, 0); }
		public ComandoIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterComandoIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitComandoIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitComandoIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoIfContext comandoIf() throws RecognitionException {
		ComandoIfContext _localctx = new ComandoIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IF);
			setState(132);
			match(LPAREN);
			setState(133);
			((ComandoIfContext)_localctx).c = expLogica();
			setState(134);
			match(RPAREN);
			setState(135);
			match(LBRACE);

			linhaV = code.size();
			String tmp = newTemp();
			String lfalse = newLabel();
			code.add(linhaV, "\t" + tmp + " = " + ((ComandoIfContext)_localctx).c.var);
			code.add(linhaV+1,"\tif " + tmp + " == false: goto " + lfalse);

			setState(137);
			((ComandoIfContext)_localctx).a = comandos();

			int linhaX = code.size();
			String lend = newLabel();
			code.add(linhaX, "\tlabel " + lfalse);

			setState(139);
			match(RBRACE);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(140);
				match(ELSE);
				setState(141);
				match(LBRACE);

				 int linhaT = code.size();
				 code.add(linhaX, "\tgoto " + lend);

				 
				setState(143);
				((ComandoIfContext)_localctx).b = comandos();

				 linhaF = code.size();
				 code.add(linhaF,"\tlabel " + lend);
				 
				setState(145);
				match(RBRACE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoWhileContext extends ParserRuleContext {
		public String code;
		public ExpLogicaContext a;
		public ComandosContext b;
		public TerminalNode WHILE() { return getToken(SimpAlgParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SimpAlgParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpAlgParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(SimpAlgParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpAlgParser.RBRACE, 0); }
		public ExpLogicaContext expLogica() {
			return getRuleContext(ExpLogicaContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterComandoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitComandoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitComandoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoWhileContext comandoWhile() throws RecognitionException {
		ComandoWhileContext _localctx = new ComandoWhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(WHILE);
			setState(150);
			match(LPAREN);
			setState(151);
			((ComandoWhileContext)_localctx).a = expLogica();

			 linhaV = code.size();
			 String tmp = newTemp();
			 String lfalse = newLabel();
			 String lreturn = newLabel();
			 code.add(linhaV, "\t" + tmp + " = " + ((ComandoWhileContext)_localctx).a.var);
			 code.add(linhaV+1,"\tif " + tmp + " == false: goto " + lfalse);
			 code.add(linhaV+1,"\tlabel " + lreturn);
			 
			setState(153);
			match(RPAREN);
			setState(154);
			match(LBRACE);
			setState(155);
			((ComandoWhileContext)_localctx).b = comandos();

			 int linhaT = code.size();
			 code.add(linhaT, "\tgoto " + lreturn);
			 code.add(linhaT+1, "\tlabel " + lfalse);
			 
			setState(157);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IDListContext extends ParserRuleContext {
		public String var;
		public List<TerminalNode> ID() { return getTokens(SimpAlgParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpAlgParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpAlgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpAlgParser.COMMA, i);
		}
		public IDListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iDList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterIDList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitIDList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitIDList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IDListContext iDList() throws RecognitionException {
		IDListContext _localctx = new IDListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iDList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(160);
				match(COMMA);
				setState(161);
				match(ID);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpLogicaContext extends ParserRuleContext {
		public String var;
		public ExpressaoORContext a;
		public ExpressaoORContext expressaoOR() {
			return getRuleContext(ExpressaoORContext.class,0);
		}
		public ExpLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterExpLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitExpLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitExpLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpLogicaContext expLogica() throws RecognitionException {
		ExpLogicaContext _localctx = new ExpLogicaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expLogica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((ExpLogicaContext)_localctx).a = expressaoOR();
			 ((ExpLogicaContext)_localctx).var =  ((ExpLogicaContext)_localctx).a.var;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoORContext extends ParserRuleContext {
		public String var;
		public ExpressaoANDContext a;
		public ExpressaoANDContext b;
		public List<ExpressaoANDContext> expressaoAND() {
			return getRuleContexts(ExpressaoANDContext.class);
		}
		public ExpressaoANDContext expressaoAND(int i) {
			return getRuleContext(ExpressaoANDContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SimpAlgParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SimpAlgParser.OR, i);
		}
		public ExpressaoORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterExpressaoOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitExpressaoOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitExpressaoOR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoORContext expressaoOR() throws RecognitionException {
		ExpressaoORContext _localctx = new ExpressaoORContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressaoOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((ExpressaoORContext)_localctx).a = expressaoAND();
			((ExpressaoORContext)_localctx).var =  ((ExpressaoORContext)_localctx).a.var;
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(172);
				match(OR);
				setState(173);
				((ExpressaoORContext)_localctx).b = expressaoAND();
				 ((ExpressaoORContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoORContext)_localctx).a.var + " or " + ((ExpressaoORContext)_localctx).b.var); 
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoANDContext extends ParserRuleContext {
		public String var;
		public ExpressaoIGUALContext a;
		public ExpressaoIGUALContext b;
		public List<ExpressaoIGUALContext> expressaoIGUAL() {
			return getRuleContexts(ExpressaoIGUALContext.class);
		}
		public ExpressaoIGUALContext expressaoIGUAL(int i) {
			return getRuleContext(ExpressaoIGUALContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpAlgParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SimpAlgParser.AND, i);
		}
		public ExpressaoANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterExpressaoAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitExpressaoAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitExpressaoAND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoANDContext expressaoAND() throws RecognitionException {
		ExpressaoANDContext _localctx = new ExpressaoANDContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressaoAND);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((ExpressaoANDContext)_localctx).a = expressaoIGUAL();
			((ExpressaoANDContext)_localctx).var =  ((ExpressaoANDContext)_localctx).a.var;
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(183);
				match(AND);
				setState(184);
				((ExpressaoANDContext)_localctx).b = expressaoIGUAL();
				 ((ExpressaoANDContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoANDContext)_localctx).a.var + " and " + ((ExpressaoANDContext)_localctx).b.var); 
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoIGUALContext extends ParserRuleContext {
		public String var;
		public ExpressaoRelacionalContext a;
		public ExpressaoRelacionalContext b;
		public List<ExpressaoRelacionalContext> expressaoRelacional() {
			return getRuleContexts(ExpressaoRelacionalContext.class);
		}
		public ExpressaoRelacionalContext expressaoRelacional(int i) {
			return getRuleContext(ExpressaoRelacionalContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SimpAlgParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SimpAlgParser.NEQ, 0); }
		public ExpressaoIGUALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoIGUAL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterExpressaoIGUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitExpressaoIGUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitExpressaoIGUAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoIGUALContext expressaoIGUAL() throws RecognitionException {
		ExpressaoIGUALContext _localctx = new ExpressaoIGUALContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressaoIGUAL);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((ExpressaoIGUALContext)_localctx).a = expressaoRelacional();
				((ExpressaoIGUALContext)_localctx).var =  ((ExpressaoIGUALContext)_localctx).a.var;
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(194);
					match(EQ);
					setState(195);
					((ExpressaoIGUALContext)_localctx).b = expressaoRelacional();
					 ((ExpressaoIGUALContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoIGUALContext)_localctx).a.var + " == " + ((ExpressaoIGUALContext)_localctx).b.var); 
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((ExpressaoIGUALContext)_localctx).a = expressaoRelacional();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEQ) {
					{
					setState(201);
					match(NEQ);
					setState(202);
					((ExpressaoIGUALContext)_localctx).b = expressaoRelacional();
					 ((ExpressaoIGUALContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoIGUALContext)_localctx).a.var + " !> " + ((ExpressaoIGUALContext)_localctx).b.var); 
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public String var;
		public ExpressaoContext a;
		public ExpressaoContext b;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(SimpAlgParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(SimpAlgParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(SimpAlgParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SimpAlgParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(SimpAlgParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(SimpAlgParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(SimpAlgParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(SimpAlgParser.GE, i);
		}
		public List<TerminalNode> EQ() { return getTokens(SimpAlgParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(SimpAlgParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(SimpAlgParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(SimpAlgParser.NEQ, i);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressaoRelacional);
		int _la;
		try {
			int _alt;
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				((ExpressaoRelacionalContext)_localctx).a = expressao(0);
				((ExpressaoRelacionalContext)_localctx).var =  ((ExpressaoRelacionalContext)_localctx).a.var;
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LT) {
					{
					{
					setState(211);
					match(LT);
					setState(212);
					((ExpressaoRelacionalContext)_localctx).b = expressao(0);
					 ((ExpressaoRelacionalContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoRelacionalContext)_localctx).a.var + " < " + ((ExpressaoRelacionalContext)_localctx).b.var); 
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((ExpressaoRelacionalContext)_localctx).a = expressao(0);
				((ExpressaoRelacionalContext)_localctx).var =  ((ExpressaoRelacionalContext)_localctx).a.var;
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==GT) {
					{
					{
					setState(222);
					match(GT);
					setState(223);
					((ExpressaoRelacionalContext)_localctx).b = expressao(0);
					 ((ExpressaoRelacionalContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoRelacionalContext)_localctx).a.var + " > " + ((ExpressaoRelacionalContext)_localctx).b.var); 
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				((ExpressaoRelacionalContext)_localctx).a = expressao(0);
				((ExpressaoRelacionalContext)_localctx).var =  ((ExpressaoRelacionalContext)_localctx).a.var;
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LE) {
					{
					{
					setState(233);
					match(LE);
					setState(234);
					((ExpressaoRelacionalContext)_localctx).b = expressao(0);
					 ((ExpressaoRelacionalContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoRelacionalContext)_localctx).a.var + " <= " + ((ExpressaoRelacionalContext)_localctx).b.var); 
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				((ExpressaoRelacionalContext)_localctx).a = expressao(0);
				((ExpressaoRelacionalContext)_localctx).var =  ((ExpressaoRelacionalContext)_localctx).a.var;
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==GE) {
					{
					{
					setState(244);
					match(GE);
					setState(245);
					((ExpressaoRelacionalContext)_localctx).b = expressao(0);
					 ((ExpressaoRelacionalContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoRelacionalContext)_localctx).a.var + " >= " + ((ExpressaoRelacionalContext)_localctx).b.var); 
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				((ExpressaoRelacionalContext)_localctx).a = expressao(0);
				((ExpressaoRelacionalContext)_localctx).var =  ((ExpressaoRelacionalContext)_localctx).a.var;
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						match(EQ);
						setState(256);
						((ExpressaoRelacionalContext)_localctx).b = expressao(0);
						 ((ExpressaoRelacionalContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoRelacionalContext)_localctx).a.var + " == " + ((ExpressaoRelacionalContext)_localctx).b.var); 
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				((ExpressaoRelacionalContext)_localctx).a = expressao(0);
				((ExpressaoRelacionalContext)_localctx).var =  ((ExpressaoRelacionalContext)_localctx).a.var;
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(266);
						match(NEQ);
						setState(267);
						((ExpressaoRelacionalContext)_localctx).b = expressao(0);
						 ((ExpressaoRelacionalContext)_localctx).var =  newTemp(); code.add("\t" + _localctx.var + " = " + ((ExpressaoRelacionalContext)_localctx).a.var + " != " + ((ExpressaoRelacionalContext)_localctx).b.var); 
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public String var;
		public ExpressaoContext a;
		public Token NUM;
		public Token NUMREAL;
		public Token ID;
		public ExpressaoContext b;
		public TerminalNode LPAREN() { return getToken(SimpAlgParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpAlgParser.RPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode NUM() { return getToken(SimpAlgParser.NUM, 0); }
		public TerminalNode NUMREAL() { return getToken(SimpAlgParser.NUMREAL, 0); }
		public TerminalNode ID() { return getToken(SimpAlgParser.ID, 0); }
		public TerminalNode MULT() { return getToken(SimpAlgParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(SimpAlgParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(SimpAlgParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SimpAlgParser.PLUS, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(278);
				match(LPAREN);
				setState(279);
				((ExpressaoContext)_localctx).a = expressao(0);
				setState(280);
				match(RPAREN);

				                  ((ExpressaoContext)_localctx).var =  ((ExpressaoContext)_localctx).a.var;
				              
				}
				break;
			case NUM:
				{
				setState(283);
				((ExpressaoContext)_localctx).NUM = match(NUM);

				                  ((ExpressaoContext)_localctx).var =  (((ExpressaoContext)_localctx).NUM!=null?((ExpressaoContext)_localctx).NUM.getText():null);
				              
				}
				break;
			case NUMREAL:
				{
				setState(285);
				((ExpressaoContext)_localctx).NUMREAL = match(NUMREAL);

				                  ((ExpressaoContext)_localctx).var =  (((ExpressaoContext)_localctx).NUMREAL!=null?((ExpressaoContext)_localctx).NUMREAL.getText():null);
				              
				}
				break;
			case ID:
				{
				setState(287);
				((ExpressaoContext)_localctx).ID = match(ID);

				                  ((ExpressaoContext)_localctx).var =  (((ExpressaoContext)_localctx).ID!=null?((ExpressaoContext)_localctx).ID.getText():null);
				              
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(291);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(292);
						match(MULT);
						setState(293);
						((ExpressaoContext)_localctx).b = expressao(9);

						                            if(isNumero(((ExpressaoContext)_localctx).a.var) && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                if(isIntType(((ExpressaoContext)_localctx).a.var) && isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                    // Se ambos forem inteiros, não fazer nada
						                                } else {
						                                    if(isIntType(((ExpressaoContext)_localctx).a.var)) {
						                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                        ((ExpressaoContext)_localctx).a.var += ".0";
						                                    }
						                                    if(isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                        ((ExpressaoContext)_localctx).b.var += ".0";
						                                    }
						                                }
						                            }

						                            if(isNumero(((ExpressaoContext)_localctx).a.var) && !isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                if(isIntType(((ExpressaoContext)_localctx).a.var) && tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                    // Se ambos forem inteiros, não fazer nada
						                                } else {
						                                    if(isIntType(((ExpressaoContext)_localctx).a.var)) {
						                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                        ((ExpressaoContext)_localctx).a.var += ".0";
						                                    }
						                                    if(tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                        tabela.put(((ExpressaoContext)_localctx).b.var, 2);
						                                    }
						                                }
						                            }

						                            if(!isNumero(((ExpressaoContext)_localctx).a.var) && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1 && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                    // Se ambos forem inteiros, não fazer nada
						                                } else {
						                                    if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1) {
						                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                        tabela.put(((ExpressaoContext)_localctx).a.var, 2);

						                                        if(isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                            System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                            ((ExpressaoContext)_localctx).b.var += ".0";
						                                        }
						                                    }
						                                }
						                            }

						                            if(!isNumero(((ExpressaoContext)_localctx).a.var) && !isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1 && tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                    // Se ambos forem inteiros, não fazer nada
						                                } else {
						                                    if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1) {
						                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                        tabela.put(((ExpressaoContext)_localctx).a.var, 2);
						                                    }
						                                    if(tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                        tabela.put(((ExpressaoContext)_localctx).b.var, 2);
						                                    }
						                                }
						                            }

						                            ((ExpressaoContext)_localctx).var =  newTemp();
						                            code.add("\t" + _localctx.var + " = " +  ((ExpressaoContext)_localctx).a.var + " * " + ((ExpressaoContext)_localctx).b.var);
						                        
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(296);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(297);
						match(MOD);
						setState(298);
						((ExpressaoContext)_localctx).b = expressao(8);

						                        ((ExpressaoContext)_localctx).var =  newTemp();
						                        if(!isIntType(((ExpressaoContext)_localctx).a.var) || !isIntType(((ExpressaoContext)_localctx).b.var) || ((ExpressaoContext)_localctx).a.var.equals("0")  || ((ExpressaoContext)_localctx).b.var.equals("0")){
						                        System.out.println("erro: Expressao mod usando float ou 0");
						                        throw new ArithmeticException("Mod por zero, ou numero real não permitida.");
						                        }else{
						                        code.add("\t" + _localctx.var + " = " +  ((ExpressaoContext)_localctx).a.var + " % " + ((ExpressaoContext)_localctx).b.var);
						                        }
						                        
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(301);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(302);
						match(DIV);
						setState(303);
						((ExpressaoContext)_localctx).b = expressao(7);

						                                      ((ExpressaoContext)_localctx).var =  newTemp();
						                                      if(((ExpressaoContext)_localctx).b.var.equals("0")){
						                                      System.out.println("erro: Expressao divisao usando 0");
						                                      throw new ArithmeticException("Divisao por zero não permitida.");
						                                      }else{
						                                            if(isNumero(((ExpressaoContext)_localctx).a.var) && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                            if(isIntType(((ExpressaoContext)_localctx).a.var) && isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                                                // Se ambos forem inteiros, não fazer nada
						                                                            } else {
						                                                                if(isIntType(((ExpressaoContext)_localctx).a.var)) {
						                                                                    System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                                    ((ExpressaoContext)_localctx).a.var += ".0";
						                                                                }
						                                                                if(isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                                                    System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                                    ((ExpressaoContext)_localctx).b.var += ".0";
						                                                                }
						                                                            }
						                                                        }

						                                                        if(isNumero(((ExpressaoContext)_localctx).a.var) && !isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                            if(isIntType(((ExpressaoContext)_localctx).a.var) && tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                                // Se ambos forem inteiros, não fazer nada
						                                                            } else {
						                                                                if(isIntType(((ExpressaoContext)_localctx).a.var)) {
						                                                                    System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                                    ((ExpressaoContext)_localctx).a.var += ".0";
						                                                                }
						                                                                if(tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                                    System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                                    tabela.put(((ExpressaoContext)_localctx).b.var, 2);
						                                                                }
						                                                            }
						                                                        }

						                                                        if(!isNumero(((ExpressaoContext)_localctx).a.var) && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                            if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1 && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                                // Se ambos forem inteiros, não fazer nada
						                                                            } else {
						                                                                if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1) {
						                                                                    System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                                    tabela.put(((ExpressaoContext)_localctx).a.var, 2);

						                                                                    if(isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                                                        System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                                        ((ExpressaoContext)_localctx).b.var += ".0";
						                                                                    }
						                                                                }
						                                                            }
						                                                        }

						                                                        if(!isNumero(((ExpressaoContext)_localctx).a.var) && !isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                            if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1 && tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                                // Se ambos forem inteiros, não fazer nada
						                                                            } else {
						                                                                if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1) {
						                                                                    System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                                    tabela.put(((ExpressaoContext)_localctx).a.var, 2);
						                                                                }
						                                                                if(tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                                    System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                                    tabela.put(((ExpressaoContext)_localctx).b.var, 2);
						                                                                }
						                                                            }
						                                                        }







						                                      code.add("\t" + _localctx.var + " = " +  ((ExpressaoContext)_localctx).a.var + " / " + ((ExpressaoContext)_localctx).b.var);
						                                      }
						                                      
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(306);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(307);
						match(PLUS);
						setState(308);
						((ExpressaoContext)_localctx).b = expressao(6);

						                                                  ((ExpressaoContext)_localctx).var =  newTemp();
						                                                  if(isNumero(((ExpressaoContext)_localctx).a.var) && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                  if(isIntType(((ExpressaoContext)_localctx).a.var) && isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                                      // Se ambos forem inteiros, não fazer nada
						                                                  } else {
						                                                      if(isIntType(((ExpressaoContext)_localctx).a.var)) {
						                                                          System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                          ((ExpressaoContext)_localctx).a.var += ".0";
						                                                      }
						                                                      if(isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                                          System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                          ((ExpressaoContext)_localctx).b.var += ".0";
						                                                      }
						                                                  }
						                                              }

						                                              if(isNumero(((ExpressaoContext)_localctx).a.var) && !isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                  if(isIntType(((ExpressaoContext)_localctx).a.var) && tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                      // Se ambos forem inteiros, não fazer nada
						                                                  } else {
						                                                      if(isIntType(((ExpressaoContext)_localctx).a.var)) {
						                                                          System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                          ((ExpressaoContext)_localctx).a.var += ".0";
						                                                      }
						                                                      if(tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                          System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                          tabela.put(((ExpressaoContext)_localctx).b.var, 2);
						                                                      }
						                                                  }
						                                              }

						                                              if(!isNumero(((ExpressaoContext)_localctx).a.var) && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                  if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1 && isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                      // Se ambos forem inteiros, não fazer nada
						                                                  } else {
						                                                      if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1) {
						                                                          System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                          tabela.put(((ExpressaoContext)_localctx).a.var, 2);

						                                                          if(isIntType(((ExpressaoContext)_localctx).b.var)) {
						                                                              System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                              ((ExpressaoContext)_localctx).b.var += ".0";
						                                                          }
						                                                      }
						                                                  }
						                                              }

						                                              if(!isNumero(((ExpressaoContext)_localctx).a.var) && !isNumero(((ExpressaoContext)_localctx).b.var)) {
						                                                  if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1 && tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                      // Se ambos forem inteiros, não fazer nada
						                                                  } else {
						                                                      if(tabela.get(((ExpressaoContext)_localctx).a.var) == 1) {
						                                                          System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).a.var + " para float");
						                                                          tabela.put(((ExpressaoContext)_localctx).a.var, 2);
						                                                      }
						                                                      if(tabela.get(((ExpressaoContext)_localctx).b.var) == 1) {
						                                                          System.out.println("Coerção realizada do inteiro " + ((ExpressaoContext)_localctx).b.var + " para float");
						                                                          tabela.put(((ExpressaoContext)_localctx).b.var, 2);
						                                                      }
						                                                  }
						                                              }
						                            code.add("\t" + _localctx.var + " = " +  ((ExpressaoContext)_localctx).a.var + " + " + ((ExpressaoContext)_localctx).b.var);
						                        
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpAlgListener ) ((SimpAlgListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpAlgVisitor ) return ((SimpAlgVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			program();
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
		case 18:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u013f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00016\b\u0001\u000b\u0001"+
		"\f\u00017\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003"+
		"\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007o\b\u0007"+
		"\n\u0007\f\u0007r\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b}\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0094\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00a3\b\f\n\f\f\f\u00a6\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00b1\b\u000e\n\u000e\f\u000e\u00b4\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00bc\b\u000f\n\u000f\f\u000f\u00bf\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c7\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ce"+
		"\b\u0010\u0003\u0010\u00d0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d8\b\u0011\n\u0011"+
		"\f\u0011\u00db\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00e3\b\u0011\n\u0011\f\u0011\u00e6"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00ee\b\u0011\n\u0011\f\u0011\u00f1\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00f9\b\u0011\n\u0011\f\u0011\u00fc\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0104\b\u0011\n"+
		"\u0011\f\u0011\u0107\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u010f\b\u0011\n\u0011\f\u0011"+
		"\u0112\t\u0011\u0003\u0011\u0114\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0122\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0138\b\u0012\n\u0012\f\u0012\u013b\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0001$\u0014\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&\u0000\u0000\u014e\u0000(\u0001\u0000\u0000\u0000\u00025\u0001\u0000"+
		"\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000"+
		"\b[\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fb\u0001\u0000"+
		"\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000"+
		"\u0012~\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016"+
		"\u0095\u0001\u0000\u0000\u0000\u0018\u009f\u0001\u0000\u0000\u0000\u001a"+
		"\u00a7\u0001\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e"+
		"\u00b5\u0001\u0000\u0000\u0000 \u00cf\u0001\u0000\u0000\u0000\"\u0113"+
		"\u0001\u0000\u0000\u0000$\u0121\u0001\u0000\u0000\u0000&\u013c\u0001\u0000"+
		"\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0005 \u0000\u0000*+\u0003\u0002"+
		"\u0001\u0000+,\u0005!\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0005 \u0000"+
		"\u0000./\u0003\u0006\u0003\u0000/0\u0005!\u0000\u000001\u0006\u0000\uffff"+
		"\uffff\u00001\u0001\u0001\u0000\u0000\u000023\u0003\u0004\u0002\u0000"+
		"34\u0005\u001f\u0000\u000046\u0001\u0000\u0000\u000052\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0005\u0004\u0000\u0000"+
		":;\u0005\u000e\u0000\u0000;@\u0006\u0002\uffff\uffff\u0000<=\u0005\b\u0000"+
		"\u0000=>\u0005\u000e\u0000\u0000>@\u0006\u0002\uffff\uffff\u0000?9\u0001"+
		"\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000"+
		"\u0000AG\u0006\u0003\uffff\uffff\u0000BC\u0003\b\u0004\u0000CD\u0006\u0003"+
		"\uffff\uffff\u0000DF\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000"+
		"FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HM\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0005\u0006"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0003\f\u0006\u0000QR\u0005\u001f\u0000"+
		"\u0000R\\\u0001\u0000\u0000\u0000ST\u0003\u0012\t\u0000TU\u0005\u001f"+
		"\u0000\u0000U\\\u0001\u0000\u0000\u0000V\\\u0003\u0014\n\u0000W\\\u0003"+
		"\u0016\u000b\u0000XY\u0003\n\u0005\u0000YZ\u0005\u001f\u0000\u0000Z\\"+
		"\u0001\u0000\u0000\u0000[P\u0001\u0000\u0000\u0000[S\u0001\u0000\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000\\\t\u0001\u0000\u0000\u0000]^\u0005\u000e\u0000\u0000^_\u0005"+
		"\u0003\u0000\u0000_`\u0003$\u0012\u0000`a\u0006\u0005\uffff\uffff\u0000"+
		"a\u000b\u0001\u0000\u0000\u0000bc\u0005\t\u0000\u0000cd\u0005\"\u0000"+
		"\u0000de\u0003\u000e\u0007\u0000ef\u0005#\u0000\u0000fg\u0006\u0006\uffff"+
		"\uffff\u0000g\r\u0001\u0000\u0000\u0000hi\u0003\u0010\b\u0000ip\u0006"+
		"\u0007\uffff\uffff\u0000jk\u0005$\u0000\u0000kl\u0003\u0010\b\u0000lm"+
		"\u0006\u0007\uffff\uffff\u0000mo\u0001\u0000\u0000\u0000nj\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"st\u0006\u0007\uffff\uffff\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0003"+
		"$\u0012\u0000vw\u0006\b\uffff\uffff\u0000w}\u0001\u0000\u0000\u0000xy"+
		"\u0005\u0007\u0000\u0000y}\u0006\b\uffff\uffff\u0000z{\u0005\u000f\u0000"+
		"\u0000{}\u0006\b\uffff\uffff\u0000|u\u0001\u0000\u0000\u0000|x\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0011\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\n\u0000\u0000\u007f\u0080\u0005\"\u0000\u0000\u0080\u0081"+
		"\u0003\u0018\f\u0000\u0081\u0082\u0005#\u0000\u0000\u0082\u0013\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u000b\u0000\u0000\u0084\u0085\u0005"+
		"\"\u0000\u0000\u0085\u0086\u0003\u001a\r\u0000\u0086\u0087\u0005#\u0000"+
		"\u0000\u0087\u0088\u0005 \u0000\u0000\u0088\u0089\u0006\n\uffff\uffff"+
		"\u0000\u0089\u008a\u0003\u0006\u0003\u0000\u008a\u008b\u0006\n\uffff\uffff"+
		"\u0000\u008b\u0093\u0005!\u0000\u0000\u008c\u008d\u0005\f\u0000\u0000"+
		"\u008d\u008e\u0005 \u0000\u0000\u008e\u008f\u0006\n\uffff\uffff\u0000"+
		"\u008f\u0090\u0003\u0006\u0003\u0000\u0090\u0091\u0006\n\uffff\uffff\u0000"+
		"\u0091\u0092\u0005!\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093"+
		"\u008c\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0005\r\u0000\u0000\u0096\u0097"+
		"\u0005\"\u0000\u0000\u0097\u0098\u0003\u001a\r\u0000\u0098\u0099\u0006"+
		"\u000b\uffff\uffff\u0000\u0099\u009a\u0005#\u0000\u0000\u009a\u009b\u0005"+
		" \u0000\u0000\u009b\u009c\u0003\u0006\u0003\u0000\u009c\u009d\u0006\u000b"+
		"\uffff\uffff\u0000\u009d\u009e\u0005!\u0000\u0000\u009e\u0017\u0001\u0000"+
		"\u0000\u0000\u009f\u00a4\u0005\u000e\u0000\u0000\u00a0\u00a1\u0005$\u0000"+
		"\u0000\u00a1\u00a3\u0005\u000e\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0019\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e"+
		"\u0000\u00a8\u00a9\u0006\r\uffff\uffff\u0000\u00a9\u001b\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0003\u001e\u000f\u0000\u00ab\u00b2\u0006\u000e\uffff"+
		"\uffff\u0000\u00ac\u00ad\u0005\u001e\u0000\u0000\u00ad\u00ae\u0003\u001e"+
		"\u000f\u0000\u00ae\u00af\u0006\u000e\uffff\uffff\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u001d\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0003 \u0010\u0000\u00b6\u00bd\u0006\u000f"+
		"\uffff\uffff\u0000\u00b7\u00b8\u0005\u001d\u0000\u0000\u00b8\u00b9\u0003"+
		" \u0010\u0000\u00b9\u00ba\u0006\u000f\uffff\uffff\u0000\u00ba\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u001f\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0003\"\u0011\u0000\u00c1\u00c6\u0006\u0010"+
		"\uffff\uffff\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3\u00c4\u0003"+
		"\"\u0011\u0000\u00c4\u00c5\u0006\u0010\uffff\uffff\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00d0\u0001\u0000\u0000\u0000\u00c8\u00cd\u0003"+
		"\"\u0011\u0000\u00c9\u00ca\u0005\u001b\u0000\u0000\u00ca\u00cb\u0003\""+
		"\u0011\u0000\u00cb\u00cc\u0006\u0010\uffff\uffff\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00c8\u0001\u0000\u0000\u0000\u00d0!\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0003$\u0012\u0000\u00d2\u00d9\u0006\u0011\uffff"+
		"\uffff\u0000\u00d3\u00d4\u0005\u0017\u0000\u0000\u00d4\u00d5\u0003$\u0012"+
		"\u0000\u00d5\u00d6\u0006\u0011\uffff\uffff\u0000\u00d6\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u0114\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0003$\u0012\u0000\u00dd\u00e4\u0006\u0011\uffff"+
		"\uffff\u0000\u00de\u00df\u0005\u0016\u0000\u0000\u00df\u00e0\u0003$\u0012"+
		"\u0000\u00e0\u00e1\u0006\u0011\uffff\uffff\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u0114\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0003$\u0012\u0000\u00e8\u00ef\u0006\u0011\uffff"+
		"\uffff\u0000\u00e9\u00ea\u0005\u0019\u0000\u0000\u00ea\u00eb\u0003$\u0012"+
		"\u0000\u00eb\u00ec\u0006\u0011\uffff\uffff\u0000\u00ec\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u0114\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0003$\u0012\u0000\u00f3\u00fa\u0006\u0011\uffff"+
		"\uffff\u0000\u00f4\u00f5\u0005\u0018\u0000\u0000\u00f5\u00f6\u0003$\u0012"+
		"\u0000\u00f6\u00f7\u0006\u0011\uffff\uffff\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u0114\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0003$\u0012\u0000\u00fe\u0105\u0006\u0011\uffff"+
		"\uffff\u0000\u00ff\u0100\u0005\u001a\u0000\u0000\u0100\u0101\u0003$\u0012"+
		"\u0000\u0101\u0102\u0006\u0011\uffff\uffff\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u0114\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0003$\u0012\u0000\u0109\u0110\u0006\u0011\uffff"+
		"\uffff\u0000\u010a\u010b\u0005\u001b\u0000\u0000\u010b\u010c\u0003$\u0012"+
		"\u0000\u010c\u010d\u0006\u0011\uffff\uffff\u0000\u010d\u010f\u0001\u0000"+
		"\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0113\u00d1\u0001\u0000\u0000\u0000\u0113\u00dc\u0001\u0000"+
		"\u0000\u0000\u0113\u00e7\u0001\u0000\u0000\u0000\u0113\u00f2\u0001\u0000"+
		"\u0000\u0000\u0113\u00fd\u0001\u0000\u0000\u0000\u0113\u0108\u0001\u0000"+
		"\u0000\u0000\u0114#\u0001\u0000\u0000\u0000\u0115\u0116\u0006\u0012\uffff"+
		"\uffff\u0000\u0116\u0117\u0005\"\u0000\u0000\u0117\u0118\u0003$\u0012"+
		"\u0000\u0118\u0119\u0005#\u0000\u0000\u0119\u011a\u0006\u0012\uffff\uffff"+
		"\u0000\u011a\u0122\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u000f\u0000"+
		"\u0000\u011c\u0122\u0006\u0012\uffff\uffff\u0000\u011d\u011e\u0005\u0010"+
		"\u0000\u0000\u011e\u0122\u0006\u0012\uffff\uffff\u0000\u011f\u0120\u0005"+
		"\u000e\u0000\u0000\u0120\u0122\u0006\u0012\uffff\uffff\u0000\u0121\u0115"+
		"\u0001\u0000\u0000\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0121\u011d"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0139"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\n\b\u0000\u0000\u0124\u0125\u0005"+
		"\u0013\u0000\u0000\u0125\u0126\u0003$\u0012\t\u0126\u0127\u0006\u0012"+
		"\uffff\uffff\u0000\u0127\u0138\u0001\u0000\u0000\u0000\u0128\u0129\n\u0007"+
		"\u0000\u0000\u0129\u012a\u0005\u0015\u0000\u0000\u012a\u012b\u0003$\u0012"+
		"\b\u012b\u012c\u0006\u0012\uffff\uffff\u0000\u012c\u0138\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\n\u0006\u0000\u0000\u012e\u012f\u0005\u0014\u0000\u0000"+
		"\u012f\u0130\u0003$\u0012\u0007\u0130\u0131\u0006\u0012\uffff\uffff\u0000"+
		"\u0131\u0138\u0001\u0000\u0000\u0000\u0132\u0133\n\u0005\u0000\u0000\u0133"+
		"\u0134\u0005\u0011\u0000\u0000\u0134\u0135\u0003$\u0012\u0006\u0135\u0136"+
		"\u0006\u0012\uffff\uffff\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u0123\u0001\u0000\u0000\u0000\u0137\u0128\u0001\u0000\u0000\u0000\u0137"+
		"\u012d\u0001\u0000\u0000\u0000\u0137\u0132\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a%\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0003\u0000\u0000\u0000\u013d\'\u0001"+
		"\u0000\u0000\u0000\u00187?GM[p|\u0093\u00a4\u00b2\u00bd\u00c6\u00cd\u00cf"+
		"\u00d9\u00e4\u00ef\u00fa\u0105\u0110\u0113\u0121\u0137\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}