#!/usr/bin/python
import sys
from symtab import *
<<<<<<< HEAD
symbol_tab = symbol_table()
=======
# symbol_tab = symbol_table()
>>>>>>> fc857b6879028637f19f7fb843a7ed3907efc42c
fname = 'A.txt'
count_label = 0
count_temp = 0
code = ''
offset = 0
non_vars = ['label', 'call']
# keywords = ['ifgoto', 'goto', 'ret', 'print', 'function', 'exit'] + non_vars
addr_desc = {} 
<<<<<<< HEAD

=======
varlist = []
>>>>>>> fc857b6879028637f19f7fb843a7ed3907efc42c

# Variables
basic_blocks = [] # The list of blocks

##########
rel_ops = ['lt', 'leq', 'gt', 'geq', 'eq', 'neq']

logic_ops = ['!', '&&', '||']

arith_ops = ['+', '-', '*', '/', '%']

operators = arith_ops + rel_ops + logic_ops + ['=']

keywords = ['ifgoto', 'goto', 'ret', 'print', 'function', 'exit'] +  non_vars
lang = operators + keywords
# Variables
basic_blocks = [] # The list of blocks

class label(object):
  def __init__(self,_id = 0,name=''):
    global count_label
    # self.code = code
    self._id = count_label;
    if name == '':
      name = 'L' + str(count_label) 
      count_label = count_label + 1;
    self.name = name
  def __repr__(self):
    return (self.name+':')

class newtemp(object):
  def __init__(self,_id = 0):
    global count_temp
    self.count = count_temp
    self._id = count_temp;
    count_temp = count_temp + 1;
  def __repr__(self):
    p = 'T' + str(self.count)
    return p

class Assignment():
  """docstring for Assignment"""
  def __init__(self,source='',sourceadd='', destination='',destinationadd=''):
    self.source = source
    self.destination = destination
  def __repr__(self):
    return self.source + ' = ' + self.destination

class Function_definition():
  """docstring for Function_definition"""
  def __init__(self,name=''):
    self.name = name
  def __repr__(self):
    return self.name

class BinOp():
  """docstring for BinOp"""
  def __init__(self,destination='',source_1='',operand='',source_2=''):
    self.source_1 = source_1
    self.source_2 = source_2
    self.operand = operand
    self.destination = destination
  def __repr__(self):
    return self.destination + ' = ' + self.source_1 + self.operand + self.source_2

def Jump(arg, arg2):
  global code
  code = code + '\t'+arg2+' ' + str(arg) + '\n'

def Compare(arg1, arg2):
  global code
  code = code + '\tCMP ' + str(arg1) +', ' + str(arg2) + '\n'

def PushParam(arg1,add1):
  global code
  code = code + '\tPUSH ' + str(arg1)+ '\n'

def FuncCall(arg1,arg2):
  global code
  k = int(get_argc_symbol_table(str(arg1.value),'s0'))
  # print "+++",get_argc_symbol_table(str(arg1.value),'s0')
  code = code + '\tCALL ' + str(arg1.value)+ '\n'
  code = code + '\t'+arg2+' = Ret Value'+'\n'

def Decl(arg1):
  global offset
  global code
  arg2 = arg1.children[0]
  p = arg2.value
  temp = str(get_size_symbol_table(arg2.value, arg1.scope_name))
  address = "[ebp-"+str(offset+int(temp))+"]"
  set_address_symbol_table(arg2.value, arg1.scope_name,address)
  offset =offset+int(temp)
  code = code + '\tDecl ' + str(p)+' '+temp+ '\n'
  return address

def Ret():
  global code
  code = code + '\tRET '+ '\n'

def BeginFunc():
  global code
  code = code + '\tBeginFunc'+'\n'

def EndFunc():
  global code
  code = code + '\tEndFunc'+'\n'
################
# arith_ops = ['+', '-', '*', '/', '%']
# rel_ops = ['lt', 'leq', 'gt', 'geq', 'eq', 'neq']
# logic_ops = ['!', '&&', '||']
# operators = arith_ops + rel_ops + logic_ops + ['=']



def leader_block_func(lines):
	leader_block=[]
	basic_blocks=[]
	leader_block.append(1)   # for first line of execution by default
	for line in lines:
		if line[1] == 'call':
<<<<<<< HEAD
			leader_block.append(int(line[0])+1)
