# Define the list of registers
reglist = ['%eax', '%ebx', '%ecx', '%edx']
# Construct the register descriptor table
registers = {}
registers = registers.fromkeys(reglist)
addr_desc={}

def isnumber(num):
	t = num.isdigit() or (num[1:].isdigit() and num[0] == "-")
	return t

# Sets the register descriptor entry as per the arguments
def setregister(register, content):
	registers[register] = content

# getreg function... return register for the variable. spilling implemented here.
def getReg(variable, instrno):
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
def getlocation(variable):
	return addr_desc[variable]['loc']

# Sets the location entry in the adrdrss decriptor for a variable 
def setlocation(variable, location):
	addressDescriptor[variable] = location

# Returns the nextuse of the variable
def nextuse(variable, line):
	return nextuseTable[line-1][variable]