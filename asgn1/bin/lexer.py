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
        'STRING_LITERAL','CHAR_CONST','INT_CONST','IDENTIFIER', 'FLOAT_CONST'] + [k.upper() for k in keywords]


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


FLOAT_CONST = r"""
(?:
    (?:0|[1-9][0-9]*)\.[0-9]*(?:[eE][+-]?[0-9]+)?
    |
    \.[0-9]+(?:[eE][+-]?[0-9]+)?
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

literals = ['(',')','+','-','*','/','=','?',':',',','.','^','|','&','~','!','=','[',']','{','}',';','<','>','@','%']

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

ERROR_LIST=[]

def t_error(t):
    # print("Illegal character '%s'" % t.value[0])
    ERROR_LIST.append(t.value[0])
    t.lexer.skip(1)

lexer = lex.lex()


relpath=sys.argv[1]
currdir=os.getcwd()
inp_file = open(currdir + "/" + relpath, "r")
data = inp_file.read() 


lexer.input(data)

Toks={}
for a in tokens+literals:
    Toks[a]=[a,0]

print "Tokens \t\t Occurances\t\tLexemes"
for tok in lexer:
    Toks[tok.type][1]=Toks[tok.type][1]+1
    if tok.value in Toks[tok.type][2:]: continue
    Toks[tok.type].append(tok.value)

for x in Toks:
    if Toks[x][1]!=0 :
        print "-"*64
        print Toks[x][0],"\n\t\t\t",Toks[x][1],"\t\t",Toks[x][2]
        for i in range(3,len(Toks[x])):
            print "\t\t\t\t\t",Toks[x][i]
print "-"*64,'\nIllegal list'
for i in range(0,len(ERROR_LIST)):
    print ERROR_LIST[i]+"\t",
print "\n","-"*64


# while True:
#    tok = lexer.token()
#    if not tok: 
#        break      # No more input
#    print(tok)
