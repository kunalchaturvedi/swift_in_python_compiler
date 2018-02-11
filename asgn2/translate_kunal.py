import sys
from three_code_gen import *

###################################################################################################

# Get the intermediate code file name
if len(sys.argv) == 2:
	filename = str(sys.argv[1])
else:
	print("usage: python codegen.py irfile")
	exit()

# Define the list of registers
reglist = ['%eax', '%ebx', '%ecx', '%edx']
# Construct the register descriptor table
registers = {}
registers = registers.fromkeys(reglist)

# Mathematical Operators
mathops = ['+', '-', '*', '/', '%']
relops = ['&&', '||', '~']
# Variable 
varlist = []
addressDescriptor = {}

assembly = ""
relcount = 1
# Three address code keywords
tackeywords = ['ifgoto', 'goto', 'return', 'call', 'print', 'label', '<=', '>=', '==', '>', '<', '!=', '=', 'function', 'exit'] + mathops

###################################################################################################

def getReg():
	return 1

def getLocation():
	return 1

def setReg():
	return 1

def setLocation():
	return 1



def translate(t_line):
	asm_line=""
	t_line_no=int(t_line[0])
	t_op=t_line[1]

	if t_op in arith_ops:
		# t_line_no , t_op , operand1 , operand2

		result=t_line[2]
		operand1=t_line[3]
		operand2=t_line[4]

		#################addition case###############
		if t_op == "+":
			if not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
				if loc1 == 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "add " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "add " + loc1 + ", " + destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "add " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "add " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line = asm_line + "mov $" + str(int(operand1)+int(operand2)) + ", " + destreg + "\n"
			
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line = asm_line + "mov $" +operand2 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "add " + operand1 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "add " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand2)
				asm_line = asm_line + "mov $" +operand1 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "add " + operand2 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "add " + loc2 + ", " + destreg + "\n"
				
			setReg(destreg,result)
			setLocation(result,destreg)
		
		######subtraction case#################3
		elif t_op == "-":
			if not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
				if loc1 == 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "sub " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "sub " + loc1 + ", " + destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "sub " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "sub " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line = asm_line + "mov $" + str(int(operand2)-int(operand1)) + ", " + destreg + "\n"
			
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line = asm_line + "mov $" +operand2 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "sub " + operand1 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "sub " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand2)
				asm_line = asm_line + "mov $" +operand1 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "sub " + operand2 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "sub " + loc2 + ", " + destreg + "\n"
			
			setReg(destreg,result)
			setLocation(result,destreg)

	elif t_op == "param":
		#t_line_no, param, value
		param_val = t_line[2]
		if isnumber(param_val):
			param_val = "$"+param_val
		else:
			param_loc=getLocation(param_val)
			if param_loc == "mem":
				# do nothing
			else:
				param_val=addr_desc[param_val]
			asm_line=asm_line + "push" + param_val + "\n"

	elif t_op == "call":
		# t_line_no, call, fun_name, arg_num, ret
		arg_num=t_line[3]
		# pushing all variables to memory evrytime a function call occurs
		for var in varlist:
			loc=getLocation(var)
			if loc != "mem":
				asm_line = asm_line + "mov" + loc + ", " + var+ "\n"
				setLocation(var, "mem")
		fun_name = t_line[2]
		asm_line = asm_line+ "call " + fun_name + "\n"
			
	elif t_op == "label":
		# t_line_no, "label", label_name
		label_name=t_line[2]
		asm_line=asm_line+ label_name +": " +"\n"
	
	elif t_op == "exit":
		# t_line_no, exit
		# exit will be used to exit from program
		# dont know if it will be useful if we also have return
		# but still keeping this here for now
		asm_line = asm_line + "call "+ "exit" + "\n"


