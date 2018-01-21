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
		RULE_optional_binding_condition = 11, RULE_repeat_while_statement = 12, 
		RULE_branch_statement = 13, RULE_if_statement = 14, RULE_else_clause = 15, 
		RULE_switch_statement = 16, RULE_switch_cases = 17, RULE_switch_case = 18, 
		RULE_case_label = 19, RULE_case_item_list = 20, RULE_default_label = 21, 
		RULE_where_clause = 22, RULE_where_expression = 23, RULE_control_transfer_statement = 24, 
		RULE_break_statement = 25, RULE_continue_statement = 26, RULE_return_statement = 27, 
		RULE_declaration = 28, RULE_declarations = 29, RULE_top_level_declaration = 30, 
		RULE_code_block = 31, RULE_import_declaration = 32, RULE_import_kind = 33, 
		RULE_import_path = 34, RULE_import_path_identifier = 35, RULE_constant_declaration = 36, 
		RULE_pattern_initializer_list = 37, RULE_pattern_initializer = 38, RULE_initializer = 39, 
		RULE_variable_declaration = 40, RULE_variable_declaration_head = 41, RULE_variable_name = 42, 
		RULE_getter_setter_block = 43, RULE_getter_clause = 44, RULE_setter_clause = 45, 
		RULE_setter_name = 46, RULE_getter_setter_keyword_block = 47, RULE_getter_keyword_clause = 48, 
		RULE_setter_keyword_clause = 49, RULE_willSet_didSet_block = 50, RULE_willSet_clause = 51, 
		RULE_didSet_clause = 52, RULE_function_declaration = 53, RULE_function_head = 54, 
		RULE_function_name = 55, RULE_function_signature = 56, RULE_function_result = 57, 
		RULE_function_body = 58, RULE_parameter_clause = 59, RULE_parameter_list = 60, 
		RULE_parameter = 61, RULE_external_parameter_name = 62, RULE_local_parameter_name = 63, 
		RULE_default_argument_clause = 64, RULE_struct_declaration = 65, RULE_struct_name = 66, 
		RULE_struct_body = 67, RULE_struct_member = 68, RULE_operator_declaration = 69, 
		RULE_prefix_operator_declaration = 70, RULE_postfix_operator_declaration = 71, 
		RULE_infix_operator_declaration = 72, RULE_declaration_modifier = 73, 
		RULE_declaration_modifiers = 74, RULE_access_level_modifier = 75, RULE_mutation_modifier = 76, 
		RULE_pattern = 77, RULE_identifier_pattern = 78, RULE_value_binding_pattern = 79, 
		RULE_expression_pattern = 80, RULE_expression = 81, RULE_expression_list = 82, 
		RULE_prefix_expression = 83, RULE_in_out_expression = 84, RULE_binary_expression = 85, 
		RULE_binary_expressions = 86, RULE_conditional_operator = 87, RULE_primary_expression = 88, 
		RULE_literal_expression = 89, RULE_array_literal = 90, RULE_array_literal_items = 91, 
		RULE_array_literal_item = 92, RULE_parenthesized_expression = 93, RULE_postfix_expression = 94, 
		RULE_function_call_argument_clause = 95, RULE_function_call_argument_list = 96, 
		RULE_function_call_argument = 97, RULE_argument_names = 98, RULE_argument_name = 99, 
		RULE_type = 100, RULE_type_annotation = 101, RULE_type_identifier = 102, 
		RULE_type_name = 103, RULE_function_type = 104, RULE_function_type_argument_clause = 105, 
		RULE_function_type_argument_list = 106, RULE_function_type_argument = 107, 
		RULE_argument_label = 108, RULE_array_type = 109, RULE_identifier = 110, 
		RULE_declaration_identifier = 111, RULE_label_identifier = 112, RULE_keyword_as_identifier_in_declarations = 113, 
		RULE_keyword_as_identifier_in_labels = 114, RULE_assignment_operator = 115, 
		RULE_negate_prefix_operator = 116, RULE_compilation_condition_AND = 117, 
		RULE_compilation_condition_OR = 118, RULE_compilation_condition_GE = 119, 
		RULE_arrow_operator = 120, RULE_range_operator = 121, RULE_same_type_equals = 122, 
		RULE_binary_operator = 123, RULE_prefix_operator = 124, RULE_postfix_operator = 125, 
		RULE_operator = 126, RULE_operator_character = 127, RULE_operator_head = 128, 
		RULE_dot_operator_head = 129, RULE_dot_operator_character = 130, RULE_literal = 131, 
		RULE_numeric_literal = 132, RULE_boolean_literal = 133, RULE_nil_literal = 134, 
		RULE_integer_literal = 135, RULE_string_literal = 136;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "statements_impl", "loop_statement", 
		"for_statement", "for_init", "while_statement", "condition_list", "condition", 
		"case_condition", "optional_binding_condition", "repeat_while_statement", 
		"branch_statement", "if_statement", "else_clause", "switch_statement", 
		"switch_cases", "switch_case", "case_label", "case_item_list", "default_label", 
		"where_clause", "where_expression", "control_transfer_statement", "break_statement", 
		"continue_statement", "return_statement", "declaration", "declarations", 
		"top_level_declaration", "code_block", "import_declaration", "import_kind", 
		"import_path", "import_path_identifier", "constant_declaration", "pattern_initializer_list", 
		"pattern_initializer", "initializer", "variable_declaration", "variable_declaration_head", 
		"variable_name", "getter_setter_block", "getter_clause", "setter_clause", 
		"setter_name", "getter_setter_keyword_block", "getter_keyword_clause", 
		"setter_keyword_clause", "willSet_didSet_block", "willSet_clause", "didSet_clause", 
		"function_declaration", "function_head", "function_name", "function_signature", 
		"function_result", "function_body", "parameter_clause", "parameter_list", 
		"parameter", "external_parameter_name", "local_parameter_name", "default_argument_clause", 
		"struct_declaration", "struct_name", "struct_body", "struct_member", "operator_declaration", 
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
		null, "'for'", "'while'", "'case'", "'let'", "'var'", "'repeat'", "'if'", 
		"'else'", "'switch'", "'default'", "'where'", "'break'", "'continue'", 
		"'return'", "'import'", "'typealias'", "'struct'", "'class'", "'enum'", 
		"'protocol'", "'func'", "'get'", "'set'", "'willSet'", "'didSet'", "'throws'", 
		"'rethrows'", "'prefix'", "'operator'", "'postfix'", "'infix'", "'dynamic'", 
		"'override'", "'required'", "'static'", "'private'", "'fileprivate'", 
		"'internal'", "'public'", "'open'", "'mutating'", "'nonmutating'", "'init'", 
		"'self'", "'inout'", "'Type'", "'alpha'", "'arch'", "'arm'", "'arm64'", 
		"'assignment'", "'associativity'", "'blue'", "'convenience'", "'file'", 
		"'final'", "'green'", "'higherThan'", "'i386'", "'iOS'", "'iOSApplicationExtension'", 
		"'indirect'", "'lazy'", "'left'", "'line'", "'lowerThan'", "'macOS'", 
		"'macOSApplicationExtension'", "'none'", "'of'", "'optional'", "'os'", 
		"'precedence'", "'red'", "'resourceName'", "'right'", "'safe'", "'swift'", 
		"'tvOS'", "'type'", "'unowned'", "'unsafe'", "'watchOS'", "'weak'", "'x86_64'", 
		"'Any'", "'Protocol'", "'Self'", "'as'", "'associatedtype'", "'catch'", 
		"'defer'", "'deinit'", "'do'", "'extension'", "'fallthrough'", "'false'", 
		"'guard'", "'in'", "'is'", "'nil'", "'precedencegroup'", "'subscript'", 
		"'super'", "'throw'", "'true'", "'try'", null, "'.'", "'{'", "'('", "'['", 
		"'}'", "')'", "']'", "','", "':'", "';'", "'<'", "'>'", "'_'", "'!'", 
		"'?'", "'@'", "'&'", "'-'", "'='", "'|'", "'/'", "'+'", "'*'", "'%'", 
		"'^'", "'~'"
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(274);
				statements();
				}
				break;
			}
			setState(277);
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				expression();
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(280);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				declaration();
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(284);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				loop_statement();
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(288);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				branch_statement();
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(292);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				control_transfer_statement();
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(296);
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
			setState(301);
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
			setState(303);
			if (!(SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore))) throw new FailedPredicateException(this, "SwiftSupport.isSeparatedStatement(_input, $indexBefore)");
			setState(304);
			statement();
			((Statements_implContext)_localctx).indexAfter =  _input.index();
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(306);
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
		public Repeat_while_statementContext repeat_while_statement() {
			return getRuleContext(Repeat_while_statementContext.class,0);
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
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				for_statement();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				while_statement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				repeat_while_statement();
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
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(T__0);
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(315);
					for_init();
					}
					break;
				}
				setState(318);
				match(SEMI);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(319);
					expression();
					}
					break;
				}
				setState(322);
				match(SEMI);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(323);
					expression();
					}
					break;
				}
				setState(326);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(T__0);
				setState(328);
				match(LPAREN);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(329);
					for_init();
					}
					break;
				}
				setState(332);
				match(SEMI);
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(333);
					expression();
					}
					break;
				}
				setState(336);
				match(SEMI);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(337);
					expression();
					}
					break;
				}
				setState(340);
				match(RPAREN);
				setState(341);
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
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
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
			setState(348);
			match(T__1);
			setState(349);
			condition_list();
			setState(350);
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
			setState(352);
			condition();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				setState(354);
				condition();
				}
				}
				setState(359);
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
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				case_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
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
			setState(365);
			match(T__2);
			setState(366);
			pattern();
			setState(367);
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
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__3);
				setState(370);
				pattern();
				setState(371);
				initializer();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(T__4);
				setState(374);
				pattern();
				setState(375);
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

	public static class Repeat_while_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_while_statement; }
	}

	public final Repeat_while_statementContext repeat_while_statement() throws RecognitionException {
		Repeat_while_statementContext _localctx = new Repeat_while_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__5);
			setState(380);
			code_block();
			setState(381);
			match(T__1);
			setState(382);
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

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_branch_statement);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				if_statement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				switch_statement();
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
		enterRule(_localctx, 28, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__6);
			setState(389);
			condition_list();
			setState(390);
			code_block();
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(391);
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
		enterRule(_localctx, 30, RULE_else_clause);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__7);
				setState(395);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__7);
				setState(397);
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

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__8);
			setState(401);
			expression();
			setState(402);
			match(LCURLY);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__9) {
				{
				setState(403);
				switch_cases();
				}
			}

			setState(406);
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

	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			switch_case();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__9) {
				{
				setState(409);
				switch_cases();
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

	public static class Switch_caseContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch_case);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				case_label();
				setState(413);
				statements();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				default_label();
				setState(416);
				statements();
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

	public static class Case_labelContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__2);
			setState(421);
			case_item_list();
			setState(422);
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

	public static class Case_item_listContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_case_item_list);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				pattern();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(425);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				pattern();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(429);
					where_clause();
					}
				}

				setState(432);
				match(COMMA);
				setState(433);
				case_item_list();
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

	public static class Default_labelContext extends ParserRuleContext {
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__9);
			setState(438);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_expressionContext where_expression() {
			return getRuleContext(Where_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__10);
			setState(441);
			where_expression();
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

	public static class Where_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expression; }
	}

	public final Where_expressionContext where_expression() throws RecognitionException {
		Where_expressionContext _localctx = new Where_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 48, RULE_control_transfer_statement);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				break_statement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				continue_statement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
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
		enterRule(_localctx, 50, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__11);
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
		enterRule(_localctx, 52, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__12);
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
		enterRule(_localctx, 54, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__13);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(455);
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
		enterRule(_localctx, 56, RULE_declaration);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				function_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				struct_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(463);
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
		enterRule(_localctx, 58, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				declaration();
				}
				}
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) );
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
		enterRule(_localctx, 60, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(471);
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
		enterRule(_localctx, 62, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(LCURLY);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(475);
				statements();
				}
				break;
			}
			setState(478);
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
		enterRule(_localctx, 64, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__14);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(481);
				import_kind();
				}
			}

			setState(484);
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
		enterRule(_localctx, 66, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_import_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			import_path_identifier();
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					match(DOT);
					setState(490);
					import_path_identifier();
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 70, RULE_import_path_identifier);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__39:
			case T__40:
			case T__41:
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
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
				setState(497);
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
		enterRule(_localctx, 72, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__27) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(500);
				declaration_modifiers();
				}
			}

			setState(503);
			match(T__3);
			setState(504);
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
		enterRule(_localctx, 74, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			pattern_initializer();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					match(COMMA);
					setState(508);
					pattern_initializer();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 76, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			pattern();
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(515);
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
		enterRule(_localctx, 78, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			assignment_operator();
			setState(519);
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
		enterRule(_localctx, 80, RULE_variable_declaration);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				variable_declaration_head();
				setState(522);
				variable_name();
				setState(523);
				type_annotation();
				setState(524);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				variable_declaration_head();
				setState(527);
				variable_name();
				setState(528);
				type_annotation();
				setState(529);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				variable_declaration_head();
				setState(532);
				variable_name();
				setState(533);
				type_annotation();
				setState(534);
				getter_setter_keyword_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				variable_declaration_head();
				setState(537);
				variable_name();
				setState(538);
				type_annotation();
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(539);
					initializer();
					}
					break;
				}
				setState(542);
				willSet_didSet_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				variable_declaration_head();
				setState(545);
				variable_name();
				setState(546);
				type_annotation();
				setState(547);
				type_annotation();
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(548);
					initializer();
					}
					break;
				}
				setState(551);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(553);
				variable_declaration_head();
				setState(554);
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
		enterRule(_localctx, 82, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__27) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(558);
				declaration_modifiers();
				}
			}

			setState(561);
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
		enterRule(_localctx, 84, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		enterRule(_localctx, 86, RULE_getter_setter_block);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(LCURLY);
				setState(566);
				getter_clause();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__40) | (1L << T__41))) != 0)) {
					{
					setState(567);
					setter_clause();
					}
				}

				setState(570);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				match(LCURLY);
				setState(573);
				setter_clause();
				setState(574);
				getter_clause();
				setState(575);
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
		enterRule(_localctx, 88, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40 || _la==T__41) {
				{
				setState(579);
				mutation_modifier();
				}
			}

			setState(582);
			match(T__21);
			setState(583);
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
		enterRule(_localctx, 90, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40 || _la==T__41) {
				{
				setState(585);
				mutation_modifier();
				}
			}

			setState(588);
			match(T__22);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(589);
				setter_name();
				}
			}

			setState(592);
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
		enterRule(_localctx, 92, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(LPAREN);
			setState(595);
			declaration_identifier();
			setState(596);
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
		enterRule(_localctx, 94, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(LCURLY);
				setState(599);
				getter_keyword_clause();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__40) | (1L << T__41))) != 0)) {
					{
					setState(600);
					setter_keyword_clause();
					}
				}

				setState(603);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(LCURLY);
				setState(606);
				setter_keyword_clause();
				setState(607);
				getter_keyword_clause();
				setState(608);
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
		enterRule(_localctx, 96, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40 || _la==T__41) {
				{
				setState(612);
				mutation_modifier();
				}
			}

			setState(615);
			match(T__21);
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
		enterRule(_localctx, 98, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40 || _la==T__41) {
				{
				setState(617);
				mutation_modifier();
				}
			}

			setState(620);
			match(T__22);
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
		enterRule(_localctx, 100, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(LCURLY);
				setState(623);
				willSet_clause();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(624);
					didSet_clause();
					}
				}

				setState(627);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(LCURLY);
				setState(630);
				didSet_clause();
				setState(631);
				willSet_clause();
				setState(632);
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
		enterRule(_localctx, 102, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(T__23);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(637);
				setter_name();
				}
			}

			setState(640);
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
		enterRule(_localctx, 104, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__24);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(643);
				setter_name();
				}
			}

			setState(646);
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
		enterRule(_localctx, 106, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			function_head();
			setState(649);
			function_name();
			setState(650);
			function_signature();
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(651);
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
		enterRule(_localctx, 108, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__27) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(654);
				declaration_modifiers();
				}
			}

			setState(657);
			match(T__20);
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
		enterRule(_localctx, 110, RULE_function_name);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__39:
			case T__40:
			case T__41:
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
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
				setState(660);
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
		enterRule(_localctx, 112, RULE_function_signature);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				parameter_clause();
				setState(665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(664);
					match(T__25);
					}
					break;
				}
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(667);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				parameter_clause();
				setState(671);
				match(T__26);
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(672);
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
		enterRule(_localctx, 114, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			arrow_operator();
			setState(678);
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
		enterRule(_localctx, 116, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
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
		enterRule(_localctx, 118, RULE_parameter_clause);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				match(LPAREN);
				setState(683);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(LPAREN);
				setState(685);
				parameter_list();
				setState(686);
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
		enterRule(_localctx, 120, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			parameter();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691);
				match(COMMA);
				setState(692);
				parameter();
				}
				}
				setState(697);
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
		enterRule(_localctx, 122, RULE_parameter);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(698);
					external_parameter_name();
					}
					break;
				}
				setState(701);
				local_parameter_name();
				setState(702);
				type_annotation();
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(703);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(706);
					external_parameter_name();
					}
					break;
				}
				setState(709);
				local_parameter_name();
				setState(710);
				type_annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(712);
					external_parameter_name();
					}
					break;
				}
				setState(715);
				local_parameter_name();
				setState(716);
				type_annotation();
				setState(717);
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
		enterRule(_localctx, 124, RULE_external_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		enterRule(_localctx, 126, RULE_local_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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
		enterRule(_localctx, 128, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			assignment_operator();
			setState(726);
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
		enterRule(_localctx, 130, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				setState(728);
				access_level_modifier();
				}
			}

			setState(731);
			match(T__16);
			setState(732);
			struct_name();
			setState(733);
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
		enterRule(_localctx, 132, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
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
		enterRule(_localctx, 134, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(LCURLY);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				{
				setState(738);
				struct_member();
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(744);
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
		enterRule(_localctx, 136, RULE_struct_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
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
		enterRule(_localctx, 138, RULE_operator_declaration);
		try {
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				prefix_operator_declaration();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				postfix_operator_declaration();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
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
		enterRule(_localctx, 140, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__27);
			setState(754);
			match(T__28);
			setState(755);
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
		enterRule(_localctx, 142, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(T__29);
			setState(758);
			match(T__28);
			setState(759);
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
		enterRule(_localctx, 144, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(T__30);
			setState(762);
			match(T__28);
			setState(763);
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
		enterRule(_localctx, 146, RULE_declaration_modifier);
		try {
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(T__17);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				match(T__32);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(768);
				match(T__29);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(769);
				match(T__27);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(770);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 7);
				{
				setState(771);
				match(T__34);
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 8);
				{
				setState(772);
				access_level_modifier();
				}
				break;
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 9);
				{
				setState(773);
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
		enterRule(_localctx, 148, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(776);
				declaration_modifier();
				}
				}
				setState(779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__27) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) );
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
		enterRule(_localctx, 150, RULE_access_level_modifier);
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(T__35);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(T__35);
				setState(783);
				match(LPAREN);
				setState(784);
				match(T__22);
				setState(785);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				match(T__36);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				match(T__36);
				setState(788);
				match(LPAREN);
				setState(789);
				match(T__22);
				setState(790);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(791);
				match(T__37);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(792);
				match(T__37);
				setState(793);
				match(LPAREN);
				setState(794);
				match(T__22);
				setState(795);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(796);
				match(T__38);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(797);
				match(T__38);
				setState(798);
				match(LPAREN);
				setState(799);
				match(T__22);
				setState(800);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(801);
				match(T__39);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(802);
				match(T__39);
				setState(803);
				match(LPAREN);
				setState(804);
				match(T__22);
				setState(805);
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
		enterRule(_localctx, 152, RULE_mutation_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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
		enterRule(_localctx, 154, RULE_pattern);
		try {
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				identifier_pattern();
				setState(812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(811);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				value_binding_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
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
		enterRule(_localctx, 156, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
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
		enterRule(_localctx, 158, RULE_value_binding_pattern);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(T__4);
				setState(821);
				pattern();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(T__3);
				setState(823);
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
		enterRule(_localctx, 160, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
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
		enterRule(_localctx, 162, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			prefix_expression();
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(829);
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
		enterRule(_localctx, 164, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			expression();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(833);
				match(COMMA);
				setState(834);
				expression();
				}
				}
				setState(839);
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
		enterRule(_localctx, 166, RULE_prefix_expression);
		try {
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				prefix_operator();
				setState(841);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
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
		enterRule(_localctx, 168, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(AND);
			setState(848);
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
		enterRule(_localctx, 170, RULE_binary_expression);
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				binary_operator();
				setState(851);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				assignment_operator();
				setState(854);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				conditional_operator();
				setState(857);
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
		enterRule(_localctx, 172, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(862); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(861);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(864); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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
		enterRule(_localctx, 174, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(QUESTION);
			setState(867);
			expression();
			setState(868);
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
		enterRule(_localctx, 176, RULE_primary_expression);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				declaration_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
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
		enterRule(_localctx, 178, RULE_literal_expression);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
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
		enterRule(_localctx, 180, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(LBRACK);
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(880);
				array_literal_items();
				}
				break;
			}
			setState(883);
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
		enterRule(_localctx, 182, RULE_array_literal_items);
		int _la;
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				array_literal_item();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(886);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				array_literal_item();
				setState(890);
				match(COMMA);
				setState(891);
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
		enterRule(_localctx, 184, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
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
		enterRule(_localctx, 186, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(LPAREN);
			setState(898);
			expression();
			setState(899);
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_postfix_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(902);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(944);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_operationContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(904);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(905);
						postfix_operator();
						}
						break;
					case 2:
						{
						_localctx = new Function_call_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(906);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(907);
						function_call_argument_clause();
						}
						break;
					case 3:
						{
						_localctx = new Initializer_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(908);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(909);
						match(DOT);
						setState(910);
						match(T__42);
						}
						break;
					case 4:
						{
						_localctx = new Initializer_expression_with_argsContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(911);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(912);
						match(DOT);
						setState(913);
						match(T__42);
						setState(914);
						match(LPAREN);
						setState(915);
						argument_names();
						setState(916);
						match(RPAREN);
						}
						break;
					case 5:
						{
						_localctx = new Explicit_member_expression1Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(918);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(919);
						match(DOT);
						setState(920);
						match(Pure_decimal_digits);
						}
						break;
					case 6:
						{
						_localctx = new Explicit_member_expression2Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(921);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(922);
						match(DOT);
						setState(923);
						declaration_identifier();
						}
						break;
					case 7:
						{
						_localctx = new Explicit_member_expression3Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(924);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(925);
						match(DOT);
						setState(926);
						declaration_identifier();
						setState(927);
						match(LPAREN);
						setState(928);
						argument_names();
						setState(929);
						match(RPAREN);
						}
						break;
					case 8:
						{
						_localctx = new Explicit_member_expression4Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(931);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(932);
						match(LPAREN);
						setState(933);
						argument_names();
						setState(934);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new Postfix_self_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(936);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(937);
						match(DOT);
						setState(938);
						match(T__43);
						}
						break;
					case 10:
						{
						_localctx = new Subscript_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(939);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(940);
						match(LBRACK);
						setState(941);
						expression_list();
						setState(942);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
		enterRule(_localctx, 190, RULE_function_call_argument_clause);
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				match(LPAREN);
				setState(950);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(LPAREN);
				setState(952);
				function_call_argument_list();
				setState(953);
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
		enterRule(_localctx, 192, RULE_function_call_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			function_call_argument();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(958);
				match(COMMA);
				setState(959);
				function_call_argument();
				}
				}
				setState(964);
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
		enterRule(_localctx, 194, RULE_function_call_argument);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				label_identifier();
				setState(967);
				match(COLON);
				setState(968);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				operator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(971);
				label_identifier();
				setState(972);
				match(COLON);
				setState(973);
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
		enterRule(_localctx, 196, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			argument_name();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(978);
				argument_name();
				}
				}
				setState(983);
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
		enterRule(_localctx, 198, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			label_identifier();
			setState(985);
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
		enterRule(_localctx, 200, RULE_type);
		try {
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new The_array_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				array_type();
				}
				break;
			case LPAREN:
				_localctx = new The_function_typeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				function_type();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__39:
			case T__40:
			case T__41:
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
			case Identifier:
				_localctx = new The_type_identifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
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
		enterRule(_localctx, 202, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(COLON);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(993);
				match(T__44);
				}
			}

			setState(996);
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
		enterRule(_localctx, 204, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			type_name();
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(999);
				match(DOT);
				setState(1000);
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
		enterRule(_localctx, 206, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
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
		enterRule(_localctx, 208, RULE_function_type);
		try {
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				function_type_argument_clause();
				setState(1007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1006);
					match(T__25);
					}
					break;
				}
				setState(1009);
				arrow_operator();
				setState(1010);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				function_type_argument_clause();
				setState(1013);
				match(T__26);
				setState(1014);
				arrow_operator();
				setState(1015);
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
		enterRule(_localctx, 210, RULE_function_type_argument_clause);
		try {
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				match(LPAREN);
				setState(1020);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				match(LPAREN);
				setState(1022);
				function_type_argument_list();
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1023);
					range_operator();
					}
					break;
				}
				setState(1026);
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
		enterRule(_localctx, 212, RULE_function_type_argument_list);
		try {
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				function_type_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				function_type_argument();
				setState(1032);
				match(COMMA);
				setState(1033);
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
		enterRule(_localctx, 214, RULE_function_type_argument);
		int _la;
		try {
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(1037);
					match(T__44);
					}
				}

				setState(1040);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				argument_label();
				setState(1042);
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
		enterRule(_localctx, 216, RULE_argument_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 218, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(LBRACK);
			setState(1049);
			type();
			setState(1050);
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
		enterRule(_localctx, 220, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
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
		enterRule(_localctx, 222, RULE_declaration_identifier);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(Identifier);
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__39:
			case T__40:
			case T__41:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
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
		enterRule(_localctx, 224, RULE_label_identifier);
		try {
			setState(1060);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
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
			case T__40:
			case T__41:
			case T__42:
			case T__43:
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
				setState(1059);
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
		enterRule(_localctx, 226, RULE_keyword_as_identifier_in_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_la = _input.LA(1);
			if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__22 - 22)) | (1L << (T__23 - 22)) | (1L << (T__24 - 22)) | (1L << (T__27 - 22)) | (1L << (T__29 - 22)) | (1L << (T__30 - 22)) | (1L << (T__31 - 22)) | (1L << (T__32 - 22)) | (1L << (T__33 - 22)) | (1L << (T__39 - 22)) | (1L << (T__40 - 22)) | (1L << (T__41 - 22)) | (1L << (T__45 - 22)) | (1L << (T__46 - 22)) | (1L << (T__47 - 22)) | (1L << (T__48 - 22)) | (1L << (T__49 - 22)) | (1L << (T__50 - 22)) | (1L << (T__51 - 22)) | (1L << (T__52 - 22)) | (1L << (T__53 - 22)) | (1L << (T__54 - 22)) | (1L << (T__55 - 22)) | (1L << (T__56 - 22)) | (1L << (T__57 - 22)) | (1L << (T__58 - 22)) | (1L << (T__59 - 22)) | (1L << (T__60 - 22)) | (1L << (T__61 - 22)) | (1L << (T__62 - 22)) | (1L << (T__63 - 22)) | (1L << (T__64 - 22)) | (1L << (T__65 - 22)) | (1L << (T__66 - 22)) | (1L << (T__67 - 22)) | (1L << (T__68 - 22)) | (1L << (T__69 - 22)) | (1L << (T__70 - 22)) | (1L << (T__71 - 22)) | (1L << (T__72 - 22)) | (1L << (T__73 - 22)) | (1L << (T__74 - 22)) | (1L << (T__75 - 22)) | (1L << (T__76 - 22)) | (1L << (T__77 - 22)) | (1L << (T__78 - 22)) | (1L << (T__79 - 22)) | (1L << (T__80 - 22)) | (1L << (T__81 - 22)) | (1L << (T__82 - 22)) | (1L << (T__83 - 22)) | (1L << (T__84 - 22)))) != 0)) ) {
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
		enterRule(_localctx, 228, RULE_keyword_as_identifier_in_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)))) != 0)) ) {
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
		enterRule(_localctx, 230, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(1067);
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
		enterRule(_localctx, 232, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(1070);
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
		enterRule(_localctx, 234, RULE_compilation_condition_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(1073);
			match(AND);
			setState(1074);
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
		enterRule(_localctx, 236, RULE_compilation_condition_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(1077);
			match(OR);
			setState(1078);
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
		enterRule(_localctx, 238, RULE_compilation_condition_GE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			if (!(SwiftSupport.isOperator(_input,">="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\">=\")");
			setState(1081);
			match(GT);
			setState(1082);
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
		enterRule(_localctx, 240, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(1085);
			match(SUB);
			setState(1086);
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
		enterRule(_localctx, 242, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(1089);
			match(DOT);
			setState(1090);
			match(DOT);
			setState(1091);
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
		enterRule(_localctx, 244, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(1094);
			match(EQUAL);
			setState(1095);
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
		enterRule(_localctx, 246, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(1098);
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
		enterRule(_localctx, 248, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(1101);
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
		enterRule(_localctx, 250, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(1104);
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
		enterRule(_localctx, 252, RULE_operator);
		try {
			int _alt;
			setState(1122);
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
				setState(1106);
				operator_head();
				setState(1111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1107);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(1108);
						operator_character();
						}
						} 
					}
					setState(1113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				dot_operator_head();
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1115);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(1116);
						dot_operator_character();
						}
						} 
					}
					setState(1121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		enterRule(_localctx, 254, RULE_operator_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
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
		enterRule(_localctx, 256, RULE_operator_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
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
		enterRule(_localctx, 258, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
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
		enterRule(_localctx, 260, RULE_dot_operator_character);
		try {
			setState(1132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
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
				setState(1131);
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
		enterRule(_localctx, 262, RULE_literal);
		try {
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1137);
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
		enterRule(_localctx, 264, RULE_numeric_literal);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1140);
					negate_prefix_operator();
					}
					break;
				}
				setState(1143);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1144);
					negate_prefix_operator();
					}
					break;
				}
				setState(1147);
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
		enterRule(_localctx, 266, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_la = _input.LA(1);
			if ( !(_la==T__96 || _la==T__105) ) {
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
		enterRule(_localctx, 268, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(T__100);
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
		enterRule(_localctx, 270, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
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
		enterRule(_localctx, 272, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
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
		case 94:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 115:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 116:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 117:
			return compilation_condition_AND_sempred((Compilation_condition_ANDContext)_localctx, predIndex);
		case 118:
			return compilation_condition_OR_sempred((Compilation_condition_ORContext)_localctx, predIndex);
		case 119:
			return compilation_condition_GE_sempred((Compilation_condition_GEContext)_localctx, predIndex);
		case 120:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 121:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 122:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 123:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 124:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 125:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 126:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0092\u0489\4\2\t"+
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
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\3\2\5\2\u0116\n\2\3\2\3\2\3\3\3\3\5\3\u011c\n\3\3\3\3"+
		"\3\5\3\u0120\n\3\3\3\3\3\5\3\u0124\n\3\3\3\3\3\5\3\u0128\n\3\3\3\3\3\5"+
		"\3\u012c\n\3\5\3\u012e\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0136\n\5\3\6\3"+
		"\6\3\6\5\6\u013b\n\6\3\7\3\7\5\7\u013f\n\7\3\7\3\7\5\7\u0143\n\7\3\7\3"+
		"\7\5\7\u0147\n\7\3\7\3\7\3\7\3\7\5\7\u014d\n\7\3\7\3\7\5\7\u0151\n\7\3"+
		"\7\3\7\5\7\u0155\n\7\3\7\3\7\5\7\u0159\n\7\3\b\3\b\5\b\u015d\n\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\7\n\u0166\n\n\f\n\16\n\u0169\13\n\3\13\3\13\3\13"+
		"\5\13\u016e\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u017c"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u0185\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u018b\n\20\3\21\3\21\3\21\3\21\5\21\u0191\n\21\3\22\3\22\3"+
		"\22\3\22\5\22\u0197\n\22\3\22\3\22\3\23\3\23\5\23\u019d\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01a5\n\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26"+
		"\u01ad\n\26\3\26\3\26\5\26\u01b1\n\26\3\26\3\26\3\26\5\26\u01b6\n\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u01c3\n\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u01cb\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01d3\n\36\3\37\6\37\u01d6\n\37\r\37\16\37\u01d7\3 \5 \u01db"+
		"\n \3!\3!\5!\u01df\n!\3!\3!\3\"\3\"\5\"\u01e5\n\"\3\"\3\"\3#\3#\3$\3$"+
		"\3$\7$\u01ee\n$\f$\16$\u01f1\13$\3%\3%\5%\u01f5\n%\3&\5&\u01f8\n&\3&\3"+
		"&\3&\3\'\3\'\3\'\7\'\u0200\n\'\f\'\16\'\u0203\13\'\3(\3(\5(\u0207\n(\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u021f"+
		"\n*\3*\3*\3*\3*\3*\3*\3*\5*\u0228\n*\3*\3*\3*\3*\3*\5*\u022f\n*\3+\5+"+
		"\u0232\n+\3+\3+\3,\3,\3-\3-\3-\5-\u023b\n-\3-\3-\3-\3-\3-\3-\3-\5-\u0244"+
		"\n-\3.\5.\u0247\n.\3.\3.\3.\3/\5/\u024d\n/\3/\3/\5/\u0251\n/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\5\61\u025c\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0265\n\61\3\62\5\62\u0268\n\62\3\62\3\62\3\63\5\63\u026d"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\5\64\u0274\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u027d\n\64\3\65\3\65\5\65\u0281\n\65\3\65\3\65\3\66\3"+
		"\66\5\66\u0287\n\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u028f\n\67\38\5"+
		"8\u0292\n8\38\38\39\39\59\u0298\n9\3:\3:\5:\u029c\n:\3:\5:\u029f\n:\3"+
		":\3:\3:\5:\u02a4\n:\5:\u02a6\n:\3;\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\5=\u02b3"+
		"\n=\3>\3>\3>\7>\u02b8\n>\f>\16>\u02bb\13>\3?\5?\u02be\n?\3?\3?\3?\5?\u02c3"+
		"\n?\3?\5?\u02c6\n?\3?\3?\3?\3?\5?\u02cc\n?\3?\3?\3?\3?\5?\u02d2\n?\3@"+
		"\3@\3A\3A\3B\3B\3B\3C\5C\u02dc\nC\3C\3C\3C\3C\3D\3D\3E\3E\7E\u02e6\nE"+
		"\fE\16E\u02e9\13E\3E\3E\3F\3F\3G\3G\3G\5G\u02f2\nG\3H\3H\3H\3H\3I\3I\3"+
		"I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0309\nK\3L\6L\u030c\n"+
		"L\rL\16L\u030d\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\5M\u0329\nM\3N\3N\3O\3O\5O\u032f\nO\3O\3O\5O\u0333"+
		"\nO\3P\3P\3Q\3Q\3Q\3Q\5Q\u033b\nQ\3R\3R\3S\3S\5S\u0341\nS\3T\3T\3T\7T"+
		"\u0346\nT\fT\16T\u0349\13T\3U\3U\3U\3U\3U\5U\u0350\nU\3V\3V\3V\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\5W\u035e\nW\3X\6X\u0361\nX\rX\16X\u0362\3Y\3Y\3Y\3"+
		"Y\3Z\3Z\3Z\5Z\u036c\nZ\3[\3[\5[\u0370\n[\3\\\3\\\5\\\u0374\n\\\3\\\3\\"+
		"\3]\3]\5]\u037a\n]\3]\3]\3]\3]\5]\u0380\n]\3^\3^\3_\3_\3_\3_\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\7`\u03b3\n`\f`\16"+
		"`\u03b6\13`\3a\3a\3a\3a\3a\3a\5a\u03be\na\3b\3b\3b\7b\u03c3\nb\fb\16b"+
		"\u03c6\13b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u03d2\nc\3d\3d\7d\u03d6\n"+
		"d\fd\16d\u03d9\13d\3e\3e\3e\3f\3f\3f\5f\u03e1\nf\3g\3g\5g\u03e5\ng\3g"+
		"\3g\3h\3h\3h\5h\u03ec\nh\3i\3i\3j\3j\5j\u03f2\nj\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\5j\u03fc\nj\3k\3k\3k\3k\3k\5k\u0403\nk\3k\3k\5k\u0407\nk\3l\3l\3l"+
		"\3l\3l\5l\u040e\nl\3m\5m\u0411\nm\3m\3m\3m\3m\5m\u0417\nm\3n\3n\3o\3o"+
		"\3o\3o\3p\3p\3q\3q\5q\u0423\nq\3r\3r\5r\u0427\nr\3s\3s\3t\3t\3u\3u\3u"+
		"\3v\3v\3v\3w\3w\3w\3w\3x\3x\3x\3x\3y\3y\3y\3y\3z\3z\3z\3z\3{\3{\3{\3{"+
		"\3{\3|\3|\3|\3|\3}\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\7\u0080\u0458\n\u0080\f\u0080\16\u0080\u045b\13\u0080\3\u0080\3"+
		"\u0080\3\u0080\7\u0080\u0460\n\u0080\f\u0080\16\u0080\u0463\13\u0080\5"+
		"\u0080\u0465\n\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3"+
		"\u0084\3\u0084\5\u0084\u046f\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5"+
		"\u0085\u0475\n\u0085\3\u0086\5\u0086\u0478\n\u0086\3\u0086\3\u0086\5\u0086"+
		"\u047c\n\u0086\3\u0086\5\u0086\u047f\n\u0086\3\u0087\3\u0087\3\u0088\3"+
		"\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\2\3\u00be\u008b\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\2\n\4\2\7\7\22\27\3\2+,\7\2\30\33\36\36"+
		" $*,\60W\5\2\3\5\b.\60m\5\2yz|}\177\u0088\4\2ccll\3\2\u008a\u008c\3\2"+
		"\u008e\u008f\2\u04a4\2\u0115\3\2\2\2\4\u012d\3\2\2\2\6\u012f\3\2\2\2\b"+
		"\u0131\3\2\2\2\n\u013a\3\2\2\2\f\u0158\3\2\2\2\16\u015c\3\2\2\2\20\u015e"+
		"\3\2\2\2\22\u0162\3\2\2\2\24\u016d\3\2\2\2\26\u016f\3\2\2\2\30\u017b\3"+
		"\2\2\2\32\u017d\3\2\2\2\34\u0184\3\2\2\2\36\u0186\3\2\2\2 \u0190\3\2\2"+
		"\2\"\u0192\3\2\2\2$\u019a\3\2\2\2&\u01a4\3\2\2\2(\u01a6\3\2\2\2*\u01b5"+
		"\3\2\2\2,\u01b7\3\2\2\2.\u01ba\3\2\2\2\60\u01bd\3\2\2\2\62\u01c2\3\2\2"+
		"\2\64\u01c4\3\2\2\2\66\u01c6\3\2\2\28\u01c8\3\2\2\2:\u01d2\3\2\2\2<\u01d5"+
		"\3\2\2\2>\u01da\3\2\2\2@\u01dc\3\2\2\2B\u01e2\3\2\2\2D\u01e8\3\2\2\2F"+
		"\u01ea\3\2\2\2H\u01f4\3\2\2\2J\u01f7\3\2\2\2L\u01fc\3\2\2\2N\u0204\3\2"+
		"\2\2P\u0208\3\2\2\2R\u022e\3\2\2\2T\u0231\3\2\2\2V\u0235\3\2\2\2X\u0243"+
		"\3\2\2\2Z\u0246\3\2\2\2\\\u024c\3\2\2\2^\u0254\3\2\2\2`\u0264\3\2\2\2"+
		"b\u0267\3\2\2\2d\u026c\3\2\2\2f\u027c\3\2\2\2h\u027e\3\2\2\2j\u0284\3"+
		"\2\2\2l\u028a\3\2\2\2n\u0291\3\2\2\2p\u0297\3\2\2\2r\u02a5\3\2\2\2t\u02a7"+
		"\3\2\2\2v\u02aa\3\2\2\2x\u02b2\3\2\2\2z\u02b4\3\2\2\2|\u02d1\3\2\2\2~"+
		"\u02d3\3\2\2\2\u0080\u02d5\3\2\2\2\u0082\u02d7\3\2\2\2\u0084\u02db\3\2"+
		"\2\2\u0086\u02e1\3\2\2\2\u0088\u02e3\3\2\2\2\u008a\u02ec\3\2\2\2\u008c"+
		"\u02f1\3\2\2\2\u008e\u02f3\3\2\2\2\u0090\u02f7\3\2\2\2\u0092\u02fb\3\2"+
		"\2\2\u0094\u0308\3\2\2\2\u0096\u030b\3\2\2\2\u0098\u0328\3\2\2\2\u009a"+
		"\u032a\3\2\2\2\u009c\u0332\3\2\2\2\u009e\u0334\3\2\2\2\u00a0\u033a\3\2"+
		"\2\2\u00a2\u033c\3\2\2\2\u00a4\u033e\3\2\2\2\u00a6\u0342\3\2\2\2\u00a8"+
		"\u034f\3\2\2\2\u00aa\u0351\3\2\2\2\u00ac\u035d\3\2\2\2\u00ae\u0360\3\2"+
		"\2\2\u00b0\u0364\3\2\2\2\u00b2\u036b\3\2\2\2\u00b4\u036f\3\2\2\2\u00b6"+
		"\u0371\3\2\2\2\u00b8\u037f\3\2\2\2\u00ba\u0381\3\2\2\2\u00bc\u0383\3\2"+
		"\2\2\u00be\u0387\3\2\2\2\u00c0\u03bd\3\2\2\2\u00c2\u03bf\3\2\2\2\u00c4"+
		"\u03d1\3\2\2\2\u00c6\u03d3\3\2\2\2\u00c8\u03da\3\2\2\2\u00ca\u03e0\3\2"+
		"\2\2\u00cc\u03e2\3\2\2\2\u00ce\u03e8\3\2\2\2\u00d0\u03ed\3\2\2\2\u00d2"+
		"\u03fb\3\2\2\2\u00d4\u0406\3\2\2\2\u00d6\u040d\3\2\2\2\u00d8\u0416\3\2"+
		"\2\2\u00da\u0418\3\2\2\2\u00dc\u041a\3\2\2\2\u00de\u041e\3\2\2\2\u00e0"+
		"\u0422\3\2\2\2\u00e2\u0426\3\2\2\2\u00e4\u0428\3\2\2\2\u00e6\u042a\3\2"+
		"\2\2\u00e8\u042c\3\2\2\2\u00ea\u042f\3\2\2\2\u00ec\u0432\3\2\2\2\u00ee"+
		"\u0436\3\2\2\2\u00f0\u043a\3\2\2\2\u00f2\u043e\3\2\2\2\u00f4\u0442\3\2"+
		"\2\2\u00f6\u0447\3\2\2\2\u00f8\u044b\3\2\2\2\u00fa\u044e\3\2\2\2\u00fc"+
		"\u0451\3\2\2\2\u00fe\u0464\3\2\2\2\u0100\u0466\3\2\2\2\u0102\u0468\3\2"+
		"\2\2\u0104\u046a\3\2\2\2\u0106\u046e\3\2\2\2\u0108\u0474\3\2\2\2\u010a"+
		"\u047e\3\2\2\2\u010c\u0480\3\2\2\2\u010e\u0482\3\2\2\2\u0110\u0484\3\2"+
		"\2\2\u0112\u0486\3\2\2\2\u0114\u0116\5\6\4\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\2\2\3\u0118\3\3\2\2\2"+
		"\u0119\u011b\5\u00a4S\2\u011a\u011c\7x\2\2\u011b\u011a\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u012e\3\2\2\2\u011d\u011f\5:\36\2\u011e\u0120\7x\2\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u012e\3\2\2\2\u0121\u0123\5\n"+
		"\6\2\u0122\u0124\7x\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u012e\3\2\2\2\u0125\u0127\5\34\17\2\u0126\u0128\7x\2\2\u0127\u0126\3"+
		"\2\2\2\u0127\u0128\3\2\2\2\u0128\u012e\3\2\2\2\u0129\u012b\5\62\32\2\u012a"+
		"\u012c\7x\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u0119\3\2\2\2\u012d\u011d\3\2\2\2\u012d\u0121\3\2\2\2\u012d"+
		"\u0125\3\2\2\2\u012d\u0129\3\2\2\2\u012e\5\3\2\2\2\u012f\u0130\5\b\5\2"+
		"\u0130\7\3\2\2\2\u0131\u0132\6\5\2\3\u0132\u0133\5\4\3\2\u0133\u0135\b"+
		"\5\1\2\u0134\u0136\5\b\5\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\t\3\2\2\2\u0137\u013b\5\f\7\2\u0138\u013b\5\20\t\2\u0139\u013b\5\32\16"+
		"\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\13"+
		"\3\2\2\2\u013c\u013e\7\3\2\2\u013d\u013f\5\16\b\2\u013e\u013d\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7x\2\2\u0141\u0143"+
		"\5\u00a4S\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2"+
		"\2\u0144\u0146\7x\2\2\u0145\u0147\5\u00a4S\2\u0146\u0145\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0159\5@!\2\u0149\u014a\7\3\2"+
		"\2\u014a\u014c\7q\2\2\u014b\u014d\5\16\b\2\u014c\u014b\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7x\2\2\u014f\u0151\5\u00a4S\2"+
		"\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154"+
		"\7x\2\2\u0153\u0155\5\u00a4S\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0157\7t\2\2\u0157\u0159\5@!\2\u0158\u013c"+
		"\3\2\2\2\u0158\u0149\3\2\2\2\u0159\r\3\2\2\2\u015a\u015d\5R*\2\u015b\u015d"+
		"\5\u00a6T\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\17\3\2\2\2\u015e"+
		"\u015f\7\4\2\2\u015f\u0160\5\22\n\2\u0160\u0161\5@!\2\u0161\21\3\2\2\2"+
		"\u0162\u0167\5\24\13\2\u0163\u0164\7v\2\2\u0164\u0166\5\24\13\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\23\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\5\u00a4S\2\u016b"+
		"\u016e\5\26\f\2\u016c\u016e\5\30\r\2\u016d\u016a\3\2\2\2\u016d\u016b\3"+
		"\2\2\2\u016d\u016c\3\2\2\2\u016e\25\3\2\2\2\u016f\u0170\7\5\2\2\u0170"+
		"\u0171\5\u009cO\2\u0171\u0172\5P)\2\u0172\27\3\2\2\2\u0173\u0174\7\6\2"+
		"\2\u0174\u0175\5\u009cO\2\u0175\u0176\5P)\2\u0176\u017c\3\2\2\2\u0177"+
		"\u0178\7\7\2\2\u0178\u0179\5\u009cO\2\u0179\u017a\5P)\2\u017a\u017c\3"+
		"\2\2\2\u017b\u0173\3\2\2\2\u017b\u0177\3\2\2\2\u017c\31\3\2\2\2\u017d"+
		"\u017e\7\b\2\2\u017e\u017f\5@!\2\u017f\u0180\7\4\2\2\u0180\u0181\5\u00a4"+
		"S\2\u0181\33\3\2\2\2\u0182\u0185\5\36\20\2\u0183\u0185\5\"\22\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\35\3\2\2\2\u0186\u0187\7\t\2"+
		"\2\u0187\u0188\5\22\n\2\u0188\u018a\5@!\2\u0189\u018b\5 \21\2\u018a\u0189"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\37\3\2\2\2\u018c\u018d\7\n\2\2\u018d"+
		"\u0191\5@!\2\u018e\u018f\7\n\2\2\u018f\u0191\5\36\20\2\u0190\u018c\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0191!\3\2\2\2\u0192\u0193\7\13\2\2\u0193\u0194"+
		"\5\u00a4S\2\u0194\u0196\7p\2\2\u0195\u0197\5$\23\2\u0196\u0195\3\2\2\2"+
		"\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7s\2\2\u0199#\3\2"+
		"\2\2\u019a\u019c\5&\24\2\u019b\u019d\5$\23\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d%\3\2\2\2\u019e\u019f\5(\25\2\u019f\u01a0\5\6\4\2"+
		"\u01a0\u01a5\3\2\2\2\u01a1\u01a2\5,\27\2\u01a2\u01a3\5\6\4\2\u01a3\u01a5"+
		"\3\2\2\2\u01a4\u019e\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a5\'\3\2\2\2\u01a6"+
		"\u01a7\7\5\2\2\u01a7\u01a8\5*\26\2\u01a8\u01a9\7w\2\2\u01a9)\3\2\2\2\u01aa"+
		"\u01ac\5\u009cO\2\u01ab\u01ad\5.\30\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01ad\u01b6\3\2\2\2\u01ae\u01b0\5\u009cO\2\u01af\u01b1\5.\30"+
		"\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\7v\2\2\u01b3\u01b4\5*\26\2\u01b4\u01b6\3\2\2\2\u01b5\u01aa\3\2\2\2\u01b5"+
		"\u01ae\3\2\2\2\u01b6+\3\2\2\2\u01b7\u01b8\7\f\2\2\u01b8\u01b9\7w\2\2\u01b9"+
		"-\3\2\2\2\u01ba\u01bb\7\r\2\2\u01bb\u01bc\5\60\31\2\u01bc/\3\2\2\2\u01bd"+
		"\u01be\5\u00a4S\2\u01be\61\3\2\2\2\u01bf\u01c3\5\64\33\2\u01c0\u01c3\5"+
		"\66\34\2\u01c1\u01c3\58\35\2\u01c2\u01bf\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\63\3\2\2\2\u01c4\u01c5\7\16\2\2\u01c5\65\3\2\2\2"+
		"\u01c6\u01c7\7\17\2\2\u01c7\67\3\2\2\2\u01c8\u01ca\7\20\2\2\u01c9\u01cb"+
		"\5\u00a4S\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb9\3\2\2\2\u01cc"+
		"\u01d3\5B\"\2\u01cd\u01d3\5J&\2\u01ce\u01d3\5R*\2\u01cf\u01d3\5l\67\2"+
		"\u01d0\u01d3\5\u0084C\2\u01d1\u01d3\5\u008cG\2\u01d2\u01cc\3\2\2\2\u01d2"+
		"\u01cd\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d2\u01d1\3\2\2\2\u01d3;\3\2\2\2\u01d4\u01d6\5:\36\2\u01d5\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"=\3\2\2\2\u01d9\u01db\5\6\4\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2"+
		"\u01db?\3\2\2\2\u01dc\u01de\7p\2\2\u01dd\u01df\5\6\4\2\u01de\u01dd\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7s\2\2\u01e1"+
		"A\3\2\2\2\u01e2\u01e4\7\21\2\2\u01e3\u01e5\5D#\2\u01e4\u01e3\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5F$\2\u01e7C\3\2\2\2\u01e8"+
		"\u01e9\t\2\2\2\u01e9E\3\2\2\2\u01ea\u01ef\5H%\2\u01eb\u01ec\7o\2\2\u01ec"+
		"\u01ee\5H%\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2"+
		"\2\u01ef\u01f0\3\2\2\2\u01f0G\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5"+
		"\5\u00e0q\2\u01f3\u01f5\5\u00fe\u0080\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f5I\3\2\2\2\u01f6\u01f8\5\u0096L\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\7\6\2\2\u01fa\u01fb\5L"+
		"\'\2\u01fbK\3\2\2\2\u01fc\u0201\5N(\2\u01fd\u01fe\7v\2\2\u01fe\u0200\5"+
		"N(\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202M\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\5\u009c"+
		"O\2\u0205\u0207\5P)\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207O\3"+
		"\2\2\2\u0208\u0209\5\u00e8u\2\u0209\u020a\5\u00a4S\2\u020aQ\3\2\2\2\u020b"+
		"\u020c\5T+\2\u020c\u020d\5V,\2\u020d\u020e\5\u00ccg\2\u020e\u020f\5@!"+
		"\2\u020f\u022f\3\2\2\2\u0210\u0211\5T+\2\u0211\u0212\5V,\2\u0212\u0213"+
		"\5\u00ccg\2\u0213\u0214\5X-\2\u0214\u022f\3\2\2\2\u0215\u0216\5T+\2\u0216"+
		"\u0217\5V,\2\u0217\u0218\5\u00ccg\2\u0218\u0219\5`\61\2\u0219\u022f\3"+
		"\2\2\2\u021a\u021b\5T+\2\u021b\u021c\5V,\2\u021c\u021e\5\u00ccg\2\u021d"+
		"\u021f\5P)\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2"+
		"\2\u0220\u0221\5f\64\2\u0221\u022f\3\2\2\2\u0222\u0223\5T+\2\u0223\u0224"+
		"\5V,\2\u0224\u0225\5\u00ccg\2\u0225\u0227\5\u00ccg\2\u0226\u0228\5P)\2"+
		"\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a"+
		"\5f\64\2\u022a\u022f\3\2\2\2\u022b\u022c\5T+\2\u022c\u022d\5L\'\2\u022d"+
		"\u022f\3\2\2\2\u022e\u020b\3\2\2\2\u022e\u0210\3\2\2\2\u022e\u0215\3\2"+
		"\2\2\u022e\u021a\3\2\2\2\u022e\u0222\3\2\2\2\u022e\u022b\3\2\2\2\u022f"+
		"S\3\2\2\2\u0230\u0232\5\u0096L\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2"+
		"\2\u0232\u0233\3\2\2\2\u0233\u0234\7\7\2\2\u0234U\3\2\2\2\u0235\u0236"+
		"\5\u00e0q\2\u0236W\3\2\2\2\u0237\u0238\7p\2\2\u0238\u023a\5Z.\2\u0239"+
		"\u023b\5\\/\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u023d\7s\2\2\u023d\u0244\3\2\2\2\u023e\u023f\7p\2\2\u023f\u0240"+
		"\5\\/\2\u0240\u0241\5Z.\2\u0241\u0242\7s\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u0237\3\2\2\2\u0243\u023e\3\2\2\2\u0244Y\3\2\2\2\u0245\u0247\5\u009a"+
		"N\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\7\30\2\2\u0249\u024a\5@!\2\u024a[\3\2\2\2\u024b\u024d\5\u009aN"+
		"\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250"+
		"\7\31\2\2\u024f\u0251\5^\60\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252\u0253\5@!\2\u0253]\3\2\2\2\u0254\u0255\7q\2"+
		"\2\u0255\u0256\5\u00e0q\2\u0256\u0257\7t\2\2\u0257_\3\2\2\2\u0258\u0259"+
		"\7p\2\2\u0259\u025b\5b\62\2\u025a\u025c\5d\63\2\u025b\u025a\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7s\2\2\u025e\u0265\3\2"+
		"\2\2\u025f\u0260\7p\2\2\u0260\u0261\5d\63\2\u0261\u0262\5b\62\2\u0262"+
		"\u0263\7s\2\2\u0263\u0265\3\2\2\2\u0264\u0258\3\2\2\2\u0264\u025f\3\2"+
		"\2\2\u0265a\3\2\2\2\u0266\u0268\5\u009aN\2\u0267\u0266\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\7\30\2\2\u026ac\3\2\2\2\u026b"+
		"\u026d\5\u009aN\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u026f\7\31\2\2\u026fe\3\2\2\2\u0270\u0271\7p\2\2\u0271"+
		"\u0273\5h\65\2\u0272\u0274\5j\66\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u0276\7s\2\2\u0276\u027d\3\2\2\2\u0277"+
		"\u0278\7p\2\2\u0278\u0279\5j\66\2\u0279\u027a\5h\65\2\u027a\u027b\7s\2"+
		"\2\u027b\u027d\3\2\2\2\u027c\u0270\3\2\2\2\u027c\u0277\3\2\2\2\u027dg"+
		"\3\2\2\2\u027e\u0280\7\32\2\2\u027f\u0281\5^\60\2\u0280\u027f\3\2\2\2"+
		"\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\5@!\2\u0283i\3\2"+
		"\2\2\u0284\u0286\7\33\2\2\u0285\u0287\5^\60\2\u0286\u0285\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\5@!\2\u0289k\3\2\2\2\u028a"+
		"\u028b\5n8\2\u028b\u028c\5p9\2\u028c\u028e\5r:\2\u028d\u028f\5v<\2\u028e"+
		"\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028fm\3\2\2\2\u0290\u0292\5\u0096"+
		"L\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\7\27\2\2\u0294o\3\2\2\2\u0295\u0298\5\u00e0q\2\u0296\u0298\5\u00fe"+
		"\u0080\2\u0297\u0295\3\2\2\2\u0297\u0296\3\2\2\2\u0298q\3\2\2\2\u0299"+
		"\u029b\5x=\2\u029a\u029c\7\34\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029e\3\2\2\2\u029d\u029f\5t;\2\u029e\u029d\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a6\3\2\2\2\u02a0\u02a1\5x=\2\u02a1\u02a3\7\35\2\2\u02a2"+
		"\u02a4\5t;\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2"+
		"\2\u02a5\u0299\3\2\2\2\u02a5\u02a0\3\2\2\2\u02a6s\3\2\2\2\u02a7\u02a8"+
		"\5\u00f2z\2\u02a8\u02a9\5\u00caf\2\u02a9u\3\2\2\2\u02aa\u02ab\5@!\2\u02ab"+
		"w\3\2\2\2\u02ac\u02ad\7q\2\2\u02ad\u02b3\7t\2\2\u02ae\u02af\7q\2\2\u02af"+
		"\u02b0\5z>\2\u02b0\u02b1\7t\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02ac\3\2\2"+
		"\2\u02b2\u02ae\3\2\2\2\u02b3y\3\2\2\2\u02b4\u02b9\5|?\2\u02b5\u02b6\7"+
		"v\2\2\u02b6\u02b8\5|?\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba{\3\2\2\2\u02bb\u02b9\3\2\2\2"+
		"\u02bc\u02be\5~@\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf"+
		"\3\2\2\2\u02bf\u02c0\5\u0080A\2\u02c0\u02c2\5\u00ccg\2\u02c1\u02c3\5\u0082"+
		"B\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02d2\3\2\2\2\u02c4"+
		"\u02c6\5~@\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2"+
		"\2\u02c7\u02c8\5\u0080A\2\u02c8\u02c9\5\u00ccg\2\u02c9\u02d2\3\2\2\2\u02ca"+
		"\u02cc\5~@\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2"+
		"\2\u02cd\u02ce\5\u0080A\2\u02ce\u02cf\5\u00ccg\2\u02cf\u02d0\5\u00f4{"+
		"\2\u02d0\u02d2\3\2\2\2\u02d1\u02bd\3\2\2\2\u02d1\u02c5\3\2\2\2\u02d1\u02cb"+
		"\3\2\2\2\u02d2}\3\2\2\2\u02d3\u02d4\5\u00e2r\2\u02d4\177\3\2\2\2\u02d5"+
		"\u02d6\5\u00e2r\2\u02d6\u0081\3\2\2\2\u02d7\u02d8\5\u00e8u\2\u02d8\u02d9"+
		"\5\u00a4S\2\u02d9\u0083\3\2\2\2\u02da\u02dc\5\u0098M\2\u02db\u02da\3\2"+
		"\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\7\23\2\2\u02de"+
		"\u02df\5\u0086D\2\u02df\u02e0\5\u0088E\2\u02e0\u0085\3\2\2\2\u02e1\u02e2"+
		"\5\u00e0q\2\u02e2\u0087\3\2\2\2\u02e3\u02e7\7p\2\2\u02e4\u02e6\5\u008a"+
		"F\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb\7s"+
		"\2\2\u02eb\u0089\3\2\2\2\u02ec\u02ed\5:\36\2\u02ed\u008b\3\2\2\2\u02ee"+
		"\u02f2\5\u008eH\2\u02ef\u02f2\5\u0090I\2\u02f0\u02f2\5\u0092J\2\u02f1"+
		"\u02ee\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0\3\2\2\2\u02f2\u008d\3\2"+
		"\2\2\u02f3\u02f4\7\36\2\2\u02f4\u02f5\7\37\2\2\u02f5\u02f6\5\u00fe\u0080"+
		"\2\u02f6\u008f\3\2\2\2\u02f7\u02f8\7 \2\2\u02f8\u02f9\7\37\2\2\u02f9\u02fa"+
		"\5\u00fe\u0080\2\u02fa\u0091\3\2\2\2\u02fb\u02fc\7!\2\2\u02fc\u02fd\7"+
		"\37\2\2\u02fd\u02fe\5\u00fe\u0080\2\u02fe\u0093\3\2\2\2\u02ff\u0309\7"+
		"\24\2\2\u0300\u0309\7\"\2\2\u0301\u0309\7#\2\2\u0302\u0309\7 \2\2\u0303"+
		"\u0309\7\36\2\2\u0304\u0309\7$\2\2\u0305\u0309\7%\2\2\u0306\u0309\5\u0098"+
		"M\2\u0307\u0309\5\u009aN\2\u0308\u02ff\3\2\2\2\u0308\u0300\3\2\2\2\u0308"+
		"\u0301\3\2\2\2\u0308\u0302\3\2\2\2\u0308\u0303\3\2\2\2\u0308\u0304\3\2"+
		"\2\2\u0308\u0305\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309"+
		"\u0095\3\2\2\2\u030a\u030c\5\u0094K\2\u030b\u030a\3\2\2\2\u030c\u030d"+
		"\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0097\3\2\2\2\u030f"+
		"\u0329\7&\2\2\u0310\u0311\7&\2\2\u0311\u0312\7q\2\2\u0312\u0313\7\31\2"+
		"\2\u0313\u0329\7t\2\2\u0314\u0329\7\'\2\2\u0315\u0316\7\'\2\2\u0316\u0317"+
		"\7q\2\2\u0317\u0318\7\31\2\2\u0318\u0329\7t\2\2\u0319\u0329\7(\2\2\u031a"+
		"\u031b\7(\2\2\u031b\u031c\7q\2\2\u031c\u031d\7\31\2\2\u031d\u0329\7t\2"+
		"\2\u031e\u0329\7)\2\2\u031f\u0320\7)\2\2\u0320\u0321\7q\2\2\u0321\u0322"+
		"\7\31\2\2\u0322\u0329\7t\2\2\u0323\u0329\7*\2\2\u0324\u0325\7*\2\2\u0325"+
		"\u0326\7q\2\2\u0326\u0327\7\31\2\2\u0327\u0329\7t\2\2\u0328\u030f\3\2"+
		"\2\2\u0328\u0310\3\2\2\2\u0328\u0314\3\2\2\2\u0328\u0315\3\2\2\2\u0328"+
		"\u0319\3\2\2\2\u0328\u031a\3\2\2\2\u0328\u031e\3\2\2\2\u0328\u031f\3\2"+
		"\2\2\u0328\u0323\3\2\2\2\u0328\u0324\3\2\2\2\u0329\u0099\3\2\2\2\u032a"+
		"\u032b\t\3\2\2\u032b\u009b\3\2\2\2\u032c\u032e\5\u009eP\2\u032d\u032f"+
		"\5\u00ccg\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0333\3\2\2"+
		"\2\u0330\u0333\5\u00a0Q\2\u0331\u0333\5\u00a2R\2\u0332\u032c\3\2\2\2\u0332"+
		"\u0330\3\2\2\2\u0332\u0331\3\2\2\2\u0333\u009d\3\2\2\2\u0334\u0335\5\u00e0"+
		"q\2\u0335\u009f\3\2\2\2\u0336\u0337\7\7\2\2\u0337\u033b\5\u009cO\2\u0338"+
		"\u0339\7\6\2\2\u0339\u033b\5\u009cO\2\u033a\u0336\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033b\u00a1\3\2\2\2\u033c\u033d\5\u00a4S\2\u033d\u00a3\3\2\2"+
		"\2\u033e\u0340\5\u00a8U\2\u033f\u0341\5\u00aeX\2\u0340\u033f\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341\u00a5\3\2\2\2\u0342\u0347\5\u00a4S\2\u0343\u0344"+
		"\7v\2\2\u0344\u0346\5\u00a4S\2\u0345\u0343\3\2\2\2\u0346\u0349\3\2\2\2"+
		"\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u00a7\3\2\2\2\u0349\u0347"+
		"\3\2\2\2\u034a\u034b\5\u00fa~\2\u034b\u034c\5\u00be`\2\u034c\u0350\3\2"+
		"\2\2\u034d\u0350\5\u00be`\2\u034e\u0350\5\u00aaV\2\u034f\u034a\3\2\2\2"+
		"\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u0350\u00a9\3\2\2\2\u0351\u0352"+
		"\7\177\2\2\u0352\u0353\5\u00e0q\2\u0353\u00ab\3\2\2\2\u0354\u0355\5\u00f8"+
		"}\2\u0355\u0356\5\u00a8U\2\u0356\u035e\3\2\2\2\u0357\u0358\5\u00e8u\2"+
		"\u0358\u0359\5\u00a8U\2\u0359\u035e\3\2\2\2\u035a\u035b\5\u00b0Y\2\u035b"+
		"\u035c\5\u00a8U\2\u035c\u035e\3\2\2\2\u035d\u0354\3\2\2\2\u035d\u0357"+
		"\3\2\2\2\u035d\u035a\3\2\2\2\u035e\u00ad\3\2\2\2\u035f\u0361\5\u00acW"+
		"\2\u0360\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u00af\3\2\2\2\u0364\u0365\7}\2\2\u0365\u0366\5\u00a4S\2"+
		"\u0366\u0367\7w\2\2\u0367\u00b1\3\2\2\2\u0368\u036c\5\u00e0q\2\u0369\u036c"+
		"\5\u00b4[\2\u036a\u036c\5\u00bc_\2\u036b\u0368\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036b\u036a\3\2\2\2\u036c\u00b3\3\2\2\2\u036d\u0370\5\u0108\u0085"+
		"\2\u036e\u0370\5\u00b6\\\2\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370"+
		"\u00b5\3\2\2\2\u0371\u0373\7r\2\2\u0372\u0374\5\u00b8]\2\u0373\u0372\3"+
		"\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\7u\2\2\u0376"+
		"\u00b7\3\2\2\2\u0377\u0379\5\u00ba^\2\u0378\u037a\7v\2\2\u0379\u0378\3"+
		"\2\2\2\u0379\u037a\3\2\2\2\u037a\u0380\3\2\2\2\u037b\u037c\5\u00ba^\2"+
		"\u037c\u037d\7v\2\2\u037d\u037e\5\u00b8]\2\u037e\u0380\3\2\2\2\u037f\u0377"+
		"\3\2\2\2\u037f\u037b\3\2\2\2\u0380\u00b9\3\2\2\2\u0381\u0382\5\u00a4S"+
		"\2\u0382\u00bb\3\2\2\2\u0383\u0384\7q\2\2\u0384\u0385\5\u00a4S\2\u0385"+
		"\u0386\7t\2\2\u0386\u00bd\3\2\2\2\u0387\u0388\b`\1\2\u0388\u0389\5\u00b2"+
		"Z\2\u0389\u03b4\3\2\2\2\u038a\u038b\f\f\2\2\u038b\u03b3\5\u00fc\177\2"+
		"\u038c\u038d\f\13\2\2\u038d\u03b3\5\u00c0a\2\u038e\u038f\f\n\2\2\u038f"+
		"\u0390\7o\2\2\u0390\u03b3\7-\2\2\u0391\u0392\f\t\2\2\u0392\u0393\7o\2"+
		"\2\u0393\u0394\7-\2\2\u0394\u0395\7q\2\2\u0395\u0396\5\u00c6d\2\u0396"+
		"\u0397\7t\2\2\u0397\u03b3\3\2\2\2\u0398\u0399\f\b\2\2\u0399\u039a\7o\2"+
		"\2\u039a\u03b3\7\u008c\2\2\u039b\u039c\f\7\2\2\u039c\u039d\7o\2\2\u039d"+
		"\u03b3\5\u00e0q\2\u039e\u039f\f\6\2\2\u039f\u03a0\7o\2\2\u03a0\u03a1\5"+
		"\u00e0q\2\u03a1\u03a2\7q\2\2\u03a2\u03a3\5\u00c6d\2\u03a3\u03a4\7t\2\2"+
		"\u03a4\u03b3\3\2\2\2\u03a5\u03a6\f\5\2\2\u03a6\u03a7\7q\2\2\u03a7\u03a8"+
		"\5\u00c6d\2\u03a8\u03a9\7t\2\2\u03a9\u03b3\3\2\2\2\u03aa\u03ab\f\4\2\2"+
		"\u03ab\u03ac\7o\2\2\u03ac\u03b3\7.\2\2\u03ad\u03ae\f\3\2\2\u03ae\u03af"+
		"\7r\2\2\u03af\u03b0\5\u00a6T\2\u03b0\u03b1\7u\2\2\u03b1\u03b3\3\2\2\2"+
		"\u03b2\u038a\3\2\2\2\u03b2\u038c\3\2\2\2\u03b2\u038e\3\2\2\2\u03b2\u0391"+
		"\3\2\2\2\u03b2\u0398\3\2\2\2\u03b2\u039b\3\2\2\2\u03b2\u039e\3\2\2\2\u03b2"+
		"\u03a5\3\2\2\2\u03b2\u03aa\3\2\2\2\u03b2\u03ad\3\2\2\2\u03b3\u03b6\3\2"+
		"\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u00bf\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u03b8\7q\2\2\u03b8\u03be\7t\2\2\u03b9\u03ba\7q\2"+
		"\2\u03ba\u03bb\5\u00c2b\2\u03bb\u03bc\7t\2\2\u03bc\u03be\3\2\2\2\u03bd"+
		"\u03b7\3\2\2\2\u03bd\u03b9\3\2\2\2\u03be\u00c1\3\2\2\2\u03bf\u03c4\5\u00c4"+
		"c\2\u03c0\u03c1\7v\2\2\u03c1\u03c3\5\u00c4c\2\u03c2\u03c0\3\2\2\2\u03c3"+
		"\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u00c3\3\2"+
		"\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03d2\5\u00a4S\2\u03c8\u03c9\5\u00e2r\2"+
		"\u03c9\u03ca\7w\2\2\u03ca\u03cb\5\u00a4S\2\u03cb\u03d2\3\2\2\2\u03cc\u03d2"+
		"\5\u00fe\u0080\2\u03cd\u03ce\5\u00e2r\2\u03ce\u03cf\7w\2\2\u03cf\u03d0"+
		"\5\u00fe\u0080\2\u03d0\u03d2\3\2\2\2\u03d1\u03c7\3\2\2\2\u03d1\u03c8\3"+
		"\2\2\2\u03d1\u03cc\3\2\2\2\u03d1\u03cd\3\2\2\2\u03d2\u00c5\3\2\2\2\u03d3"+
		"\u03d7\5\u00c8e\2\u03d4\u03d6\5\u00c8e\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u00c7\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u03db\5\u00e2r\2\u03db\u03dc\7w\2\2\u03dc\u00c9\3"+
		"\2\2\2\u03dd\u03e1\5\u00dco\2\u03de\u03e1\5\u00d2j\2\u03df\u03e1\5\u00ce"+
		"h\2\u03e0\u03dd\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03df\3\2\2\2\u03e1"+
		"\u00cb\3\2\2\2\u03e2\u03e4\7w\2\2\u03e3\u03e5\7/\2\2\u03e4\u03e3\3\2\2"+
		"\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\5\u00caf\2\u03e7"+
		"\u00cd\3\2\2\2\u03e8\u03eb\5\u00d0i\2\u03e9\u03ea\7o\2\2\u03ea\u03ec\5"+
		"\u00ceh\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u00cf\3\2\2\2"+
		"\u03ed\u03ee\5\u00e0q\2\u03ee\u00d1\3\2\2\2\u03ef\u03f1\5\u00d4k\2\u03f0"+
		"\u03f2\7\34\2\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3"+
		"\2\2\2\u03f3\u03f4\5\u00f2z\2\u03f4\u03f5\5\u00caf\2\u03f5\u03fc\3\2\2"+
		"\2\u03f6\u03f7\5\u00d4k\2\u03f7\u03f8\7\35\2\2\u03f8\u03f9\5\u00f2z\2"+
		"\u03f9\u03fa\5\u00caf\2\u03fa\u03fc\3\2\2\2\u03fb\u03ef\3\2\2\2\u03fb"+
		"\u03f6\3\2\2\2\u03fc\u00d3\3\2\2\2\u03fd\u03fe\7q\2\2\u03fe\u0407\7t\2"+
		"\2\u03ff\u0400\7q\2\2\u0400\u0402\5\u00d6l\2\u0401\u0403\5\u00f4{\2\u0402"+
		"\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\7t"+
		"\2\2\u0405\u0407\3\2\2\2\u0406\u03fd\3\2\2\2\u0406\u03ff\3\2\2\2\u0407"+
		"\u00d5\3\2\2\2\u0408\u040e\5\u00d8m\2\u0409\u040a\5\u00d8m\2\u040a\u040b"+
		"\7v\2\2\u040b\u040c\5\u00d6l\2\u040c\u040e\3\2\2\2\u040d\u0408\3\2\2\2"+
		"\u040d\u0409\3\2\2\2\u040e\u00d7\3\2\2\2\u040f\u0411\7/\2\2\u0410\u040f"+
		"\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0417\5\u00caf"+
		"\2\u0413\u0414\5\u00dan\2\u0414\u0415\5\u00ccg\2\u0415\u0417\3\2\2\2\u0416"+
		"\u0410\3\2\2\2\u0416\u0413\3\2\2\2\u0417\u00d9\3\2\2\2\u0418\u0419\5\u00e2"+
		"r\2\u0419\u00db\3\2\2\2\u041a\u041b\7r\2\2\u041b\u041c\5\u00caf\2\u041c"+
		"\u041d\7u\2\2\u041d\u00dd\3\2\2\2\u041e\u041f\7n\2\2\u041f\u00df\3\2\2"+
		"\2\u0420\u0423\7n\2\2\u0421\u0423\5\u00e4s\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0421\3\2\2\2\u0423\u00e1\3\2\2\2\u0424\u0427\7n\2\2\u0425\u0427\5\u00e6"+
		"t\2\u0426\u0424\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u00e3\3\2\2\2\u0428"+
		"\u0429\t\4\2\2\u0429\u00e5\3\2\2\2\u042a\u042b\t\5\2\2\u042b\u00e7\3\2"+
		"\2\2\u042c\u042d\6u\r\2\u042d\u042e\7\u0081\2\2\u042e\u00e9\3\2\2\2\u042f"+
		"\u0430\6v\16\2\u0430\u0431\7\u0080\2\2\u0431\u00eb\3\2\2\2\u0432\u0433"+
		"\6w\17\2\u0433\u0434\7\177\2\2\u0434\u0435\7\177\2\2\u0435\u00ed\3\2\2"+
		"\2\u0436\u0437\6x\20\2\u0437\u0438\7\u0082\2\2\u0438\u0439\7\u0082\2\2"+
		"\u0439\u00ef\3\2\2\2\u043a\u043b\6y\21\2\u043b\u043c\7z\2\2\u043c\u043d"+
		"\7\u0081\2\2\u043d\u00f1\3\2\2\2\u043e\u043f\6z\22\2\u043f\u0440\7\u0080"+
		"\2\2\u0440\u0441\7z\2\2\u0441\u00f3\3\2\2\2\u0442\u0443\6{\23\2\u0443"+
		"\u0444\7o\2\2\u0444\u0445\7o\2\2\u0445\u0446\7o\2\2\u0446\u00f5\3\2\2"+
		"\2\u0447\u0448\6|\24\2\u0448\u0449\7\u0081\2\2\u0449\u044a\7\u0081\2\2"+
		"\u044a\u00f7\3\2\2\2\u044b\u044c\6}\25\2\u044c\u044d\5\u00fe\u0080\2\u044d"+
		"\u00f9\3\2\2\2\u044e\u044f\6~\26\2\u044f\u0450\5\u00fe\u0080\2\u0450\u00fb"+
		"\3\2\2\2\u0451\u0452\6\177\27\2\u0452\u0453\5\u00fe\u0080\2\u0453\u00fd"+
		"\3\2\2\2\u0454\u0459\5\u0102\u0082\2\u0455\u0456\6\u0080\30\2\u0456\u0458"+
		"\5\u0100\u0081\2\u0457\u0455\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3"+
		"\2\2\2\u0459\u045a\3\2\2\2\u045a\u0465\3\2\2\2\u045b\u0459\3\2\2\2\u045c"+
		"\u0461\5\u0104\u0083\2\u045d\u045e\6\u0080\31\2\u045e\u0460\5\u0106\u0084"+
		"\2\u045f\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0454\3\2\2\2\u0464"+
		"\u045c\3\2\2\2\u0465\u00ff\3\2\2\2\u0466\u0467\5\u0102\u0082\2\u0467\u0101"+
		"\3\2\2\2\u0468\u0469\t\6\2\2\u0469\u0103\3\2\2\2\u046a\u046b\7o\2\2\u046b"+
		"\u0105\3\2\2\2\u046c\u046f\7o\2\2\u046d\u046f\5\u0100\u0081\2\u046e\u046c"+
		"\3\2\2\2\u046e\u046d\3\2\2\2\u046f\u0107\3\2\2\2\u0470\u0475\5\u010a\u0086"+
		"\2\u0471\u0475\5\u0112\u008a\2\u0472\u0475\5\u010c\u0087\2\u0473\u0475"+
		"\5\u010e\u0088\2\u0474\u0470\3\2\2\2\u0474\u0471\3\2\2\2\u0474\u0472\3"+
		"\2\2\2\u0474\u0473\3\2\2\2\u0475\u0109\3\2\2\2\u0476\u0478\5\u00eav\2"+
		"\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047f"+
		"\5\u0110\u0089\2\u047a\u047c\5\u00eav\2\u047b\u047a\3\2\2\2\u047b\u047c"+
		"\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f\7\u008d\2\2\u047e\u0477\3\2\2"+
		"\2\u047e\u047b\3\2\2\2\u047f\u010b\3\2\2\2\u0480\u0481\t\7\2\2\u0481\u010d"+
		"\3\2\2\2\u0482\u0483\7g\2\2\u0483\u010f\3\2\2\2\u0484\u0485\t\b\2\2\u0485"+
		"\u0111\3\2\2\2\u0486\u0487\t\t\2\2\u0487\u0113\3\2\2\2w\u0115\u011b\u011f"+
		"\u0123\u0127\u012b\u012d\u0135\u013a\u013e\u0142\u0146\u014c\u0150\u0154"+
		"\u0158\u015c\u0167\u016d\u017b\u0184\u018a\u0190\u0196\u019c\u01a4\u01ac"+
		"\u01b0\u01b5\u01c2\u01ca\u01d2\u01d7\u01da\u01de\u01e4\u01ef\u01f4\u01f7"+
		"\u0201\u0206\u021e\u0227\u022e\u0231\u023a\u0243\u0246\u024c\u0250\u025b"+
		"\u0264\u0267\u026c\u0273\u027c\u0280\u0286\u028e\u0291\u0297\u029b\u029e"+
		"\u02a3\u02a5\u02b2\u02b9\u02bd\u02c2\u02c5\u02cb\u02d1\u02db\u02e7\u02f1"+
		"\u0308\u030d\u0328\u032e\u0332\u033a\u0340\u0347\u034f\u035d\u0362\u036b"+
		"\u036f\u0373\u0379\u037f\u03b2\u03b4\u03bd\u03c4\u03d1\u03d7\u03e0\u03e4"+
		"\u03eb\u03f1\u03fb\u0402\u0406\u040d\u0410\u0416\u0422\u0426\u0459\u0461"+
		"\u0464\u046e\u0474\u0477\u047b\u047e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}