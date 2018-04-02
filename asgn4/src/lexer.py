
import sys
import os
import ply.lex as lex

# List of token names.   This is always required

keywords = (  'associatedtype', 'class', 'deinit' , 'enum', 'extension' , 'fileprivate', 
	'func', 'import', 'init', 'inout', 'internal', 'let', 'open', 'operator', 'private', 'public',
	'static', 'struct', 'subscript', 'typealias', 'var' , 'break', 'case', 'continue', 'default', 'defer', 'do', 
	'else', 'fallthrough', 'for', 'guard', 'if', 'in', 'repeat', 'return', 'switch',
	'where', 'while',
	'as', 'Any', 'catch', 'false', 'is', 'nil', 'rethrows', 'super',  'Self', 
	'throw', 'throws', 'true', 'try', 'print','Int','Float','Double','String',
	'_',
	# '#available', '#colorLiteral', '#column', '#else', 
	# '#elseif', '#endif', '#file', '#fileLiteral', '#function', '#if', '#imageLiteral',
	# '#line', '#selector', '#sourceLocation',
	 'associativity', 'convenience', 'dynamic',
	'didSet', 'final', 'get', 'infix', 'indirect', 'lazy', 'left', 'mutating',
	'none', 'nonmutating', 'optional', 'override', 'postfix', 'precedence', 'prefix', 'required', 'right', 'set', 'Type', 'unowned', 'weak','willSet'
	)

# literals = '()+-*/=?:,.^|&~!=[]{};<>@%'

tokens = [ # 'NAME', 'LINE_COMMENT', 'BLOCK_COMMENT','ESCAPE_CHAR' , 'STRING_LITERAL', 'NUMBER' , 'BOOL','NUMERIC_LITERAL'
        #operator
        'GT','LT','EQUAL','RBRACK','LBRACK','RCURLY','LCURLY','RPAREN',
        'LPAREN','NOT','TILDE','OR','AND','MOD','DIV','MUL','SUB',
        'ADD','COLON','SEMICOLON','COMMA','DOT','CARET',
        'IDENTIFIER','STRING_LITERAL','CHAR_CONST','INT_CONST','FLOAT_CONST','LINE_COMMENT','NIL_LITERAL',
        'EQUALEQUAL','NOTEQUAL', 'OROR', 'ANDAND', 'LTE', 'GTE', 'ARROW', 'CONDOP', 'ATRATE', 'EXCLAMATION',
        'RSHIFT','LSHIFT', 'RANGEOP'
        ] + [k.upper() for k in keywords]


# def t_IDENTIFIER(t):
#     r'[a-zA-Z_][a-zA-Z_0-9]*'
#     t.type = reserved.get(t.value,'IDENTIFIER')    # Check for reserved words
#     return t


def t_IDENTIFIER(t):
    '[A-Za-z_$][A-Za-z0-9_$]*'
    if t.value in keywords:
        t.type = t.value.upper()
    return t

def t_STRING_LITERAL(t):
    r'\"([^\\\n]|(\\.))*?\"'
    return t

def t_CHAR_CONST(t): 
    r'\'[A-Za-z]\''
    return t

def t_NIL_LITERAL(t):
    r'nil'
    return t


FLOAT_CONST = r"""
(?:
    (?:0|[1-9][0-9]*)\.[0-9]*(?:[eE][+-]?[0-9]+)?
)
"""
@lex.TOKEN(FLOAT_CONST)
def t_FLOAT_CONST(t):
    # r'(([0-9](_?[0-9]+)*(\.[0-9](_?[0-9]+)*)?)[eE]\-[0-9](_?[0-9]+)*)|([0-9](_?[0-9]+)*\.[0-9](_?[0-9]+)*)([eE][\+]?[0-9](_?[0-9]+)*)?'
    # t.value = float(t.value.replace("_",""))
    return t


INT_CONST = r"""
(?:
    (?:0|[1-9][0-9]*)(?:[eE][+-]?[0-9]+)?
)
"""
@lex.TOKEN(INT_CONST)
def t_INT_CONST(t):
    # r'[0-9][0-9A-F]*'
    return t