=======
			leader_block.append(int(line[0]))
>>>>>>> fc857b6879028637f19f7fb843a7ed3907efc42c
		elif line[1] == 'ifgoto':
			leader_block.append(int(line[-1]))
			leader_block.append(int(line[0])+1)
		elif line[1] == 'label':
			leader_block.append(int(line[0]))
		elif line[1] == 'goto':
			leader_block.append(int(line[-1]))
<<<<<<< HEAD
		# elif line[1] == 'ret':
		# 	leader_block.append(int(line[0]))
	leader=sorted(leader_block)
=======
			leader_block.append(int(line[0])+1)
		# elif line[1] == 'ret':
		# 	leader_block.append(int(line[0]))
	leader=sorted(list(set(leader_block)))
>>>>>>> fc857b6879028637f19f7fb843a7ed3907efc42c
	return leader

def Basic_block(lines,leader_block):
	basic_blocks=[]
	count=1
	num_leader=len(leader_block)
	space1 = range(0,num_leader-1)
	temp=[]
	# temp=temp.append(lines[0])
	for i  in space1 :
		temp=[]
		if i+1 <= num_leader:
			space=range(leader_block[i]-1,leader_block[i+1]-1)
		else:
			space=range(leader_block[i]-1,num_leader)
		for j in space:
			temp.append(lines[j])
		basic_blocks.append(temp)
		temp=[]
	space3=range(leader_block[num_leader-1]-1,len(lines))
	temp1=[]
	for i  in space3:
		temp1.append(lines[i])
	basic_blocks.append(temp1)
	return basic_blocks

def print_asm(line, symbol_table, line_var_list):
    op = line[1]
    # print ("op: ", op)
    for var in line_var_list:
        var_idx = line_var_list.index(var)
        (in_reg, reg) = get_reg(var, symbol_table)
        if len(line_var_list) > 1:
            if not in_reg:
                print ("\tmovl "+var+", %"+reg)
        line_var_list[var_idx] = '%'+reg
    if op=='=':
        t = line[-1]
        try:
            int(t)
        except:
            t = line_var_list[-1]
        else:
            t = '$'+t            
        print ("\tmovl "+t+", "+ line_var_list[0])
    elif op=='+':
         print ("\taddl "+line_var_list[1]+", "+line_var_list[0]) # need to be updated


def content(block):
	block_var_set = [] # Set of all the variables in the block
	block_var_list_by_line = []  # List of the lists of the variables in each line of the block
	for line in block:
	    block_var_list_by_line.append([])
	    if line[1] in non_vars:
	        continue
	    # temp=[]
	    for word in line:
	        if word not in lang:
	            try:
	                int(word)
	            except:
	            	# if word not in block_var_list_by_line[-1]:
	                block_var_list_by_line[-1].append(word)
	                if word not in block_var_set:
	                	block_var_set.append(word)     
		# block_var_list_by_line[-1].append(temp)
	return (block_var_set, block_var_list_by_line)		


<<<<<<< HEAD
def process(block):
	(block_var_set, block_var_list_by_line) = content(block)
	src=['$']
	dst=['$']
	symbol_table={}
	symbol_table_list=[]
	num_var=len(block_var_set)
	for i in range(num_var):
		addr_desc[var]={'loc':'mem', 'value': None}
	for var in block_var_set:
		symbol_table[var] = {'state': 'dead', 'prev_use': None, 'next_use': None}
	if not symbol_table: # if symbol table is empty
	    for line in block:
	        symbol_table_list.append({})
	else :
		for line in reversed(block):
			idx= block.index(line)
=======

def var_List(code):
	varlist=[]
	leader_block = leader_block_func(code)
	basic_blocks = Basic_block(code,leader_block)
	for block in basic_blocks:
		(block_var_set, block_var_list_by_line) = content(block)
		varlist=varlist+block_var_set
	return list(set(varlist))


def process(block,nextuseTable):
	(block_var_set, block_var_list_by_line) = content(block)
	symbol_table={}
	symbol_table_list=[]
	num_var=len(block_var_set)
	for var in block_var_set:
		if var not in addr_desc:
			addr_desc[var] = {'loc': 'mem', 'reg_val': None}
			# for var1 in block_var_set
	for var1 in block_var_set:
		symbol_table[var1] = {'state': 'dead', 'prev_use': None, 'next_use': None}
	if not symbol_table:
		for line in block:
	        symbol_table_list.append({})
	else:
		for line in reversed(block):
			# nextuseTable[instrnumber-1] = {var:symbolTable[var] for var in block_var_set}
			src=['$']
			dst=['$']
			idx= block.index(line)
			nextuseTable[instrnumber-1] = {var:symbolTable[var] for var in block_var_set}
