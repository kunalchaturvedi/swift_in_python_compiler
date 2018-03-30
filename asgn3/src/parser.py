import sys
import ply.yacc as yacc
from lexer import *

import sys


# Precedence and associativity of operators
precedence = (
	('left', 'OR'),
	('left', 'AND'),
	('left', 'EQUAL', 'NOTEQUAL'),
	('left', 'GT', 'GTE', 'LT', 'LTE'),
	('left', 'RSHIFT', 'LSHIFT'),
	('left', 'ADD', 'SUB'),
	('left', 'MUL', 'DIV', 'MOD'),
	('right', 'TILDE')
)

#  Statements 

def p_start(p):
   'start : statements'
   p[0]=p[1]

def p_statements(p):
	"""
	statements : statement statements
	|
	"""



def p_statement(p):
	"""statement : expression 
		| declaration 
		| loop_statement 
		| branch_statement 
		| control_transfer_statement
		| print_statement
		"""
	p[0]=p[1]


def p_print_statement(p):
	"""
	print_statement : PRINT LPAREN print_arg_list RPAREN
	"""

def p_print_arg_list(p):
	"""
	print_arg_list : print_arg COMMA print_arg_list
	 | print_arg
	"""

def p_print_arg(p):
	"""
	print_arg : identifier
	| literal
	| expression
	"""

def p_loop_statement(p):
	"""
	loop_statement : for_statement 
	| while_statement
	| repeat_while_statement
	"""

def p_for_statement(p):
	"""
	for_statement : FOR LPAREN for_init SEMICOLON expression SEMICOLON expression RPAREN code_block
	"""	
def p_for_init(p):
	"""
	for_init : variable_declaration 
	| expression_list
	"""

def p_while(p):
	"""
	while_statement : WHILE condition_list code_block
	"""

def p_condition_list(p):
	"""
	condition_list : condition commacond
	"""
def p_commacond(p):  #*
	"""
	commacond : COMMA condition commacond
	|
	"""


def p_condition(p):
	"""
	condition : expression
 	| case_condition
 	| optional_binding_condition
	
	"""

def p_case_condition(p):
	"""
	case_condition : CASE pattern initializer

	"""

def p_optional_binding_condition(p):
	"""
	optional_binding_condition : LET pattern initializer
 	| VAR pattern initializer

	"""

def p_repeat_while_statement(p):
	"""
	repeat_while_statement : REPEAT code_block WHILE expression 
	"""

def p_branch_statement(p):
	"""
	branch_statement : if_statement
 	| switch_statement
	"""

def p_if_statement(p):
	"""
	if_statement : IF condition_list code_block else_clause 
	| IF condition_list code_block
	"""
def p_else_clause(p):
	"""
	else_clause : ELSE code_block 
	| ELSE if_statement
	"""

def p_switch_statement(p):
	"""
	switch_statement : SWITCH expression LCURLY switch_cases RCURLY
	| SWITCH expression LCURLY RCURLY
	"""

def p_switch_cases(p):
	"""
	switch_cases : switch_case switch_cases
	| switch_case 
	"""

def p_switch_case(p):
	"""
	switch_case : case_label statements 
	| default_label statements
	"""

def p_case_label(p):
	"""
	case_label : CASE case_item_list COLON
	"""

def p_case_item_list(p):
	"""
	case_item_list : pattern where_clause
	| pattern 
	| pattern where_clause COMMA case_item_list
	| pattern COMMA case_item_list
	"""

def p_default_label(p):
	"""
	default_label : DEFAULT COLON
	""" 

def p_where_clause(p):
	"""
	where_clause : WHERE where_expression
	"""

def p_where_expression(p):
	"""
	where_expression : expression
	"""
# control_transfer_statement

def p_control_transfer_statement(p):
	"""
	control_transfer_statement : break_statement
 	| continue_statement
 	| return_statement

	"""

def p_break_statement(p):
	"""
	break_statement : BREAK
	"""

def p_continue_statement(p):
	"""
	continue_statement : CONTINUE
	"""

def p_return_statement(p):
	"""
	return_statement : RETURN expression
	| RETURN
	"""


########################################################

def p_declaration(p):
	"""
	declaration : import_declaration
	| constant_declaration
	| variable_declaration
	| function_declaration
	| struct_declaration
	| operator_declaration
	"""
# declarations : declaration+ 

