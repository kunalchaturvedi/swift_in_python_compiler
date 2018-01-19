// Generated from /home/kunal/repos/swift_in_python_compiler/grammar/kunal/Swift3.g4 by ANTLR 4.7
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
		T__107=108, T__108=109, Identifier=110, DOT=111, LCURLY=112, LPAREN=113, 
		LBRACK=114, RCURLY=115, RPAREN=116, RBRACK=117, COMMA=118, COLON=119, 
		SEMI=120, LT=121, GT=122, UNDERSCORE=123, BANG=124, QUESTION=125, AT=126, 
		AND=127, SUB=128, EQUAL=129, OR=130, DIV=131, ADD=132, MUL=133, MOD=134, 
		CARET=135, TILDE=136, Implicit_parameter_name=137, Binary_literal=138, 
		Decimal_literal=139, Pure_decimal_digits=140, Floating_point_literal=141, 
		Static_string_literal=142, Interpolated_string_literal=143, WS=144, Block_comment=145, 
		Line_comment=146;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_statements_impl = 3, 
		RULE_loop_statement = 4, RULE_for_statement = 5, RULE_for_init = 6, RULE_for_in_statement = 7, 
		RULE_while_statement = 8, RULE_condition_list = 9, RULE_condition = 10, 
		RULE_case_condition = 11, RULE_optional_binding_condition = 12, RULE_repeat_while_statement = 13, 
		RULE_branch_statement = 14, RULE_if_statement = 15, RULE_else_clause = 16, 
		RULE_switch_statement = 17, RULE_switch_cases = 18, RULE_switch_case = 19, 
		RULE_case_label = 20, RULE_case_item_list = 21, RULE_default_label = 22, 
		RULE_where_clause = 23, RULE_where_expression = 24, RULE_labeled_statement = 25, 
		RULE_statement_label = 26, RULE_label_name = 27, RULE_control_transfer_statement = 28, 
		RULE_break_statement = 29, RULE_continue_statement = 30, RULE_return_statement = 31, 
		RULE_generic_parameter_clause = 32, RULE_generic_parameter_list = 33, 
		RULE_generic_parameter = 34, RULE_generic_where_clause = 35, RULE_requirement_list = 36, 
		RULE_requirement = 37, RULE_conformance_requirement = 38, RULE_same_type_requirement = 39, 
		RULE_generic_argument_clause = 40, RULE_generic_argument_list = 41, RULE_generic_argument = 42, 
		RULE_declaration = 43, RULE_declarations = 44, RULE_top_level_declaration = 45, 
		RULE_code_block = 46, RULE_import_declaration = 47, RULE_import_kind = 48, 
		RULE_import_path = 49, RULE_import_path_identifier = 50, RULE_constant_declaration = 51, 
		RULE_pattern_initializer_list = 52, RULE_pattern_initializer = 53, RULE_initializer = 54, 
		RULE_variable_declaration = 55, RULE_variable_declaration_head = 56, RULE_variable_name = 57, 
		RULE_getter_setter_block = 58, RULE_getter_clause = 59, RULE_setter_clause = 60, 
		RULE_setter_name = 61, RULE_getter_setter_keyword_block = 62, RULE_getter_keyword_clause = 63, 
		RULE_setter_keyword_clause = 64, RULE_willSet_didSet_block = 65, RULE_willSet_clause = 66, 
		RULE_didSet_clause = 67, RULE_function_declaration = 68, RULE_function_head = 69, 
		RULE_function_name = 70, RULE_function_signature = 71, RULE_function_result = 72, 
		RULE_function_body = 73, RULE_parameter_clause = 74, RULE_parameter_list = 75, 
		RULE_parameter = 76, RULE_external_parameter_name = 77, RULE_local_parameter_name = 78, 
		RULE_default_argument_clause = 79, RULE_struct_declaration = 80, RULE_struct_name = 81, 
		RULE_struct_body = 82, RULE_struct_member = 83, RULE_class_declaration = 84, 
		RULE_class_name = 85, RULE_class_body = 86, RULE_class_member = 87, RULE_operator_declaration = 88, 
		RULE_prefix_operator_declaration = 89, RULE_postfix_operator_declaration = 90, 
		RULE_infix_operator_declaration = 91, RULE_infix_operator_group = 92, 
		RULE_precedence_group_declaration = 93, RULE_precedence_group_attribute = 94, 
		RULE_precedence_group_relation = 95, RULE_precedence_group_assignment = 96, 
		RULE_precedence_group_associativity = 97, RULE_associativity = 98, RULE_precedence_group_names = 99, 
		RULE_precedence_group_name = 100, RULE_declaration_modifier = 101, RULE_declaration_modifiers = 102, 
		RULE_access_level_modifier = 103, RULE_mutation_modifier = 104, RULE_pattern = 105, 
		RULE_identifier_pattern = 106, RULE_value_binding_pattern = 107, RULE_expression_pattern = 108, 
		RULE_attribute = 109, RULE_attribute_name = 110, RULE_attribute_argument_clause = 111, 
		RULE_attributes = 112, RULE_balanced_tokens = 113, RULE_balanced_token = 114, 
		RULE_any_punctuation_for_balanced_token = 115, RULE_expression = 116, 
		RULE_expression_list = 117, RULE_prefix_expression = 118, RULE_in_out_expression = 119, 
		RULE_binary_expression = 120, RULE_binary_expressions = 121, RULE_conditional_operator = 122, 
		RULE_primary_expression = 123, RULE_literal_expression = 124, RULE_array_literal = 125, 
		RULE_array_literal_items = 126, RULE_array_literal_item = 127, RULE_self_expression = 128, 
		RULE_implicit_member_expression = 129, RULE_parenthesized_expression = 130, 
		RULE_postfix_expression = 131, RULE_function_call_argument_clause = 132, 
		RULE_function_call_argument_list = 133, RULE_function_call_argument = 134, 
		RULE_argument_names = 135, RULE_argument_name = 136, RULE_type = 137, 
		RULE_type_annotation = 138, RULE_type_identifier = 139, RULE_type_name = 140, 
		RULE_function_type = 141, RULE_function_type_argument_clause = 142, RULE_function_type_argument_list = 143, 
		RULE_function_type_argument = 144, RULE_argument_label = 145, RULE_array_type = 146, 
		RULE_declaration_identifier = 147, RULE_label_identifier = 148, RULE_keyword_as_identifier_in_declarations = 149, 
		RULE_keyword_as_identifier_in_labels = 150, RULE_assignment_operator = 151, 
		RULE_negate_prefix_operator = 152, RULE_compilation_condition_AND = 153, 
		RULE_compilation_condition_OR = 154, RULE_compilation_condition_GE = 155, 
		RULE_arrow_operator = 156, RULE_range_operator = 157, RULE_same_type_equals = 158, 
		RULE_binary_operator = 159, RULE_prefix_operator = 160, RULE_postfix_operator = 161, 
		RULE_operator = 162, RULE_operator_character = 163, RULE_operator_head = 164, 
		RULE_dot_operator_head = 165, RULE_dot_operator_character = 166, RULE_literal = 167, 
		RULE_numeric_literal = 168, RULE_boolean_literal = 169, RULE_nil_literal = 170, 
		RULE_integer_literal = 171, RULE_string_literal = 172;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "statements_impl", "loop_statement", 
		"for_statement", "for_init", "for_in_statement", "while_statement", "condition_list", 
		"condition", "case_condition", "optional_binding_condition", "repeat_while_statement", 
		"branch_statement", "if_statement", "else_clause", "switch_statement", 
		"switch_cases", "switch_case", "case_label", "case_item_list", "default_label", 
		"where_clause", "where_expression", "labeled_statement", "statement_label", 
		"label_name", "control_transfer_statement", "break_statement", "continue_statement", 
		"return_statement", "generic_parameter_clause", "generic_parameter_list", 
		"generic_parameter", "generic_where_clause", "requirement_list", "requirement", 
		"conformance_requirement", "same_type_requirement", "generic_argument_clause", 
		"generic_argument_list", "generic_argument", "declaration", "declarations", 
		"top_level_declaration", "code_block", "import_declaration", "import_kind", 
		"import_path", "import_path_identifier", "constant_declaration", "pattern_initializer_list", 
		"pattern_initializer", "initializer", "variable_declaration", "variable_declaration_head", 
		"variable_name", "getter_setter_block", "getter_clause", "setter_clause", 
		"setter_name", "getter_setter_keyword_block", "getter_keyword_clause", 
		"setter_keyword_clause", "willSet_didSet_block", "willSet_clause", "didSet_clause", 
		"function_declaration", "function_head", "function_name", "function_signature", 
		"function_result", "function_body", "parameter_clause", "parameter_list", 
		"parameter", "external_parameter_name", "local_parameter_name", "default_argument_clause", 
		"struct_declaration", "struct_name", "struct_body", "struct_member", "class_declaration", 
		"class_name", "class_body", "class_member", "operator_declaration", "prefix_operator_declaration", 
		"postfix_operator_declaration", "infix_operator_declaration", "infix_operator_group", 
		"precedence_group_declaration", "precedence_group_attribute", "precedence_group_relation", 
		"precedence_group_assignment", "precedence_group_associativity", "associativity", 
		"precedence_group_names", "precedence_group_name", "declaration_modifier", 
		"declaration_modifiers", "access_level_modifier", "mutation_modifier", 
		"pattern", "identifier_pattern", "value_binding_pattern", "expression_pattern", 
		"attribute", "attribute_name", "attribute_argument_clause", "attributes", 
		"balanced_tokens", "balanced_token", "any_punctuation_for_balanced_token", 
		"expression", "expression_list", "prefix_expression", "in_out_expression", 
		"binary_expression", "binary_expressions", "conditional_operator", "primary_expression", 
		"literal_expression", "array_literal", "array_literal_items", "array_literal_item", 
		"self_expression", "implicit_member_expression", "parenthesized_expression", 
		"postfix_expression", "function_call_argument_clause", "function_call_argument_list", 
		"function_call_argument", "argument_names", "argument_name", "type", "type_annotation", 
		"type_identifier", "type_name", "function_type", "function_type_argument_clause", 
		"function_type_argument_list", "function_type_argument", "argument_label", 
		"array_type", "declaration_identifier", "label_identifier", "keyword_as_identifier_in_declarations", 
		"keyword_as_identifier_in_labels", "assignment_operator", "negate_prefix_operator", 
		"compilation_condition_AND", "compilation_condition_OR", "compilation_condition_GE", 
		"arrow_operator", "range_operator", "same_type_equals", "binary_operator", 
		"prefix_operator", "postfix_operator", "operator", "operator_character", 
		"operator_head", "dot_operator_head", "dot_operator_character", "literal", 
		"numeric_literal", "boolean_literal", "nil_literal", "integer_literal", 
		"string_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'for'", "'case'", "'in'", "'while'", "'let'", "'var'", "'repeat'", 
		"'if'", "'else'", "'switch'", "'default'", "'where'", "'break'", "'continue'", 
		"'return'", "'import'", "'typealias'", "'struct'", "'class'", "'enum'", 
		"'protocol'", "'func'", "'get'", "'set'", "'willSet'", "'didSet'", "'throws'", 
		"'rethrows'", "'final'", "'prefix'", "'operator'", "'postfix'", "'infix'", 
		"'precedencegroup'", "'higherThan'", "'lowerThan'", "'assignment'", "'associativity'", 
		"'left'", "'right'", "'none'", "'dynamic'", "'override'", "'required'", 
		"'static'", "'private'", "'fileprivate'", "'internal'", "'public'", "'open'", 
		"'mutating'", "'nonmutating'", "'#'", "'`'", "'self'", "'init'", "'Self'", 
		"'inout'", "'Type'", "'alpha'", "'arch'", "'arm'", "'arm64'", "'blue'", 
		"'convenience'", "'file'", "'green'", "'i386'", "'iOS'", "'iOSApplicationExtension'", 
		"'indirect'", "'lazy'", "'line'", "'macOS'", "'macOSApplicationExtension'", 
		"'of'", "'optional'", "'os'", "'precedence'", "'red'", "'resourceName'", 
		"'safe'", "'swift'", "'tvOS'", "'type'", "'unowned'", "'unsafe'", "'watchOS'", 
		"'weak'", "'x86_64'", "'Any'", "'Protocol'", "'as'", "'associatedtype'", 
		"'catch'", "'defer'", "'deinit'", "'do'", "'extension'", "'fallthrough'", 
		"'false'", "'guard'", "'is'", "'nil'", "'subscript'", "'super'", "'throw'", 
		"'true'", "'try'", null, "'.'", "'{'", "'('", "'['", "'}'", "')'", "']'", 
		"','", "':'", "';'", "'<'", "'>'", "'_'", "'!'", "'?'", "'@'", "'&'", 
		"'-'", "'='", "'|'", "'/'", "'+'", "'*'", "'%'", "'^'", "'~'"
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
		null, null, "Identifier", "DOT", "LCURLY", "LPAREN", "LBRACK", "RCURLY", 
		"RPAREN", "RBRACK", "COMMA", "COLON", "SEMI", "LT", "GT", "UNDERSCORE", 
		"BANG", "QUESTION", "AT", "AND", "SUB", "EQUAL", "OR", "DIV", "ADD", "MUL", 
		"MOD", "CARET", "TILDE", "Implicit_parameter_name", "Binary_literal", 
		"Decimal_literal", "Pure_decimal_digits", "Floating_point_literal", "Static_string_literal", 
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(346);
				statements();
				}
				break;
			}
			setState(349);
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
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
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
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				expression();
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(352);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				declaration();
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(356);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				loop_statement();
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(360);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				branch_statement();
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(364);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				labeled_statement();
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(368);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				control_transfer_statement();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(372);
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
			setState(377);
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
			setState(379);
			if (!(SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore))) throw new FailedPredicateException(this, "SwiftSupport.isSeparatedStatement(_input, $indexBefore)");
			setState(380);
			statement();
			((Statements_implContext)_localctx).indexAfter =  _input.index();
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(382);
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
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				repeat_while_statement();
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
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(T__0);
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(392);
					for_init();
					}
					break;
				}
				setState(395);
				match(SEMI);
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(396);
					expression();
					}
					break;
				}
				setState(399);
				match(SEMI);
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(400);
					expression();
					}
					break;
				}
				setState(403);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(T__0);
				setState(405);
				match(LPAREN);
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(406);
					for_init();
					}
					break;
				}
				setState(409);
				match(SEMI);
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(410);
					expression();
					}
					break;
				}
				setState(413);
				match(SEMI);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(414);
					expression();
					}
					break;
				}
				setState(417);
				match(RPAREN);
				setState(418);
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
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
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

	public static class For_in_statementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__0);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(426);
				match(T__1);
				}
				break;
			}
			setState(429);
			pattern();
			setState(430);
			match(T__2);
			setState(431);
			expression();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(432);
				where_clause();
				}
			}

			setState(435);
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
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__3);
			setState(438);
			condition_list();
			setState(439);
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
		enterRule(_localctx, 18, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			condition();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442);
				match(COMMA);
				setState(443);
				condition();
				}
				}
				setState(448);
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
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				case_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
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
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__1);
			setState(455);
			pattern();
			setState(456);
			initializer();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(457);
				where_clause();
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
		enterRule(_localctx, 24, RULE_optional_binding_condition);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(T__4);
				setState(461);
				pattern();
				setState(462);
				initializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(T__5);
				setState(465);
				pattern();
				setState(466);
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
		enterRule(_localctx, 26, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__6);
			setState(471);
			code_block();
			setState(472);
			match(T__3);
			setState(473);
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
		enterRule(_localctx, 28, RULE_branch_statement);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
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
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__7);
			setState(480);
			condition_list();
			setState(481);
			code_block();
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(482);
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
		enterRule(_localctx, 32, RULE_else_clause);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(T__8);
				setState(486);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(T__8);
				setState(488);
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
		enterRule(_localctx, 34, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__9);
			setState(492);
			expression();
			setState(493);
			match(LCURLY);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__10) {
				{
				setState(494);
				switch_cases();
				}
			}

			setState(497);
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
		enterRule(_localctx, 36, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			switch_case();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__10) {
				{
				setState(500);
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
		enterRule(_localctx, 38, RULE_switch_case);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				case_label();
				setState(504);
				statements();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				default_label();
				setState(507);
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
		enterRule(_localctx, 40, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__1);
			setState(512);
			case_item_list();
			setState(513);
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
		enterRule(_localctx, 42, RULE_case_item_list);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				pattern();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(516);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				pattern();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(520);
					where_clause();
					}
				}

				setState(523);
				match(COMMA);
				setState(524);
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
		enterRule(_localctx, 44, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(T__10);
			setState(529);
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
		enterRule(_localctx, 46, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T__11);
			setState(532);
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
		enterRule(_localctx, 48, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_labeled_statement);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				statement_label();
				setState(537);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				statement_label();
				setState(540);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				statement_label();
				setState(543);
				switch_statement();
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

	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			label_name();
			setState(548);
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

	public static class Label_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		enterRule(_localctx, 56, RULE_control_transfer_statement);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				break_statement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				continue_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
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
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(T__12);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(558);
				label_name();
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

	public static class Continue_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__13);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(562);
				label_name();
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
		enterRule(_localctx, 62, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__14);
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(566);
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

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generic_parameter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LT);
			setState(570);
			generic_parameter_list();
			setState(571);
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

	public static class Generic_parameter_listContext extends ParserRuleContext {
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
		}
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_generic_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			generic_parameter();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(574);
				match(COMMA);
				setState(575);
				generic_parameter();
				}
				}
				setState(580);
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

	public static class Generic_parameterContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_generic_parameter);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				type_name();
				setState(583);
				match(COLON);
				setState(584);
				type_identifier();
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

	public static class Generic_where_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Generic_where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_where_clause; }
	}

	public final Generic_where_clauseContext generic_where_clause() throws RecognitionException {
		Generic_where_clauseContext _localctx = new Generic_where_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_generic_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__11);
			setState(589);
			requirement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_listContext extends ParserRuleContext {
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_requirement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			requirement();
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(592);
					match(COMMA);
					setState(593);
					requirement();
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_requirement);
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				same_type_requirement();
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

	public static class Conformance_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conformance_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			type_identifier();
			setState(604);
			match(COLON);
			setState(605);
			type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_requirementContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Same_type_equalsContext same_type_equals() {
			return getRuleContext(Same_type_equalsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			type_identifier();
			setState(608);
			same_type_equals();
			setState(609);
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

	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(LT);
			setState(612);
			generic_argument_list();
			setState(613);
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

	public static class Generic_argument_listContext extends ParserRuleContext {
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
		}
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			generic_argument();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(616);
				match(COMMA);
				setState(617);
				generic_argument();
				}
				}
				setState(622);
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

	public static class Generic_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Precedence_group_declarationContext precedence_group_declaration() {
			return getRuleContext(Precedence_group_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declaration);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				function_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(629);
				struct_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(630);
				class_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(631);
				operator_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(632);
				precedence_group_declaration();
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
		enterRule(_localctx, 88, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(635);
				declaration();
				}
				}
				setState(638); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || _la==AT );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(640);
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
		enterRule(_localctx, 92, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(LCURLY);
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(644);
				statements();
				}
				break;
			}
			setState(647);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 94, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(649);
				attributes();
				}
			}

			setState(652);
			match(T__15);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(653);
				import_kind();
				}
			}

			setState(656);
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
		enterRule(_localctx, 96, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 98, RULE_import_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			import_path_identifier();
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					match(DOT);
					setState(662);
					import_path_identifier();
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 100, RULE_import_path_identifier);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
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
			case T__49:
			case T__50:
			case T__51:
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
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
				setState(669);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 102, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(672);
				attributes();
				}
			}

			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
				{
				setState(675);
				declaration_modifiers();
				}
			}

			setState(678);
			match(T__4);
			setState(679);
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
		enterRule(_localctx, 104, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			pattern_initializer();
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					match(COMMA);
					setState(683);
					pattern_initializer();
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 106, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			pattern();
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(690);
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
		enterRule(_localctx, 108, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			assignment_operator();
			setState(694);
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
		enterRule(_localctx, 110, RULE_variable_declaration);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				variable_declaration_head();
				setState(697);
				variable_name();
				setState(698);
				type_annotation();
				setState(699);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				variable_declaration_head();
				setState(702);
				variable_name();
				setState(703);
				type_annotation();
				setState(704);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				variable_declaration_head();
				setState(707);
				variable_name();
				setState(708);
				type_annotation();
				setState(709);
				getter_setter_keyword_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				variable_declaration_head();
				setState(712);
				variable_name();
				setState(713);
				type_annotation();
				setState(715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(714);
					initializer();
					}
					break;
				}
				setState(717);
				willSet_didSet_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(719);
				variable_declaration_head();
				setState(720);
				variable_name();
				setState(721);
				type_annotation();
				setState(722);
				type_annotation();
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(723);
					initializer();
					}
					break;
				}
				setState(726);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(728);
				variable_declaration_head();
				setState(729);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(733);
				attributes();
				}
			}

			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
				{
				setState(736);
				declaration_modifiers();
				}
			}

			setState(739);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
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
		enterRule(_localctx, 116, RULE_getter_setter_block);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				match(LCURLY);
				setState(744);
				getter_clause();
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__50) | (1L << T__51))) != 0) || _la==AT) {
					{
					setState(745);
					setter_clause();
					}
				}

				setState(748);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				match(LCURLY);
				setState(751);
				setter_clause();
				setState(752);
				getter_clause();
				setState(753);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 118, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(757);
				attributes();
				}
			}

			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50 || _la==T__51) {
				{
				setState(760);
				mutation_modifier();
				}
			}

			setState(763);
			match(T__22);
			setState(764);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 120, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(766);
				attributes();
				}
			}

			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50 || _la==T__51) {
				{
				setState(769);
				mutation_modifier();
				}
			}

			setState(772);
			match(T__23);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(773);
				setter_name();
				}
			}

			setState(776);
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
		enterRule(_localctx, 122, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(LPAREN);
			setState(779);
			declaration_identifier();
			setState(780);
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
		enterRule(_localctx, 124, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(LCURLY);
				setState(783);
				getter_keyword_clause();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__50) | (1L << T__51))) != 0) || _la==AT) {
					{
					setState(784);
					setter_keyword_clause();
					}
				}

				setState(787);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(LCURLY);
				setState(790);
				setter_keyword_clause();
				setState(791);
				getter_keyword_clause();
				setState(792);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(796);
				attributes();
				}
			}

			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50 || _la==T__51) {
				{
				setState(799);
				mutation_modifier();
				}
			}

			setState(802);
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

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
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
		enterRule(_localctx, 128, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(804);
				attributes();
				}
			}

			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50 || _la==T__51) {
				{
				setState(807);
				mutation_modifier();
				}
			}

			setState(810);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(LCURLY);
				setState(813);
				willSet_clause();
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25 || _la==AT) {
					{
					setState(814);
					didSet_clause();
					}
				}

				setState(817);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(LCURLY);
				setState(820);
				didSet_clause();
				setState(821);
				willSet_clause();
				setState(822);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 132, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(826);
				attributes();
				}
			}

			setState(829);
			match(T__24);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(830);
				setter_name();
				}
			}

			setState(833);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 134, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(835);
				attributes();
				}
			}

			setState(838);
			match(T__25);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(839);
				setter_name();
				}
			}

			setState(842);
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
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
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
		enterRule(_localctx, 136, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			function_head();
			setState(845);
			function_name();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(846);
				generic_parameter_clause();
				}
			}

			setState(849);
			function_signature();
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(850);
				generic_where_clause();
				}
				break;
			}
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(853);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(856);
				attributes();
				}
			}

			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
				{
				setState(859);
				declaration_modifiers();
				}
			}

			setState(862);
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
		enterRule(_localctx, 140, RULE_function_name);
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
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
			case T__49:
			case T__50:
			case T__51:
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
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
				setState(865);
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
		enterRule(_localctx, 142, RULE_function_signature);
		try {
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				parameter_clause();
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(869);
					match(T__26);
					}
					break;
				}
				setState(873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(872);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				parameter_clause();
				setState(876);
				match(T__27);
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(877);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			arrow_operator();
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(883);
				attributes();
				}
				break;
			}
			setState(886);
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
		enterRule(_localctx, 146, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
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
		enterRule(_localctx, 148, RULE_parameter_clause);
		try {
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(LPAREN);
				setState(891);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(LPAREN);
				setState(893);
				parameter_list();
				setState(894);
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
		enterRule(_localctx, 150, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			parameter();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(899);
				match(COMMA);
				setState(900);
				parameter();
				}
				}
				setState(905);
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
		enterRule(_localctx, 152, RULE_parameter);
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(906);
					external_parameter_name();
					}
					break;
				}
				setState(909);
				local_parameter_name();
				setState(910);
				type_annotation();
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(911);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(914);
					external_parameter_name();
					}
					break;
				}
				setState(917);
				local_parameter_name();
				setState(918);
				type_annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(920);
					external_parameter_name();
					}
					break;
				}
				setState(923);
				local_parameter_name();
				setState(924);
				type_annotation();
				setState(925);
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
		enterRule(_localctx, 154, RULE_external_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
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
		enterRule(_localctx, 156, RULE_local_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
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
		enterRule(_localctx, 158, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			assignment_operator();
			setState(934);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(936);
				attributes();
				}
			}

			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
				{
				setState(939);
				access_level_modifier();
				}
			}

			setState(942);
			match(T__17);
			setState(943);
			struct_name();
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(944);
				generic_parameter_clause();
				}
			}

			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(947);
				generic_where_clause();
				}
			}

			setState(950);
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
		enterRule(_localctx, 162, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
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
		enterRule(_localctx, 164, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(LCURLY);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || _la==AT) {
				{
				{
				setState(955);
				struct_member();
				}
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(961);
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
		enterRule(_localctx, 166, RULE_struct_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<Access_level_modifierContext> access_level_modifier() {
			return getRuleContexts(Access_level_modifierContext.class);
		}
		public Access_level_modifierContext access_level_modifier(int i) {
			return getRuleContext(Access_level_modifierContext.class,i);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_class_declaration);
		int _la;
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(965);
					attributes();
					}
				}

				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
					{
					setState(968);
					access_level_modifier();
					}
				}

				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(971);
					match(T__28);
					}
				}

				setState(974);
				match(T__18);
				setState(975);
				class_name();
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(976);
					generic_parameter_clause();
					}
				}

				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(979);
					generic_where_clause();
					}
				}

				setState(982);
				class_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(984);
					attributes();
					}
				}

				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
					{
					setState(987);
					access_level_modifier();
					}
				}

				setState(990);
				match(T__28);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) {
					{
					setState(991);
					access_level_modifier();
					}
				}

				setState(994);
				match(T__18);
				setState(995);
				class_name();
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(996);
					generic_parameter_clause();
					}
				}

				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(999);
					generic_where_clause();
					}
				}

				setState(1002);
				class_body();
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

	public static class Class_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(LCURLY);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || _la==AT) {
				{
				{
				setState(1009);
				class_member();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
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

	public static class Class_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_class_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
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
		enterRule(_localctx, 176, RULE_operator_declaration);
		try {
			setState(1022);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				prefix_operator_declaration();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				postfix_operator_declaration();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(1021);
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
		enterRule(_localctx, 178, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(T__29);
			setState(1025);
			match(T__30);
			setState(1026);
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
		enterRule(_localctx, 180, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(T__31);
			setState(1029);
			match(T__30);
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

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Infix_operator_groupContext infix_operator_group() {
			return getRuleContext(Infix_operator_groupContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(T__32);
			setState(1033);
			match(T__30);
			setState(1034);
			operator();
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1035);
				infix_operator_group();
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

	public static class Infix_operator_groupContext extends ParserRuleContext {
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public Infix_operator_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_group; }
	}

	public final Infix_operator_groupContext infix_operator_group() throws RecognitionException {
		Infix_operator_groupContext _localctx = new Infix_operator_groupContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_infix_operator_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(COLON);
			setState(1039);
			precedence_group_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_declarationContext extends ParserRuleContext {
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public List<Precedence_group_attributeContext> precedence_group_attribute() {
			return getRuleContexts(Precedence_group_attributeContext.class);
		}
		public Precedence_group_attributeContext precedence_group_attribute(int i) {
			return getRuleContext(Precedence_group_attributeContext.class,i);
		}
		public Precedence_group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_declaration; }
	}

	public final Precedence_group_declarationContext precedence_group_declaration() throws RecognitionException {
		Precedence_group_declarationContext _localctx = new Precedence_group_declarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_precedence_group_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(T__33);
			setState(1042);
			precedence_group_name();
			setState(1043);
			match(LCURLY);
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				{
				setState(1044);
				precedence_group_attribute();
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050);
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

	public static class Precedence_group_attributeContext extends ParserRuleContext {
		public Precedence_group_relationContext precedence_group_relation() {
			return getRuleContext(Precedence_group_relationContext.class,0);
		}
		public Precedence_group_assignmentContext precedence_group_assignment() {
			return getRuleContext(Precedence_group_assignmentContext.class,0);
		}
		public Precedence_group_associativityContext precedence_group_associativity() {
			return getRuleContext(Precedence_group_associativityContext.class,0);
		}
		public Precedence_group_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_attribute; }
	}

	public final Precedence_group_attributeContext precedence_group_attribute() throws RecognitionException {
		Precedence_group_attributeContext _localctx = new Precedence_group_attributeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_precedence_group_attribute);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				precedence_group_relation();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				precedence_group_assignment();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(1054);
				precedence_group_associativity();
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

	public static class Precedence_group_relationContext extends ParserRuleContext {
		public Precedence_group_namesContext precedence_group_names() {
			return getRuleContext(Precedence_group_namesContext.class,0);
		}
		public Precedence_group_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_relation; }
	}

	public final Precedence_group_relationContext precedence_group_relation() throws RecognitionException {
		Precedence_group_relationContext _localctx = new Precedence_group_relationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_precedence_group_relation);
		try {
			setState(1063);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				match(T__34);
				setState(1058);
				match(COLON);
				setState(1059);
				precedence_group_names();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				match(T__35);
				setState(1061);
				match(COLON);
				setState(1062);
				precedence_group_names();
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

	public static class Precedence_group_assignmentContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Precedence_group_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_assignment; }
	}

	public final Precedence_group_assignmentContext precedence_group_assignment() throws RecognitionException {
		Precedence_group_assignmentContext _localctx = new Precedence_group_assignmentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_precedence_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(T__36);
			setState(1066);
			match(COLON);
			setState(1067);
			boolean_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_associativityContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public Precedence_group_associativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_associativity; }
	}

	public final Precedence_group_associativityContext precedence_group_associativity() throws RecognitionException {
		Precedence_group_associativityContext _localctx = new Precedence_group_associativityContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_precedence_group_associativity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(T__37);
			setState(1070);
			match(COLON);
			setState(1071);
			associativity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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

	public static class Precedence_group_namesContext extends ParserRuleContext {
		public List<Precedence_group_nameContext> precedence_group_name() {
			return getRuleContexts(Precedence_group_nameContext.class);
		}
		public Precedence_group_nameContext precedence_group_name(int i) {
			return getRuleContext(Precedence_group_nameContext.class,i);
		}
		public Precedence_group_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_names; }
	}

	public final Precedence_group_namesContext precedence_group_names() throws RecognitionException {
		Precedence_group_namesContext _localctx = new Precedence_group_namesContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_precedence_group_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			precedence_group_name();
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1076);
				match(COMMA);
				setState(1077);
				precedence_group_name();
				}
				}
				setState(1082);
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

	public static class Precedence_group_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Precedence_group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_name; }
	}

	public final Precedence_group_nameContext precedence_group_name() throws RecognitionException {
		Precedence_group_nameContext _localctx = new Precedence_group_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_precedence_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
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
		enterRule(_localctx, 202, RULE_declaration_modifier);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(T__18);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(1087);
				match(T__42);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(1088);
				match(T__31);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(1089);
				match(T__29);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 6);
				{
				setState(1090);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 7);
				{
				setState(1091);
				match(T__44);
				}
				break;
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				enterOuterAlt(_localctx, 8);
				{
				setState(1092);
				access_level_modifier();
				}
				break;
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 9);
				{
				setState(1093);
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
		enterRule(_localctx, 204, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1096);
				declaration_modifier();
				}
				}
				setState(1099); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 206, RULE_access_level_modifier);
		try {
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				match(T__45);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(T__45);
				setState(1103);
				match(LPAREN);
				setState(1104);
				match(T__23);
				setState(1105);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1106);
				match(T__46);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1107);
				match(T__46);
				setState(1108);
				match(LPAREN);
				setState(1109);
				match(T__23);
				setState(1110);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1111);
				match(T__47);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1112);
				match(T__47);
				setState(1113);
				match(LPAREN);
				setState(1114);
				match(T__23);
				setState(1115);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1116);
				match(T__48);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1117);
				match(T__48);
				setState(1118);
				match(LPAREN);
				setState(1119);
				match(T__23);
				setState(1120);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1121);
				match(T__49);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1122);
				match(T__49);
				setState(1123);
				match(LPAREN);
				setState(1124);
				match(T__23);
				setState(1125);
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
		enterRule(_localctx, 208, RULE_mutation_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
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
		enterRule(_localctx, 210, RULE_pattern);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				identifier_pattern();
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1131);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				value_binding_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1135);
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
		enterRule(_localctx, 212, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
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
		enterRule(_localctx, 214, RULE_value_binding_pattern);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(T__5);
				setState(1141);
				pattern();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				match(T__4);
				setState(1143);
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
		enterRule(_localctx, 216, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
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

	public static class AttributeContext extends ParserRuleContext {
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(AT);
			setState(1149);
			attribute_name();
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1150);
				attribute_argument_clause();
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

	public static class Attribute_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
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

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(LPAREN);
			setState(1156);
			balanced_tokens();
			setState(1157);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1159);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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

	public static class Balanced_tokensContext extends ParserRuleContext {
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1164);
					balanced_token();
					}
					} 
				}
				setState(1169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class Balanced_tokenContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Any_punctuation_for_balanced_tokenContext any_punctuation_for_balanced_token() {
			return getRuleContext(Any_punctuation_for_balanced_tokenContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_balanced_token);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1170);
				match(LPAREN);
				setState(1171);
				balanced_tokens();
				setState(1172);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				match(LBRACK);
				setState(1175);
				balanced_tokens();
				setState(1176);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
				match(LCURLY);
				setState(1179);
				balanced_tokens();
				setState(1180);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1182);
				label_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1183);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1184);
				operator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1185);
				any_punctuation_for_balanced_token();
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

	public static class Any_punctuation_for_balanced_tokenContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public Any_punctuation_for_balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_punctuation_for_balanced_token; }
	}

	public final Any_punctuation_for_balanced_tokenContext any_punctuation_for_balanced_token() throws RecognitionException {
		Any_punctuation_for_balanced_tokenContext _localctx = new Any_punctuation_for_balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_any_punctuation_for_balanced_token);
		int _la;
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53 || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DOT - 111)) | (1L << (COMMA - 111)) | (1L << (COLON - 111)) | (1L << (SEMI - 111)) | (1L << (QUESTION - 111)) | (1L << (AT - 111)) | (1L << (EQUAL - 111)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1189);
				arrow_operator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1190);
				if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
				setState(1191);
				match(AND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
				setState(1193);
				match(BANG);
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
		enterRule(_localctx, 232, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			prefix_expression();
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1197);
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
		enterRule(_localctx, 234, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			expression();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1201);
				match(COMMA);
				setState(1202);
				expression();
				}
				}
				setState(1207);
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
		enterRule(_localctx, 236, RULE_prefix_expression);
		try {
			setState(1213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				prefix_operator();
				setState(1209);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1212);
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
		enterRule(_localctx, 238, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(AND);
			setState(1216);
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
		enterRule(_localctx, 240, RULE_binary_expression);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				binary_operator();
				setState(1219);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				assignment_operator();
				setState(1222);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1224);
				conditional_operator();
				setState(1225);
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
		enterRule(_localctx, 242, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1229);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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
		enterRule(_localctx, 244, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(QUESTION);
			setState(1235);
			expression();
			setState(1236);
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
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Implicit_member_expressionContext implicit_member_expression() {
			return getRuleContext(Implicit_member_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_primary_expression);
		try {
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				declaration_identifier();
				setState(1240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1239);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1243);
				self_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1244);
				parenthesized_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1245);
				implicit_member_expression();
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
		enterRule(_localctx, 248, RULE_literal_expression);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
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
		enterRule(_localctx, 250, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(LBRACK);
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1253);
				array_literal_items();
				}
				break;
			}
			setState(1256);
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
		enterRule(_localctx, 252, RULE_array_literal_items);
		int _la;
		try {
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				array_literal_item();
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1259);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				array_literal_item();
				setState(1263);
				match(COMMA);
				setState(1264);
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
		enterRule(_localctx, 254, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
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

	public static class Self_expressionContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_self_expression);
		try {
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270);
				match(T__54);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				match(T__54);
				setState(1272);
				match(DOT);
				setState(1273);
				declaration_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1274);
				match(T__54);
				setState(1275);
				match(LBRACK);
				setState(1276);
				expression_list();
				setState(1277);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1279);
				match(T__54);
				setState(1280);
				match(DOT);
				setState(1281);
				match(T__55);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1282);
				match(T__56);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1283);
				match(T__56);
				setState(1284);
				match(DOT);
				setState(1285);
				declaration_identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1286);
				match(T__56);
				setState(1287);
				match(DOT);
				setState(1288);
				match(T__55);
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

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(DOT);
			setState(1292);
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
		enterRule(_localctx, 260, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(LPAREN);
			setState(1295);
			expression();
			setState(1296);
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
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
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
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_postfix_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1299);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1344);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_operationContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1301);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1302);
						postfix_operator();
						}
						break;
					case 2:
						{
						_localctx = new Function_call_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1303);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1304);
						function_call_argument_clause();
						}
						break;
					case 3:
						{
						_localctx = new Initializer_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1305);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1306);
						match(DOT);
						setState(1307);
						match(T__55);
						}
						break;
					case 4:
						{
						_localctx = new Initializer_expression_with_argsContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1308);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1309);
						match(DOT);
						setState(1310);
						match(T__55);
						setState(1311);
						match(LPAREN);
						setState(1312);
						argument_names();
						setState(1313);
						match(RPAREN);
						}
						break;
					case 5:
						{
						_localctx = new Explicit_member_expression1Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1315);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1316);
						match(DOT);
						setState(1317);
						match(Pure_decimal_digits);
						}
						break;
					case 6:
						{
						_localctx = new Explicit_member_expression2Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1318);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1319);
						match(DOT);
						setState(1320);
						declaration_identifier();
						setState(1322);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
						case 1:
							{
							setState(1321);
							generic_argument_clause();
							}
							break;
						}
						}
						break;
					case 7:
						{
						_localctx = new Explicit_member_expression3Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1324);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1325);
						match(DOT);
						setState(1326);
						declaration_identifier();
						setState(1327);
						match(LPAREN);
						setState(1328);
						argument_names();
						setState(1329);
						match(RPAREN);
						}
						break;
					case 8:
						{
						_localctx = new Explicit_member_expression4Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1331);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1332);
						match(LPAREN);
						setState(1333);
						argument_names();
						setState(1334);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new Postfix_self_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1336);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1337);
						match(DOT);
						setState(1338);
						match(T__54);
						}
						break;
					case 10:
						{
						_localctx = new Subscript_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1339);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1340);
						match(LBRACK);
						setState(1341);
						expression_list();
						setState(1342);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(1348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
		enterRule(_localctx, 264, RULE_function_call_argument_clause);
		try {
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				match(LPAREN);
				setState(1350);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				match(LPAREN);
				setState(1352);
				function_call_argument_list();
				setState(1353);
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
		enterRule(_localctx, 266, RULE_function_call_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			function_call_argument();
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1358);
				match(COMMA);
				setState(1359);
				function_call_argument();
				}
				}
				setState(1364);
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
		enterRule(_localctx, 268, RULE_function_call_argument);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				label_identifier();
				setState(1367);
				match(COLON);
				setState(1368);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				operator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1371);
				label_identifier();
				setState(1372);
				match(COLON);
				setState(1373);
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
		enterRule(_localctx, 270, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			argument_name();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(1378);
				argument_name();
				}
				}
				setState(1383);
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
		enterRule(_localctx, 272, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			label_identifier();
			setState(1385);
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
	public static class The_self_typeContext extends TypeContext {
		public The_self_typeContext(TypeContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 274, RULE_type);
		try {
			setState(1391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new The_array_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				array_type();
				}
				break;
			case LPAREN:
			case AT:
				_localctx = new The_function_typeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				function_type();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
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
			case T__49:
			case T__50:
			case T__51:
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
			case Identifier:
				_localctx = new The_type_identifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				type_identifier();
				}
				break;
			case T__56:
				_localctx = new The_self_typeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1390);
				match(T__56);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(COLON);
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1394);
				attributes();
				}
				break;
			}
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(1397);
				match(T__57);
				}
			}

			setState(1400);
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
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
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
		enterRule(_localctx, 278, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			type_name();
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1403);
				generic_argument_clause();
				}
				break;
			}
			setState(1408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1406);
				match(DOT);
				setState(1407);
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
		enterRule(_localctx, 280, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_function_type);
		int _la;
		try {
			setState(1430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1412);
					attributes();
					}
				}

				setState(1415);
				function_type_argument_clause();
				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1416);
					match(T__26);
					}
					break;
				}
				setState(1419);
				arrow_operator();
				setState(1420);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1422);
					attributes();
					}
				}

				setState(1425);
				function_type_argument_clause();
				setState(1426);
				match(T__27);
				setState(1427);
				arrow_operator();
				setState(1428);
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
		enterRule(_localctx, 284, RULE_function_type_argument_clause);
		try {
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				match(LPAREN);
				setState(1433);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				match(LPAREN);
				setState(1435);
				function_type_argument_list();
				setState(1437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1436);
					range_operator();
					}
					break;
				}
				setState(1439);
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
		enterRule(_localctx, 286, RULE_function_type_argument_list);
		try {
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				function_type_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1444);
				function_type_argument();
				setState(1445);
				match(COMMA);
				setState(1446);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 288, RULE_function_type_argument);
		int _la;
		try {
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1450);
					attributes();
					}
					break;
				}
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__57) {
					{
					setState(1453);
					match(T__57);
					}
				}

				setState(1456);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				argument_label();
				setState(1458);
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
		enterRule(_localctx, 290, RULE_argument_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
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
		enterRule(_localctx, 292, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(LBRACK);
			setState(1465);
			type();
			setState(1466);
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
		enterRule(_localctx, 294, RULE_declaration_identifier);
		try {
			setState(1470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				match(Identifier);
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
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
			case T__49:
			case T__50:
			case T__51:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
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
		enterRule(_localctx, 296, RULE_label_identifier);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				match(Identifier);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
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
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__54:
			case T__55:
			case T__56:
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
			case T__107:
			case T__108:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
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
		enterRule(_localctx, 298, RULE_keyword_as_identifier_in_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)))) != 0)) ) {
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
		enterRule(_localctx, 300, RULE_keyword_as_identifier_in_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)))) != 0)) ) {
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
		enterRule(_localctx, 302, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(1481);
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
		enterRule(_localctx, 304, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(1484);
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
		enterRule(_localctx, 306, RULE_compilation_condition_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(1487);
			match(AND);
			setState(1488);
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
		enterRule(_localctx, 308, RULE_compilation_condition_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(1491);
			match(OR);
			setState(1492);
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
		enterRule(_localctx, 310, RULE_compilation_condition_GE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			if (!(SwiftSupport.isOperator(_input,">="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\">=\")");
			setState(1495);
			match(GT);
			setState(1496);
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
		enterRule(_localctx, 312, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(1499);
			match(SUB);
			setState(1500);
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
		enterRule(_localctx, 314, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(1503);
			match(DOT);
			setState(1504);
			match(DOT);
			setState(1505);
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
		enterRule(_localctx, 316, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(1508);
			match(EQUAL);
			setState(1509);
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
		enterRule(_localctx, 318, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(1512);
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
		enterRule(_localctx, 320, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(1515);
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
		enterRule(_localctx, 322, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(1518);
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
		enterRule(_localctx, 324, RULE_operator);
		try {
			int _alt;
			setState(1536);
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
				setState(1520);
				operator_head();
				setState(1525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1521);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(1522);
						operator_character();
						}
						} 
					}
					setState(1527);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				dot_operator_head();
				setState(1533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1529);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(1530);
						dot_operator_character();
						}
						} 
					}
					setState(1535);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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
		enterRule(_localctx, 326, RULE_operator_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
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
		enterRule(_localctx, 328, RULE_operator_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (LT - 121)) | (1L << (GT - 121)) | (1L << (BANG - 121)) | (1L << (QUESTION - 121)) | (1L << (AND - 121)) | (1L << (SUB - 121)) | (1L << (EQUAL - 121)) | (1L << (OR - 121)) | (1L << (DIV - 121)) | (1L << (ADD - 121)) | (1L << (MUL - 121)) | (1L << (MOD - 121)) | (1L << (CARET - 121)) | (1L << (TILDE - 121)))) != 0)) ) {
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
		enterRule(_localctx, 330, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
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
		enterRule(_localctx, 332, RULE_dot_operator_character);
		try {
			setState(1546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1544);
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
				setState(1545);
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
		enterRule(_localctx, 334, RULE_literal);
		try {
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1550);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1551);
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
		enterRule(_localctx, 336, RULE_numeric_literal);
		try {
			setState(1562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1554);
					negate_prefix_operator();
					}
					break;
				}
				setState(1557);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1558);
					negate_prefix_operator();
					}
					break;
				}
				setState(1561);
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
		enterRule(_localctx, 338, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_la = _input.LA(1);
			if ( !(_la==T__100 || _la==T__107) ) {
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
		enterRule(_localctx, 340, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(T__103);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 342, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (Binary_literal - 138)) | (1L << (Decimal_literal - 138)) | (1L << (Pure_decimal_digits - 138)))) != 0)) ) {
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
		enterRule(_localctx, 344, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
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
		case 115:
			return any_punctuation_for_balanced_token_sempred((Any_punctuation_for_balanced_tokenContext)_localctx, predIndex);
		case 131:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 151:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 152:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 153:
			return compilation_condition_AND_sempred((Compilation_condition_ANDContext)_localctx, predIndex);
		case 154:
			return compilation_condition_OR_sempred((Compilation_condition_ORContext)_localctx, predIndex);
		case 155:
			return compilation_condition_GE_sempred((Compilation_condition_GEContext)_localctx, predIndex);
		case 156:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 157:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 158:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 159:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 160:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 161:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 162:
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
	private boolean any_punctuation_for_balanced_token_sempred(Any_punctuation_for_balanced_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return SwiftSupport.isPrefixOp(_input);
		case 2:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean compilation_condition_AND_sempred(Compilation_condition_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean compilation_condition_OR_sempred(Compilation_condition_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean compilation_condition_GE_sempred(Compilation_condition_GEContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SwiftSupport.isOperator(_input,">=");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return _input.get(_input.index()-1).getType()!=WS;
		case 25:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0094\u0627\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\3\2\5\2\u015e\n\2\3\2\3\2\3\3\3\3\5\3\u0164\n\3\3\3\3"+
		"\3\5\3\u0168\n\3\3\3\3\3\5\3\u016c\n\3\3\3\3\3\5\3\u0170\n\3\3\3\3\3\5"+
		"\3\u0174\n\3\3\3\3\3\5\3\u0178\n\3\5\3\u017a\n\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\5\5\u0182\n\5\3\6\3\6\3\6\3\6\5\6\u0188\n\6\3\7\3\7\5\7\u018c\n\7\3"+
		"\7\3\7\5\7\u0190\n\7\3\7\3\7\5\7\u0194\n\7\3\7\3\7\3\7\3\7\5\7\u019a\n"+
		"\7\3\7\3\7\5\7\u019e\n\7\3\7\3\7\5\7\u01a2\n\7\3\7\3\7\5\7\u01a6\n\7\3"+
		"\b\3\b\5\b\u01aa\n\b\3\t\3\t\5\t\u01ae\n\t\3\t\3\t\3\t\3\t\5\t\u01b4\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u01bf\n\13\f\13\16\13\u01c2"+
		"\13\13\3\f\3\f\3\f\5\f\u01c7\n\f\3\r\3\r\3\r\3\r\5\r\u01cd\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01d7\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\5\20\u01e0\n\20\3\21\3\21\3\21\3\21\5\21\u01e6\n\21\3"+
		"\22\3\22\3\22\3\22\5\22\u01ec\n\22\3\23\3\23\3\23\3\23\5\23\u01f2\n\23"+
		"\3\23\3\23\3\24\3\24\5\24\u01f8\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0200\n\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u0208\n\27\3\27\3\27\5"+
		"\27\u020c\n\27\3\27\3\27\3\27\5\27\u0211\n\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0224"+
		"\n\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u022e\n\36\3\37\3\37"+
		"\5\37\u0232\n\37\3 \3 \5 \u0236\n \3!\3!\5!\u023a\n!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\7#\u0243\n#\f#\16#\u0246\13#\3$\3$\3$\3$\3$\5$\u024d\n$\3%\3%"+
		"\3%\3&\3&\3&\7&\u0255\n&\f&\16&\u0258\13&\3\'\3\'\5\'\u025c\n\'\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\7+\u026d\n+\f+\16+\u0270\13+\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u027c\n-\3.\6.\u027f\n.\r.\16.\u0280\3"+
		"/\5/\u0284\n/\3\60\3\60\5\60\u0288\n\60\3\60\3\60\3\61\5\61\u028d\n\61"+
		"\3\61\3\61\5\61\u0291\n\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\7\63\u029a"+
		"\n\63\f\63\16\63\u029d\13\63\3\64\3\64\5\64\u02a1\n\64\3\65\5\65\u02a4"+
		"\n\65\3\65\5\65\u02a7\n\65\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u02af\n"+
		"\66\f\66\16\66\u02b2\13\66\3\67\3\67\5\67\u02b6\n\67\38\38\38\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u02ce\n9\39\39\3"+
		"9\39\39\39\39\59\u02d7\n9\39\39\39\39\39\59\u02de\n9\3:\5:\u02e1\n:\3"+
		":\5:\u02e4\n:\3:\3:\3;\3;\3<\3<\3<\5<\u02ed\n<\3<\3<\3<\3<\3<\3<\3<\5"+
		"<\u02f6\n<\3=\5=\u02f9\n=\3=\5=\u02fc\n=\3=\3=\3=\3>\5>\u0302\n>\3>\5"+
		">\u0305\n>\3>\3>\5>\u0309\n>\3>\3>\3?\3?\3?\3?\3@\3@\3@\5@\u0314\n@\3"+
		"@\3@\3@\3@\3@\3@\3@\5@\u031d\n@\3A\5A\u0320\nA\3A\5A\u0323\nA\3A\3A\3"+
		"B\5B\u0328\nB\3B\5B\u032b\nB\3B\3B\3C\3C\3C\5C\u0332\nC\3C\3C\3C\3C\3"+
		"C\3C\3C\5C\u033b\nC\3D\5D\u033e\nD\3D\3D\5D\u0342\nD\3D\3D\3E\5E\u0347"+
		"\nE\3E\3E\5E\u034b\nE\3E\3E\3F\3F\3F\5F\u0352\nF\3F\3F\5F\u0356\nF\3F"+
		"\5F\u0359\nF\3G\5G\u035c\nG\3G\5G\u035f\nG\3G\3G\3H\3H\5H\u0365\nH\3I"+
		"\3I\5I\u0369\nI\3I\5I\u036c\nI\3I\3I\3I\5I\u0371\nI\5I\u0373\nI\3J\3J"+
		"\5J\u0377\nJ\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\5L\u0383\nL\3M\3M\3M\7M\u0388"+
		"\nM\fM\16M\u038b\13M\3N\5N\u038e\nN\3N\3N\3N\5N\u0393\nN\3N\5N\u0396\n"+
		"N\3N\3N\3N\3N\5N\u039c\nN\3N\3N\3N\3N\5N\u03a2\nN\3O\3O\3P\3P\3Q\3Q\3"+
		"Q\3R\5R\u03ac\nR\3R\5R\u03af\nR\3R\3R\3R\5R\u03b4\nR\3R\5R\u03b7\nR\3"+
		"R\3R\3S\3S\3T\3T\7T\u03bf\nT\fT\16T\u03c2\13T\3T\3T\3U\3U\3V\5V\u03c9"+
		"\nV\3V\5V\u03cc\nV\3V\5V\u03cf\nV\3V\3V\3V\5V\u03d4\nV\3V\5V\u03d7\nV"+
		"\3V\3V\3V\5V\u03dc\nV\3V\5V\u03df\nV\3V\3V\5V\u03e3\nV\3V\3V\3V\5V\u03e8"+
		"\nV\3V\5V\u03eb\nV\3V\3V\5V\u03ef\nV\3W\3W\3X\3X\7X\u03f5\nX\fX\16X\u03f8"+
		"\13X\3X\3X\3Y\3Y\3Z\3Z\3Z\5Z\u0401\nZ\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3"+
		"]\3]\3]\5]\u040f\n]\3^\3^\3^\3_\3_\3_\3_\7_\u0418\n_\f_\16_\u041b\13_"+
		"\3_\3_\3`\3`\3`\5`\u0422\n`\3a\3a\3a\3a\3a\3a\5a\u042a\na\3b\3b\3b\3b"+
		"\3c\3c\3c\3c\3d\3d\3e\3e\3e\7e\u0439\ne\fe\16e\u043c\13e\3f\3f\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\5g\u0449\ng\3h\6h\u044c\nh\rh\16h\u044d\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0469"+
		"\ni\3j\3j\3k\3k\5k\u046f\nk\3k\3k\5k\u0473\nk\3l\3l\3m\3m\3m\3m\5m\u047b"+
		"\nm\3n\3n\3o\3o\3o\5o\u0482\no\3p\3p\3q\3q\3q\3q\3r\6r\u048b\nr\rr\16"+
		"r\u048c\3s\7s\u0490\ns\fs\16s\u0493\13s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t"+
		"\3t\3t\3t\3t\3t\3t\5t\u04a5\nt\3u\3u\3u\3u\3u\3u\5u\u04ad\nu\3v\3v\5v"+
		"\u04b1\nv\3w\3w\3w\7w\u04b6\nw\fw\16w\u04b9\13w\3x\3x\3x\3x\3x\5x\u04c0"+
		"\nx\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u04ce\nz\3{\6{\u04d1\n{\r{"+
		"\16{\u04d2\3|\3|\3|\3|\3}\3}\5}\u04db\n}\3}\3}\3}\3}\5}\u04e1\n}\3~\3"+
		"~\5~\u04e5\n~\3\177\3\177\5\177\u04e9\n\177\3\177\3\177\3\u0080\3\u0080"+
		"\5\u0080\u04ef\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u04f5\n"+
		"\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u050c\n\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u052d\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0543"+
		"\n\u0085\f\u0085\16\u0085\u0546\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u054e\n\u0086\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u0553\n\u0087\f\u0087\16\u0087\u0556\13\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0562"+
		"\n\u0088\3\u0089\3\u0089\7\u0089\u0566\n\u0089\f\u0089\16\u0089\u0569"+
		"\13\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0572\n\u008b\3\u008c\3\u008c\5\u008c\u0576\n\u008c\3\u008c\5\u008c\u0579"+
		"\n\u008c\3\u008c\3\u008c\3\u008d\3\u008d\5\u008d\u057f\n\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0583\n\u008d\3\u008e\3\u008e\3\u008f\5\u008f\u0588\n"+
		"\u008f\3\u008f\3\u008f\5\u008f\u058c\n\u008f\3\u008f\3\u008f\3\u008f\3"+
		"\u008f\5\u008f\u0592\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5"+
		"\u008f\u0599\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u05a0"+
		"\n\u0090\3\u0090\3\u0090\5\u0090\u05a4\n\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\5\u0091\u05ab\n\u0091\3\u0092\5\u0092\u05ae\n\u0092\3"+
		"\u0092\5\u0092\u05b1\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u05b7"+
		"\n\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\5\u0095\u05c1\n\u0095\3\u0096\3\u0096\5\u0096\u05c5\n\u0096\3\u0097\3"+
		"\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\7\u00a4\u05f6\n\u00a4\f\u00a4\16\u00a4\u05f9\13\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\7\u00a4\u05fe\n\u00a4\f\u00a4\16\u00a4\u0601\13\u00a4"+
		"\5\u00a4\u0603\n\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a8\3\u00a8\5\u00a8\u060d\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0613\n\u00a9\3\u00aa\5\u00aa\u0616\n\u00aa\3\u00aa\3\u00aa\5"+
		"\u00aa\u061a\n\u00aa\3\u00aa\5\u00aa\u061d\n\u00aa\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\2\3\u0108\u00af\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\2\f\4\2\b\b\23\30\3\2)+\3\2\65\66"+
		"\7\2\678qqxz\177\u0080\u0083\u0083\b\2\31\34\37 \"#%.\64\66=\\\6\2\3\6"+
		"\t\669;=o\5\2{|~\177\u0081\u008a\4\2ggnn\3\2\u008c\u008e\3\2\u0090\u0091"+
		"\2\u066d\2\u015d\3\2\2\2\4\u0179\3\2\2\2\6\u017b\3\2\2\2\b\u017d\3\2\2"+
		"\2\n\u0187\3\2\2\2\f\u01a5\3\2\2\2\16\u01a9\3\2\2\2\20\u01ab\3\2\2\2\22"+
		"\u01b7\3\2\2\2\24\u01bb\3\2\2\2\26\u01c6\3\2\2\2\30\u01c8\3\2\2\2\32\u01d6"+
		"\3\2\2\2\34\u01d8\3\2\2\2\36\u01df\3\2\2\2 \u01e1\3\2\2\2\"\u01eb\3\2"+
		"\2\2$\u01ed\3\2\2\2&\u01f5\3\2\2\2(\u01ff\3\2\2\2*\u0201\3\2\2\2,\u0210"+
		"\3\2\2\2.\u0212\3\2\2\2\60\u0215\3\2\2\2\62\u0218\3\2\2\2\64\u0223\3\2"+
		"\2\2\66\u0225\3\2\2\28\u0228\3\2\2\2:\u022d\3\2\2\2<\u022f\3\2\2\2>\u0233"+
		"\3\2\2\2@\u0237\3\2\2\2B\u023b\3\2\2\2D\u023f\3\2\2\2F\u024c\3\2\2\2H"+
		"\u024e\3\2\2\2J\u0251\3\2\2\2L\u025b\3\2\2\2N\u025d\3\2\2\2P\u0261\3\2"+
		"\2\2R\u0265\3\2\2\2T\u0269\3\2\2\2V\u0271\3\2\2\2X\u027b\3\2\2\2Z\u027e"+
		"\3\2\2\2\\\u0283\3\2\2\2^\u0285\3\2\2\2`\u028c\3\2\2\2b\u0294\3\2\2\2"+
		"d\u0296\3\2\2\2f\u02a0\3\2\2\2h\u02a3\3\2\2\2j\u02ab\3\2\2\2l\u02b3\3"+
		"\2\2\2n\u02b7\3\2\2\2p\u02dd\3\2\2\2r\u02e0\3\2\2\2t\u02e7\3\2\2\2v\u02f5"+
		"\3\2\2\2x\u02f8\3\2\2\2z\u0301\3\2\2\2|\u030c\3\2\2\2~\u031c\3\2\2\2\u0080"+
		"\u031f\3\2\2\2\u0082\u0327\3\2\2\2\u0084\u033a\3\2\2\2\u0086\u033d\3\2"+
		"\2\2\u0088\u0346\3\2\2\2\u008a\u034e\3\2\2\2\u008c\u035b\3\2\2\2\u008e"+
		"\u0364\3\2\2\2\u0090\u0372\3\2\2\2\u0092\u0374\3\2\2\2\u0094\u037a\3\2"+
		"\2\2\u0096\u0382\3\2\2\2\u0098\u0384\3\2\2\2\u009a\u03a1\3\2\2\2\u009c"+
		"\u03a3\3\2\2\2\u009e\u03a5\3\2\2\2\u00a0\u03a7\3\2\2\2\u00a2\u03ab\3\2"+
		"\2\2\u00a4\u03ba\3\2\2\2\u00a6\u03bc\3\2\2\2\u00a8\u03c5\3\2\2\2\u00aa"+
		"\u03ee\3\2\2\2\u00ac\u03f0\3\2\2\2\u00ae\u03f2\3\2\2\2\u00b0\u03fb\3\2"+
		"\2\2\u00b2\u0400\3\2\2\2\u00b4\u0402\3\2\2\2\u00b6\u0406\3\2\2\2\u00b8"+
		"\u040a\3\2\2\2\u00ba\u0410\3\2\2\2\u00bc\u0413\3\2\2\2\u00be\u0421\3\2"+
		"\2\2\u00c0\u0429\3\2\2\2\u00c2\u042b\3\2\2\2\u00c4\u042f\3\2\2\2\u00c6"+
		"\u0433\3\2\2\2\u00c8\u0435\3\2\2\2\u00ca\u043d\3\2\2\2\u00cc\u0448\3\2"+
		"\2\2\u00ce\u044b\3\2\2\2\u00d0\u0468\3\2\2\2\u00d2\u046a\3\2\2\2\u00d4"+
		"\u0472\3\2\2\2\u00d6\u0474\3\2\2\2\u00d8\u047a\3\2\2\2\u00da\u047c\3\2"+
		"\2\2\u00dc\u047e\3\2\2\2\u00de\u0483\3\2\2\2\u00e0\u0485\3\2\2\2\u00e2"+
		"\u048a\3\2\2\2\u00e4\u0491\3\2\2\2\u00e6\u04a4\3\2\2\2\u00e8\u04ac\3\2"+
		"\2\2\u00ea\u04ae\3\2\2\2\u00ec\u04b2\3\2\2\2\u00ee\u04bf\3\2\2\2\u00f0"+
		"\u04c1\3\2\2\2\u00f2\u04cd\3\2\2\2\u00f4\u04d0\3\2\2\2\u00f6\u04d4\3\2"+
		"\2\2\u00f8\u04e0\3\2\2\2\u00fa\u04e4\3\2\2\2\u00fc\u04e6\3\2\2\2\u00fe"+
		"\u04f4\3\2\2\2\u0100\u04f6\3\2\2\2\u0102\u050b\3\2\2\2\u0104\u050d\3\2"+
		"\2\2\u0106\u0510\3\2\2\2\u0108\u0514\3\2\2\2\u010a\u054d\3\2\2\2\u010c"+
		"\u054f\3\2\2\2\u010e\u0561\3\2\2\2\u0110\u0563\3\2\2\2\u0112\u056a\3\2"+
		"\2\2\u0114\u0571\3\2\2\2\u0116\u0573\3\2\2\2\u0118\u057c\3\2\2\2\u011a"+
		"\u0584\3\2\2\2\u011c\u0598\3\2\2\2\u011e\u05a3\3\2\2\2\u0120\u05aa\3\2"+
		"\2\2\u0122\u05b6\3\2\2\2\u0124\u05b8\3\2\2\2\u0126\u05ba\3\2\2\2\u0128"+
		"\u05c0\3\2\2\2\u012a\u05c4\3\2\2\2\u012c\u05c6\3\2\2\2\u012e\u05c8\3\2"+
		"\2\2\u0130\u05ca\3\2\2\2\u0132\u05cd\3\2\2\2\u0134\u05d0\3\2\2\2\u0136"+
		"\u05d4\3\2\2\2\u0138\u05d8\3\2\2\2\u013a\u05dc\3\2\2\2\u013c\u05e0\3\2"+
		"\2\2\u013e\u05e5\3\2\2\2\u0140\u05e9\3\2\2\2\u0142\u05ec\3\2\2\2\u0144"+
		"\u05ef\3\2\2\2\u0146\u0602\3\2\2\2\u0148\u0604\3\2\2\2\u014a\u0606\3\2"+
		"\2\2\u014c\u0608\3\2\2\2\u014e\u060c\3\2\2\2\u0150\u0612\3\2\2\2\u0152"+
		"\u061c\3\2\2\2\u0154\u061e\3\2\2\2\u0156\u0620\3\2\2\2\u0158\u0622\3\2"+
		"\2\2\u015a\u0624\3\2\2\2\u015c\u015e\5\6\4\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\2\2\3\u0160\3\3\2\2\2"+
		"\u0161\u0163\5\u00eav\2\u0162\u0164\7z\2\2\u0163\u0162\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u017a\3\2\2\2\u0165\u0167\5X-\2\u0166\u0168\7z\2\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u017a\3\2\2\2\u0169\u016b\5\n"+
		"\6\2\u016a\u016c\7z\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u017a\3\2\2\2\u016d\u016f\5\36\20\2\u016e\u0170\7z\2\2\u016f\u016e\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u017a\3\2\2\2\u0171\u0173\5\64\33\2\u0172"+
		"\u0174\7z\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u017a\3\2"+
		"\2\2\u0175\u0177\5:\36\2\u0176\u0178\7z\2\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0161\3\2\2\2\u0179\u0165\3\2"+
		"\2\2\u0179\u0169\3\2\2\2\u0179\u016d\3\2\2\2\u0179\u0171\3\2\2\2\u0179"+
		"\u0175\3\2\2\2\u017a\5\3\2\2\2\u017b\u017c\5\b\5\2\u017c\7\3\2\2\2\u017d"+
		"\u017e\6\5\2\3\u017e\u017f\5\4\3\2\u017f\u0181\b\5\1\2\u0180\u0182\5\b"+
		"\5\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\t\3\2\2\2\u0183\u0188"+
		"\5\f\7\2\u0184\u0188\5\20\t\2\u0185\u0188\5\22\n\2\u0186\u0188\5\34\17"+
		"\2\u0187\u0183\3\2\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186"+
		"\3\2\2\2\u0188\13\3\2\2\2\u0189\u018b\7\3\2\2\u018a\u018c\5\16\b\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\7z"+
		"\2\2\u018e\u0190\5\u00eav\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0193\7z\2\2\u0192\u0194\5\u00eav\2\u0193\u0192\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01a6\5^\60\2\u0196"+
		"\u0197\7\3\2\2\u0197\u0199\7s\2\2\u0198\u019a\5\16\b\2\u0199\u0198\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\7z\2\2\u019c"+
		"\u019e\5\u00eav\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a1\7z\2\2\u01a0\u01a2\5\u00eav\2\u01a1\u01a0\3\2\2\2"+
		"\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a6"+
		"\5^\60\2\u01a5\u0189\3\2\2\2\u01a5\u0196\3\2\2\2\u01a6\r\3\2\2\2\u01a7"+
		"\u01aa\5p9\2\u01a8\u01aa\5\u00ecw\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3"+
		"\2\2\2\u01aa\17\3\2\2\2\u01ab\u01ad\7\3\2\2\u01ac\u01ae\7\4\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\5\u00d4"+
		"k\2\u01b0\u01b1\7\5\2\2\u01b1\u01b3\5\u00eav\2\u01b2\u01b4\5\60\31\2\u01b3"+
		"\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5^"+
		"\60\2\u01b6\21\3\2\2\2\u01b7\u01b8\7\6\2\2\u01b8\u01b9\5\24\13\2\u01b9"+
		"\u01ba\5^\60\2\u01ba\23\3\2\2\2\u01bb\u01c0\5\26\f\2\u01bc\u01bd\7x\2"+
		"\2\u01bd\u01bf\5\26\f\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\25\3\2\2\2\u01c2\u01c0\3\2\2"+
		"\2\u01c3\u01c7\5\u00eav\2\u01c4\u01c7\5\30\r\2\u01c5\u01c7\5\32\16\2\u01c6"+
		"\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\27\3\2\2"+
		"\2\u01c8\u01c9\7\4\2\2\u01c9\u01ca\5\u00d4k\2\u01ca\u01cc\5n8\2\u01cb"+
		"\u01cd\5\60\31\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\31\3\2"+
		"\2\2\u01ce\u01cf\7\7\2\2\u01cf\u01d0\5\u00d4k\2\u01d0\u01d1\5n8\2\u01d1"+
		"\u01d7\3\2\2\2\u01d2\u01d3\7\b\2\2\u01d3\u01d4\5\u00d4k\2\u01d4\u01d5"+
		"\5n8\2\u01d5\u01d7\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d7"+
		"\33\3\2\2\2\u01d8\u01d9\7\t\2\2\u01d9\u01da\5^\60\2\u01da\u01db\7\6\2"+
		"\2\u01db\u01dc\5\u00eav\2\u01dc\35\3\2\2\2\u01dd\u01e0\5 \21\2\u01de\u01e0"+
		"\5$\23\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\37\3\2\2\2\u01e1"+
		"\u01e2\7\n\2\2\u01e2\u01e3\5\24\13\2\u01e3\u01e5\5^\60\2\u01e4\u01e6\5"+
		"\"\22\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6!\3\2\2\2\u01e7\u01e8"+
		"\7\13\2\2\u01e8\u01ec\5^\60\2\u01e9\u01ea\7\13\2\2\u01ea\u01ec\5 \21\2"+
		"\u01eb\u01e7\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec#\3\2\2\2\u01ed\u01ee\7"+
		"\f\2\2\u01ee\u01ef\5\u00eav\2\u01ef\u01f1\7r\2\2\u01f0\u01f2\5&\24\2\u01f1"+
		"\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7u"+
		"\2\2\u01f4%\3\2\2\2\u01f5\u01f7\5(\25\2\u01f6\u01f8\5&\24\2\u01f7\u01f6"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\'\3\2\2\2\u01f9\u01fa\5*\26\2\u01fa"+
		"\u01fb\5\6\4\2\u01fb\u0200\3\2\2\2\u01fc\u01fd\5.\30\2\u01fd\u01fe\5\6"+
		"\4\2\u01fe\u0200\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200"+
		")\3\2\2\2\u0201\u0202\7\4\2\2\u0202\u0203\5,\27\2\u0203\u0204\7y\2\2\u0204"+
		"+\3\2\2\2\u0205\u0207\5\u00d4k\2\u0206\u0208\5\60\31\2\u0207\u0206\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0211\3\2\2\2\u0209\u020b\5\u00d4k\2\u020a"+
		"\u020c\5\60\31\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3"+
		"\2\2\2\u020d\u020e\7x\2\2\u020e\u020f\5,\27\2\u020f\u0211\3\2\2\2\u0210"+
		"\u0205\3\2\2\2\u0210\u0209\3\2\2\2\u0211-\3\2\2\2\u0212\u0213\7\r\2\2"+
		"\u0213\u0214\7y\2\2\u0214/\3\2\2\2\u0215\u0216\7\16\2\2\u0216\u0217\5"+
		"\62\32\2\u0217\61\3\2\2\2\u0218\u0219\5\u00eav\2\u0219\63\3\2\2\2\u021a"+
		"\u021b\5\66\34\2\u021b\u021c\5\n\6\2\u021c\u0224\3\2\2\2\u021d\u021e\5"+
		"\66\34\2\u021e\u021f\5 \21\2\u021f\u0224\3\2\2\2\u0220\u0221\5\66\34\2"+
		"\u0221\u0222\5$\23\2\u0222\u0224\3\2\2\2\u0223\u021a\3\2\2\2\u0223\u021d"+
		"\3\2\2\2\u0223\u0220\3\2\2\2\u0224\65\3\2\2\2\u0225\u0226\58\35\2\u0226"+
		"\u0227\7y\2\2\u0227\67\3\2\2\2\u0228\u0229\5\u0128\u0095\2\u02299\3\2"+
		"\2\2\u022a\u022e\5<\37\2\u022b\u022e\5> \2\u022c\u022e\5@!\2\u022d\u022a"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022e;\3\2\2\2\u022f"+
		"\u0231\7\17\2\2\u0230\u0232\58\35\2\u0231\u0230\3\2\2\2\u0231\u0232\3"+
		"\2\2\2\u0232=\3\2\2\2\u0233\u0235\7\20\2\2\u0234\u0236\58\35\2\u0235\u0234"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236?\3\2\2\2\u0237\u0239\7\21\2\2\u0238"+
		"\u023a\5\u00eav\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023aA\3\2\2"+
		"\2\u023b\u023c\7{\2\2\u023c\u023d\5D#\2\u023d\u023e\7|\2\2\u023eC\3\2"+
		"\2\2\u023f\u0244\5F$\2\u0240\u0241\7x\2\2\u0241\u0243\5F$\2\u0242\u0240"+
		"\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"E\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024d\5\u011a\u008e\2\u0248\u0249"+
		"\5\u011a\u008e\2\u0249\u024a\7y\2\2\u024a\u024b\5\u0118\u008d\2\u024b"+
		"\u024d\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u0248\3\2\2\2\u024dG\3\2\2\2"+
		"\u024e\u024f\7\16\2\2\u024f\u0250\5J&\2\u0250I\3\2\2\2\u0251\u0256\5L"+
		"\'\2\u0252\u0253\7x\2\2\u0253\u0255\5L\'\2\u0254\u0252\3\2\2\2\u0255\u0258"+
		"\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257K\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0259\u025c\5N(\2\u025a\u025c\5P)\2\u025b\u0259\3\2\2\2"+
		"\u025b\u025a\3\2\2\2\u025cM\3\2\2\2\u025d\u025e\5\u0118\u008d\2\u025e"+
		"\u025f\7y\2\2\u025f\u0260\5\u0118\u008d\2\u0260O\3\2\2\2\u0261\u0262\5"+
		"\u0118\u008d\2\u0262\u0263\5\u013e\u00a0\2\u0263\u0264\5\u0114\u008b\2"+
		"\u0264Q\3\2\2\2\u0265\u0266\7{\2\2\u0266\u0267\5T+\2\u0267\u0268\7|\2"+
		"\2\u0268S\3\2\2\2\u0269\u026e\5V,\2\u026a\u026b\7x\2\2\u026b\u026d\5V"+
		",\2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026fU\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\5\u0114"+
		"\u008b\2\u0272W\3\2\2\2\u0273\u027c\5`\61\2\u0274\u027c\5h\65\2\u0275"+
		"\u027c\5p9\2\u0276\u027c\5\u008aF\2\u0277\u027c\5\u00a2R\2\u0278\u027c"+
		"\5\u00aaV\2\u0279\u027c\5\u00b2Z\2\u027a\u027c\5\u00bc_\2\u027b\u0273"+
		"\3\2\2\2\u027b\u0274\3\2\2\2\u027b\u0275\3\2\2\2\u027b\u0276\3\2\2\2\u027b"+
		"\u0277\3\2\2\2\u027b\u0278\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2"+
		"\2\2\u027cY\3\2\2\2\u027d\u027f\5X-\2\u027e\u027d\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281[\3\2\2\2\u0282"+
		"\u0284\5\6\4\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284]\3\2\2\2"+
		"\u0285\u0287\7r\2\2\u0286\u0288\5\6\4\2\u0287\u0286\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\7u\2\2\u028a_\3\2\2\2\u028b\u028d"+
		"\5\u00e2r\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2"+
		"\2\u028e\u0290\7\22\2\2\u028f\u0291\5b\62\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\5d\63\2\u0293a\3\2\2\2"+
		"\u0294\u0295\t\2\2\2\u0295c\3\2\2\2\u0296\u029b\5f\64\2\u0297\u0298\7"+
		"q\2\2\u0298\u029a\5f\64\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029ce\3\2\2\2\u029d\u029b\3\2\2\2"+
		"\u029e\u02a1\5\u0128\u0095\2\u029f\u02a1\5\u0146\u00a4\2\u02a0\u029e\3"+
		"\2\2\2\u02a0\u029f\3\2\2\2\u02a1g\3\2\2\2\u02a2\u02a4\5\u00e2r\2\u02a3"+
		"\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a7\5\u00ce"+
		"h\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02a9\7\7\2\2\u02a9\u02aa\5j\66\2\u02aai\3\2\2\2\u02ab\u02b0\5l\67\2"+
		"\u02ac\u02ad\7x\2\2\u02ad\u02af\5l\67\2\u02ae\u02ac\3\2\2\2\u02af\u02b2"+
		"\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1k\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b5\5\u00d4k\2\u02b4\u02b6\5n8\2\u02b5\u02b4\3"+
		"\2\2\2\u02b5\u02b6\3\2\2\2\u02b6m\3\2\2\2\u02b7\u02b8\5\u0130\u0099\2"+
		"\u02b8\u02b9\5\u00eav\2\u02b9o\3\2\2\2\u02ba\u02bb\5r:\2\u02bb\u02bc\5"+
		"t;\2\u02bc\u02bd\5\u0116\u008c\2\u02bd\u02be\5^\60\2\u02be\u02de\3\2\2"+
		"\2\u02bf\u02c0\5r:\2\u02c0\u02c1\5t;\2\u02c1\u02c2\5\u0116\u008c\2\u02c2"+
		"\u02c3\5v<\2\u02c3\u02de\3\2\2\2\u02c4\u02c5\5r:\2\u02c5\u02c6\5t;\2\u02c6"+
		"\u02c7\5\u0116\u008c\2\u02c7\u02c8\5~@\2\u02c8\u02de\3\2\2\2\u02c9\u02ca"+
		"\5r:\2\u02ca\u02cb\5t;\2\u02cb\u02cd\5\u0116\u008c\2\u02cc\u02ce\5n8\2"+
		"\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0"+
		"\5\u0084C\2\u02d0\u02de\3\2\2\2\u02d1\u02d2\5r:\2\u02d2\u02d3\5t;\2\u02d3"+
		"\u02d4\5\u0116\u008c\2\u02d4\u02d6\5\u0116\u008c\2\u02d5\u02d7\5n8\2\u02d6"+
		"\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\5\u0084"+
		"C\2\u02d9\u02de\3\2\2\2\u02da\u02db\5r:\2\u02db\u02dc\5j\66\2\u02dc\u02de"+
		"\3\2\2\2\u02dd\u02ba\3\2\2\2\u02dd\u02bf\3\2\2\2\u02dd\u02c4\3\2\2\2\u02dd"+
		"\u02c9\3\2\2\2\u02dd\u02d1\3\2\2\2\u02dd\u02da\3\2\2\2\u02deq\3\2\2\2"+
		"\u02df\u02e1\5\u00e2r\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e3\3\2\2\2\u02e2\u02e4\5\u00ceh\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\7\b\2\2\u02e6s\3\2\2\2\u02e7"+
		"\u02e8\5\u0128\u0095\2\u02e8u\3\2\2\2\u02e9\u02ea\7r\2\2\u02ea\u02ec\5"+
		"x=\2\u02eb\u02ed\5z>\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\7u\2\2\u02ef\u02f6\3\2\2\2\u02f0\u02f1\7r\2\2\u02f1"+
		"\u02f2\5z>\2\u02f2\u02f3\5x=\2\u02f3\u02f4\7u\2\2\u02f4\u02f6\3\2\2\2"+
		"\u02f5\u02e9\3\2\2\2\u02f5\u02f0\3\2\2\2\u02f6w\3\2\2\2\u02f7\u02f9\5"+
		"\u00e2r\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2"+
		"\u02fa\u02fc\5\u00d2j\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02fe\7\31\2\2\u02fe\u02ff\5^\60\2\u02ffy\3\2\2\2"+
		"\u0300\u0302\5\u00e2r\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u0305\5\u00d2j\2\u0304\u0303\3\2\2\2\u0304\u0305"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\7\32\2\2\u0307\u0309\5|?\2\u0308"+
		"\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\5^"+
		"\60\2\u030b{\3\2\2\2\u030c\u030d\7s\2\2\u030d\u030e\5\u0128\u0095\2\u030e"+
		"\u030f\7v\2\2\u030f}\3\2\2\2\u0310\u0311\7r\2\2\u0311\u0313\5\u0080A\2"+
		"\u0312\u0314\5\u0082B\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\7u\2\2\u0316\u031d\3\2\2\2\u0317\u0318\7r\2"+
		"\2\u0318\u0319\5\u0082B\2\u0319\u031a\5\u0080A\2\u031a\u031b\7u\2\2\u031b"+
		"\u031d\3\2\2\2\u031c\u0310\3\2\2\2\u031c\u0317\3\2\2\2\u031d\177\3\2\2"+
		"\2\u031e\u0320\5\u00e2r\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u0322\3\2\2\2\u0321\u0323\5\u00d2j\2\u0322\u0321\3\2\2\2\u0322\u0323"+
		"\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\7\31\2\2\u0325\u0081\3\2\2\2"+
		"\u0326\u0328\5\u00e2r\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u032a\3\2\2\2\u0329\u032b\5\u00d2j\2\u032a\u0329\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\7\32\2\2\u032d\u0083\3\2\2\2"+
		"\u032e\u032f\7r\2\2\u032f\u0331\5\u0086D\2\u0330\u0332\5\u0088E\2\u0331"+
		"\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\7u"+
		"\2\2\u0334\u033b\3\2\2\2\u0335\u0336\7r\2\2\u0336\u0337\5\u0088E\2\u0337"+
		"\u0338\5\u0086D\2\u0338\u0339\7u\2\2\u0339\u033b\3\2\2\2\u033a\u032e\3"+
		"\2\2\2\u033a\u0335\3\2\2\2\u033b\u0085\3\2\2\2\u033c\u033e\5\u00e2r\2"+
		"\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341"+
		"\7\33\2\2\u0340\u0342\5|?\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u0344\5^\60\2\u0344\u0087\3\2\2\2\u0345\u0347\5\u00e2"+
		"r\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034a\7\34\2\2\u0349\u034b\5|?\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u034c\3\2\2\2\u034c\u034d\5^\60\2\u034d\u0089\3\2\2\2\u034e"+
		"\u034f\5\u008cG\2\u034f\u0351\5\u008eH\2\u0350\u0352\5B\"\2\u0351\u0350"+
		"\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\5\u0090I"+
		"\2\u0354\u0356\5H%\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358"+
		"\3\2\2\2\u0357\u0359\5\u0094K\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2"+
		"\2\u0359\u008b\3\2\2\2\u035a\u035c\5\u00e2r\2\u035b\u035a\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035f\5\u00ceh\2\u035e\u035d"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\7\30\2\2"+
		"\u0361\u008d\3\2\2\2\u0362\u0365\5\u0128\u0095\2\u0363\u0365\5\u0146\u00a4"+
		"\2\u0364\u0362\3\2\2\2\u0364\u0363\3\2\2\2\u0365\u008f\3\2\2\2\u0366\u0368"+
		"\5\u0096L\2\u0367\u0369\7\35\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2"+
		"\2\u0369\u036b\3\2\2\2\u036a\u036c\5\u0092J\2\u036b\u036a\3\2\2\2\u036b"+
		"\u036c\3\2\2\2\u036c\u0373\3\2\2\2\u036d\u036e\5\u0096L\2\u036e\u0370"+
		"\7\36\2\2\u036f\u0371\5\u0092J\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2"+
		"\2\u0371\u0373\3\2\2\2\u0372\u0366\3\2\2\2\u0372\u036d\3\2\2\2\u0373\u0091"+
		"\3\2\2\2\u0374\u0376\5\u013a\u009e\2\u0375\u0377\5\u00e2r\2\u0376\u0375"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\5\u0114\u008b"+
		"\2\u0379\u0093\3\2\2\2\u037a\u037b\5^\60\2\u037b\u0095\3\2\2\2\u037c\u037d"+
		"\7s\2\2\u037d\u0383\7v\2\2\u037e\u037f\7s\2\2\u037f\u0380\5\u0098M\2\u0380"+
		"\u0381\7v\2\2\u0381\u0383\3\2\2\2\u0382\u037c\3\2\2\2\u0382\u037e\3\2"+
		"\2\2\u0383\u0097\3\2\2\2\u0384\u0389\5\u009aN\2\u0385\u0386\7x\2\2\u0386"+
		"\u0388\5\u009aN\2\u0387\u0385\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0099\3\2\2\2\u038b\u0389\3\2\2\2\u038c"+
		"\u038e\5\u009cO\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0390\5\u009eP\2\u0390\u0392\5\u0116\u008c\2\u0391\u0393"+
		"\5\u00a0Q\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u03a2\3\2\2"+
		"\2\u0394\u0396\5\u009cO\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0398\5\u009eP\2\u0398\u0399\5\u0116\u008c\2\u0399"+
		"\u03a2\3\2\2\2\u039a\u039c\5\u009cO\2\u039b\u039a\3\2\2\2\u039b\u039c"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\5\u009eP\2\u039e\u039f\5\u0116"+
		"\u008c\2\u039f\u03a0\5\u013c\u009f\2\u03a0\u03a2\3\2\2\2\u03a1\u038d\3"+
		"\2\2\2\u03a1\u0395\3\2\2\2\u03a1\u039b\3\2\2\2\u03a2\u009b\3\2\2\2\u03a3"+
		"\u03a4\5\u012a\u0096\2\u03a4\u009d\3\2\2\2\u03a5\u03a6\5\u012a\u0096\2"+
		"\u03a6\u009f\3\2\2\2\u03a7\u03a8\5\u0130\u0099\2\u03a8\u03a9\5\u00eav"+
		"\2\u03a9\u00a1\3\2\2\2\u03aa\u03ac\5\u00e2r\2\u03ab\u03aa\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03af\5\u00d0i\2\u03ae\u03ad"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\7\24\2\2"+
		"\u03b1\u03b3\5\u00a4S\2\u03b2\u03b4\5B\"\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4"+
		"\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03b7\5H%\2\u03b6\u03b5\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\5\u00a6T\2\u03b9\u00a3"+
		"\3\2\2\2\u03ba\u03bb\5\u0128\u0095\2\u03bb\u00a5\3\2\2\2\u03bc\u03c0\7"+
		"r\2\2\u03bd\u03bf\5\u00a8U\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0"+
		"\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03c0\3\2"+
		"\2\2\u03c3\u03c4\7u\2\2\u03c4\u00a7\3\2\2\2\u03c5\u03c6\5X-\2\u03c6\u00a9"+
		"\3\2\2\2\u03c7\u03c9\5\u00e2r\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2"+
		"\2\u03c9\u03cb\3\2\2\2\u03ca\u03cc\5\u00d0i\2\u03cb\u03ca\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cf\7\37\2\2\u03ce\u03cd\3"+
		"\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\7\25\2\2\u03d1"+
		"\u03d3\5\u00acW\2\u03d2\u03d4\5B\"\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3"+
		"\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d7\5H%\2\u03d6\u03d5\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\5\u00aeX\2\u03d9\u03ef"+
		"\3\2\2\2\u03da\u03dc\5\u00e2r\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2"+
		"\2\u03dc\u03de\3\2\2\2\u03dd\u03df\5\u00d0i\2\u03de\u03dd\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\7\37\2\2\u03e1\u03e3\5"+
		"\u00d0i\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2"+
		"\u03e4\u03e5\7\25\2\2\u03e5\u03e7\5\u00acW\2\u03e6\u03e8\5B\"\2\u03e7"+
		"\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03eb\5H"+
		"%\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"\u03ed\5\u00aeX\2\u03ed\u03ef\3\2\2\2\u03ee\u03c8\3\2\2\2\u03ee\u03db"+
		"\3\2\2\2\u03ef\u00ab\3\2\2\2\u03f0\u03f1\5\u0128\u0095\2\u03f1\u00ad\3"+
		"\2\2\2\u03f2\u03f6\7r\2\2\u03f3\u03f5\5\u00b0Y\2\u03f4\u03f3\3\2\2\2\u03f5"+
		"\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2"+
		"\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\7u\2\2\u03fa\u00af\3\2\2\2\u03fb"+
		"\u03fc\5X-\2\u03fc\u00b1\3\2\2\2\u03fd\u0401\5\u00b4[\2\u03fe\u0401\5"+
		"\u00b6\\\2\u03ff\u0401\5\u00b8]\2\u0400\u03fd\3\2\2\2\u0400\u03fe\3\2"+
		"\2\2\u0400\u03ff\3\2\2\2\u0401\u00b3\3\2\2\2\u0402\u0403\7 \2\2\u0403"+
		"\u0404\7!\2\2\u0404\u0405\5\u0146\u00a4\2\u0405\u00b5\3\2\2\2\u0406\u0407"+
		"\7\"\2\2\u0407\u0408\7!\2\2\u0408\u0409\5\u0146\u00a4\2\u0409\u00b7\3"+
		"\2\2\2\u040a\u040b\7#\2\2\u040b\u040c\7!\2\2\u040c\u040e\5\u0146\u00a4"+
		"\2\u040d\u040f\5\u00ba^\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f"+
		"\u00b9\3\2\2\2\u0410\u0411\7y\2\2\u0411\u0412\5\u00caf\2\u0412\u00bb\3"+
		"\2\2\2\u0413\u0414\7$\2\2\u0414\u0415\5\u00caf\2\u0415\u0419\7r\2\2\u0416"+
		"\u0418\5\u00be`\2\u0417\u0416\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417"+
		"\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c"+
		"\u041d\7u\2\2\u041d\u00bd\3\2\2\2\u041e\u0422\5\u00c0a\2\u041f\u0422\5"+
		"\u00c2b\2\u0420\u0422\5\u00c4c\2\u0421\u041e\3\2\2\2\u0421\u041f\3\2\2"+
		"\2\u0421\u0420\3\2\2\2\u0422\u00bf\3\2\2\2\u0423\u0424\7%\2\2\u0424\u0425"+
		"\7y\2\2\u0425\u042a\5\u00c8e\2\u0426\u0427\7&\2\2\u0427\u0428\7y\2\2\u0428"+
		"\u042a\5\u00c8e\2\u0429\u0423\3\2\2\2\u0429\u0426\3\2\2\2\u042a\u00c1"+
		"\3\2\2\2\u042b\u042c\7\'\2\2\u042c\u042d\7y\2\2\u042d\u042e\5\u0154\u00ab"+
		"\2\u042e\u00c3\3\2\2\2\u042f\u0430\7(\2\2\u0430\u0431\7y\2\2\u0431\u0432"+
		"\5\u00c6d\2\u0432\u00c5\3\2\2\2\u0433\u0434\t\3\2\2\u0434\u00c7\3\2\2"+
		"\2\u0435\u043a\5\u00caf\2\u0436\u0437\7x\2\2\u0437\u0439\5\u00caf\2\u0438"+
		"\u0436\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2"+
		"\2\2\u043b\u00c9\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\5\u0128\u0095"+
		"\2\u043e\u00cb\3\2\2\2\u043f\u0449\7\25\2\2\u0440\u0449\7,\2\2\u0441\u0449"+
		"\7-\2\2\u0442\u0449\7\"\2\2\u0443\u0449\7 \2\2\u0444\u0449\7.\2\2\u0445"+
		"\u0449\7/\2\2\u0446\u0449\5\u00d0i\2\u0447\u0449\5\u00d2j\2\u0448\u043f"+
		"\3\2\2\2\u0448\u0440\3\2\2\2\u0448\u0441\3\2\2\2\u0448\u0442\3\2\2\2\u0448"+
		"\u0443\3\2\2\2\u0448\u0444\3\2\2\2\u0448\u0445\3\2\2\2\u0448\u0446\3\2"+
		"\2\2\u0448\u0447\3\2\2\2\u0449\u00cd\3\2\2\2\u044a\u044c\5\u00ccg\2\u044b"+
		"\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2"+
		"\2\2\u044e\u00cf\3\2\2\2\u044f\u0469\7\60\2\2\u0450\u0451\7\60\2\2\u0451"+
		"\u0452\7s\2\2\u0452\u0453\7\32\2\2\u0453\u0469\7v\2\2\u0454\u0469\7\61"+
		"\2\2\u0455\u0456\7\61\2\2\u0456\u0457\7s\2\2\u0457\u0458\7\32\2\2\u0458"+
		"\u0469\7v\2\2\u0459\u0469\7\62\2\2\u045a\u045b\7\62\2\2\u045b\u045c\7"+
		"s\2\2\u045c\u045d\7\32\2\2\u045d\u0469\7v\2\2\u045e\u0469\7\63\2\2\u045f"+
		"\u0460\7\63\2\2\u0460\u0461\7s\2\2\u0461\u0462\7\32\2\2\u0462\u0469\7"+
		"v\2\2\u0463\u0469\7\64\2\2\u0464\u0465\7\64\2\2\u0465\u0466\7s\2\2\u0466"+
		"\u0467\7\32\2\2\u0467\u0469\7v\2\2\u0468\u044f\3\2\2\2\u0468\u0450\3\2"+
		"\2\2\u0468\u0454\3\2\2\2\u0468\u0455\3\2\2\2\u0468\u0459\3\2\2\2\u0468"+
		"\u045a\3\2\2\2\u0468\u045e\3\2\2\2\u0468\u045f\3\2\2\2\u0468\u0463\3\2"+
		"\2\2\u0468\u0464\3\2\2\2\u0469\u00d1\3\2\2\2\u046a\u046b\t\4\2\2\u046b"+
		"\u00d3\3\2\2\2\u046c\u046e\5\u00d6l\2\u046d\u046f\5\u0116\u008c\2\u046e"+
		"\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0473\3\2\2\2\u0470\u0473\5\u00d8"+
		"m\2\u0471\u0473\5\u00dan\2\u0472\u046c\3\2\2\2\u0472\u0470\3\2\2\2\u0472"+
		"\u0471\3\2\2\2\u0473\u00d5\3\2\2\2\u0474\u0475\5\u0128\u0095\2\u0475\u00d7"+
		"\3\2\2\2\u0476\u0477\7\b\2\2\u0477\u047b\5\u00d4k\2\u0478\u0479\7\7\2"+
		"\2\u0479\u047b\5\u00d4k\2\u047a\u0476\3\2\2\2\u047a\u0478\3\2\2\2\u047b"+
		"\u00d9\3\2\2\2\u047c\u047d\5\u00eav\2\u047d\u00db\3\2\2\2\u047e\u047f"+
		"\7\u0080\2\2\u047f\u0481\5\u00dep\2\u0480\u0482\5\u00e0q\2\u0481\u0480"+
		"\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u00dd\3\2\2\2\u0483\u0484\5\u0128\u0095"+
		"\2\u0484\u00df\3\2\2\2\u0485\u0486\7s\2\2\u0486\u0487\5\u00e4s\2\u0487"+
		"\u0488\7v\2\2\u0488\u00e1\3\2\2\2\u0489\u048b\5\u00dco\2\u048a\u0489\3"+
		"\2\2\2\u048b\u048c\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u00e3\3\2\2\2\u048e\u0490\5\u00e6t\2\u048f\u048e\3\2\2\2\u0490\u0493"+
		"\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u00e5\3\2\2\2\u0493"+
		"\u0491\3\2\2\2\u0494\u0495\7s\2\2\u0495\u0496\5\u00e4s\2\u0496\u0497\7"+
		"v\2\2\u0497\u04a5\3\2\2\2\u0498\u0499\7t\2\2\u0499\u049a\5\u00e4s\2\u049a"+
		"\u049b\7w\2\2\u049b\u04a5\3\2\2\2\u049c\u049d\7r\2\2\u049d\u049e\5\u00e4"+
		"s\2\u049e\u049f\7u\2\2\u049f\u04a5\3\2\2\2\u04a0\u04a5\5\u012a\u0096\2"+
		"\u04a1\u04a5\5\u0150\u00a9\2\u04a2\u04a5\5\u0146\u00a4\2\u04a3\u04a5\5"+
		"\u00e8u\2\u04a4\u0494\3\2\2\2\u04a4\u0498\3\2\2\2\u04a4\u049c\3\2\2\2"+
		"\u04a4\u04a0\3\2\2\2\u04a4\u04a1\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a3"+
		"\3\2\2\2\u04a5\u00e7\3\2\2\2\u04a6\u04ad\t\5\2\2\u04a7\u04ad\5\u013a\u009e"+
		"\2\u04a8\u04a9\6u\3\2\u04a9\u04ad\7\u0081\2\2\u04aa\u04ab\6u\4\2\u04ab"+
		"\u04ad\7~\2\2\u04ac\u04a6\3\2\2\2\u04ac\u04a7\3\2\2\2\u04ac\u04a8\3\2"+
		"\2\2\u04ac\u04aa\3\2\2\2\u04ad\u00e9\3\2\2\2\u04ae\u04b0\5\u00eex\2\u04af"+
		"\u04b1\5\u00f4{\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u00eb"+
		"\3\2\2\2\u04b2\u04b7\5\u00eav\2\u04b3\u04b4\7x\2\2\u04b4\u04b6\5\u00ea"+
		"v\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7"+
		"\u04b8\3\2\2\2\u04b8\u00ed\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bb\5\u0142"+
		"\u00a2\2\u04bb\u04bc\5\u0108\u0085\2\u04bc\u04c0\3\2\2\2\u04bd\u04c0\5"+
		"\u0108\u0085\2\u04be\u04c0\5\u00f0y\2\u04bf\u04ba\3\2\2\2\u04bf\u04bd"+
		"\3\2\2\2\u04bf\u04be\3\2\2\2\u04c0\u00ef\3\2\2\2\u04c1\u04c2\7\u0081\2"+
		"\2\u04c2\u04c3\5\u0128\u0095\2\u04c3\u00f1\3\2\2\2\u04c4\u04c5\5\u0140"+
		"\u00a1\2\u04c5\u04c6\5\u00eex\2\u04c6\u04ce\3\2\2\2\u04c7\u04c8\5\u0130"+
		"\u0099\2\u04c8\u04c9\5\u00eex\2\u04c9\u04ce\3\2\2\2\u04ca\u04cb\5\u00f6"+
		"|\2\u04cb\u04cc\5\u00eex\2\u04cc\u04ce\3\2\2\2\u04cd\u04c4\3\2\2\2\u04cd"+
		"\u04c7\3\2\2\2\u04cd\u04ca\3\2\2\2\u04ce\u00f3\3\2\2\2\u04cf\u04d1\5\u00f2"+
		"z\2\u04d0\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u00f5\3\2\2\2\u04d4\u04d5\7\177\2\2\u04d5\u04d6\5"+
		"\u00eav\2\u04d6\u04d7\7y\2\2\u04d7\u00f7\3\2\2\2\u04d8\u04da\5\u0128\u0095"+
		"\2\u04d9\u04db\5R*\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04e1"+
		"\3\2\2\2\u04dc\u04e1\5\u00fa~\2\u04dd\u04e1\5\u0102\u0082\2\u04de\u04e1"+
		"\5\u0106\u0084\2\u04df\u04e1\5\u0104\u0083\2\u04e0\u04d8\3\2\2\2\u04e0"+
		"\u04dc\3\2\2\2\u04e0\u04dd\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04df\3\2"+
		"\2\2\u04e1\u00f9\3\2\2\2\u04e2\u04e5\5\u0150\u00a9\2\u04e3\u04e5\5\u00fc"+
		"\177\2\u04e4\u04e2\3\2\2\2\u04e4\u04e3\3\2\2\2\u04e5\u00fb\3\2\2\2\u04e6"+
		"\u04e8\7t\2\2\u04e7\u04e9\5\u00fe\u0080\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\7w\2\2\u04eb\u00fd\3\2\2\2\u04ec"+
		"\u04ee\5\u0100\u0081\2\u04ed\u04ef\7x\2\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef"+
		"\3\2\2\2\u04ef\u04f5\3\2\2\2\u04f0\u04f1\5\u0100\u0081\2\u04f1\u04f2\7"+
		"x\2\2\u04f2\u04f3\5\u00fe\u0080\2\u04f3\u04f5\3\2\2\2\u04f4\u04ec\3\2"+
		"\2\2\u04f4\u04f0\3\2\2\2\u04f5\u00ff\3\2\2\2\u04f6\u04f7\5\u00eav\2\u04f7"+
		"\u0101\3\2\2\2\u04f8\u050c\79\2\2\u04f9\u04fa\79\2\2\u04fa\u04fb\7q\2"+
		"\2\u04fb\u050c\5\u0128\u0095\2\u04fc\u04fd\79\2\2\u04fd\u04fe\7t\2\2\u04fe"+
		"\u04ff\5\u00ecw\2\u04ff\u0500\7w\2\2\u0500\u050c\3\2\2\2\u0501\u0502\7"+
		"9\2\2\u0502\u0503\7q\2\2\u0503\u050c\7:\2\2\u0504\u050c\7;\2\2\u0505\u0506"+
		"\7;\2\2\u0506\u0507\7q\2\2\u0507\u050c\5\u0128\u0095\2\u0508\u0509\7;"+
		"\2\2\u0509\u050a\7q\2\2\u050a\u050c\7:\2\2\u050b\u04f8\3\2\2\2\u050b\u04f9"+
		"\3\2\2\2\u050b\u04fc\3\2\2\2\u050b\u0501\3\2\2\2\u050b\u0504\3\2\2\2\u050b"+
		"\u0505\3\2\2\2\u050b\u0508\3\2\2\2\u050c\u0103\3\2\2\2\u050d\u050e\7q"+
		"\2\2\u050e\u050f\5\u012a\u0096\2\u050f\u0105\3\2\2\2\u0510\u0511\7s\2"+
		"\2\u0511\u0512\5\u00eav\2\u0512\u0513\7v\2\2\u0513\u0107\3\2\2\2\u0514"+
		"\u0515\b\u0085\1\2\u0515\u0516\5\u00f8}\2\u0516\u0544\3\2\2\2\u0517\u0518"+
		"\f\f\2\2\u0518\u0543\5\u0144\u00a3\2\u0519\u051a\f\13\2\2\u051a\u0543"+
		"\5\u010a\u0086\2\u051b\u051c\f\n\2\2\u051c\u051d\7q\2\2\u051d\u0543\7"+
		":\2\2\u051e\u051f\f\t\2\2\u051f\u0520\7q\2\2\u0520\u0521\7:\2\2\u0521"+
		"\u0522\7s\2\2\u0522\u0523\5\u0110\u0089\2\u0523\u0524\7v\2\2\u0524\u0543"+
		"\3\2\2\2\u0525\u0526\f\b\2\2\u0526\u0527\7q\2\2\u0527\u0543\7\u008e\2"+
		"\2\u0528\u0529\f\7\2\2\u0529\u052a\7q\2\2\u052a\u052c\5\u0128\u0095\2"+
		"\u052b\u052d\5R*\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u0543"+
		"\3\2\2\2\u052e\u052f\f\6\2\2\u052f\u0530\7q\2\2\u0530\u0531\5\u0128\u0095"+
		"\2\u0531\u0532\7s\2\2\u0532\u0533\5\u0110\u0089\2\u0533\u0534\7v\2\2\u0534"+
		"\u0543\3\2\2\2\u0535\u0536\f\5\2\2\u0536\u0537\7s\2\2\u0537\u0538\5\u0110"+
		"\u0089\2\u0538\u0539\7v\2\2\u0539\u0543\3\2\2\2\u053a\u053b\f\4\2\2\u053b"+
		"\u053c\7q\2\2\u053c\u0543\79\2\2\u053d\u053e\f\3\2\2\u053e\u053f\7t\2"+
		"\2\u053f\u0540\5\u00ecw\2\u0540\u0541\7w\2\2\u0541\u0543\3\2\2\2\u0542"+
		"\u0517\3\2\2\2\u0542\u0519\3\2\2\2\u0542\u051b\3\2\2\2\u0542\u051e\3\2"+
		"\2\2\u0542\u0525\3\2\2\2\u0542\u0528\3\2\2\2\u0542\u052e\3\2\2\2\u0542"+
		"\u0535\3\2\2\2\u0542\u053a\3\2\2\2\u0542\u053d\3\2\2\2\u0543\u0546\3\2"+
		"\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0109\3\2\2\2\u0546"+
		"\u0544\3\2\2\2\u0547\u0548\7s\2\2\u0548\u054e\7v\2\2\u0549\u054a\7s\2"+
		"\2\u054a\u054b\5\u010c\u0087\2\u054b\u054c\7v\2\2\u054c\u054e\3\2\2\2"+
		"\u054d\u0547\3\2\2\2\u054d\u0549\3\2\2\2\u054e\u010b\3\2\2\2\u054f\u0554"+
		"\5\u010e\u0088\2\u0550\u0551\7x\2\2\u0551\u0553\5\u010e\u0088\2\u0552"+
		"\u0550\3\2\2\2\u0553\u0556\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2"+
		"\2\2\u0555\u010d\3\2\2\2\u0556\u0554\3\2\2\2\u0557\u0562\5\u00eav\2\u0558"+
		"\u0559\5\u012a\u0096\2\u0559\u055a\7y\2\2\u055a\u055b\5\u00eav\2\u055b"+
		"\u0562\3\2\2\2\u055c\u0562\5\u0146\u00a4\2\u055d\u055e\5\u012a\u0096\2"+
		"\u055e\u055f\7y\2\2\u055f\u0560\5\u0146\u00a4\2\u0560\u0562\3\2\2\2\u0561"+
		"\u0557\3\2\2\2\u0561\u0558\3\2\2\2\u0561\u055c\3\2\2\2\u0561\u055d\3\2"+
		"\2\2\u0562\u010f\3\2\2\2\u0563\u0567\5\u0112\u008a\2\u0564\u0566\5\u0112"+
		"\u008a\2\u0565\u0564\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567"+
		"\u0568\3\2\2\2\u0568\u0111\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u056b\5\u012a"+
		"\u0096\2\u056b\u056c\7y\2\2\u056c\u0113\3\2\2\2\u056d\u0572\5\u0126\u0094"+
		"\2\u056e\u0572\5\u011c\u008f\2\u056f\u0572\5\u0118\u008d\2\u0570\u0572"+
		"\7;\2\2\u0571\u056d\3\2\2\2\u0571\u056e\3\2\2\2\u0571\u056f\3\2\2\2\u0571"+
		"\u0570\3\2\2\2\u0572\u0115\3\2\2\2\u0573\u0575\7y\2\2\u0574\u0576\5\u00e2"+
		"r\2\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577"+
		"\u0579\7<\2\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\3\2"+
		"\2\2\u057a\u057b\5\u0114\u008b\2\u057b\u0117\3\2\2\2\u057c\u057e\5\u011a"+
		"\u008e\2\u057d\u057f\5R*\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u0582\3\2\2\2\u0580\u0581\7q\2\2\u0581\u0583\5\u0118\u008d\2\u0582\u0580"+
		"\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0119\3\2\2\2\u0584\u0585\5\u0128\u0095"+
		"\2\u0585\u011b\3\2\2\2\u0586\u0588\5\u00e2r\2\u0587\u0586\3\2\2\2\u0587"+
		"\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\5\u011e\u0090\2\u058a\u058c"+
		"\7\35\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2"+
		"\u058d\u058e\5\u013a\u009e\2\u058e\u058f\5\u0114\u008b\2\u058f\u0599\3"+
		"\2\2\2\u0590\u0592\5\u00e2r\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2"+
		"\u0592\u0593\3\2\2\2\u0593\u0594\5\u011e\u0090\2\u0594\u0595\7\36\2\2"+
		"\u0595\u0596\5\u013a\u009e\2\u0596\u0597\5\u0114\u008b\2\u0597\u0599\3"+
		"\2\2\2\u0598\u0587\3\2\2\2\u0598\u0591\3\2\2\2\u0599\u011d\3\2\2\2\u059a"+
		"\u059b\7s\2\2\u059b\u05a4\7v\2\2\u059c\u059d\7s\2\2\u059d\u059f\5\u0120"+
		"\u0091\2\u059e\u05a0\5\u013c\u009f\2\u059f\u059e\3\2\2\2\u059f\u05a0\3"+
		"\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\7v\2\2\u05a2\u05a4\3\2\2\2\u05a3"+
		"\u059a\3\2\2\2\u05a3\u059c\3\2\2\2\u05a4\u011f\3\2\2\2\u05a5\u05ab\5\u0122"+
		"\u0092\2\u05a6\u05a7\5\u0122\u0092\2\u05a7\u05a8\7x\2\2\u05a8\u05a9\5"+
		"\u0120\u0091\2\u05a9\u05ab\3\2\2\2\u05aa\u05a5\3\2\2\2\u05aa\u05a6\3\2"+
		"\2\2\u05ab\u0121\3\2\2\2\u05ac\u05ae\5\u00e2r\2\u05ad\u05ac\3\2\2\2\u05ad"+
		"\u05ae\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af\u05b1\7<\2\2\u05b0\u05af\3\2"+
		"\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b7\5\u0114\u008b"+
		"\2\u05b3\u05b4\5\u0124\u0093\2\u05b4\u05b5\5\u0116\u008c\2\u05b5\u05b7"+
		"\3\2\2\2\u05b6\u05ad\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b7\u0123\3\2\2\2\u05b8"+
		"\u05b9\5\u012a\u0096\2\u05b9\u0125\3\2\2\2\u05ba\u05bb\7t\2\2\u05bb\u05bc"+
		"\5\u0114\u008b\2\u05bc\u05bd\7w\2\2\u05bd\u0127\3\2\2\2\u05be\u05c1\7"+
		"p\2\2\u05bf\u05c1\5\u012c\u0097\2\u05c0\u05be\3\2\2\2\u05c0\u05bf\3\2"+
		"\2\2\u05c1\u0129\3\2\2\2\u05c2\u05c5\7p\2\2\u05c3\u05c5\5\u012e\u0098"+
		"\2\u05c4\u05c2\3\2\2\2\u05c4\u05c3\3\2\2\2\u05c5\u012b\3\2\2\2\u05c6\u05c7"+
		"\t\6\2\2\u05c7\u012d\3\2\2\2\u05c8\u05c9\t\7\2\2\u05c9\u012f\3\2\2\2\u05ca"+
		"\u05cb\6\u0099\17\2\u05cb\u05cc\7\u0083\2\2\u05cc\u0131\3\2\2\2\u05cd"+
		"\u05ce\6\u009a\20\2\u05ce\u05cf\7\u0082\2\2\u05cf\u0133\3\2\2\2\u05d0"+
		"\u05d1\6\u009b\21\2\u05d1\u05d2\7\u0081\2\2\u05d2\u05d3\7\u0081\2\2\u05d3"+
		"\u0135\3\2\2\2\u05d4\u05d5\6\u009c\22\2\u05d5\u05d6\7\u0084\2\2\u05d6"+
		"\u05d7\7\u0084\2\2\u05d7\u0137\3\2\2\2\u05d8\u05d9\6\u009d\23\2\u05d9"+
		"\u05da\7|\2\2\u05da\u05db\7\u0083\2\2\u05db\u0139\3\2\2\2\u05dc\u05dd"+
		"\6\u009e\24\2\u05dd\u05de\7\u0082\2\2\u05de\u05df\7|\2\2\u05df\u013b\3"+
		"\2\2\2\u05e0\u05e1\6\u009f\25\2\u05e1\u05e2\7q\2\2\u05e2\u05e3\7q\2\2"+
		"\u05e3\u05e4\7q\2\2\u05e4\u013d\3\2\2\2\u05e5\u05e6\6\u00a0\26\2\u05e6"+
		"\u05e7\7\u0083\2\2\u05e7\u05e8\7\u0083\2\2\u05e8\u013f\3\2\2\2\u05e9\u05ea"+
		"\6\u00a1\27\2\u05ea\u05eb\5\u0146\u00a4\2\u05eb\u0141\3\2\2\2\u05ec\u05ed"+
		"\6\u00a2\30\2\u05ed\u05ee\5\u0146\u00a4\2\u05ee\u0143\3\2\2\2\u05ef\u05f0"+
		"\6\u00a3\31\2\u05f0\u05f1\5\u0146\u00a4\2\u05f1\u0145\3\2\2\2\u05f2\u05f7"+
		"\5\u014a\u00a6\2\u05f3\u05f4\6\u00a4\32\2\u05f4\u05f6\5\u0148\u00a5\2"+
		"\u05f5\u05f3\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8"+
		"\3\2\2\2\u05f8\u0603\3\2\2\2\u05f9\u05f7\3\2\2\2\u05fa\u05ff\5\u014c\u00a7"+
		"\2\u05fb\u05fc\6\u00a4\33\2\u05fc\u05fe\5\u014e\u00a8\2\u05fd\u05fb\3"+
		"\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u0603\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u05f2\3\2\2\2\u0602\u05fa\3\2"+
		"\2\2\u0603\u0147\3\2\2\2\u0604\u0605\5\u014a\u00a6\2\u0605\u0149\3\2\2"+
		"\2\u0606\u0607\t\b\2\2\u0607\u014b\3\2\2\2\u0608\u0609\7q\2\2\u0609\u014d"+
		"\3\2\2\2\u060a\u060d\7q\2\2\u060b\u060d\5\u0148\u00a5\2\u060c\u060a\3"+
		"\2\2\2\u060c\u060b\3\2\2\2\u060d\u014f\3\2\2\2\u060e\u0613\5\u0152\u00aa"+
		"\2\u060f\u0613\5\u015a\u00ae\2\u0610\u0613\5\u0154\u00ab\2\u0611\u0613"+
		"\5\u0156\u00ac\2\u0612\u060e\3\2\2\2\u0612\u060f\3\2\2\2\u0612\u0610\3"+
		"\2\2\2\u0612\u0611\3\2\2\2\u0613\u0151\3\2\2\2\u0614\u0616\5\u0132\u009a"+
		"\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u061d"+
		"\5\u0158\u00ad\2\u0618\u061a\5\u0132\u009a\2\u0619\u0618\3\2\2\2\u0619"+
		"\u061a\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\7\u008f\2\2\u061c\u0615"+
		"\3\2\2\2\u061c\u0619\3\2\2\2\u061d\u0153\3\2\2\2\u061e\u061f\t\t\2\2\u061f"+
		"\u0155\3\2\2\2\u0620\u0621\7j\2\2\u0621\u0157\3\2\2\2\u0622\u0623\t\n"+
		"\2\2\u0623\u0159\3\2\2\2\u0624\u0625\t\13\2\2\u0625\u015b\3\2\2\2\u00b1"+
		"\u015d\u0163\u0167\u016b\u016f\u0173\u0177\u0179\u0181\u0187\u018b\u018f"+
		"\u0193\u0199\u019d\u01a1\u01a5\u01a9\u01ad\u01b3\u01c0\u01c6\u01cc\u01d6"+
		"\u01df\u01e5\u01eb\u01f1\u01f7\u01ff\u0207\u020b\u0210\u0223\u022d\u0231"+
		"\u0235\u0239\u0244\u024c\u0256\u025b\u026e\u027b\u0280\u0283\u0287\u028c"+
		"\u0290\u029b\u02a0\u02a3\u02a6\u02b0\u02b5\u02cd\u02d6\u02dd\u02e0\u02e3"+
		"\u02ec\u02f5\u02f8\u02fb\u0301\u0304\u0308\u0313\u031c\u031f\u0322\u0327"+
		"\u032a\u0331\u033a\u033d\u0341\u0346\u034a\u0351\u0355\u0358\u035b\u035e"+
		"\u0364\u0368\u036b\u0370\u0372\u0376\u0382\u0389\u038d\u0392\u0395\u039b"+
		"\u03a1\u03ab\u03ae\u03b3\u03b6\u03c0\u03c8\u03cb\u03ce\u03d3\u03d6\u03db"+
		"\u03de\u03e2\u03e7\u03ea\u03ee\u03f6\u0400\u040e\u0419\u0421\u0429\u043a"+
		"\u0448\u044d\u0468\u046e\u0472\u047a\u0481\u048c\u0491\u04a4\u04ac\u04b0"+
		"\u04b7\u04bf\u04cd\u04d2\u04da\u04e0\u04e4\u04e8\u04ee\u04f4\u050b\u052c"+
		"\u0542\u0544\u054d\u0554\u0561\u0567\u0571\u0575\u0578\u057e\u0582\u0587"+
		"\u058b\u0591\u0598\u059f\u05a3\u05aa\u05ad\u05b0\u05b6\u05c0\u05c4\u05f7"+
		"\u05ff\u0602\u060c\u0612\u0615\u0619\u061c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}