# goto and ifgoto
	elif t_op = "goto":
		# t_line_no, "goto", goto_label
		# goto_label => t_line_no or some label used in code
		# pushing all variables to memory evrytime a goto call occurs
		for var in varlist:
			loc=getLocation(var)
			if loc != "mem":
				asm_line = asm_line + "mov" + loc + ", " + var+ "\n"
				setLocation(var, "mem")
		
		goto_label = t_line[2]
		if isnumber(goto_label):
			jmp_loc = "L "+goto_label
		else:
			jmp_loc = goto_label
		asm_line=asm_line+ "jmp "+ goto_label + "\n"

	elif "ifgoto":
		# t_line_no, "ifgoto", relop, op1, op2, ifgoto_label
		# ifgoto_label => t_line_no or some label used in code

		op1 = t_line[3]
		op2 = t_line[4]
		ifgoto_label = t_line[5]
		relop = t_line[2]
		
		# checking if using line nuber as label and updating accordingly 
		if isnumber(ifgoto_label):
			ifgoto_label = "L" + ifgoto_label

		# pushing all variables to memory evrytime a ifgoto call occurs
		for var in varlist:
			loc=getLocation(var)
			if loc != "mem":
				asm_line = asm_line + "mov" + loc + ", " + var+ "\n"
				setLocation(var, "mem")
		
		if isnumber(op1) and isnumber(op2):
			asm_line=asm_line + "cmp $" + op2 + ", $" + op1 + "\n"

		elif isnumber(op1) and not isnumber(op2):
			loc2 = getLocation(op2)
			if loc2 != "mem":
				asm_line = asm_line + "cmp " + loc2 + ", $" + op1 + "\n"
			else:
				asm_line = asm_line + "cmp " + op2 + ", $" + op1 + "\n"
		
		elif not isnumber(op1) and isnumber(op2):
			loc1 = getLocation(op1)
			if loc1 != "mem":
				asm_line = asm_line + "cmp $" + op2 + ", " + loc1 + "\n"
			else:
				asm_line = asm_line + "cmp $" + op2 + ", " + op1 + "\n"
		
		elif not isnumber(op1) and not isnumber(op2):
			# thodi doubt hai isme...
			loc1=getLocation(op1)
			loc2=getLocation(op2)
			if loc1 == "mem" and loc2 == "mem":
				reg = getReg(op1,t_line_no)
				asm_line = asm_line + "mov " + loc1 + ", " + reg + "\n"
				asm_line = asm_line + "cmp " + op2 + ", " + reg + "\n"
				# setReg(reg, op1)
				# setLocation(op1, reg)
				# we shouldnt update the values... so no need for setreg or setlocation

			if loc1 == "mem" and loc2 != "mem":
				# asm_line = asm_line + "mov " + loc1 + ", " + reg + "\n"
				asm_line = asm_line + "cmp " + loc2 + ", " + op1 + "\n"
			if loc1 != "mem" and loc2 == "mem":
				asm_line = asm_line + "cmp " + op2 + ", " + loc1 + "\n"
			if loc1 != "mem" and loc2 != "mem":
				asm_line =asm_line + "cmp " + loc2 + ", " + loc1 + "\n"

		# already pushing all variables to memory evrytime a ifgoto call occurs
		# we shouldnt need to do this
		# i have doubt here
		# for var in varlist:
		# 	loc=getLocation(var)
		# 	if loc != "mem":
		# 		asm_line = asm_line + "mov" + loc + ", " + var+ "\n"
		# 		setLocation(var, "mem")

		if relop== "==":
			asm_line = asm_line + "je" + ifgoto_label + "\n"
		if relop== "<=":
			asm_line = asm_line + "jle" + ifgoto_label + "\n"
		if relop== ">=":
			asm_line = asm_line + "jge" + ifgoto_label + "\n"
		if relop== "<":
			asm_line = asm_line + "jl" + ifgoto_label + "\n"
		if relop== ">":
			asm_line = asm_line + "jg" + ifgoto_label + "\n"
		if relop== "!=":
			asm_line = asm_line + "jne" + ifgoto_label + "\n"

# print
	elif "print":
		# t_line_no, "print", operand
		# karna kya hai par???
		# #####################################????????????????????????
		if isnumber(operand):
			# asm_line = asm_line
			# ????
		else:
			# ?????
		
		
	
		
				
			
				





	
	
	


				