# literals = ['(',')','+','-','*','/','=','?',':',',','.','^','|','&','~','!','=','[',']','{','}',';','<','>','@','%']
# literals =  ['@','?']
# t_NUM = r'\.?[0-9][0-9eE_lLdDa-fA-F.xXpP]*'
# t_NUM = r'\.?[0-9][0-9eE_lLdDa-fA-F.xXpP]*'
# t_PLUS    = r'\+'
# t_MINUS   = r'-'
# t_TIMES   = r'\*'
# t_DIVIDE  = r'/'
# t_MOD     = r'%'
# t_AMPERS  = r'&'
# t_OR = r'\|'
# t_LPAREN  = r'\('
# t_RPAREN  = r'\)'
# t_EQUAL   = r'='
# t_QUESTION = '?'
# t_SEMICOLON = ';'
# t_COLON = ':'
# t_NOT = '~'
t_CARET = r'\^'
t_DOT          = r'\.'
t_COMMA        = r','
t_SEMICOLON         =  r';'
t_COLON         = r':'
t_ADD          = r'\+'             
t_SUB         = r'-'              
t_MUL         = r'\*'             
# t_Expo          = r'\*\*'
t_DIV         = r'/'              
t_MOD           = r'%'              
t_AND          = r'&'              
t_OR         = r'\|'             
# t_BinXor        = r'\^'             
t_TILDE         = r'~'              
t_CONDOP        = r'\?'
t_NOT           = r'!'              
t_LPAREN     = r'\('             
t_RPAREN    = r'\)'             
t_LCURLY     = r'{'              
t_RCURLY    = r'}'              
t_LBRACK   = r'\['
t_RBRACK  = r'\]'
t_EQUAL       = r'\='
t_EQUALEQUAL         = r'=='
t_NOTEQUAL      = r'!='
t_LT            = r'<'              
t_GT            = r'>'              
t_LTE           = r'<='
t_GTE           = r'>='
t_OROR            = r'\|\|'           
t_ANDAND          = r'&&'       

t_ARROW         = r'->'
t_ATRATE        = r'@'
t_EXCLAMATION   = r'!'

t_RANGEOP   = r'\.\.\.'

# GT,LT,EQUAL,RBRACK,LBRACK,RCURLY,LCURLY,RPAREN,LPAREN,NOT,TILDE,
# OR,AND,MOD,DIV,MUL,SUB,ADD,COLON,SEMI,COMMA,DOT,CARET

# t_RIGHT_ASSIGN = r'>>='
# t_LEFT_ASSIGN = r'<<='
# t_ADD_ASSIGN = r'\+='
# t_SUB_ASSIGN = r'-='
# t_MUL_ASSIGN = r'\*='
# t_DIV_ASSIGN = r'/='

# t_MOD_ASSIGN = r'%='
# t_AND_ASSIGN = r'&='
# t_XOR_ASSIGN = r'\^='
# t_OR_ASSIGN = r'\|='
t_RSHIFT = r'>>'
t_LSHIFT = r'<<'
# t_INC_OP = r'\+\+'
# t_DEC_OP = r'--'

# DEC_OP,INC_OP,LEFT_OP,RIGHT_OP,OR_ASSIGN,XOR_ASSIGN,AND_ASSIGN,MOD_ASSIGN,
# DIV_ASSIGN,MUL_ASSIGN,SUB_ASSIGN,ADD_ASSIGN,LEFT_ASSIGN,RIGHT_ASSIGN

# t_AND_OP = r'&&'
# t_OR_OP = r'\|\|'
# t_LE_OP = r'<='
# t_GE_OP = r'>='
# t_EQ_OP = r'=='
# t_NE_OP = r'!='

# t_FUNC_RETURN = r'->'

t_ignore = " \t\v\f"


def t_LINE_COMMENT(t):
    r'(/\*(.|\n)*?\*/)|(//(.)*\n)'
    t.lexer.lineno += t.value.count('\n')

def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)

ERROR_LIST=[]

def t_error(t):
    # print("Illegal character '%s'" % t.value[0])
    ERROR_LIST.append(t.value[0])
    t.lexer.skip(1)

lexer = lex.lex()


# relpath=sys.argv[1]
# currdir=os.getcwd()
# inp_file = open(currdir + "/" + relpath, "r")
# data = raw_input('calc > ')


# lexer.input(data)


# while True:
#    tok = lexer.token()
#    if not tok: 
#        break      # No more input
#    print(tok)