# GRAMMAR OF A TOP-LEVEL DECLARATION
def p_top_level_declaration(p):
	"""
	top_level_declaration : statements
	| 
	"""

# GRAMMAR OF A CODE BLOCK
def p_code_block(p):
	"""
	code_block : LCURLY statements RCURLY
	| LCURLY RCURLY
	"""

# GRAMMAR OF AN IMPORT DECLARATION
def p_import_declaration(p):
	"""
	import_declaration : IMPORT import_kind import_path
	| IMPORT import_path
	"""

def p_import_kind(p):
	"""
	import_kind : TYPEALIAS 
	| STRUCT 
	| VAR 
	| FUNC  
	"""
	# | 'class' 
	# | 'enum' 
	# | 'protocol' 


def p_import_path(p):
	"""
	import_path : import_path_identifier dot_import_path_identifier
	"""
def p_dot_import_path_identifier(p): #*
	"""
	dot_import_path_identifier : DOT import_path_identifier dot_import_path_identifier
	|
	"""


def p_import_path_identifier(p):
	"""
	import_path_identifier : declaration_identifier 
	| operator  
	"""

# // GRAMMAR OF A CONSTANT DECLARATION

def p_constant_declaration(p):
	"""
	constant_declaration : LET pattern_initializer_list
	"""
# declaration_modifiers LET pattern_initializer_list


def p_pattern_initializer_list(p):
	"""
	pattern_initializer_list : pattern_initializer p_com_pat_init_star
	"""
def p_com_pat_init_star(p): #*
	"""
	p_com_pat_init_star : COMMA pattern_initializer p_com_pat_init_star
	|
	"""


# /** rule is ambiguous. can match "var x = 1" with x as pattern
#  *  OR with x as expression_pattern.
#  *  ANTLR resolves in favor or first choice: pattern is x, 1 is initializer.
#  */
def p_pattern_initializer(p):
	"""
	pattern_initializer : pattern initializer
	| pattern
	"""

def p_initializer(p):
	"""
	initializer : EQUAL expression  
	"""

# // GRAMMAR OF A VARIABLE DECLARATION //-----------------//

def p_variable_declaration(p):
	"""
	variable_declaration : variable_declaration_head variable_name type_annotation code_block
	| variable_declaration_head variable_name type_annotation initializer
	| variable_declaration_head pattern_initializer_list
	
	"""
	# | variable_declaration_head variable_name type_annotation getter_setter_block
	# | variable_declaration_head variable_name type_annotation getter_setter_keyword_block
	# | variable_declaration_head variable_name type_annotation initializer? willSet_didSet_block
	# | variable_declaration_head variable_name type_annotation type_annotation initializer? willSet_didSet_block

def p_variable_declaration_head(p):
	"""
	variable_declaration_head : VAR    
	"""
# declaration_modifiers VAR



def p_variable_name(p):
	"""
	variable_name : declaration_identifier  
	"""

# getter_setter_block : LCURLY getter_clause setter_clause?RCURLY  | LCURLY setter_clause getter_clause RCURLY  
# getter_clause : /*attributes?*/ mutation_modifier? 'get' code_block  
# setter_clause : /*attributes?*/ mutation_modifier? 'set' setter_name? code_block  
# setter_name : LPAREN declaration_identifier RPAREN  

# getter_setter_keyword_block : LCURLY getter_keyword_clause setter_keyword_clause?RCURLY | LCURLY setter_keyword_clause getter_keyword_clause RCURLY  
# getter_keyword_clause : /*attributes?*/ mutation_modifier? 'get'  
# setter_keyword_clause : /*attributes?*/ mutation_modifier? 'set'  

# willSet_didSet_block : LCURLY willSet_clause didSet_clause?RCURLY | LCURLY didSet_clause willSet_clause RCURLY  
# willSet_clause : /*attributes?*/ 'willSet' setter_name? code_block  
# didSet_clause : /*attributes?*/ 'didSet' setter_name? code_block  



# // GRAMMAR OF A FUNCTION DECLARATION-------------------------
def p_function_declaration(p):
	"""
	function_declaration : function_head function_name function_signature function_body
	| function_head function_name function_signature 
	"""

def p_function_head(p):
	"""
	function_head : FUNC
	"""

#  declaration_modifiers FUNC

def p_function_name(p):
	"""
	function_name : declaration_identifier 
	| operator 
	"""

