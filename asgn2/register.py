# Define the list of registers
reglist = ['%eax', '%ebx', '%ecx', '%edx']
# Construct the register descriptor table
registers = {}
registers = registers.fromkeys(reglist)
addr_desc={}
addr_desc = {} 
varlist = []
basic_blocks = [] # The list of blocks

symbol_table={}
fname = 'A.txt'
count_label = 0
count_temp = 0
code = ''
offset = 0
non_vars = ['label', 'call']
# keywords = ['ifgoto', 'goto', 'ret', 'print', 'function', 'exit'] + non_vars



##########
rel_ops = ['lt', 'leq', 'gt', 'geq', 'eq', 'neq']

logic_ops = ['!', '&&', '||']

arith_ops = ['+', '-', '*', '/', '%']

operators = arith_ops + rel_ops + logic_ops + ['=']

keywords = ['ifgoto', 'goto', 'ret', 'print', 'function', 'exit'] +  non_vars
lang = operators + keywords
# Variables
# basic_blocks = [] # The list of blocks


def isnumber(num):
	t = num.isdigit() or (num[1:].isdigit() and num[0] == "-")
	return t

# Sets the register descriptor entry as per the arguments
def setReg(register, content):
	global registers
	registers[register] = content

# getreg function... return register for the variable. spilling implemented here.
def getReg(variable, instrno):
	global registers
	global nextuseTable
	#instrno is the line number!
	if variable in registers.values():
		for x in registers.keys():
			if registers[x] == variable:
				return x
	for x in registers.keys():
		if registers[x] == None:
			return x
	instrvardict = nextuseTable[instrno - 1]
	farthestnextuse = max(instrvardict.keys())
	for var in instrvardict:
		if instrvardict[var] == farthestnextuse:
			break;
	#var is variable to be spilled!
	for regspill in registers.keys():
		if registers[regspill] == var:
			break;
	#regspill contais register to be spilled!!
	assembly = assembly + "movl " + regspill + ", " + var + "\n"
	return regspill

# Returns the location of the variable from the addrss descriptor table
def getLocation(variable):
	global addr_desc
	return addr_desc[variable]

# Sets the location entry in the adrdrss decriptor for a variable 
def setLocation(variable, location):
	global addr_desc
	addr_desc[variable] = location

# Returns the nextuse of the variable
def nextuse(variable, line):
	global nextuseTable
	return nextuseTable[line-1][variable]