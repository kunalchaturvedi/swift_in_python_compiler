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
	'throw', 'throws', 'true', 'try', 'print','Int','Float','Double',
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
        'RIGHT_ASSIGN','LEFT_ASSIGN','ADD_ASSIGN','SUB_ASSIGN','MUL_ASSIGN','DIV_ASSIGN',
        'MOD_ASSIGN','AND_ASSIGN','XOR_ASSIGN','OR_ASSIGN','RIGHT_OP','LEFT_OP','INC_OP','DEC_OP',
        'AND_OP','OR_OP','LE_OP','GE_OP','EQ_OP','NE_OP','FUNC_RETURN',
        #literal
        'STRING_LITERAL','CCONST','NUMBER','NAME'] + [k.upper() for k in keywords]


# def t_IDENTIFIER(t):
#     r'[a-zA-Z_][a-zA-Z_0-9]*'
#     t.type = reserved.get(t.value,'IDENTIFIER')    # Check for reserved words
#     return t


def t_NAME(t):
    '[A-Za-z_$][A-Za-z0-9_$]*'
    if t.value in keywords:
        t.type = t.value.upper()
    return t

def t_STRING_LITERAL(t):
    r'\"([^\\\n]|(\\.))*?\"'
    return t

def t_CCONST(t): 
    r'(L)?\'([^\\\n]|(\\.))*?\''
    return t

def t_NUMBER(t):
    r'\.?[0-9][0-9eE_lLdDa-fA-F.xXpP]*'
    return t


literals = '()+-*/=?:,.^|&~!=[]{};<>@%'

# t_NUM = r'\.?[0-9][0-9eE_lLdDa-fA-F.xXpP]*'
# t_NUM = r'\.?[0-9][0-9eE_lLdDa-fA-F.xXpP]*'

t_RIGHT_ASSIGN = r'>>='
t_LEFT_ASSIGN = r'<<='
t_ADD_ASSIGN = r'\+='
t_SUB_ASSIGN = r'-='
t_MUL_ASSIGN = r'\*='
t_DIV_ASSIGN = r'/='

t_MOD_ASSIGN = r'%='
t_AND_ASSIGN = r'&='
t_XOR_ASSIGN = r'\^='
t_OR_ASSIGN = r'\|='
t_RIGHT_OP = r'>>'
t_LEFT_OP = r'<<'
t_INC_OP = r'\+\+'
t_DEC_OP = r'--'


t_AND_OP = r'&&'
t_OR_OP = r'\|\|'
t_LE_OP = r'<='
t_GE_OP = r'>='
t_EQ_OP = r'=='
t_NE_OP = r'!='

t_FUNC_RETURN = r'->'

t_ignore = " \t\v\f"


def t_LINE_COMMENT(t):
    r'(/\*(.|\n)*?\*/)|(//(.)*\n)'
    t.lexer.lineno += t.value.count('\n')

def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)


def t_error(t):
    print("Illegal character '%s'" % t.value[0])
    t.lexer.skip(1)

lexer = lex.lex()


relpath=sys.argv[1]
currdir=os.getcwd()
inp_file = open(currdir + "/bin/" + relpath, "r")
data = inp_file.read() 


lexer.input(data)

while True:
    tok = lexer.token()
    if not tok: 
        break      # No more input
    print(tok)