def p_function_signature(p):
	"""
	function_signature : parameter_clause THROWS function_result
	| parameter_clause 
	| parameter_clause THROWS 
	| parameter_clause function_result
	| parameter_clause RETHROWS function_result
	| parameter_clause RETHROWS
	
	"""

def p_function_result(p):
	"""
	function_result : ARROW type 
	"""

def p_function_body(p):
	"""
	function_body : code_block 
	"""

def p_parameter_clause(p):
	"""
	parameter_clause : LPAREN RPAREN 
	|  LPAREN parameter_list RPAREN  
	"""

def p_parameter_list(p):
	"""
	parameter_list : parameter commapar  
	"""
def p_commapar(p): #*
	"""
	commapar : COMMA parameter commapar
	|
	"""


def p_parameter(p):
	"""
	parameter : external_parameter_name local_parameter_name type_annotation default_argument_clause
	|  local_parameter_name type_annotation 
	|  local_parameter_name type_annotation default_argument_clause
	| external_parameter_name local_parameter_name type_annotation 
	| external_parameter_name local_parameter_name type_annotation RANGEOP
	| local_parameter_name type_annotation RANGEOP
	
	"""

def p_external_parameter_name(p):
	"""
	external_parameter_name : label_identifier 
	"""

def p_local_parameter_name(p):
	"""
	local_parameter_name : label_identifier 
	"""

def p_default_argument_clause(p):
	"""
	default_argument_clause : EQUAL expression 
	"""

# // GRAMMAR OF A STRUCTURE DECLARATION todo did not update

def p_struct_declaration(p):
	"""
	struct_declaration : STRUCT struct_name struct_body  
	"""

def p_struct_name(p):
	"""
	struct_name : declaration_identifier  
	"""

def p_struct_body(p):
	"""
	struct_body : LCURLY struct_member_star RCURLY  
	"""
def p_struct_member_star(p): #*
	"""
	struct_member_star : struct_member struct_member_star
	|
	"""


def p_struct_member(p):
	"""
	struct_member : declaration 
	"""

# // GRAMMAR OF AN OPERATOR DECLARATION

def p_operator_declaration(p):
	"""
	operator_declaration : prefix_operator_declaration 
	| postfix_operator_declaration 
	| infix_operator_declaration 
	"""

def p_prefix_operator_declaration(p):
	"""
	prefix_operator_declaration : PREFIX OPERATOR operator 
	"""

def p_postfix_operator_declaration(p):
	"""
	postfix_operator_declaration : POSTFIX OPERATOR operator 
	"""

def p_infix_operator_declaration(p):
	"""
	infix_operator_declaration : INFIX OPERATOR operator 
	"""

# // GRAMMAR OF A DECLARATION MODIFIER

def p_declaration_modifier(p):
	"""
	declaration_modifier : POSTFIX
	| PREFIX
	| STATIC
	"""
#  'class'
# 	| 'dynamic'
# 	| 'override'
# 	| 'required'
# 	| access_level_modifier


# def p_access_level_modifier(p):
# 	"""
# 	access_level_modifier
# 	: 'private' | 'private' LPAREN 'set' RPAREN
# 	| 'fileprivate' | 'fileprivate' LPAREN 'set' RPAREN
# 	| 'internal' | 'internal' LPAREN 'set' RPAREN
# 	| 'public' | 'public' LPAREN 'set' RPAREN
# 	| 'open' | 'open' LPAREN 'set' RPAREN
	
# 	"""

# // GRAMMAR OF A PATTERN //********danger!!!****** */

def p_pattern(p):
	"""
	pattern : identifier_pattern type_annotation
	| identifier_pattern
	| value_binding_pattern
	| expression_pattern
	
	"""

def p_identifier_pattern(p):
	"""
	identifier_pattern : declaration_identifier 
	"""

def p_value_binding_pattern(p):
	"""
	value_binding_pattern : VAR pattern
	| LET pattern
	"""


def p_expression_pattern(p):
	"""
	expression_pattern : expression  
	"""

# // GRAMMAR OF AN EXPRESSION

def p_expression(p):
	"""
	expression : prefix_expression binary_expressions
	| prefix_expression
	"""

def p_expression_list(p):
	"""
	expression_list : expression commaexp 
	"""
