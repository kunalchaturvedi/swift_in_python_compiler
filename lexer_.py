import ply.lex as lex

# List of token names.   This is always required

keywords = (  'associatedtype', 'class', 'deinit' , 'enum', 'extension' , 'fileprivate', 
	'func', 'import', 'init', 'inout', 'internal', 'let', 'open', 'operator', 'private', 'protocol', 'public',
	'static', 'struct', 'subscript', 'typealias', 'var' , 'break', 'case', 'continue', 'default', 'defer', 'do', 
	'else', 'fallthrough', 'for', 'guard', 'if', 'in', 'repeat', 'return', 'switch',
	'where', 'while',
	'as', 'Any', 'catch', 'false', 'is', 'nil', 'rethrows', 'super', 'self', 'Self', 
	'throw', 'throws', 'true', 'try',
	'_',
	'#available', '#colorLiteral', '#column', '#else', 
	'#elseif', '#endif', '#file', '#fileLiteral', '#function', '#if', '#imageLiteral',
	'#line', '#selector', '#sourceLocation',
	'associativity', 'convenience', 'dynamic',
	'didSet', 'final', 'get', 'infix', 'indirect', 'lazy', 'left', 'mutating',
	'none', 'nonmutating', 'optional', 'override', 'postfix', 'precedence', 'prefix',
	'Protocol', 'required', 'right', 'set', 'Type', 'unowned', 'weak','willSet'
)




tokens = (
   'NUMBER',
   'PLUS',
   'MINUS',
   'TIMES',
   'DIVIDE',
   'LPAREN',
   'RPAREN',
)

# Regular expression rules for simple tokens
t_PLUS    = r'\+'
t_MINUS   = r'-'
t_TIMES   = r'\*'
t_DIVIDE  = r'/'
t_LPAREN  = r'\('
t_RPAREN  = r'\)'

# A regular expression rule with some action code
def t_NUMBER(t):
    r'\d+'
    t.value = int(t.value)    
    return t

# Define a rule so we can track line numbers
def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)

# A string containing ignored characters (spaces and tabs)
t_ignore  = ' \t'

# Error handling rule
def t_error(t):
    print("Illegal character '%s'" % t.value[0])
    t.lexer.skip(1)

# Build the lexer
lexer = lex.lex()