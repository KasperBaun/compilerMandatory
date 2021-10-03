// Generated from impl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, FLOAT=24, MULTIDIV=25, 
		ADDSUB=26, ALPHA=27, NUM=28, WHITESPACE=29, COMMENT=30, COMMENT2=31;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_command = 2, RULE_expr = 3, RULE_condition = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "command", "expr", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'\"'", "'['", "']'", "'output'", "'while'", 
			"'('", "')'", "'for'", "'..'", "'if'", "'&&'", "'||'", "'!='", "'=='", 
			"'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"FLOAT", "MULTIDIV", "ADDSUB", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
			"COMMENT2"
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
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << ID))) != 0)) {
				{
				{
				setState(10);
				((StartContext)_localctx).command = command();
				((StartContext)_localctx).cs.add(((StartContext)_localctx).command);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleCommandsContext extends ProgramContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MultipleCommandsContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMultipleCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMultipleCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMultipleCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCommandContext extends ProgramContext {
		public CommandContext c;
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleCommandContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSingleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__11:
			case T__13:
			case ID:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((SingleCommandContext)_localctx).c = command();
				}
				break;
			case T__0:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(T__0);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << ID))) != 0)) {
					{
					{
					setState(20);
					((MultipleCommandsContext)_localctx).command = command();
					((MultipleCommandsContext)_localctx).cs.add(((MultipleCommandsContext)_localctx).command);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(T__1);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends CommandContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignContext extends CommandContext {
		public Token x;
		public ExprContext i;
		public ExprContext n;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAssignContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitArrayAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public IfStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends CommandContext {
		public Token x;
		public ExprContext i;
		public ExprContext n;
		public ProgramContext p;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ForLoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputContext extends CommandContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignContext extends CommandContext {
		public Token x;
		public Token s;
		public List<TerminalNode> ID() { return getTokens(implParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(implParser.ID, i);
		}
		public StringAssignContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStringAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStringAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStringAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileLoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((AssignmentContext)_localctx).x = match(ID);
				setState(30);
				match(T__2);
				setState(31);
				((AssignmentContext)_localctx).e = expr(0);
				setState(32);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new StringAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((StringAssignContext)_localctx).x = match(ID);
				setState(35);
				match(T__2);
				setState(36);
				match(T__4);
				setState(37);
				((StringAssignContext)_localctx).s = match(ID);
				setState(38);
				match(T__4);
				setState(39);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				((ArrayAssignContext)_localctx).x = match(ID);
				setState(41);
				match(T__5);
				setState(42);
				((ArrayAssignContext)_localctx).i = expr(0);
				setState(43);
				match(T__6);
				setState(44);
				match(T__2);
				setState(45);
				((ArrayAssignContext)_localctx).n = expr(0);
				setState(46);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(T__7);
				setState(49);
				((OutputContext)_localctx).e = expr(0);
				setState(50);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__8);
				setState(53);
				match(T__9);
				setState(54);
				((WhileLoopContext)_localctx).c = condition(0);
				setState(55);
				match(T__10);
				setState(56);
				((WhileLoopContext)_localctx).p = program();
				}
				break;
			case 6:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(T__11);
				setState(59);
				match(T__9);
				setState(60);
				((ForLoopContext)_localctx).x = match(ID);
				setState(61);
				match(T__2);
				setState(62);
				((ForLoopContext)_localctx).i = expr(0);
				setState(63);
				match(T__12);
				setState(64);
				((ForLoopContext)_localctx).n = expr(0);
				setState(65);
				match(T__10);
				setState(66);
				((ForLoopContext)_localctx).p = program();
				}
				break;
			case 7:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				match(T__13);
				setState(69);
				match(T__9);
				setState(70);
				((IfStatementContext)_localctx).c = condition(0);
				setState(71);
				match(T__10);
				setState(72);
				((IfStatementContext)_localctx).p = program();
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
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode FLOAT() { return getToken(implParser.FLOAT, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationAndDivisionContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIDIV() { return getToken(implParser.MULTIDIV, 0); }
		public MultiplicationAndDivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMultiplicationAndDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMultiplicationAndDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMultiplicationAndDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionAndSubtractionContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADDSUB() { return getToken(implParser.ADDSUB, 0); }
		public AdditionAndSubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAdditionAndSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAdditionAndSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAdditionAndSubtraction(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(T__9);
				setState(78);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(79);
				match(T__10);
				}
				break;
			case FLOAT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				((ConstantContext)_localctx).c = match(FLOAT);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationAndDivisionContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationAndDivisionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						((MultiplicationAndDivisionContext)_localctx).op = match(MULTIDIV);
						setState(87);
						((MultiplicationAndDivisionContext)_localctx).e2 = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AdditionAndSubtractionContext(new ExprContext(_parentctx, _parentState));
						((AdditionAndSubtractionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
						((AdditionAndSubtractionContext)_localctx).op = match(ADDSUB);
						setState(90);
						((AdditionAndSubtractionContext)_localctx).e2 = expr(4);
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnequalContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public UnequalContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterUnequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitUnequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitUnequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndContext extends ConditionContext {
		public ConditionContext con1;
		public ConditionContext con2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LogicalAndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserThanOrEqualsContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LesserThanOrEqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLesserThanOrEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLesserThanOrEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLesserThanOrEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanOrEqualsContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanOrEqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterGreaterThanOrEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitGreaterThanOrEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitGreaterThanOrEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrContext extends ConditionContext {
		public ConditionContext con1;
		public ConditionContext con2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LogicalOrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserThanContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LesserThanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLesserThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLesserThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLesserThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new UnequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				((UnequalContext)_localctx).e1 = expr(0);
				setState(98);
				match(T__16);
				setState(99);
				((UnequalContext)_localctx).e2 = expr(0);
				}
				break;
			case 2:
				{
				_localctx = new EqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				((EqualsContext)_localctx).e1 = expr(0);
				setState(102);
				match(T__17);
				setState(103);
				((EqualsContext)_localctx).e2 = expr(0);
				}
				break;
			case 3:
				{
				_localctx = new GreaterThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((GreaterThanContext)_localctx).e1 = expr(0);
				setState(106);
				match(T__18);
				setState(107);
				((GreaterThanContext)_localctx).e2 = expr(0);
				}
				break;
			case 4:
				{
				_localctx = new GreaterThanOrEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				((GreaterThanOrEqualsContext)_localctx).e1 = expr(0);
				setState(110);
				match(T__19);
				setState(111);
				((GreaterThanOrEqualsContext)_localctx).e2 = expr(0);
				}
				break;
			case 5:
				{
				_localctx = new LesserThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				((LesserThanContext)_localctx).e1 = expr(0);
				setState(114);
				match(T__20);
				setState(115);
				((LesserThanContext)_localctx).e2 = expr(0);
				}
				break;
			case 6:
				{
				_localctx = new LesserThanOrEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				((LesserThanOrEqualsContext)_localctx).e1 = expr(0);
				setState(118);
				match(T__21);
				setState(119);
				((LesserThanOrEqualsContext)_localctx).e2 = expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalAndContext(new ConditionContext(_parentctx, _parentState));
						((LogicalAndContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(123);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(124);
						match(T__14);
						setState(125);
						((LogicalAndContext)_localctx).con2 = condition(9);
						}
						break;
					case 2:
						{
						_localctx = new LogicalOrContext(new ConditionContext(_parentctx, _parentState));
						((LogicalOrContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						match(T__15);
						setState(128);
						((LogicalOrContext)_localctx).con2 = condition(8);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 4:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6|\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087"+
		"\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\2\2\u0097\2\17\3\2\2\2\4\35\3\2\2\2\6"+
		"L\3\2\2\2\bU\3\2\2\2\n{\3\2\2\2\f\16\5\6\4\2\r\f\3\2\2\2\16\21\3\2\2\2"+
		"\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3"+
		"\23\3\3\2\2\2\24\36\5\6\4\2\25\31\7\3\2\2\26\30\5\6\4\2\27\26\3\2\2\2"+
		"\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2"+
		"\34\36\7\4\2\2\35\24\3\2\2\2\35\25\3\2\2\2\36\5\3\2\2\2\37 \7\31\2\2 "+
		"!\7\5\2\2!\"\5\b\5\2\"#\7\6\2\2#M\3\2\2\2$%\7\31\2\2%&\7\5\2\2&\'\7\7"+
		"\2\2\'(\7\31\2\2()\7\7\2\2)M\7\6\2\2*+\7\31\2\2+,\7\b\2\2,-\5\b\5\2-."+
		"\7\t\2\2./\7\5\2\2/\60\5\b\5\2\60\61\7\6\2\2\61M\3\2\2\2\62\63\7\n\2\2"+
		"\63\64\5\b\5\2\64\65\7\6\2\2\65M\3\2\2\2\66\67\7\13\2\2\678\7\f\2\289"+
		"\5\n\6\29:\7\r\2\2:;\5\4\3\2;M\3\2\2\2<=\7\16\2\2=>\7\f\2\2>?\7\31\2\2"+
		"?@\7\5\2\2@A\5\b\5\2AB\7\17\2\2BC\5\b\5\2CD\7\r\2\2DE\5\4\3\2EM\3\2\2"+
		"\2FG\7\20\2\2GH\7\f\2\2HI\5\n\6\2IJ\7\r\2\2JK\5\4\3\2KM\3\2\2\2L\37\3"+
		"\2\2\2L$\3\2\2\2L*\3\2\2\2L\62\3\2\2\2L\66\3\2\2\2L<\3\2\2\2LF\3\2\2\2"+
		"M\7\3\2\2\2NO\b\5\1\2OP\7\f\2\2PQ\5\b\5\2QR\7\r\2\2RV\3\2\2\2SV\7\32\2"+
		"\2TV\7\31\2\2UN\3\2\2\2US\3\2\2\2UT\3\2\2\2V_\3\2\2\2WX\f\6\2\2XY\7\33"+
		"\2\2Y^\5\b\5\7Z[\f\5\2\2[\\\7\34\2\2\\^\5\b\5\6]W\3\2\2\2]Z\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t\3\2\2\2a_\3\2\2\2bc\b\6\1\2cd\5\b\5\2"+
		"de\7\23\2\2ef\5\b\5\2f|\3\2\2\2gh\5\b\5\2hi\7\24\2\2ij\5\b\5\2j|\3\2\2"+
		"\2kl\5\b\5\2lm\7\25\2\2mn\5\b\5\2n|\3\2\2\2op\5\b\5\2pq\7\26\2\2qr\5\b"+
		"\5\2r|\3\2\2\2st\5\b\5\2tu\7\27\2\2uv\5\b\5\2v|\3\2\2\2wx\5\b\5\2xy\7"+
		"\30\2\2yz\5\b\5\2z|\3\2\2\2{b\3\2\2\2{g\3\2\2\2{k\3\2\2\2{o\3\2\2\2{s"+
		"\3\2\2\2{w\3\2\2\2|\u0085\3\2\2\2}~\f\n\2\2~\177\7\21\2\2\177\u0084\5"+
		"\n\6\13\u0080\u0081\f\t\2\2\u0081\u0082\7\22\2\2\u0082\u0084\5\n\6\n\u0083"+
		"}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\13\3\2\2\2\u0087\u0085\3\2\2\2\f\17\31\35L"+
		"U]_{\u0083\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}