def p_commaexp(p): #*
	"""
	commaexp : COMMA expression commaexp
	|
	"""


def p_prefix_expression(p):
	"""
	prefix_expression : prefix_operator postfix_expression
	| postfix_expression
	| in_out_expression
	"""

def p_in_out_expression(p):
	"""
	in_out_expression : AND declaration_identifier 
	"""

def p_binary_expression(p):
	"""
	binary_expression : binary_operator prefix_expression
	| EQUAL prefix_expression
	| conditional_operator  prefix_expression
	"""

def p_binary_expressions(p):
	"""
	binary_expressions : binary_expression_plus 
	"""
def p_binary_expression_plus(p): #+
	"""
	binary_expression_plus : binary_expression binary_expression_plus
	| binary_expression
	"""


# correct hai 
def p_conditional_operator(p):
	"""
	conditional_operator : CONDOP expression COLON 
	"""
# i say write
# 	conditional_operator : CONDOP expression COLON expression

def p_primary_expression(p):
	"""
	primary_expression : declaration_identifier
	| literal_expression
	| parenthesized_expression
	"""

def p_literal_expression(p):
	"""
	literal_expression : literal
	| array_literal
	"""

def p_array_literal(p):
	"""
	array_literal : LBRACK array_literal_items RBRACK
	| LBRACK RBRACK 
	"""

def p_array_literal_items(p):
	"""
	array_literal_items : array_literal_item COMMA
	| array_literal_item
	| array_literal_item COMMA array_literal_items
	"""

def p_array_literal_item(p):
	"""
	array_literal_item : expression 
	"""

def p_paranthesized_expression(p):
	"""
	parenthesized_expression : LPAREN expression RPAREN 
	"""

# // GRAMMAR OF A POSTFIX EXPRESSION (inlined many rules from spec to avoid indirect left-recursion)
def p_postfix_expression(p):
	"""
	postfix_expression : primary_expression
	| postfix_expression function_call_argument_clause
	| postfix_expression DOT INIT 
	| postfix_expression DOT INIT LPAREN argument_names RPAREN
	| postfix_expression DOT INT_CONST
	| postfix_expression DOT declaration_identifier
	| postfix_expression DOT declaration_identifier LPAREN argument_names RPAREN
	| postfix_expression LPAREN argument_names RPAREN 
	| postfix_expression DOT SELF 
	| postfix_expression LBRACK expression_list RBRACK
	"""
# postfix_expression /* ************************************************************************************************************ */
#  : primary_expression                                                  # primary
#  | postfix_expression postfix_operator                                 # postfix_operation
#  | postfix_expression function_call_argument_clause                    # function_call_expression
# //  | postfix_expression function_call_argument_clause? trailing_closure  # function_call_expression_with_closure
#  | postfix_expression DOT INIT                                       # initializer_expression
#  | postfix_expression DOT INIT LPAREN argument_names RPAREN                # initializer_expression_with_args
#  | postfix_expression DOT Pure_decimal_digits                          # explicit_member_expression1
#  | postfix_expression DOT declaration_identifier /*generic_argument_clause?*/          # explicit_member_expression2
#  | postfix_expression DOT declaration_identifier LPAREN argument_names RPAREN            # explicit_member_expression3
# // This does't exist in the swift grammar, but this valid swift statement fails without it
# // self.addTarget(self, action: #selector(nameOfAction(_:)))
#  | postfix_expression LPAREN argument_names RPAREN                           # explicit_member_expression4
#  | postfix_expression DOT SELF                                       # postfix_self_expression
# //  | dynamic_type_expression                                             # dynamic_type
#  | postfix_expression LBRACK expression_list RBRACK                          # subscript_expression
# // ! is a postfix operator already
# // | postfix_expression '!'                                            # forced_value_expression
# // ? is a postfix operator already
# // | postfix_expression CONDOP                                            # optional_chaining_expression
#  


# // GRAMMAR OF A FUNCTION CALL EXPRESSION
def p_function_call_argument_clause(p):
	"""
	function_call_argument_clause : LPAREN RPAREN
	| LPAREN function_call_argument_list RPAREN
	"""

def p_function_call_arguement_list(p):
	"""
	function_call_argument_list : function_call_argument COMMAfunction_call_argument_star
	"""
def p_COMMAfunction_call_argument_star(p):#*
	"""
	COMMAfunction_call_argument_star : COMMA function_call_argument COMMAfunction_call_argument_star
	|
	"""


