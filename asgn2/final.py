import sys
from register import *
from translate_fin import *


def leader_block_func(lines):
	leader_block=[]
	basic_blocks=[]
	leader_block.append(1)   # for first line of execution by default
	for line in lines:
		if line[1] == 'call':
			leader_block.append(int(line[0]))
		elif line[1] == 'ifgoto':
			leader_block.append(int(line[-1]))
			leader_block.append(int(line[0])+1)
		elif line[1] == 'label':
			leader_block.append(int(line[0]))
		elif line[1] == 'goto':
			leader_block.append(int(line[-1]))
			leader_block.append(int(line[0])+1)
		# elif line[1] == 'ret':
		# 	leader_block.append(int(line[0]))
	leader=sorted(list(set(leader_block)))
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



def var_List(code):
	varlist=[]
	leader_block = leader_block_func(code)
	basic_blocks = Basic_block(code,leader_block)
	for block in basic_blocks:
		(block_var_set, block_var_list_by_line) = content(block)
		varlist=varlist+block_var_set
	return list(set(varlist))

def node_gen(basic_blocks):
	node=[]
	for block in basic_blocks:
		temp=[]
		for line in block:
			temp=temp+[line[0]]
		node=node+[temp]
	return node


def process(block):
    global nextuseTable
    (block_var_set, block_var_list_by_line) = content(block)
    symbol_table={}
    symbol_table_list=[]
    num_var=len(block_var_set)
    for var in block_var_set:
        if var not in addr_desc:
            addr_desc[var] = 'mem'
			# for var1 in block_var_set
    for var1 in block_var_set:
        symbol_table[var1] = {'state': 'dead', 'prev_use': None}
    if not symbol_table:
        for line in block:
            symbol_table_list.append({})
    else:
        for line in reversed(block):
            src=['$']
            dst=['$']
            idx= block.index(line)
            nextuseTable[idx-1] = {var:symbol_table[var] for var in block_var_set}
            if not block_var_list_by_line[idx]:
                symbol_table_list.insert(0, {})
                continue
            dst = [block_var_list_by_line[idx][0]]+dst
            if dst[0] == '$':
                symbol_table[dest]['state'] = 'dead'
            for i in range(1, len(block_var_list_by_line[idx])):
                src=[(block_var_list_by_line[idx][i])]+src
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
                if y in variable:
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
            elif operator == "=":
                x = line[2]
                y = line[3]
                if x in variable:
                    symbol_table[x] = ["dead", None]
                if y in variable:
                    symbol_table[y] = ["live", idx]
    return symbol_table


lines = [[line.rstrip('\n').replace(" ", "").split(',')][0] for line in open(fname)]
No_lines=len(lines) #lines, operation, dest, source
leader_block = leader_block_func(lines)
basic_blocks = Basic_block(lines,leader_block)
nodes=node_gen(basic_blocks)
nextuseTable = [None for i in range(len(lines))]
varlist=var_List(lines)
for block in basic_blocks:
	print process(block),"\n",nextuseTable
	# print '\n\n\n\n\n\n\n'	



data_section = ".section .data\n"
for var in varlist:
	data_section = data_section + var + ":\n" + ".int 0\n"
data_section = data_section + "str:\n.ascii \"%d\\n\\0\"\n"

bss_section = ".section .bss\n"
text_section = ".section .text\n" + ".global main\n" + "main:\n"

for node in nodes:
	text_section = text_section + "L" + str(node[0]) + ":\n"
	for n in node:
		print lines[int(n)-1]
		print "operator->" + lines[int(n)-1][1]
		text_section = text_section + str(translate(lines[int(n)-1]))
		# print "$$$$$$$$$$$$" + str(translate(lines[int(n)-1]))


print text_section