>>>>>>> fc857b6879028637f19f7fb843a7ed3907efc42c
			if not block_var_list_by_line[idx]:
				symbol_table_list.insert(0, {})
				continue
			dst = [block_var_list_by_line[idx][0]]+dst
			if dst[0] == '$':
				symbol_table[dest]['state'] = 'dead'
			for i in range(1, len(block_var_list_by_line[idx])):
				src=[(block_var_list_by_line[idx][i])]+src
<<<<<<< HEAD
			if src[0] == '$':
				if symbol_table[src]['state'] == 'dead':
					symbol_table[src]['state'] = 'live'
					symbol_table[src]['prev_use'] = idx
					symbol_table[src]['next_use'] = idx
			symbol_table_list.insert(0, symbol_table)
	return symbol_table,symbol_table_list

def main():
	# global symbol_table, root,code
	# with open(fname) as f:
	#   content = f.readlines()
	lines = [[line.rstrip('\n').replace(" ", "").split(',')][0] for line in open(fname)]
	No_lines=len(lines) #lines, operation, dest, source
	leader_block = leader_block_func(lines)
	basic_blocks = Basic_block(lines,leader_block)
	for block in basic_blocks:
		process(block)


	# traverse_tree(root, None,None)
	print code
	return root, symbol_table
=======
			source_len=len(src)
			operator = line[1]
			variable = block_var_list_by_line[idx]
			if operator in arith_ops:
				z = line[2]
				x = line[3]
				y = line[4]
				if z in variable:
					symbol_table[z] = ["dead", None]
				if x in variable:
					symbol_table[x] = ["live", idx]
				if y in variables:
					symbol_table[y] = ["live", idx]
			elif operator == "ifgoto":
				x = line[3]
				y = line[4]
				if x in variable:
					symbol_table[x] = ["live", idx]
				if y in variable:
					symbol_table[y] = ["live", idx]
			elif operator == "print":
				x = line[2]
				if x in variable:
					symbol_table[x] = ["live", idx]
			elif operator == "="
				x = line[2]	
				y = line[3]
				if x in variable:
					symbol_table[x] = ["dead", None]
				if y in variables:
					symbol_table[y] = ["live", idx]
	return symbol_table,nextuseTable			






		# i=0
		# while src[i] != '$':
# 			if symbol_table[src[0]]['state'] == 'dead':
# 				symbol_table[src[0]]['state'] = 'live'
# 				symbol_table[src[0]]['prev_use'] = idx
# 				symbol_table[src[0]]['next_use'] = idx
# 			i=i+1
# 		symbol_table_list.insert(0, symbol_table)
# return symbol_table,symbol_table_list

def main():
# global symbol_table, root,code
# with open(fname) as f:
#   content = f.readlines()
# symbolTable = addressDescriptor.fromkeys(varlist, ["live", None])
lines = [[line.rstrip('\n').replace(" ", "").split(',')][0] for line in open(fname)]
No_lines=len(lines) #lines, operation, dest, source
leader_block = leader_block_func(lines)
basic_blocks = Basic_block(lines,leader_block)
nextuseTable = [None for i in range(len(lines))]
varlist=var_List(lines)
for block in basic_blocks:
	print process(block,nextuseTable)[0],"\n",process(block,nextuseTable)[1]
	print '\n\n\n\n\n\n\n'


# Generating the x86 Assembly code
#--------------------------------------------------------------------------------------------------
data_section = ".section .data\n"
for var in varlist:
	data_section = data_section + var + ":\n" + ".int 0\n"
data_section = data_section + "str:\n.ascii \"%d\\n\\0\"\n"

bss_section = ".section .bss\n"
text_section = ".section .text\n" + ".globl main\n" + "main:\n"

x86c = data_section + bss_section + text_section
print(x86c) 
	# traverse_tree(root, None,None)
	# print code
	# return root, symbol_table
>>>>>>> fc857b6879028637f19f7fb843a7ed3907efc42c