def p_function_call_argument(p):
	"""
	function_call_argument : expression
	| label_identifier COLON expression
	| operator
	| label_identifier COLON operator
	"""

# // GRAMMAR OF AN EXPLICIT MEMBER EXPRESSION
 
def p_arguement_names(p):
	"""
	argument_names : argument_name argument_name_star 
	"""
def p_argument_name_star(p): #*
	"""
	argument_name_star : argument_name argument_name_star
	|
	"""


def p_arguement_name(p):
	"""
	argument_name : label_identifier COLON 
	"""

def p_type(p):
	"""
	type : array_type 
	| function_type 
	| type_identifier 
	"""


# // GRAMMAR OF A TYPE ANNOTATION

def p_type_annotation(p):
	"""
	type_annotation : COLON INOUT type
	| COLON type
	"""

def p_type_identifier(p):
	"""
	type_identifier : type_name DOT type_identifier
	| type_name
	"""

def p_type_name(p):
	"""
	type_name : declaration_identifier
	| type_keyword
	"""

def p_type_keywords(p):
	"""
	type_keyword : INT
	| FLOAT
	| DOUBLE
	| STRING
	"""

# // GRAMMAR OF A FUNCTION TYPE
def p_function_type(p):
	"""
	function_type : function_type_argument_clause THROWS ARROW type
	| function_type_argument_clause ARROW type
	| function_type_argument_clause RETHROWS ARROW type
	
	"""

def p_function_type_argument_clause(p):
	"""
	function_type_argument_clause : LPAREN RPAREN
	| LPAREN function_type_argument_list RANGEOP RPAREN
	| LPAREN function_type_argument_list  RPAREN
	"""

def p_function_type_argument_list(p):
	"""
	function_type_argument_list : function_type_argument
	| function_type_argument COMMA function_type_argument_list
	
	"""

def p_function_type_argument(p):
	"""
	function_type_argument : INOUT type
	| type
	| argument_label type_annotation
	
	"""

def p_arguement_label(p):
	"""
	argument_label : label_identifier 
	"""

def p_array_type(p):
	"""
	array_type : LBRACK type RBRACK 
	"""

# ########LEXICAL STRUCTURE PART REMAINING##############

def p_identifier(p):
	"""
	identifier : IDENTIFIER
	"""
# // identifier is context sensitive


# // var x = 1 funx x() {} class x {}
def p_declaration_identifier(p):
	"""
	declaration_identifier : IDENTIFIER	
	"""


# // external, internal argument name
def p_label_identifer(p):
	"""
	label_identifier : IDENTIFIER
	"""

# need to take care of cases for == and other operators

# need to add operators

def p_prefix_operator(p):
	"""
	prefix_operator : operator
	"""

def p_binary_operator(p):
	"""
	binary_operator : operator
	"""

def p_postfix_operator(p):
	"""
	postfix_operator : operator
	"""

# ('/' | '=' | '-' | '+' | '!' | '*' | '%' | '&'
#  | '|' | '<' | '>' | '^' | '~' | '?') 
def p_operator(p):
	"""
	operator : DIV
	| EQUAL
	| SUB
	| ADD
	| EXCLAMATION
	| MUL
	| MOD
	| AND
	| OR
	| LT
	| GT
	| CARET
	| TILDE
	| CONDOP
	| conditional_operator
	| ANDAND
	| OROR
	| NOT
	| DOT
	"""

def p_conditional_operator(p):
	"""
	conditional_operator : EQUALEQUAL
	| NOTEQUAL
	| LTE
	| GTE
	| LT
	| GT
	"""


def p_literal(p):
	"""
	literal : STRING_LITERAL
	| CHAR_CONST
	| FLOAT_CONST
	| INT_CONST
	| NIL_LITERAL
	"""

########################################################


def p_error(p):
    if p:
        print("Syntax error just before '%s'" % p.value)
    else:
        print("Syntax error at EOF")

def read_data(filename):
    fp = open(filename, 'r')
    data = fp.read()
    fp.close()
    return data

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Insufficient arguments!')
        print('Format: python yacc.py test.js')
        sys.exit()
    filename = sys.argv[1]
    data = read_data(filename)
    parser = yacc.yacc(debug=True, optimize=False)
    result = parser.parse(data, debug=2)
