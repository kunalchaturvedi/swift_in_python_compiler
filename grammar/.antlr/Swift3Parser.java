// Generated from /home/kunal/repos/swift_in_python_compiler/grammar/Swift3.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Swift3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		Identifier=108, DOT=109, LCURLY=110, LPAREN=111, LBRACK=112, RCURLY=113, 
		RPAREN=114, RBRACK=115, COMMA=116, COLON=117, SEMI=118, LT=119, GT=120, 
		UNDERSCORE=121, BANG=122, QUESTION=123, AT=124, AND=125, SUB=126, EQUAL=127, 
		OR=128, DIV=129, ADD=130, MUL=131, MOD=132, CARET=133, TILDE=134, Implicit_parameter_name=135, 
		Binary_literal=136, Decimal_literal=137, Pure_decimal_digits=138, Floating_point_literal=139, 
		Static_string_literal=140, Interpolated_string_literal=141, WS=142, Block_comment=143, 
		Line_comment=144;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_statements_impl = 3, 
		RULE_loop_statement = 4, RULE_for_statement = 5, RULE_for_init = 6, RULE_while_statement = 7, 
		RULE_condition_list = 8, RULE_condition = 9, RULE_case_condition = 10, 
		RULE_optional_binding_condition = 11, RULE_branch_statement = 12, RULE_if_statement = 13, 
		RULE_else_clause = 14, RULE_control_transfer_statement = 15, RULE_break_statement = 16, 
		RULE_continue_statement = 17, RULE_return_statement = 18, RULE_declaration = 19, 
		RULE_declarations = 20, RULE_top_level_declaration = 21, RULE_code_block = 22, 
		RULE_import_declaration = 23, RULE_import_kind = 24, RULE_import_path = 25, 
		RULE_import_path_identifier = 26, RULE_constant_declaration = 27, RULE_pattern_initializer_list = 28, 
		RULE_pattern_initializer = 29, RULE_initializer = 30, RULE_variable_declaration = 31, 
		RULE_variable_declaration_head = 32, RULE_variable_name = 33, RULE_getter_setter_block = 34, 
		RULE_getter_clause = 35, RULE_setter_clause = 36, RULE_setter_name = 37, 
		RULE_getter_setter_keyword_block = 38, RULE_getter_keyword_clause = 39, 
		RULE_setter_keyword_clause = 40, RULE_willSet_didSet_block = 41, RULE_willSet_clause = 42, 
		RULE_didSet_clause = 43, RULE_function_declaration = 44, RULE_function_head = 45, 
		RULE_function_name = 46, RULE_function_signature = 47, RULE_function_result = 48, 
		RULE_function_body = 49, RULE_parameter_clause = 50, RULE_parameter_list = 51, 
		RULE_parameter = 52, RULE_external_parameter_name = 53, RULE_local_parameter_name = 54, 
		RULE_default_argument_clause = 55, RULE_struct_declaration = 56, RULE_struct_name = 57, 
		RULE_struct_body = 58, RULE_struct_member = 59, RULE_operator_declaration = 60, 
		RULE_prefix_operator_declaration = 61, RULE_postfix_operator_declaration = 62, 
		RULE_infix_operator_declaration = 63, RULE_declaration_modifier = 64, 
		RULE_declaration_modifiers = 65, RULE_access_level_modifier = 66, RULE_mutation_modifier = 67, 
		RULE_pattern = 68, RULE_identifier_pattern = 69, RULE_value_binding_pattern = 70, 
		RULE_expression_pattern = 71, RULE_expression = 72, RULE_expression_list = 73, 
		RULE_prefix_expression = 74, RULE_in_out_expression = 75, RULE_binary_expression = 76, 
		RULE_binary_expressions = 77, RULE_conditional_operator = 78, RULE_primary_expression = 79, 
		RULE_literal_expression = 80, RULE_array_literal = 81, RULE_array_literal_items = 82, 
		RULE_array_literal_item = 83, RULE_parenthesized_expression = 84, RULE_postfix_expression = 85, 
		RULE_function_call_argument_clause = 86, RULE_function_call_argument_list = 87, 
		RULE_function_call_argument = 88, RULE_argument_names = 89, RULE_argument_name = 90, 
		RULE_type = 91, RULE_type_annotation = 92, RULE_type_identifier = 93, 
		RULE_type_name = 94, RULE_function_type = 95, RULE_function_type_argument_clause = 96, 
		RULE_function_type_argument_list = 97, RULE_function_type_argument = 98, 
		RULE_argument_label = 99, RULE_array_type = 100, RULE_identifier = 101, 
		RULE_declaration_identifier = 102, RULE_label_identifier = 103, RULE_keyword_as_identifier_in_declarations = 104, 
		RULE_keyword_as_identifier_in_labels = 105, RULE_assignment_operator = 106, 
		RULE_negate_prefix_operator = 107, RULE_compilation_condition_AND = 108, 
		RULE_compilation_condition_OR = 109, RULE_compilation_condition_GE = 110, 
		RULE_arrow_operator = 111, RULE_range_operator = 112, RULE_same_type_equals = 113, 
		RULE_binary_operator = 114, RULE_prefix_operator = 115, RULE_postfix_operator = 116, 
		RULE_operator = 117, RULE_operator_character = 118, RULE_operator_head = 119, 
		RULE_dot_operator_head = 120, RULE_dot_operator_character = 121, RULE_literal = 122, 
		RULE_numeric_literal = 123, RULE_boolean_literal = 124, RULE_nil_literal = 125, 
		RULE_integer_literal = 126, RULE_string_literal = 127;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "statements_impl", "loop_statement", 
		"for_statement", "for_init", "while_statement", "condition_list", "condition", 
		"case_condition", "optional_binding_condition", "branch_statement", "if_statement", 
		"else_clause", "control_transfer_statement", "break_statement", "continue_statement", 
		"return_statement", "declaration", "declarations", "top_level_declaration", 
		"code_block", "import_declaration", "import_kind", "import_path", "import_path_identifier", 
		"constant_declaration", "pattern_initializer_list", "pattern_initializer", 
		"initializer", "variable_declaration", "variable_declaration_head", "variable_name", 
		"getter_setter_block", "getter_clause", "setter_clause", "setter_name", 
		"getter_setter_keyword_block", "getter_keyword_clause", "setter_keyword_clause", 
		"willSet_didSet_block", "willSet_clause", "didSet_clause", "function_declaration", 
		"function_head", "function_name", "function_signature", "function_result", 
		"function_body", "parameter_clause", "parameter_list", "parameter", "external_parameter_name", 
		"local_parameter_name", "default_argument_clause", "struct_declaration", 
		"struct_name", "struct_body", "struct_member", "operator_declaration", 
		"prefix_operator_declaration", "postfix_operator_declaration", "infix_operator_declaration", 
		"declaration_modifier", "declaration_modifiers", "access_level_modifier", 
		"mutation_modifier", "pattern", "identifier_pattern", "value_binding_pattern", 
		"expression_pattern", "expression", "expression_list", "prefix_expression", 
		"in_out_expression", "binary_expression", "binary_expressions", "conditional_operator", 
		"primary_expression", "literal_expression", "array_literal", "array_literal_items", 
		"array_literal_item", "parenthesized_expression", "postfix_expression", 
		"function_call_argument_clause", "function_call_argument_list", "function_call_argument", 
		"argument_names", "argument_name", "type", "type_annotation", "type_identifier", 
		"type_name", "function_type", "function_type_argument_clause", "function_type_argument_list", 
		"function_type_argument", "argument_label", "array_type", "identifier", 
		"declaration_identifier", "label_identifier", "keyword_as_identifier_in_declarations", 
		"keyword_as_identifier_in_labels", "assignment_operator", "negate_prefix_operator", 
		"compilation_condition_AND", "compilation_condition_OR", "compilation_condition_GE", 
		"arrow_operator", "range_operator", "same_type_equals", "binary_operator", 
		"prefix_operator", "postfix_operator", "operator", "operator_character", 
		"operator_head", "dot_operator_head", "dot_operator_character", "literal", 
		"numeric_literal", "boolean_literal", "nil_literal", "integer_literal", 
		"string_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'for'", "'while'", "'case'", "'let'", "'var'", "'if'", "'else'", 
		"'break'", "'continue'", "'return'", "'import'", "'typealias'", "'struct'", 
		"'class'", "'enum'", "'protocol'", "'func'", "'get'", "'set'", "'willSet'", 
		"'didSet'", "'throws'", "'rethrows'", "'prefix'", "'operator'", "'postfix'", 
		"'infix'", "'dynamic'", "'override'", "'required'", "'static'", "'private'", 
		"'fileprivate'", "'internal'", "'public'", "'open'", "'mutating'", "'nonmutating'", 
		"'init'", "'self'", "'inout'", "'Type'", "'alpha'", "'arch'", "'arm'", 
		"'arm64'", "'assignment'", "'associativity'", "'blue'", "'convenience'", 
		"'file'", "'final'", "'green'", "'higherThan'", "'i386'", "'iOS'", "'iOSApplicationExtension'", 
		"'indirect'", "'lazy'", "'left'", "'line'", "'lowerThan'", "'macOS'", 
		"'macOSApplicationExtension'", "'none'", "'of'", "'optional'", "'os'", 
		"'precedence'", "'red'", "'resourceName'", "'right'", "'safe'", "'swift'", 
		"'tvOS'", "'type'", "'unowned'", "'unsafe'", "'watchOS'", "'weak'", "'x86_64'", 
		"'Any'", "'Protocol'", "'Self'", "'as'", "'associatedtype'", "'catch'", 
		"'default'", "'defer'", "'deinit'", "'do'", "'extension'", "'fallthrough'", 
		"'false'", "'guard'", "'in'", "'is'", "'nil'", "'precedencegroup'", "'repeat'", 
		"'subscript'", "'super'", "'switch'", "'throw'", "'true'", "'try'", "'where'", 
		null, "'.'", "'{'", "'('", "'['", "'}'", "')'", "']'", "','", "':'", "';'", 
		"'<'", "'>'", "'_'", "'!'", "'?'", "'@'", "'&'", "'-'", "'='", "'|'", 
		"'/'", "'+'", "'*'", "'%'", "'^'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Identifier", "DOT", "LCURLY", "LPAREN", "LBRACK", "RCURLY", "RPAREN", 
		"RBRACK", "COMMA", "COLON", "SEMI", "LT", "GT", "UNDERSCORE", "BANG", 
		"QUESTION", "AT", "AND", "SUB", "EQUAL", "OR", "DIV", "ADD", "MUL", "MOD", 
		"CARET", "TILDE", "Implicit_parameter_name", "Binary_literal", "Decimal_literal", 
		"Pure_decimal_digits", "Floating_point_literal", "Static_string_literal", 
		"Interpolated_string_literal", "WS", "Block_comment", "Line_comment"
	};
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
	public String getGrammarFileName() { return "Swift3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Swift3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Swift3Parser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(256);
				statements();
				}
				break;
			}
			setState(259);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				expression();
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(262);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				declaration();
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(266);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				loop_statement();
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(270);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				branch_statement();
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(274);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				control_transfer_statement();
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(278);
					match(SEMI);
					}
					break;
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

	public static class StatementsContext extends ParserRuleContext {
		public Statements_implContext statements_impl() {
			return getRuleContext(Statements_implContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			statements_impl(-1);
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

	public static class Statements_implContext extends ParserRuleContext {
		public int indexBefore;
		public int indexAfter = -1;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statements_implContext statements_impl() {
			return getRuleContext(Statements_implContext.class,0);
		}
		public Statements_implContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statements_implContext(ParserRuleContext parent, int invokingState, int indexBefore) {
			super(parent, invokingState);
			this.indexBefore = indexBefore;
		}
		@Override public int getRuleIndex() { return RULE_statements_impl; }
	}

	public final Statements_implContext statements_impl(int indexBefore) throws RecognitionException {
		Statements_implContext _localctx = new Statements_implContext(_ctx, getState(), indexBefore);
		enterRule(_localctx, 6, RULE_statements_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			if (!(SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore))) throw new FailedPredicateException(this, "SwiftSupport.isSeparatedStatement(_input, $indexBefore)");
			setState(286);
			statement();
			((Statements_implContext)_localctx).indexAfter =  _input.index();
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(288);
				statements_impl(_localctx.indexAfter);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				for_statement();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				while_statement();
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

	public static class For_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__0);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(296);
					for_init();
					}
					break;
				}
				setState(299);
				match(SEMI);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(300);
					expression();
					}
					break;
				}
				setState(303);
				match(SEMI);
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(304);
					expression();
					}
					break;
				}
				setState(307);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__0);
				setState(309);
				match(LPAREN);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(310);
					for_init();
					}
					break;
				}
				setState(313);
				match(SEMI);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(314);
					expression();
					}
					break;
				}
				setState(317);
				match(SEMI);
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(318);
					expression();
					}
					break;
				}
				setState(321);
				match(RPAREN);
				setState(322);
				code_block();
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

	public static class For_initContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_init);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				expression_list();
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

	public static class While_statementContext extends ParserRuleContext {
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__1);
			setState(330);
			condition_list();
			setState(331);
			code_block();
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

	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
	}

	public final Condition_listContext condition_list() throws RecognitionException {
		Condition_listContext _localctx = new Condition_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			condition();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334);
				match(COMMA);
				setState(335);
				condition();
				}
				}
				setState(340);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_conditionContext case_condition() {
			return getRuleContext(Case_conditionContext.class,0);
		}
		public Optional_binding_conditionContext optional_binding_condition() {
			return getRuleContext(Optional_binding_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				case_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				optional_binding_condition();
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

	public static class Case_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_case_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__2);
			setState(347);
			pattern();
			setState(348);
			initializer();
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

	public static class Optional_binding_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_condition; }
	}

	public final Optional_binding_conditionContext optional_binding_condition() throws RecognitionException {
		Optional_binding_conditionContext _localctx = new Optional_binding_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_optional_binding_condition);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__3);
				setState(351);
				pattern();
				setState(352);
				initializer();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(T__4);
				setState(355);
				pattern();
				setState(356);
				initializer();
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

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_branch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			if_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__5);
			setState(363);
			condition_list();
			setState(364);
			code_block();
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(365);
				else_clause();
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

	public static class Else_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_clause);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(T__6);
				setState(369);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(T__6);
				setState(371);
				if_statement();
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

	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_control_transfer_statement);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				break_statement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				continue_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				return_statement();
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

	public static class Break_statementContext extends ParserRuleContext {
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__7);
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

	public static class Continue_statementContext extends ParserRuleContext {
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__8);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__9);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(384);
				expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				function_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				struct_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				operator_declaration();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				declaration();
				}
				}
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0) );
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

	public static class Top_level_declarationContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(400);
				statements();
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

	public static class Code_blockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LCURLY);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(404);
				statements();
				}
				break;
			}
			setState(407);
			match(RCURLY);
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

	public static class Import_declarationContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__10);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				setState(410);
				import_kind();
				}
			}

			setState(413);
			import_path();
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

	public static class Import_kindContext extends ParserRuleContext {
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Import_pathContext extends ParserRuleContext {
		public List<Import_path_identifierContext> import_path_identifier() {
			return getRuleContexts(Import_path_identifierContext.class);
		}
		public Import_path_identifierContext import_path_identifier(int i) {
			return getRuleContext(Import_path_identifierContext.class,i);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_import_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			import_path_identifier();
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(418);
					match(DOT);
					setState(419);
					import_path_identifier();
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Import_path_identifierContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_import_path_identifier);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__35:
			case T__36:
			case T__37:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				declaration_identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				operator();
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				setState(429);
				declaration_modifiers();
				}
			}

			setState(432);
			match(T__3);
			setState(433);
			pattern_initializer_list();
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

	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
		}
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			pattern_initializer();
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					match(COMMA);
					setState(437);
					pattern_initializer();
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			pattern();
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(444);
				initializer();
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

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			assignment_operator();
			setState(448);
			expression();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public List<Type_annotationContext> type_annotation() {
			return getRuleContexts(Type_annotationContext.class);
		}
		public Type_annotationContext type_annotation(int i) {
			return getRuleContext(Type_annotationContext.class,i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variable_declaration);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				variable_declaration_head();
				setState(451);
				variable_name();
				setState(452);
				type_annotation();
				setState(453);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				variable_declaration_head();
				setState(456);
				variable_name();
				setState(457);
				type_annotation();
				setState(458);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				variable_declaration_head();
				setState(461);
				variable_name();
				setState(462);
				type_annotation();
				setState(463);
				getter_setter_keyword_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				variable_declaration_head();
				setState(466);
				variable_name();
				setState(467);
				type_annotation();
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(468);
					initializer();
					}
					break;
				}
				setState(471);
				willSet_didSet_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				variable_declaration_head();
				setState(474);
				variable_name();
				setState(475);
				type_annotation();
				setState(476);
				type_annotation();
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(477);
					initializer();
					}
					break;
				}
				setState(480);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(482);
				variable_declaration_head();
				setState(483);
				pattern_initializer_list();
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

	public static class Variable_declaration_headContext extends ParserRuleContext {
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				setState(487);
				declaration_modifiers();
				}
			}

			setState(490);
			match(T__4);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			declaration_identifier();
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

	public static class Getter_setter_blockContext extends ParserRuleContext {
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_getter_setter_block);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(LCURLY);
				setState(495);
				getter_clause();
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__36) | (1L << T__37))) != 0)) {
					{
					setState(496);
					setter_clause();
					}
				}

				setState(499);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(LCURLY);
				setState(502);
				setter_clause();
				setState(503);
				getter_clause();
				setState(504);
				match(RCURLY);
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

	public static class Getter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(508);
				mutation_modifier();
				}
			}

			setState(511);
			match(T__17);
			setState(512);
			code_block();
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

	public static class Setter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(514);
				mutation_modifier();
				}
			}

			setState(517);
			match(T__18);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(518);
				setter_name();
				}
			}

			setState(521);
			code_block();
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

	public static class Setter_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(LPAREN);
			setState(524);
			declaration_identifier();
			setState(525);
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

	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(LCURLY);
				setState(528);
				getter_keyword_clause();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__36) | (1L << T__37))) != 0)) {
					{
					setState(529);
					setter_keyword_clause();
					}
				}

				setState(532);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(LCURLY);
				setState(535);
				setter_keyword_clause();
				setState(536);
				getter_keyword_clause();
				setState(537);
				match(RCURLY);
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

	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(541);
				mutation_modifier();
				}
			}

			setState(544);
			match(T__17);
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

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(546);
				mutation_modifier();
				}
			}

			setState(549);
			match(T__18);
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

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(LCURLY);
				setState(552);
				willSet_clause();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(553);
					didSet_clause();
					}
				}

				setState(556);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(LCURLY);
				setState(559);
				didSet_clause();
				setState(560);
				willSet_clause();
				setState(561);
				match(RCURLY);
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

	public static class WillSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__19);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(566);
				setter_name();
				}
			}

			setState(569);
			code_block();
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

	public static class DidSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__20);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(572);
				setter_name();
				}
			}

			setState(575);
			code_block();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			function_head();
			setState(578);
			function_name();
			setState(579);
			function_signature();
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(580);
				function_body();
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

	public static class Function_headContext extends ParserRuleContext {
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				setState(583);
				declaration_modifiers();
				}
			}

			setState(586);
			match(T__16);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_function_name);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__35:
			case T__36:
			case T__37:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				declaration_identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				operator();
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

	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_function_signature);
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				parameter_clause();
				setState(594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(593);
					match(T__21);
					}
					break;
				}
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(596);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				parameter_clause();
				setState(600);
				match(T__22);
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(601);
					function_result();
					}
					break;
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

	public static class Function_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			arrow_operator();
			setState(607);
			type();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			code_block();
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

	public static class Parameter_clauseContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameter_clause);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(LPAREN);
				setState(612);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(LPAREN);
				setState(614);
				parameter_list();
				setState(615);
				match(RPAREN);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			parameter();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(620);
				match(COMMA);
				setState(621);
				parameter();
				}
				}
				setState(626);
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

	public static class ParameterContext extends ParserRuleContext {
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameter);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(627);
					external_parameter_name();
					}
					break;
				}
				setState(630);
				local_parameter_name();
				setState(631);
				type_annotation();
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(632);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(635);
					external_parameter_name();
					}
					break;
				}
				setState(638);
				local_parameter_name();
				setState(639);
				type_annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(641);
					external_parameter_name();
					}
					break;
				}
				setState(644);
				local_parameter_name();
				setState(645);
				type_annotation();
				setState(646);
				range_operator();
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

	public static class External_parameter_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_external_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			label_identifier();
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

	public static class Local_parameter_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_local_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			label_identifier();
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

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			assignment_operator();
			setState(655);
			expression();
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				setState(657);
				access_level_modifier();
				}
			}

			setState(660);
			match(T__12);
			setState(661);
			struct_name();
			setState(662);
			struct_body();
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

	public static class Struct_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			declaration_identifier();
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

	public static class Struct_bodyContext extends ParserRuleContext {
		public List<Struct_memberContext> struct_member() {
			return getRuleContexts(Struct_memberContext.class);
		}
		public Struct_memberContext struct_member(int i) {
			return getRuleContext(Struct_memberContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(LCURLY);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				{
				setState(667);
				struct_member();
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
			match(RCURLY);
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

	public static class Struct_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Struct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member; }
	}

	public final Struct_memberContext struct_member() throws RecognitionException {
		Struct_memberContext _localctx = new Struct_memberContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_struct_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			declaration();
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

	public static class Operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_operator_declaration);
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				prefix_operator_declaration();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				postfix_operator_declaration();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				infix_operator_declaration();
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

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(T__23);
			setState(683);
			match(T__24);
			setState(684);
			operator();
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

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T__25);
			setState(687);
			match(T__24);
			setState(688);
			operator();
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

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(T__26);
			setState(691);
			match(T__24);
			setState(692);
			operator();
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

	public static class Declaration_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_declaration_modifier);
		try {
			setState(703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(T__13);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				match(T__28);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(697);
				match(T__25);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(698);
				match(T__23);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(699);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(700);
				match(T__30);
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(701);
				access_level_modifier();
				}
				break;
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 9);
				{
				setState(702);
				mutation_modifier();
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

	public static class Declaration_modifiersContext extends ParserRuleContext {
		public List<Declaration_modifierContext> declaration_modifier() {
			return getRuleContexts(Declaration_modifierContext.class);
		}
		public Declaration_modifierContext declaration_modifier(int i) {
			return getRuleContext(Declaration_modifierContext.class,i);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(705);
				declaration_modifier();
				}
				}
				setState(708); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0) );
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

	public static class Access_level_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_access_level_modifier);
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(T__31);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				match(T__31);
				setState(712);
				match(LPAREN);
				setState(713);
				match(T__18);
				setState(714);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				match(T__32);
				setState(717);
				match(LPAREN);
				setState(718);
				match(T__18);
				setState(719);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(720);
				match(T__33);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(721);
				match(T__33);
				setState(722);
				match(LPAREN);
				setState(723);
				match(T__18);
				setState(724);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(725);
				match(T__34);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(726);
				match(T__34);
				setState(727);
				match(LPAREN);
				setState(728);
				match(T__18);
				setState(729);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(730);
				match(T__35);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(731);
				match(T__35);
				setState(732);
				match(LPAREN);
				setState(733);
				match(T__18);
				setState(734);
				match(RPAREN);
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

	public static class Mutation_modifierContext extends ParserRuleContext {
		public Mutation_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutation_modifier; }
	}

	public final Mutation_modifierContext mutation_modifier() throws RecognitionException {
		Mutation_modifierContext _localctx = new Mutation_modifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_mutation_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PatternContext extends ParserRuleContext {
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_pattern);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				identifier_pattern();
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(740);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				value_binding_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				expression_pattern();
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

	public static class Identifier_patternContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			declaration_identifier();
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

	public static class Value_binding_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_value_binding_pattern);
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(T__4);
				setState(750);
				pattern();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				match(T__3);
				setState(752);
				pattern();
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

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Binary_expressionsContext binary_expressions() {
			return getRuleContext(Binary_expressionsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			prefix_expression();
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(758);
				binary_expressions();
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			expression();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(762);
				match(COMMA);
				setState(763);
				expression();
				}
				}
				setState(768);
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

	public static class Prefix_expressionContext extends ParserRuleContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_prefix_expression);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				prefix_operator();
				setState(770);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				in_out_expression();
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

	public static class In_out_expressionContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(AND);
			setState(777);
			declaration_identifier();
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_binary_expression);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				binary_operator();
				setState(780);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				assignment_operator();
				setState(783);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				conditional_operator();
				setState(786);
				prefix_expression();
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

	public static class Binary_expressionsContext extends ParserRuleContext {
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public Binary_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expressions; }
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(790);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(793); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Conditional_operatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(QUESTION);
			setState(796);
			expression();
			setState(797);
			match(COLON);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_primary_expression);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				declaration_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				parenthesized_expression();
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

	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_literal_expression);
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				array_literal();
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

	public static class Array_literalContext extends ParserRuleContext {
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(LBRACK);
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(809);
				array_literal_items();
				}
				break;
			}
			setState(812);
			match(RBRACK);
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

	public static class Array_literal_itemsContext extends ParserRuleContext {
		public Array_literal_itemContext array_literal_item() {
			return getRuleContext(Array_literal_itemContext.class,0);
		}
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_array_literal_items);
		int _la;
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				array_literal_item();
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(815);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				array_literal_item();
				setState(819);
				match(COMMA);
				setState(820);
				array_literal_items();
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

	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			expression();
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

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(LPAREN);
			setState(827);
			expression();
			setState(828);
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Initializer_expression_with_argsContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Initializer_expression_with_argsContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Function_call_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_call_argument_clauseContext function_call_argument_clause() {
			return getRuleContext(Function_call_argument_clauseContext.class,0);
		}
		public Function_call_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Subscript_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Subscript_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Explicit_member_expression1Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode Pure_decimal_digits() { return getToken(Swift3Parser.Pure_decimal_digits, 0); }
		public Explicit_member_expression1Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Explicit_member_expression2Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Explicit_member_expression2Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Initializer_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Initializer_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Explicit_member_expression3Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Explicit_member_expression3Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Explicit_member_expression4Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Explicit_member_expression4Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Postfix_operationContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Postfix_operationContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Postfix_self_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Postfix_self_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_postfix_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(831);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(873);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_operationContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(833);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(834);
						postfix_operator();
						}
						break;
					case 2:
						{
						_localctx = new Function_call_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(835);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(836);
						function_call_argument_clause();
						}
						break;
					case 3:
						{
						_localctx = new Initializer_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(837);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(838);
						match(DOT);
						setState(839);
						match(T__38);
						}
						break;
					case 4:
						{
						_localctx = new Initializer_expression_with_argsContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(840);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(841);
						match(DOT);
						setState(842);
						match(T__38);
						setState(843);
						match(LPAREN);
						setState(844);
						argument_names();
						setState(845);
						match(RPAREN);
						}
						break;
					case 5:
						{
						_localctx = new Explicit_member_expression1Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(847);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(848);
						match(DOT);
						setState(849);
						match(Pure_decimal_digits);
						}
						break;
					case 6:
						{
						_localctx = new Explicit_member_expression2Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(850);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(851);
						match(DOT);
						setState(852);
						declaration_identifier();
						}
						break;
					case 7:
						{
						_localctx = new Explicit_member_expression3Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(853);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(854);
						match(DOT);
						setState(855);
						declaration_identifier();
						setState(856);
						match(LPAREN);
						setState(857);
						argument_names();
						setState(858);
						match(RPAREN);
						}
						break;
					case 8:
						{
						_localctx = new Explicit_member_expression4Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(860);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(861);
						match(LPAREN);
						setState(862);
						argument_names();
						setState(863);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new Postfix_self_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(865);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(866);
						match(DOT);
						setState(867);
						match(T__39);
						}
						break;
					case 10:
						{
						_localctx = new Subscript_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(868);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(869);
						match(LBRACK);
						setState(870);
						expression_list();
						setState(871);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class Function_call_argument_clauseContext extends ParserRuleContext {
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public Function_call_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_clause; }
	}

	public final Function_call_argument_clauseContext function_call_argument_clause() throws RecognitionException {
		Function_call_argument_clauseContext _localctx = new Function_call_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_function_call_argument_clause);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				match(LPAREN);
				setState(879);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(LPAREN);
				setState(881);
				function_call_argument_list();
				setState(882);
				match(RPAREN);
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

	public static class Function_call_argument_listContext extends ParserRuleContext {
		public List<Function_call_argumentContext> function_call_argument() {
			return getRuleContexts(Function_call_argumentContext.class);
		}
		public Function_call_argumentContext function_call_argument(int i) {
			return getRuleContext(Function_call_argumentContext.class,i);
		}
		public Function_call_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_list; }
	}

	public final Function_call_argument_listContext function_call_argument_list() throws RecognitionException {
		Function_call_argument_listContext _localctx = new Function_call_argument_listContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_function_call_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			function_call_argument();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(887);
				match(COMMA);
				setState(888);
				function_call_argument();
				}
				}
				setState(893);
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

	public static class Function_call_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_call_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument; }
	}

	public final Function_call_argumentContext function_call_argument() throws RecognitionException {
		Function_call_argumentContext _localctx = new Function_call_argumentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_function_call_argument);
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				label_identifier();
				setState(896);
				match(COLON);
				setState(897);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
				operator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(900);
				label_identifier();
				setState(901);
				match(COLON);
				setState(902);
				operator();
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

	public static class Argument_namesContext extends ParserRuleContext {
		public List<Argument_nameContext> argument_name() {
			return getRuleContexts(Argument_nameContext.class);
		}
		public Argument_nameContext argument_name(int i) {
			return getRuleContext(Argument_nameContext.class,i);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			argument_name();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(907);
				argument_name();
				}
				}
				setState(912);
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

	public static class Argument_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			label_identifier();
			setState(914);
			match(COLON);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class The_function_typeContext extends TypeContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public The_function_typeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class The_array_typeContext extends TypeContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public The_array_typeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class The_type_identifierContext extends TypeContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public The_type_identifierContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_type);
		try {
			setState(919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new The_array_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				array_type();
				}
				break;
			case LPAREN:
				_localctx = new The_function_typeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				function_type();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__35:
			case T__36:
			case T__37:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case Identifier:
				_localctx = new The_type_identifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				type_identifier();
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

	public static class Type_annotationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(COLON);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(922);
				match(T__40);
				}
			}

			setState(925);
			type();
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

	public static class Type_identifierContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			type_name();
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(928);
				match(DOT);
				setState(929);
				type_identifier();
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

	public static class Type_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			declaration_identifier();
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

	public static class Function_typeContext extends ParserRuleContext {
		public Function_type_argument_clauseContext function_type_argument_clause() {
			return getRuleContext(Function_type_argument_clauseContext.class,0);
		}
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_function_type);
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				function_type_argument_clause();
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(935);
					match(T__21);
					}
					break;
				}
				setState(938);
				arrow_operator();
				setState(939);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				function_type_argument_clause();
				setState(942);
				match(T__22);
				setState(943);
				arrow_operator();
				setState(944);
				type();
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

	public static class Function_type_argument_clauseContext extends ParserRuleContext {
		public Function_type_argument_listContext function_type_argument_list() {
			return getRuleContext(Function_type_argument_listContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Function_type_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_clause; }
	}

	public final Function_type_argument_clauseContext function_type_argument_clause() throws RecognitionException {
		Function_type_argument_clauseContext _localctx = new Function_type_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_function_type_argument_clause);
		try {
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				match(LPAREN);
				setState(949);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(LPAREN);
				setState(951);
				function_type_argument_list();
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(952);
					range_operator();
					}
					break;
				}
				setState(955);
				match(RPAREN);
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

	public static class Function_type_argument_listContext extends ParserRuleContext {
		public Function_type_argumentContext function_type_argument() {
			return getRuleContext(Function_type_argumentContext.class,0);
		}
		public Function_type_argument_listContext function_type_argument_list() {
			return getRuleContext(Function_type_argument_listContext.class,0);
		}
		public Function_type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_list; }
	}

	public final Function_type_argument_listContext function_type_argument_list() throws RecognitionException {
		Function_type_argument_listContext _localctx = new Function_type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_function_type_argument_list);
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				function_type_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				function_type_argument();
				setState(961);
				match(COMMA);
				setState(962);
				function_type_argument_list();
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

	public static class Function_type_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Argument_labelContext argument_label() {
			return getRuleContext(Argument_labelContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Function_type_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument; }
	}

	public final Function_type_argumentContext function_type_argument() throws RecognitionException {
		Function_type_argumentContext _localctx = new Function_type_argumentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_function_type_argument);
		int _la;
		try {
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(966);
					match(T__40);
					}
				}

				setState(969);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				argument_label();
				setState(971);
				type_annotation();
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

	public static class Argument_labelContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Argument_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_label; }
	}

	public final Argument_labelContext argument_label() throws RecognitionException {
		Argument_labelContext _localctx = new Argument_labelContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_argument_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			label_identifier();
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

	public static class Array_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(LBRACK);
			setState(978);
			type();
			setState(979);
			match(RBRACK);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(Identifier);
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

	public static class Declaration_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public Keyword_as_identifier_in_declarationsContext keyword_as_identifier_in_declarations() {
			return getRuleContext(Keyword_as_identifier_in_declarationsContext.class,0);
		}
		public Declaration_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_identifier; }
	}

	public final Declaration_identifierContext declaration_identifier() throws RecognitionException {
		Declaration_identifierContext _localctx = new Declaration_identifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_declaration_identifier);
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				match(Identifier);
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__35:
			case T__36:
			case T__37:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				keyword_as_identifier_in_declarations();
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

	public static class Label_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public Keyword_as_identifier_in_labelsContext keyword_as_identifier_in_labels() {
			return getRuleContext(Keyword_as_identifier_in_labelsContext.class,0);
		}
		public Label_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_identifier; }
	}

	public final Label_identifierContext label_identifier() throws RecognitionException {
		Label_identifierContext _localctx = new Label_identifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_label_identifier);
		try {
			setState(989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				match(Identifier);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				keyword_as_identifier_in_labels();
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

	public static class Keyword_as_identifier_in_declarationsContext extends ParserRuleContext {
		public Keyword_as_identifier_in_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_identifier_in_declarations; }
	}

	public final Keyword_as_identifier_in_declarationsContext keyword_as_identifier_in_declarations() throws RecognitionException {
		Keyword_as_identifier_in_declarationsContext _localctx = new Keyword_as_identifier_in_declarationsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_keyword_as_identifier_in_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__18 - 18)) | (1L << (T__19 - 18)) | (1L << (T__20 - 18)) | (1L << (T__23 - 18)) | (1L << (T__25 - 18)) | (1L << (T__26 - 18)) | (1L << (T__27 - 18)) | (1L << (T__28 - 18)) | (1L << (T__29 - 18)) | (1L << (T__35 - 18)) | (1L << (T__36 - 18)) | (1L << (T__37 - 18)) | (1L << (T__41 - 18)) | (1L << (T__42 - 18)) | (1L << (T__43 - 18)) | (1L << (T__44 - 18)) | (1L << (T__45 - 18)) | (1L << (T__46 - 18)) | (1L << (T__47 - 18)) | (1L << (T__48 - 18)) | (1L << (T__49 - 18)) | (1L << (T__50 - 18)) | (1L << (T__51 - 18)) | (1L << (T__52 - 18)) | (1L << (T__53 - 18)) | (1L << (T__54 - 18)) | (1L << (T__55 - 18)) | (1L << (T__56 - 18)) | (1L << (T__57 - 18)) | (1L << (T__58 - 18)) | (1L << (T__59 - 18)) | (1L << (T__60 - 18)) | (1L << (T__61 - 18)) | (1L << (T__62 - 18)) | (1L << (T__63 - 18)) | (1L << (T__64 - 18)) | (1L << (T__65 - 18)) | (1L << (T__66 - 18)) | (1L << (T__67 - 18)) | (1L << (T__68 - 18)) | (1L << (T__69 - 18)) | (1L << (T__70 - 18)) | (1L << (T__71 - 18)) | (1L << (T__72 - 18)) | (1L << (T__73 - 18)) | (1L << (T__74 - 18)) | (1L << (T__75 - 18)) | (1L << (T__76 - 18)) | (1L << (T__77 - 18)) | (1L << (T__78 - 18)) | (1L << (T__79 - 18)) | (1L << (T__80 - 18)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Keyword_as_identifier_in_labelsContext extends ParserRuleContext {
		public Keyword_as_identifier_in_labelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_identifier_in_labels; }
	}

	public final Keyword_as_identifier_in_labelsContext keyword_as_identifier_in_labels() throws RecognitionException {
		Keyword_as_identifier_in_labelsContext _localctx = new Keyword_as_identifier_in_labelsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_keyword_as_identifier_in_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(996);
			match(EQUAL);
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

	public static class Negate_prefix_operatorContext extends ParserRuleContext {
		public Negate_prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_prefix_operator; }
	}

	public final Negate_prefix_operatorContext negate_prefix_operator() throws RecognitionException {
		Negate_prefix_operatorContext _localctx = new Negate_prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(999);
			match(SUB);
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

	public static class Compilation_condition_ANDContext extends ParserRuleContext {
		public Compilation_condition_ANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_AND; }
	}

	public final Compilation_condition_ANDContext compilation_condition_AND() throws RecognitionException {
		Compilation_condition_ANDContext _localctx = new Compilation_condition_ANDContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_compilation_condition_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(1002);
			match(AND);
			setState(1003);
			match(AND);
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

	public static class Compilation_condition_ORContext extends ParserRuleContext {
		public Compilation_condition_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_OR; }
	}

	public final Compilation_condition_ORContext compilation_condition_OR() throws RecognitionException {
		Compilation_condition_ORContext _localctx = new Compilation_condition_ORContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_compilation_condition_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(1006);
			match(OR);
			setState(1007);
			match(OR);
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

	public static class Compilation_condition_GEContext extends ParserRuleContext {
		public Compilation_condition_GEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_GE; }
	}

	public final Compilation_condition_GEContext compilation_condition_GE() throws RecognitionException {
		Compilation_condition_GEContext _localctx = new Compilation_condition_GEContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_compilation_condition_GE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			if (!(SwiftSupport.isOperator(_input,">="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\">=\")");
			setState(1010);
			match(GT);
			setState(1011);
			match(EQUAL);
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

	public static class Arrow_operatorContext extends ParserRuleContext {
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(1014);
			match(SUB);
			setState(1015);
			match(GT);
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

	public static class Range_operatorContext extends ParserRuleContext {
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(1018);
			match(DOT);
			setState(1019);
			match(DOT);
			setState(1020);
			match(DOT);
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

	public static class Same_type_equalsContext extends ParserRuleContext {
		public Same_type_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_equals; }
	}

	public final Same_type_equalsContext same_type_equals() throws RecognitionException {
		Same_type_equalsContext _localctx = new Same_type_equalsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(1023);
			match(EQUAL);
			setState(1024);
			match(EQUAL);
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(1027);
			operator();
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

	public static class Prefix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(1030);
			operator();
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

	public static class Postfix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(1033);
			operator();
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

	public static class OperatorContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public List<Operator_characterContext> operator_character() {
			return getRuleContexts(Operator_characterContext.class);
		}
		public Operator_characterContext operator_character(int i) {
			return getRuleContext(Operator_characterContext.class,i);
		}
		public Dot_operator_headContext dot_operator_head() {
			return getRuleContext(Dot_operator_headContext.class,0);
		}
		public List<Dot_operator_characterContext> dot_operator_character() {
			return getRuleContexts(Dot_operator_characterContext.class);
		}
		public Dot_operator_characterContext dot_operator_character(int i) {
			return getRuleContext(Dot_operator_characterContext.class,i);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_operator);
		try {
			int _alt;
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				operator_head();
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1036);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(1037);
						operator_character();
						}
						} 
					}
					setState(1042);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				dot_operator_head();
				setState(1048);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1044);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(1045);
						dot_operator_character();
						}
						} 
					}
					setState(1050);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
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

	public static class Operator_characterContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public Operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_character; }
	}

	public final Operator_characterContext operator_character() throws RecognitionException {
		Operator_characterContext _localctx = new Operator_characterContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_operator_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			operator_head();
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

	public static class Operator_headContext extends ParserRuleContext {
		public Operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_head; }
	}

	public final Operator_headContext operator_head() throws RecognitionException {
		Operator_headContext _localctx = new Operator_headContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_operator_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LT - 119)) | (1L << (GT - 119)) | (1L << (BANG - 119)) | (1L << (QUESTION - 119)) | (1L << (AND - 119)) | (1L << (SUB - 119)) | (1L << (EQUAL - 119)) | (1L << (OR - 119)) | (1L << (DIV - 119)) | (1L << (ADD - 119)) | (1L << (MUL - 119)) | (1L << (MOD - 119)) | (1L << (CARET - 119)) | (1L << (TILDE - 119)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Dot_operator_headContext extends ParserRuleContext {
		public Dot_operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_head; }
	}

	public final Dot_operator_headContext dot_operator_head() throws RecognitionException {
		Dot_operator_headContext _localctx = new Dot_operator_headContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(DOT);
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

	public static class Dot_operator_characterContext extends ParserRuleContext {
		public Operator_characterContext operator_character() {
			return getRuleContext(Operator_characterContext.class,0);
		}
		public Dot_operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_character; }
	}

	public final Dot_operator_characterContext dot_operator_character() throws RecognitionException {
		Dot_operator_characterContext _localctx = new Dot_operator_characterContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_dot_operator_character);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(DOT);
				}
				break;
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				operator_character();
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

	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Nil_literalContext nil_literal() {
			return getRuleContext(Nil_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_literal);
		try {
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				nil_literal();
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negate_prefix_operatorContext negate_prefix_operator() {
			return getRuleContext(Negate_prefix_operatorContext.class,0);
		}
		public TerminalNode Floating_point_literal() { return getToken(Swift3Parser.Floating_point_literal, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_numeric_literal);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1069);
					negate_prefix_operator();
					}
					break;
				}
				setState(1072);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1073);
					negate_prefix_operator();
					}
					break;
				}
				setState(1076);
				match(Floating_point_literal);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			_la = _input.LA(1);
			if ( !(_la==T__93 || _la==T__104) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Nil_literalContext extends ParserRuleContext {
		public Nil_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_literal; }
	}

	public final Nil_literalContext nil_literal() throws RecognitionException {
		Nil_literalContext _localctx = new Nil_literalContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(T__97);
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

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Binary_literal() { return getToken(Swift3Parser.Binary_literal, 0); }
		public TerminalNode Decimal_literal() { return getToken(Swift3Parser.Decimal_literal, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(Swift3Parser.Pure_decimal_digits, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Binary_literal - 136)) | (1L << (Decimal_literal - 136)) | (1L << (Pure_decimal_digits - 136)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(Swift3Parser.Static_string_literal, 0); }
		public TerminalNode Interpolated_string_literal() { return getToken(Swift3Parser.Interpolated_string_literal, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_la = _input.LA(1);
			if ( !(_la==Static_string_literal || _la==Interpolated_string_literal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return statements_impl_sempred((Statements_implContext)_localctx, predIndex);
		case 85:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 106:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 107:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 108:
			return compilation_condition_AND_sempred((Compilation_condition_ANDContext)_localctx, predIndex);
		case 109:
			return compilation_condition_OR_sempred((Compilation_condition_ORContext)_localctx, predIndex);
		case 110:
			return compilation_condition_GE_sempred((Compilation_condition_GEContext)_localctx, predIndex);
		case 111:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 112:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 113:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 114:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 115:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 116:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 117:
			return operator_sempred((OperatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_impl_sempred(Statements_implContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean compilation_condition_AND_sempred(Compilation_condition_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean compilation_condition_OR_sempred(Compilation_condition_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean compilation_condition_GE_sempred(Compilation_condition_GEContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return SwiftSupport.isOperator(_input,">=");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return _input.get(_input.index()-1).getType()!=WS;
		case 23:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0092\u0442\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\3\2\5\2\u0104\n\2\3\2\3\2\3\3\3\3\5\3\u010a\n\3\3\3\3"+
		"\3\5\3\u010e\n\3\3\3\3\3\5\3\u0112\n\3\3\3\3\3\5\3\u0116\n\3\3\3\3\3\5"+
		"\3\u011a\n\3\5\3\u011c\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0124\n\5\3\6\3"+
		"\6\5\6\u0128\n\6\3\7\3\7\5\7\u012c\n\7\3\7\3\7\5\7\u0130\n\7\3\7\3\7\5"+
		"\7\u0134\n\7\3\7\3\7\3\7\3\7\5\7\u013a\n\7\3\7\3\7\5\7\u013e\n\7\3\7\3"+
		"\7\5\7\u0142\n\7\3\7\3\7\5\7\u0146\n\7\3\b\3\b\5\b\u014a\n\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\7\n\u0153\n\n\f\n\16\n\u0156\13\n\3\13\3\13\3\13\5"+
		"\13\u015b\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0169"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0171\n\17\3\20\3\20\3\20\3\20"+
		"\5\20\u0177\n\20\3\21\3\21\3\21\5\21\u017c\n\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\5\24\u0184\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u018c\n\25"+
		"\3\26\6\26\u018f\n\26\r\26\16\26\u0190\3\27\5\27\u0194\n\27\3\30\3\30"+
		"\5\30\u0198\n\30\3\30\3\30\3\31\3\31\5\31\u019e\n\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\7\33\u01a7\n\33\f\33\16\33\u01aa\13\33\3\34\3\34\5"+
		"\34\u01ae\n\34\3\35\5\35\u01b1\n\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36"+
		"\u01b9\n\36\f\36\16\36\u01bc\13\36\3\37\3\37\5\37\u01c0\n\37\3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01d8\n!"+
		"\3!\3!\3!\3!\3!\3!\3!\5!\u01e1\n!\3!\3!\3!\3!\3!\5!\u01e8\n!\3\"\5\"\u01eb"+
		"\n\"\3\"\3\"\3#\3#\3$\3$\3$\5$\u01f4\n$\3$\3$\3$\3$\3$\3$\3$\5$\u01fd"+
		"\n$\3%\5%\u0200\n%\3%\3%\3%\3&\5&\u0206\n&\3&\3&\5&\u020a\n&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\5(\u0215\n(\3(\3(\3(\3(\3(\3(\3(\5(\u021e\n(\3)"+
		"\5)\u0221\n)\3)\3)\3*\5*\u0226\n*\3*\3*\3+\3+\3+\5+\u022d\n+\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u0236\n+\3,\3,\5,\u023a\n,\3,\3,\3-\3-\5-\u0240\n-\3-"+
		"\3-\3.\3.\3.\3.\5.\u0248\n.\3/\5/\u024b\n/\3/\3/\3\60\3\60\5\60\u0251"+
		"\n\60\3\61\3\61\5\61\u0255\n\61\3\61\5\61\u0258\n\61\3\61\3\61\3\61\5"+
		"\61\u025d\n\61\5\61\u025f\n\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u026c\n\64\3\65\3\65\3\65\7\65\u0271\n\65\f\65\16"+
		"\65\u0274\13\65\3\66\5\66\u0277\n\66\3\66\3\66\3\66\5\66\u027c\n\66\3"+
		"\66\5\66\u027f\n\66\3\66\3\66\3\66\3\66\5\66\u0285\n\66\3\66\3\66\3\66"+
		"\3\66\5\66\u028b\n\66\3\67\3\67\38\38\39\39\39\3:\5:\u0295\n:\3:\3:\3"+
		":\3:\3;\3;\3<\3<\7<\u029f\n<\f<\16<\u02a2\13<\3<\3<\3=\3=\3>\3>\3>\5>"+
		"\u02ab\n>\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\5B\u02c2\nB\3C\6C\u02c5\nC\rC\16C\u02c6\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02e2\nD\3E\3E\3"+
		"F\3F\5F\u02e8\nF\3F\3F\5F\u02ec\nF\3G\3G\3H\3H\3H\3H\5H\u02f4\nH\3I\3"+
		"I\3J\3J\5J\u02fa\nJ\3K\3K\3K\7K\u02ff\nK\fK\16K\u0302\13K\3L\3L\3L\3L"+
		"\3L\5L\u0309\nL\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0317\nN\3O\6O"+
		"\u031a\nO\rO\16O\u031b\3P\3P\3P\3P\3Q\3Q\3Q\5Q\u0325\nQ\3R\3R\5R\u0329"+
		"\nR\3S\3S\5S\u032d\nS\3S\3S\3T\3T\5T\u0333\nT\3T\3T\3T\3T\5T\u0339\nT"+
		"\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\7W\u036c\nW\fW\16W\u036f\13W\3X\3X\3X\3X\3X\3X\5X\u0377\nX\3"+
		"Y\3Y\3Y\7Y\u037c\nY\fY\16Y\u037f\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z"+
		"\u038b\nZ\3[\3[\7[\u038f\n[\f[\16[\u0392\13[\3\\\3\\\3\\\3]\3]\3]\5]\u039a"+
		"\n]\3^\3^\5^\u039e\n^\3^\3^\3_\3_\3_\5_\u03a5\n_\3`\3`\3a\3a\5a\u03ab"+
		"\na\3a\3a\3a\3a\3a\3a\3a\3a\5a\u03b5\na\3b\3b\3b\3b\3b\5b\u03bc\nb\3b"+
		"\3b\5b\u03c0\nb\3c\3c\3c\3c\3c\5c\u03c7\nc\3d\5d\u03ca\nd\3d\3d\3d\3d"+
		"\5d\u03d0\nd\3e\3e\3f\3f\3f\3f\3g\3g\3h\3h\5h\u03dc\nh\3i\3i\5i\u03e0"+
		"\ni\3j\3j\3k\3k\3l\3l\3l\3m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p"+
		"\3q\3q\3q\3q\3r\3r\3r\3r\3r\3s\3s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w"+
		"\3w\3w\7w\u0411\nw\fw\16w\u0414\13w\3w\3w\3w\7w\u0419\nw\fw\16w\u041c"+
		"\13w\5w\u041e\nw\3x\3x\3y\3y\3z\3z\3{\3{\5{\u0428\n{\3|\3|\3|\3|\5|\u042e"+
		"\n|\3}\5}\u0431\n}\3}\3}\5}\u0435\n}\3}\5}\u0438\n}\3~\3~\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\2\3\u00ac\u0082\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\2\n\4\2\7\7\16\23\3\2\'(\7"+
		"\2\24\27\32\32\34 &(,S\5\2\3\5\b*,m\5\2yz|}\177\u0088\4\2``kk\3\2\u008a"+
		"\u008c\3\2\u008e\u008f\2\u045e\2\u0103\3\2\2\2\4\u011b\3\2\2\2\6\u011d"+
		"\3\2\2\2\b\u011f\3\2\2\2\n\u0127\3\2\2\2\f\u0145\3\2\2\2\16\u0149\3\2"+
		"\2\2\20\u014b\3\2\2\2\22\u014f\3\2\2\2\24\u015a\3\2\2\2\26\u015c\3\2\2"+
		"\2\30\u0168\3\2\2\2\32\u016a\3\2\2\2\34\u016c\3\2\2\2\36\u0176\3\2\2\2"+
		" \u017b\3\2\2\2\"\u017d\3\2\2\2$\u017f\3\2\2\2&\u0181\3\2\2\2(\u018b\3"+
		"\2\2\2*\u018e\3\2\2\2,\u0193\3\2\2\2.\u0195\3\2\2\2\60\u019b\3\2\2\2\62"+
		"\u01a1\3\2\2\2\64\u01a3\3\2\2\2\66\u01ad\3\2\2\28\u01b0\3\2\2\2:\u01b5"+
		"\3\2\2\2<\u01bd\3\2\2\2>\u01c1\3\2\2\2@\u01e7\3\2\2\2B\u01ea\3\2\2\2D"+
		"\u01ee\3\2\2\2F\u01fc\3\2\2\2H\u01ff\3\2\2\2J\u0205\3\2\2\2L\u020d\3\2"+
		"\2\2N\u021d\3\2\2\2P\u0220\3\2\2\2R\u0225\3\2\2\2T\u0235\3\2\2\2V\u0237"+
		"\3\2\2\2X\u023d\3\2\2\2Z\u0243\3\2\2\2\\\u024a\3\2\2\2^\u0250\3\2\2\2"+
		"`\u025e\3\2\2\2b\u0260\3\2\2\2d\u0263\3\2\2\2f\u026b\3\2\2\2h\u026d\3"+
		"\2\2\2j\u028a\3\2\2\2l\u028c\3\2\2\2n\u028e\3\2\2\2p\u0290\3\2\2\2r\u0294"+
		"\3\2\2\2t\u029a\3\2\2\2v\u029c\3\2\2\2x\u02a5\3\2\2\2z\u02aa\3\2\2\2|"+
		"\u02ac\3\2\2\2~\u02b0\3\2\2\2\u0080\u02b4\3\2\2\2\u0082\u02c1\3\2\2\2"+
		"\u0084\u02c4\3\2\2\2\u0086\u02e1\3\2\2\2\u0088\u02e3\3\2\2\2\u008a\u02eb"+
		"\3\2\2\2\u008c\u02ed\3\2\2\2\u008e\u02f3\3\2\2\2\u0090\u02f5\3\2\2\2\u0092"+
		"\u02f7\3\2\2\2\u0094\u02fb\3\2\2\2\u0096\u0308\3\2\2\2\u0098\u030a\3\2"+
		"\2\2\u009a\u0316\3\2\2\2\u009c\u0319\3\2\2\2\u009e\u031d\3\2\2\2\u00a0"+
		"\u0324\3\2\2\2\u00a2\u0328\3\2\2\2\u00a4\u032a\3\2\2\2\u00a6\u0338\3\2"+
		"\2\2\u00a8\u033a\3\2\2\2\u00aa\u033c\3\2\2\2\u00ac\u0340\3\2\2\2\u00ae"+
		"\u0376\3\2\2\2\u00b0\u0378\3\2\2\2\u00b2\u038a\3\2\2\2\u00b4\u038c\3\2"+
		"\2\2\u00b6\u0393\3\2\2\2\u00b8\u0399\3\2\2\2\u00ba\u039b\3\2\2\2\u00bc"+
		"\u03a1\3\2\2\2\u00be\u03a6\3\2\2\2\u00c0\u03b4\3\2\2\2\u00c2\u03bf\3\2"+
		"\2\2\u00c4\u03c6\3\2\2\2\u00c6\u03cf\3\2\2\2\u00c8\u03d1\3\2\2\2\u00ca"+
		"\u03d3\3\2\2\2\u00cc\u03d7\3\2\2\2\u00ce\u03db\3\2\2\2\u00d0\u03df\3\2"+
		"\2\2\u00d2\u03e1\3\2\2\2\u00d4\u03e3\3\2\2\2\u00d6\u03e5\3\2\2\2\u00d8"+
		"\u03e8\3\2\2\2\u00da\u03eb\3\2\2\2\u00dc\u03ef\3\2\2\2\u00de\u03f3\3\2"+
		"\2\2\u00e0\u03f7\3\2\2\2\u00e2\u03fb\3\2\2\2\u00e4\u0400\3\2\2\2\u00e6"+
		"\u0404\3\2\2\2\u00e8\u0407\3\2\2\2\u00ea\u040a\3\2\2\2\u00ec\u041d\3\2"+
		"\2\2\u00ee\u041f\3\2\2\2\u00f0\u0421\3\2\2\2\u00f2\u0423\3\2\2\2\u00f4"+
		"\u0427\3\2\2\2\u00f6\u042d\3\2\2\2\u00f8\u0437\3\2\2\2\u00fa\u0439\3\2"+
		"\2\2\u00fc\u043b\3\2\2\2\u00fe\u043d\3\2\2\2\u0100\u043f\3\2\2\2\u0102"+
		"\u0104\5\6\4\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\7\2\2\3\u0106\3\3\2\2\2\u0107\u0109\5\u0092J\2\u0108"+
		"\u010a\7x\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u011c\3\2"+
		"\2\2\u010b\u010d\5(\25\2\u010c\u010e\7x\2\2\u010d\u010c\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u011c\3\2\2\2\u010f\u0111\5\n\6\2\u0110\u0112\7x"+
		"\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011c\3\2\2\2\u0113"+
		"\u0115\5\32\16\2\u0114\u0116\7x\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u011c\3\2\2\2\u0117\u0119\5 \21\2\u0118\u011a\7x\2\2\u0119"+
		"\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0107\3\2"+
		"\2\2\u011b\u010b\3\2\2\2\u011b\u010f\3\2\2\2\u011b\u0113\3\2\2\2\u011b"+
		"\u0117\3\2\2\2\u011c\5\3\2\2\2\u011d\u011e\5\b\5\2\u011e\7\3\2\2\2\u011f"+
		"\u0120\6\5\2\3\u0120\u0121\5\4\3\2\u0121\u0123\b\5\1\2\u0122\u0124\5\b"+
		"\5\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\t\3\2\2\2\u0125\u0128"+
		"\5\f\7\2\u0126\u0128\5\20\t\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\13\3\2\2\2\u0129\u012b\7\3\2\2\u012a\u012c\5\16\b\2\u012b\u012a"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\7x\2\2\u012e"+
		"\u0130\5\u0092J\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\7x\2\2\u0132\u0134\5\u0092J\2\u0133\u0132\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0146\5.\30\2\u0136\u0137"+
		"\7\3\2\2\u0137\u0139\7q\2\2\u0138\u013a\5\16\b\2\u0139\u0138\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\7x\2\2\u013c\u013e\5\u0092"+
		"J\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\7x\2\2\u0140\u0142\5\u0092J\2\u0141\u0140\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7t\2\2\u0144\u0146\5.\30\2\u0145"+
		"\u0129\3\2\2\2\u0145\u0136\3\2\2\2\u0146\r\3\2\2\2\u0147\u014a\5@!\2\u0148"+
		"\u014a\5\u0094K\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\17\3\2"+
		"\2\2\u014b\u014c\7\4\2\2\u014c\u014d\5\22\n\2\u014d\u014e\5.\30\2\u014e"+
		"\21\3\2\2\2\u014f\u0154\5\24\13\2\u0150\u0151\7v\2\2\u0151\u0153\5\24"+
		"\13\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\23\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\5\u0092"+
		"J\2\u0158\u015b\5\26\f\2\u0159\u015b\5\30\r\2\u015a\u0157\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\25\3\2\2\2\u015c\u015d\7\5\2"+
		"\2\u015d\u015e\5\u008aF\2\u015e\u015f\5> \2\u015f\27\3\2\2\2\u0160\u0161"+
		"\7\6\2\2\u0161\u0162\5\u008aF\2\u0162\u0163\5> \2\u0163\u0169\3\2\2\2"+
		"\u0164\u0165\7\7\2\2\u0165\u0166\5\u008aF\2\u0166\u0167\5> \2\u0167\u0169"+
		"\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0164\3\2\2\2\u0169\31\3\2\2\2\u016a"+
		"\u016b\5\34\17\2\u016b\33\3\2\2\2\u016c\u016d\7\b\2\2\u016d\u016e\5\22"+
		"\n\2\u016e\u0170\5.\30\2\u016f\u0171\5\36\20\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\35\3\2\2\2\u0172\u0173\7\t\2\2\u0173\u0177\5.\30"+
		"\2\u0174\u0175\7\t\2\2\u0175\u0177\5\34\17\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\37\3\2\2\2\u0178\u017c\5\"\22\2\u0179\u017c\5$\23"+
		"\2\u017a\u017c\5&\24\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a"+
		"\3\2\2\2\u017c!\3\2\2\2\u017d\u017e\7\n\2\2\u017e#\3\2\2\2\u017f\u0180"+
		"\7\13\2\2\u0180%\3\2\2\2\u0181\u0183\7\f\2\2\u0182\u0184\5\u0092J\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\'\3\2\2\2\u0185\u018c\5\60\31"+
		"\2\u0186\u018c\58\35\2\u0187\u018c\5@!\2\u0188\u018c\5Z.\2\u0189\u018c"+
		"\5r:\2\u018a\u018c\5z>\2\u018b\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018b"+
		"\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c)\3\2\2\2\u018d\u018f\5(\25\2\u018e\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191+\3\2\2\2\u0192"+
		"\u0194\5\6\4\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194-\3\2\2\2"+
		"\u0195\u0197\7p\2\2\u0196\u0198\5\6\4\2\u0197\u0196\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7s\2\2\u019a/\3\2\2\2\u019b\u019d"+
		"\7\r\2\2\u019c\u019e\5\62\32\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2"+
		"\u019e\u019f\3\2\2\2\u019f\u01a0\5\64\33\2\u01a0\61\3\2\2\2\u01a1\u01a2"+
		"\t\2\2\2\u01a2\63\3\2\2\2\u01a3\u01a8\5\66\34\2\u01a4\u01a5\7o\2\2\u01a5"+
		"\u01a7\5\66\34\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\65\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ae\5\u00ceh\2\u01ac\u01ae\5\u00ecw\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac"+
		"\3\2\2\2\u01ae\67\3\2\2\2\u01af\u01b1\5\u0084C\2\u01b0\u01af\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\6\2\2\u01b3\u01b4\5:"+
		"\36\2\u01b49\3\2\2\2\u01b5\u01ba\5<\37\2\u01b6\u01b7\7v\2\2\u01b7\u01b9"+
		"\5<\37\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb;\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01bf\5\u008a"+
		"F\2\u01be\u01c0\5> \2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0=\3"+
		"\2\2\2\u01c1\u01c2\5\u00d6l\2\u01c2\u01c3\5\u0092J\2\u01c3?\3\2\2\2\u01c4"+
		"\u01c5\5B\"\2\u01c5\u01c6\5D#\2\u01c6\u01c7\5\u00ba^\2\u01c7\u01c8\5."+
		"\30\2\u01c8\u01e8\3\2\2\2\u01c9\u01ca\5B\"\2\u01ca\u01cb\5D#\2\u01cb\u01cc"+
		"\5\u00ba^\2\u01cc\u01cd\5F$\2\u01cd\u01e8\3\2\2\2\u01ce\u01cf\5B\"\2\u01cf"+
		"\u01d0\5D#\2\u01d0\u01d1\5\u00ba^\2\u01d1\u01d2\5N(\2\u01d2\u01e8\3\2"+
		"\2\2\u01d3\u01d4\5B\"\2\u01d4\u01d5\5D#\2\u01d5\u01d7\5\u00ba^\2\u01d6"+
		"\u01d8\5> \2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2"+
		"\2\u01d9\u01da\5T+\2\u01da\u01e8\3\2\2\2\u01db\u01dc\5B\"\2\u01dc\u01dd"+
		"\5D#\2\u01dd\u01de\5\u00ba^\2\u01de\u01e0\5\u00ba^\2\u01df\u01e1\5> \2"+
		"\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3"+
		"\5T+\2\u01e3\u01e8\3\2\2\2\u01e4\u01e5\5B\"\2\u01e5\u01e6\5:\36\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01c4\3\2\2\2\u01e7\u01c9\3\2\2\2\u01e7\u01ce\3\2"+
		"\2\2\u01e7\u01d3\3\2\2\2\u01e7\u01db\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e8"+
		"A\3\2\2\2\u01e9\u01eb\5\u0084C\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7\7\2\2\u01edC\3\2\2\2\u01ee\u01ef"+
		"\5\u00ceh\2\u01efE\3\2\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f3\5H%\2\u01f2"+
		"\u01f4\5J&\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2"+
		"\2\u01f5\u01f6\7s\2\2\u01f6\u01fd\3\2\2\2\u01f7\u01f8\7p\2\2\u01f8\u01f9"+
		"\5J&\2\u01f9\u01fa\5H%\2\u01fa\u01fb\7s\2\2\u01fb\u01fd\3\2\2\2\u01fc"+
		"\u01f0\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fdG\3\2\2\2\u01fe\u0200\5\u0088"+
		"E\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0202\7\24\2\2\u0202\u0203\5.\30\2\u0203I\3\2\2\2\u0204\u0206\5\u0088"+
		"E\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\7\25\2\2\u0208\u020a\5L\'\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020c\5.\30\2\u020cK\3\2\2\2\u020d\u020e"+
		"\7q\2\2\u020e\u020f\5\u00ceh\2\u020f\u0210\7t\2\2\u0210M\3\2\2\2\u0211"+
		"\u0212\7p\2\2\u0212\u0214\5P)\2\u0213\u0215\5R*\2\u0214\u0213\3\2\2\2"+
		"\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7s\2\2\u0217\u021e"+
		"\3\2\2\2\u0218\u0219\7p\2\2\u0219\u021a\5R*\2\u021a\u021b\5P)\2\u021b"+
		"\u021c\7s\2\2\u021c\u021e\3\2\2\2\u021d\u0211\3\2\2\2\u021d\u0218\3\2"+
		"\2\2\u021eO\3\2\2\2\u021f\u0221\5\u0088E\2\u0220\u021f\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7\24\2\2\u0223Q\3\2\2\2\u0224"+
		"\u0226\5\u0088E\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0228\7\25\2\2\u0228S\3\2\2\2\u0229\u022a\7p\2\2\u022a"+
		"\u022c\5V,\2\u022b\u022d\5X-\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2"+
		"\u022d\u022e\3\2\2\2\u022e\u022f\7s\2\2\u022f\u0236\3\2\2\2\u0230\u0231"+
		"\7p\2\2\u0231\u0232\5X-\2\u0232\u0233\5V,\2\u0233\u0234\7s\2\2\u0234\u0236"+
		"\3\2\2\2\u0235\u0229\3\2\2\2\u0235\u0230\3\2\2\2\u0236U\3\2\2\2\u0237"+
		"\u0239\7\26\2\2\u0238\u023a\5L\'\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u023c\5.\30\2\u023cW\3\2\2\2\u023d\u023f"+
		"\7\27\2\2\u023e\u0240\5L\'\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0242\5.\30\2\u0242Y\3\2\2\2\u0243\u0244\5\\/\2\u0244"+
		"\u0245\5^\60\2\u0245\u0247\5`\61\2\u0246\u0248\5d\63\2\u0247\u0246\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248[\3\2\2\2\u0249\u024b\5\u0084C\2\u024a\u0249"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\7\23\2\2"+
		"\u024d]\3\2\2\2\u024e\u0251\5\u00ceh\2\u024f\u0251\5\u00ecw\2\u0250\u024e"+
		"\3\2\2\2\u0250\u024f\3\2\2\2\u0251_\3\2\2\2\u0252\u0254\5f\64\2\u0253"+
		"\u0255\7\30\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3"+
		"\2\2\2\u0256\u0258\5b\62\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u025f\3\2\2\2\u0259\u025a\5f\64\2\u025a\u025c\7\31\2\2\u025b\u025d\5"+
		"b\62\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e"+
		"\u0252\3\2\2\2\u025e\u0259\3\2\2\2\u025fa\3\2\2\2\u0260\u0261\5\u00e0"+
		"q\2\u0261\u0262\5\u00b8]\2\u0262c\3\2\2\2\u0263\u0264\5.\30\2\u0264e\3"+
		"\2\2\2\u0265\u0266\7q\2\2\u0266\u026c\7t\2\2\u0267\u0268\7q\2\2\u0268"+
		"\u0269\5h\65\2\u0269\u026a\7t\2\2\u026a\u026c\3\2\2\2\u026b\u0265\3\2"+
		"\2\2\u026b\u0267\3\2\2\2\u026cg\3\2\2\2\u026d\u0272\5j\66\2\u026e\u026f"+
		"\7v\2\2\u026f\u0271\5j\66\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273i\3\2\2\2\u0274\u0272\3\2\2\2"+
		"\u0275\u0277\5l\67\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0279\5n8\2\u0279\u027b\5\u00ba^\2\u027a\u027c\5p9\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u028b\3\2\2\2\u027d\u027f\5l"+
		"\67\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0281\5n8\2\u0281\u0282\5\u00ba^\2\u0282\u028b\3\2\2\2\u0283\u0285\5"+
		"l\67\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0287\5n8\2\u0287\u0288\5\u00ba^\2\u0288\u0289\5\u00e2r\2\u0289\u028b"+
		"\3\2\2\2\u028a\u0276\3\2\2\2\u028a\u027e\3\2\2\2\u028a\u0284\3\2\2\2\u028b"+
		"k\3\2\2\2\u028c\u028d\5\u00d0i\2\u028dm\3\2\2\2\u028e\u028f\5\u00d0i\2"+
		"\u028fo\3\2\2\2\u0290\u0291\5\u00d6l\2\u0291\u0292\5\u0092J\2\u0292q\3"+
		"\2\2\2\u0293\u0295\5\u0086D\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2"+
		"\u0295\u0296\3\2\2\2\u0296\u0297\7\17\2\2\u0297\u0298\5t;\2\u0298\u0299"+
		"\5v<\2\u0299s\3\2\2\2\u029a\u029b\5\u00ceh\2\u029bu\3\2\2\2\u029c\u02a0"+
		"\7p\2\2\u029d\u029f\5x=\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2"+
		"\2\2\u02a3\u02a4\7s\2\2\u02a4w\3\2\2\2\u02a5\u02a6\5(\25\2\u02a6y\3\2"+
		"\2\2\u02a7\u02ab\5|?\2\u02a8\u02ab\5~@\2\u02a9\u02ab\5\u0080A\2\u02aa"+
		"\u02a7\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab{\3\2\2\2"+
		"\u02ac\u02ad\7\32\2\2\u02ad\u02ae\7\33\2\2\u02ae\u02af\5\u00ecw\2\u02af"+
		"}\3\2\2\2\u02b0\u02b1\7\34\2\2\u02b1\u02b2\7\33\2\2\u02b2\u02b3\5\u00ec"+
		"w\2\u02b3\177\3\2\2\2\u02b4\u02b5\7\35\2\2\u02b5\u02b6\7\33\2\2\u02b6"+
		"\u02b7\5\u00ecw\2\u02b7\u0081\3\2\2\2\u02b8\u02c2\7\20\2\2\u02b9\u02c2"+
		"\7\36\2\2\u02ba\u02c2\7\37\2\2\u02bb\u02c2\7\34\2\2\u02bc\u02c2\7\32\2"+
		"\2\u02bd\u02c2\7 \2\2\u02be\u02c2\7!\2\2\u02bf\u02c2\5\u0086D\2\u02c0"+
		"\u02c2\5\u0088E\2\u02c1\u02b8\3\2\2\2\u02c1\u02b9\3\2\2\2\u02c1\u02ba"+
		"\3\2\2\2\u02c1\u02bb\3\2\2\2\u02c1\u02bc\3\2\2\2\u02c1\u02bd\3\2\2\2\u02c1"+
		"\u02be\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u0083\3\2"+
		"\2\2\u02c3\u02c5\5\u0082B\2\u02c4\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u0085\3\2\2\2\u02c8\u02e2\7\""+
		"\2\2\u02c9\u02ca\7\"\2\2\u02ca\u02cb\7q\2\2\u02cb\u02cc\7\25\2\2\u02cc"+
		"\u02e2\7t\2\2\u02cd\u02e2\7#\2\2\u02ce\u02cf\7#\2\2\u02cf\u02d0\7q\2\2"+
		"\u02d0\u02d1\7\25\2\2\u02d1\u02e2\7t\2\2\u02d2\u02e2\7$\2\2\u02d3\u02d4"+
		"\7$\2\2\u02d4\u02d5\7q\2\2\u02d5\u02d6\7\25\2\2\u02d6\u02e2\7t\2\2\u02d7"+
		"\u02e2\7%\2\2\u02d8\u02d9\7%\2\2\u02d9\u02da\7q\2\2\u02da\u02db\7\25\2"+
		"\2\u02db\u02e2\7t\2\2\u02dc\u02e2\7&\2\2\u02dd\u02de\7&\2\2\u02de\u02df"+
		"\7q\2\2\u02df\u02e0\7\25\2\2\u02e0\u02e2\7t\2\2\u02e1\u02c8\3\2\2\2\u02e1"+
		"\u02c9\3\2\2\2\u02e1\u02cd\3\2\2\2\u02e1\u02ce\3\2\2\2\u02e1\u02d2\3\2"+
		"\2\2\u02e1\u02d3\3\2\2\2\u02e1\u02d7\3\2\2\2\u02e1\u02d8\3\2\2\2\u02e1"+
		"\u02dc\3\2\2\2\u02e1\u02dd\3\2\2\2\u02e2\u0087\3\2\2\2\u02e3\u02e4\t\3"+
		"\2\2\u02e4\u0089\3\2\2\2\u02e5\u02e7\5\u008cG\2\u02e6\u02e8\5\u00ba^\2"+
		"\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ec\3\2\2\2\u02e9\u02ec"+
		"\5\u008eH\2\u02ea\u02ec\5\u0090I\2\u02eb\u02e5\3\2\2\2\u02eb\u02e9\3\2"+
		"\2\2\u02eb\u02ea\3\2\2\2\u02ec\u008b\3\2\2\2\u02ed\u02ee\5\u00ceh\2\u02ee"+
		"\u008d\3\2\2\2\u02ef\u02f0\7\7\2\2\u02f0\u02f4\5\u008aF\2\u02f1\u02f2"+
		"\7\6\2\2\u02f2\u02f4\5\u008aF\2\u02f3\u02ef\3\2\2\2\u02f3\u02f1\3\2\2"+
		"\2\u02f4\u008f\3\2\2\2\u02f5\u02f6\5\u0092J\2\u02f6\u0091\3\2\2\2\u02f7"+
		"\u02f9\5\u0096L\2\u02f8\u02fa\5\u009cO\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fa\u0093\3\2\2\2\u02fb\u0300\5\u0092J\2\u02fc\u02fd\7v\2\2"+
		"\u02fd\u02ff\5\u0092J\2\u02fe\u02fc\3\2\2\2\u02ff\u0302\3\2\2\2\u0300"+
		"\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0095\3\2\2\2\u0302\u0300\3\2"+
		"\2\2\u0303\u0304\5\u00e8u\2\u0304\u0305\5\u00acW\2\u0305\u0309\3\2\2\2"+
		"\u0306\u0309\5\u00acW\2\u0307\u0309\5\u0098M\2\u0308\u0303\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309\u0097\3\2\2\2\u030a\u030b\7\177"+
		"\2\2\u030b\u030c\5\u00ceh\2\u030c\u0099\3\2\2\2\u030d\u030e\5\u00e6t\2"+
		"\u030e\u030f\5\u0096L\2\u030f\u0317\3\2\2\2\u0310\u0311\5\u00d6l\2\u0311"+
		"\u0312\5\u0096L\2\u0312\u0317\3\2\2\2\u0313\u0314\5\u009eP\2\u0314\u0315"+
		"\5\u0096L\2\u0315\u0317\3\2\2\2\u0316\u030d\3\2\2\2\u0316\u0310\3\2\2"+
		"\2\u0316\u0313\3\2\2\2\u0317\u009b\3\2\2\2\u0318\u031a\5\u009aN\2\u0319"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2"+
		"\2\2\u031c\u009d\3\2\2\2\u031d\u031e\7}\2\2\u031e\u031f\5\u0092J\2\u031f"+
		"\u0320\7w\2\2\u0320\u009f\3\2\2\2\u0321\u0325\5\u00ceh\2\u0322\u0325\5"+
		"\u00a2R\2\u0323\u0325\5\u00aaV\2\u0324\u0321\3\2\2\2\u0324\u0322\3\2\2"+
		"\2\u0324\u0323\3\2\2\2\u0325\u00a1\3\2\2\2\u0326\u0329\5\u00f6|\2\u0327"+
		"\u0329\5\u00a4S\2\u0328\u0326\3\2\2\2\u0328\u0327\3\2\2\2\u0329\u00a3"+
		"\3\2\2\2\u032a\u032c\7r\2\2\u032b\u032d\5\u00a6T\2\u032c\u032b\3\2\2\2"+
		"\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\7u\2\2\u032f\u00a5"+
		"\3\2\2\2\u0330\u0332\5\u00a8U\2\u0331\u0333\7v\2\2\u0332\u0331\3\2\2\2"+
		"\u0332\u0333\3\2\2\2\u0333\u0339\3\2\2\2\u0334\u0335\5\u00a8U\2\u0335"+
		"\u0336\7v\2\2\u0336\u0337\5\u00a6T\2\u0337\u0339\3\2\2\2\u0338\u0330\3"+
		"\2\2\2\u0338\u0334\3\2\2\2\u0339\u00a7\3\2\2\2\u033a\u033b\5\u0092J\2"+
		"\u033b\u00a9\3\2\2\2\u033c\u033d\7q\2\2\u033d\u033e\5\u0092J\2\u033e\u033f"+
		"\7t\2\2\u033f\u00ab\3\2\2\2\u0340\u0341\bW\1\2\u0341\u0342\5\u00a0Q\2"+
		"\u0342\u036d\3\2\2\2\u0343\u0344\f\f\2\2\u0344\u036c\5\u00eav\2\u0345"+
		"\u0346\f\13\2\2\u0346\u036c\5\u00aeX\2\u0347\u0348\f\n\2\2\u0348\u0349"+
		"\7o\2\2\u0349\u036c\7)\2\2\u034a\u034b\f\t\2\2\u034b\u034c\7o\2\2\u034c"+
		"\u034d\7)\2\2\u034d\u034e\7q\2\2\u034e\u034f\5\u00b4[\2\u034f\u0350\7"+
		"t\2\2\u0350\u036c\3\2\2\2\u0351\u0352\f\b\2\2\u0352\u0353\7o\2\2\u0353"+
		"\u036c\7\u008c\2\2\u0354\u0355\f\7\2\2\u0355\u0356\7o\2\2\u0356\u036c"+
		"\5\u00ceh\2\u0357\u0358\f\6\2\2\u0358\u0359\7o\2\2\u0359\u035a\5\u00ce"+
		"h\2\u035a\u035b\7q\2\2\u035b\u035c\5\u00b4[\2\u035c\u035d\7t\2\2\u035d"+
		"\u036c\3\2\2\2\u035e\u035f\f\5\2\2\u035f\u0360\7q\2\2\u0360\u0361\5\u00b4"+
		"[\2\u0361\u0362\7t\2\2\u0362\u036c\3\2\2\2\u0363\u0364\f\4\2\2\u0364\u0365"+
		"\7o\2\2\u0365\u036c\7*\2\2\u0366\u0367\f\3\2\2\u0367\u0368\7r\2\2\u0368"+
		"\u0369\5\u0094K\2\u0369\u036a\7u\2\2\u036a\u036c\3\2\2\2\u036b\u0343\3"+
		"\2\2\2\u036b\u0345\3\2\2\2\u036b\u0347\3\2\2\2\u036b\u034a\3\2\2\2\u036b"+
		"\u0351\3\2\2\2\u036b\u0354\3\2\2\2\u036b\u0357\3\2\2\2\u036b\u035e\3\2"+
		"\2\2\u036b\u0363\3\2\2\2\u036b\u0366\3\2\2\2\u036c\u036f\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u00ad\3\2\2\2\u036f\u036d\3\2"+
		"\2\2\u0370\u0371\7q\2\2\u0371\u0377\7t\2\2\u0372\u0373\7q\2\2\u0373\u0374"+
		"\5\u00b0Y\2\u0374\u0375\7t\2\2\u0375\u0377\3\2\2\2\u0376\u0370\3\2\2\2"+
		"\u0376\u0372\3\2\2\2\u0377\u00af\3\2\2\2\u0378\u037d\5\u00b2Z\2\u0379"+
		"\u037a\7v\2\2\u037a\u037c\5\u00b2Z\2\u037b\u0379\3\2\2\2\u037c\u037f\3"+
		"\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u00b1\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u0380\u038b\5\u0092J\2\u0381\u0382\5\u00d0i\2\u0382\u0383"+
		"\7w\2\2\u0383\u0384\5\u0092J\2\u0384\u038b\3\2\2\2\u0385\u038b\5\u00ec"+
		"w\2\u0386\u0387\5\u00d0i\2\u0387\u0388\7w\2\2\u0388\u0389\5\u00ecw\2\u0389"+
		"\u038b\3\2\2\2\u038a\u0380\3\2\2\2\u038a\u0381\3\2\2\2\u038a\u0385\3\2"+
		"\2\2\u038a\u0386\3\2\2\2\u038b\u00b3\3\2\2\2\u038c\u0390\5\u00b6\\\2\u038d"+
		"\u038f\5\u00b6\\\2\u038e\u038d\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e"+
		"\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u00b5\3\2\2\2\u0392\u0390\3\2\2\2\u0393"+
		"\u0394\5\u00d0i\2\u0394\u0395\7w\2\2\u0395\u00b7\3\2\2\2\u0396\u039a\5"+
		"\u00caf\2\u0397\u039a\5\u00c0a\2\u0398\u039a\5\u00bc_\2\u0399\u0396\3"+
		"\2\2\2\u0399\u0397\3\2\2\2\u0399\u0398\3\2\2\2\u039a\u00b9\3\2\2\2\u039b"+
		"\u039d\7w\2\2\u039c\u039e\7+\2\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2"+
		"\2\u039e\u039f\3\2\2\2\u039f\u03a0\5\u00b8]\2\u03a0\u00bb\3\2\2\2\u03a1"+
		"\u03a4\5\u00be`\2\u03a2\u03a3\7o\2\2\u03a3\u03a5\5\u00bc_\2\u03a4\u03a2"+
		"\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u00bd\3\2\2\2\u03a6\u03a7\5\u00ceh"+
		"\2\u03a7\u00bf\3\2\2\2\u03a8\u03aa\5\u00c2b\2\u03a9\u03ab\7\30\2\2\u03aa"+
		"\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\5\u00e0"+
		"q\2\u03ad\u03ae\5\u00b8]\2\u03ae\u03b5\3\2\2\2\u03af\u03b0\5\u00c2b\2"+
		"\u03b0\u03b1\7\31\2\2\u03b1\u03b2\5\u00e0q\2\u03b2\u03b3\5\u00b8]\2\u03b3"+
		"\u03b5\3\2\2\2\u03b4\u03a8\3\2\2\2\u03b4\u03af\3\2\2\2\u03b5\u00c1\3\2"+
		"\2\2\u03b6\u03b7\7q\2\2\u03b7\u03c0\7t\2\2\u03b8\u03b9\7q\2\2\u03b9\u03bb"+
		"\5\u00c4c\2\u03ba\u03bc\5\u00e2r\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\7t\2\2\u03be\u03c0\3\2\2\2\u03bf"+
		"\u03b6\3\2\2\2\u03bf\u03b8\3\2\2\2\u03c0\u00c3\3\2\2\2\u03c1\u03c7\5\u00c6"+
		"d\2\u03c2\u03c3\5\u00c6d\2\u03c3\u03c4\7v\2\2\u03c4\u03c5\5\u00c4c\2\u03c5"+
		"\u03c7\3\2\2\2\u03c6\u03c1\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c7\u00c5\3\2"+
		"\2\2\u03c8\u03ca\7+\2\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03d0\5\u00b8]\2\u03cc\u03cd\5\u00c8e\2\u03cd\u03ce"+
		"\5\u00ba^\2\u03ce\u03d0\3\2\2\2\u03cf\u03c9\3\2\2\2\u03cf\u03cc\3\2\2"+
		"\2\u03d0\u00c7\3\2\2\2\u03d1\u03d2\5\u00d0i\2\u03d2\u00c9\3\2\2\2\u03d3"+
		"\u03d4\7r\2\2\u03d4\u03d5\5\u00b8]\2\u03d5\u03d6\7u\2\2\u03d6\u00cb\3"+
		"\2\2\2\u03d7\u03d8\7n\2\2\u03d8\u00cd\3\2\2\2\u03d9\u03dc\7n\2\2\u03da"+
		"\u03dc\5\u00d2j\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dc\u00cf"+
		"\3\2\2\2\u03dd\u03e0\7n\2\2\u03de\u03e0\5\u00d4k\2\u03df\u03dd\3\2\2\2"+
		"\u03df\u03de\3\2\2\2\u03e0\u00d1\3\2\2\2\u03e1\u03e2\t\4\2\2\u03e2\u00d3"+
		"\3\2\2\2\u03e3\u03e4\t\5\2\2\u03e4\u00d5\3\2\2\2\u03e5\u03e6\6l\r\2\u03e6"+
		"\u03e7\7\u0081\2\2\u03e7\u00d7\3\2\2\2\u03e8\u03e9\6m\16\2\u03e9\u03ea"+
		"\7\u0080\2\2\u03ea\u00d9\3\2\2\2\u03eb\u03ec\6n\17\2\u03ec\u03ed\7\177"+
		"\2\2\u03ed\u03ee\7\177\2\2\u03ee\u00db\3\2\2\2\u03ef\u03f0\6o\20\2\u03f0"+
		"\u03f1\7\u0082\2\2\u03f1\u03f2\7\u0082\2\2\u03f2\u00dd\3\2\2\2\u03f3\u03f4"+
		"\6p\21\2\u03f4\u03f5\7z\2\2\u03f5\u03f6\7\u0081\2\2\u03f6\u00df\3\2\2"+
		"\2\u03f7\u03f8\6q\22\2\u03f8\u03f9\7\u0080\2\2\u03f9\u03fa\7z\2\2\u03fa"+
		"\u00e1\3\2\2\2\u03fb\u03fc\6r\23\2\u03fc\u03fd\7o\2\2\u03fd\u03fe\7o\2"+
		"\2\u03fe\u03ff\7o\2\2\u03ff\u00e3\3\2\2\2\u0400\u0401\6s\24\2\u0401\u0402"+
		"\7\u0081\2\2\u0402\u0403\7\u0081\2\2\u0403\u00e5\3\2\2\2\u0404\u0405\6"+
		"t\25\2\u0405\u0406\5\u00ecw\2\u0406\u00e7\3\2\2\2\u0407\u0408\6u\26\2"+
		"\u0408\u0409\5\u00ecw\2\u0409\u00e9\3\2\2\2\u040a\u040b\6v\27\2\u040b"+
		"\u040c\5\u00ecw\2\u040c\u00eb\3\2\2\2\u040d\u0412\5\u00f0y\2\u040e\u040f"+
		"\6w\30\2\u040f\u0411\5\u00eex\2\u0410\u040e\3\2\2\2\u0411\u0414\3\2\2"+
		"\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u041e\3\2\2\2\u0414\u0412"+
		"\3\2\2\2\u0415\u041a\5\u00f2z\2\u0416\u0417\6w\31\2\u0417\u0419\5\u00f4"+
		"{\2\u0418\u0416\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a"+
		"\u041b\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u040d\3\2"+
		"\2\2\u041d\u0415\3\2\2\2\u041e\u00ed\3\2\2\2\u041f\u0420\5\u00f0y\2\u0420"+
		"\u00ef\3\2\2\2\u0421\u0422\t\6\2\2\u0422\u00f1\3\2\2\2\u0423\u0424\7o"+
		"\2\2\u0424\u00f3\3\2\2\2\u0425\u0428\7o\2\2\u0426\u0428\5\u00eex\2\u0427"+
		"\u0425\3\2\2\2\u0427\u0426\3\2\2\2\u0428\u00f5\3\2\2\2\u0429\u042e\5\u00f8"+
		"}\2\u042a\u042e\5\u0100\u0081\2\u042b\u042e\5\u00fa~\2\u042c\u042e\5\u00fc"+
		"\177\2\u042d\u0429\3\2\2\2\u042d\u042a\3\2\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042c\3\2\2\2\u042e\u00f7\3\2\2\2\u042f\u0431\5\u00d8m\2\u0430\u042f"+
		"\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0438\5\u00fe\u0080"+
		"\2\u0433\u0435\5\u00d8m\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0438\7\u008d\2\2\u0437\u0430\3\2\2\2\u0437\u0434"+
		"\3\2\2\2\u0438\u00f9\3\2\2\2\u0439\u043a\t\7\2\2\u043a\u00fb\3\2\2\2\u043b"+
		"\u043c\7d\2\2\u043c\u00fd\3\2\2\2\u043d\u043e\t\b\2\2\u043e\u00ff\3\2"+
		"\2\2\u043f\u0440\t\t\2\2\u0440\u0101\3\2\2\2p\u0103\u0109\u010d\u0111"+
		"\u0115\u0119\u011b\u0123\u0127\u012b\u012f\u0133\u0139\u013d\u0141\u0145"+
		"\u0149\u0154\u015a\u0168\u0170\u0176\u017b\u0183\u018b\u0190\u0193\u0197"+
		"\u019d\u01a8\u01ad\u01b0\u01ba\u01bf\u01d7\u01e0\u01e7\u01ea\u01f3\u01fc"+
		"\u01ff\u0205\u0209\u0214\u021d\u0220\u0225\u022c\u0235\u0239\u023f\u0247"+
		"\u024a\u0250\u0254\u0257\u025c\u025e\u026b\u0272\u0276\u027b\u027e\u0284"+
		"\u028a\u0294\u02a0\u02aa\u02c1\u02c6\u02e1\u02e7\u02eb\u02f3\u02f9\u0300"+
		"\u0308\u0316\u031b\u0324\u0328\u032c\u0332\u0338\u036b\u036d\u0376\u037d"+
		"\u038a\u0390\u0399\u039d\u03a4\u03aa\u03b4\u03bb\u03bf\u03c6\u03c9\u03cf"+
		"\u03db\u03df\u0412\u041a\u041d\u0427\u042d\u0430\u0434\u0437";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}