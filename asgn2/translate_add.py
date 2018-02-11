import sys
from three_code_gen import *

def getReg:

def getLocation:

def setReg:

def setLocation:



def translate(t_line):
	asm_line=""
	t_line_no=int(t_line[0])
	t_op=t_line[1]

	if t_op in arith_ops:
		result=t_line[2]
		operand1=t_line[3]
		operand2=t_line[4]

		#################addition case###############
		if t_op == "+":
			if not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no) # replace ,t_line with t_line_no everywhere
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


		elif t_op == "*":
			if registers['%eax'] != None:#intializing eax,ecx,edx
				asm_line = asm_line + "mov %eax, " + registers['%eax'] + "\n"
				setLocation(registers['%eax'], "mem")
			if registers['%edx'] != None:
				asm_line = asm_line + "mov %edx, " + registers['%edx'] + "\n"
				setLocation(registers['%edx'], "mem")
		#	if not isnumber(operand1):
		#		loc1 = getlocation(operand1)
		#		setlocation(operand1, "mem")
		#	if not isnumber(operand2):
		#		loc2 = getlocation(operand2)
		#		setlocation(operand2, "mem")
		
		
		
		
			loc1=getLocation(operand1) #changes to be made here if code does not work
			if not isnumber(operand1):
				setLocation(operand1,"mem")
			loc2=getLocation(operand2)
			if not isnumber(operand2):
				setLocation(operand2,"mem")
			if not isnumber(operand1) and not isnumber(operand2):
				asm_line=asm_line + "mov " + operand1 + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov " + operand2 + ", "+ "%edx" + " \n"
				asm_line=asm_line + "imul " + "%edx" + "\n"
				setLocation(result,'%eax')
			elif isnumber(operand1) and not isnumber(operand2):
				asm_line=asm_line + "mov $" + (operand1) + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov " + operand2 + ", "+ "%edx" + " \n"
				asm_line=asm_line + "imul " + "%edx" + "\n"
				setLocation(result,'%eax')
			elif not isnumber(operand1) and isnumber(operand2):
				asm_line=asm_line + "mov " + operand1 + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov $" + (operand2) + ", "+ "%edx" + " \n"
				asm_line=asm_line + "imul " + "%edx" + "\n"
				setLocation(result,'%eax')
			elif isnumber(operand1) and isnumber(operand2):
				asm_line=asm_line + "mov $" + str(int(operand1)*int(operand2)) + ", "+ "%eax" + " \n"
				setLocation(result,'%eax')
		
		
		elif t_op == "/":
			if registers['%eax'] != None:
				asm_line = asm_line + "mov %eax, " + registers['%eax'] + "\n"
				setLocation(registers['%eax'], "mem")
			if registers['%edx'] != None:
				asm_line = asm_line + "mov %edx, " + registers['%edx'] + "\n"
				setLocation(registers['%edx'], "mem")
			if registers['%ecx'] != None:
				asm_line = asm_line + "mov %ecx, " + registers['%ecx'] + "\n"
				setLocation(registers['%ecx'], "mem")	
		#if registers['%eax'] != None:
			#		assembly = assembly + "movl %eax, " + registers['%eax'] + "\n"
		#			setlocation(registers['%eax'], "mem")
		#	if registers['%edx'] != None:
		#			assembly = assembly + "movl %edx, " + registers['%edx'] + "\n"
		#			setlocation(registers['%edx'], "mem")
		#	if not isnumber(operand1):
		#		loc1 = getlocation(operand1)
		#		setlocation(operand1, "mem")
		#	if not isnumber(operand2):
		#		loc2 = getlocation(operand2)
		#		setlocation(operand2, "mem")
		
		
		
		
			loc1=getLocation(operand1) #changes to be made here if code does not work
			if not isnumber(operand1):
				setLocation(operand1,"mem")
			loc2=getLocation(operand2)
			if not isnumber(operand2):
				setLocation(operand2,"mem")
				
			if not isnumber(operand1) and not isnumber(operand2):
				asm_line=asm_line + "mov " + operand1 + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov " + operand2 + ", "+ "%ecx" + " \n"
				asm_line=asm_line + "idiv " + "%ecx" + "\n"
				setLocation(result,'%eax')
			elif isnumber(operand1) and not isnumber(operand2):
				asm_line=asm_line + "mov $" + (operand1) + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov " + operand2 + ", "+ "%ecx" + " \n"
				asm_line=asm_line + "idiv " + "%ecx" + "\n"
				setLocation(result,'%eax')
			elif not isnumber(operand1) and isnumber(operand2):
				asm_line=asm_line + "mov " + operand1 + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov $" + (operand2) + ", "+ "%ecx" + " \n"
				asm_line=asm_line + "idiv " + "%ecx" + "\n"
				setLocation(result,'%eax')
			elif isnumber(operand1) and isnumber(operand2):
				asm_line=asm_line + "mov $" + str(int(int(operand1)/int(operand2))) + ", "+ "%eax" + " \n"
				setLocation(result,'%eax')		
		
		elif t_op == "%":
		
			if registers['%eax'] != None: #intializing eax,ecx,edx
				asm_line = asm_line + "mov %eax, " + registers['%eax'] + "\n"
				setLocation(registers['%eax'], "mem")
			if registers['%edx'] != None:
				asm_line = asm_line + "mov %edx, " + registers['%edx'] + "\n"
				setLocation(registers['%edx'], "mem")
			if registers['%ecx'] != None:
				asm_line = asm_line + "mov %ecx, " + registers['%ecx'] + "\n"
				setLocation(registers['%ecx'], "mem")
		#if registers['%eax'] != None:
			#		assembly = assembly + "movl %eax, " + registers['%eax'] + "\n"
		#			setlocation(registers['%eax'], "mem")
		#	if registers['%edx'] != None:
		#			assembly = assembly + "movl %edx, " + registers['%edx'] + "\n"
		#			setlocation(registers['%edx'], "mem")
		#	if not isnumber(operand1):
		#		loc1 = getlocation(operand1)
		#		setlocation(operand1, "mem")
		#	if not isnumber(operand2):
		#		loc2 = getlocation(operand2)
		#		setlocation(operand2, "mem")
		
		
		
		
			loc1=getLocation(operand1) #changes to be made here if code does not work
			if not isnumber(operand1):
				setLocation(operand1,"mem")
			loc2=getLocation(operand2)
			if not isnumber(operand2):
				setLocation(operand2,"mem")
				
			asm_line = asm_line + "mov $0, %edx \n"
			if not isnumber(operand1) and not isnumber(operand2):
				asm_line=asm_line + "mov " + operand1 + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov " + operand2 + ", "+ "%ecx" + " \n"
				asm_line=asm_line + "idiv " + "%ecx" + "\n"
				setLocation(result,'%edx')
			elif isnumber(operand1) and not isnumber(operand2):
				asm_line=asm_line + "mov $" + (operand1) + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov " + operand2 + ", "+ "%ecx" + " \n"
				asm_line=asm_line + "idiv " + "%ecx" + "\n"
				setLocation(result,'%edx')
			elif not isnumber(operand1) and isnumber(operand2):
				asm_line=asm_line + "mov " + operand1 + ", "+ "%eax" + " \n"
				asm_line=asm_line + "mov $" + (operand2) + ", "+ "%ecx" + " \n"
				asm_line=asm_line + "idiv " + "%ecx" + "\n"
				setLocation(result,'%edx')
			elif isnumber(operand1) and isnumber(operand2):
				asm_line=asm_line + "mov $" + str(int(int(operand1)/int(operand2))) + ", "+ "%edx" + " \n"
				setLocation(result,'%edx')			
			
			
			
		elif t_op == "<=" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			LESS="LESS" + str(opnumber)
			NLESS="NLESS" +str(opnumber)
			if isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line=asm_line +"move $"+str(int(int(operand1)<=int(operand2)))+", " +destreg + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line=asm_line +"move $"+operand1+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand2+", " +destreg + "\n"
				asm_line=asm_line +"jle "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line=asm_line +"move $"+operand2+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
					
				asm_line=asm_line +"jle "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			elif not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
					
				if loc2 !='mem' and loc1 !='mem':
					asm_line=asm_line +"mov "+loc1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem'
					asm_line=asm_line +"mov "+operand1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"	 
				elif loc1 != 'mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				elif loc1 =='mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
						
				asm_line=asm_line +"jle "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			opnumber=opnumber+1							
					
		elif t_op == ">=" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			LESS="LESS" + str(opnumber)
			NLESS="NLESS" +str(opnumber)
			if isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line=asm_line +"move $"+str(int(int(operand1)>=int(operand2)))+", " +destreg + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line=asm_line +"move $"+operand1+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand2+", " +destreg + "\n"
				asm_line=asm_line +"jge "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line=asm_line +"move $"+operand2+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
					
				asm_line=asm_line +"jge "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			elif not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
					
				if loc2 !='mem' and loc1 !='mem':
					asm_line=asm_line +"mov "+loc1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem'
					asm_line=asm_line +"mov "+operand1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"	 
				elif loc1 != 'mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				elif loc1 =='mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
						
				asm_line=asm_line +"jge "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			opnumber=opnumber+1	
		
		elif t_op == "==" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			LESS="LESS" + str(opnumber)
			NLESS="NLESS" +str(opnumber)
			if isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line=asm_line +"move $"+str(int(int(operand1)==int(operand2)))+", " +destreg + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line=asm_line +"move $"+operand1+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand2+", " +destreg + "\n"
				asm_line=asm_line +"je "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line=asm_line +"move $"+operand2+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
					
				asm_line=asm_line +"je "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			elif not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
					
				if loc2 !='mem' and loc1 !='mem':
					asm_line=asm_line +"mov "+loc1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem'
					asm_line=asm_line +"mov "+operand1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"	 
				elif loc1 != 'mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				elif loc1 =='mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
						
				asm_line=asm_line +"je "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			opnumber=opnumber+1		
		
		elif t_op == "!=" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			LESS="LESS" + str(opnumber)
			NLESS="NLESS" +str(opnumber)
			if isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line=asm_line +"move $"+str(int(int(operand1)!=int(operand2)))+", " +destreg + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line=asm_line +"move $"+operand1+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand2+", " +destreg + "\n"
				asm_line=asm_line +"jne "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line=asm_line +"move $"+operand2+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
					
				asm_line=asm_line +"jne "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			elif not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
					
				if loc2 !='mem' and loc1 !='mem':
					asm_line=asm_line +"mov "+loc1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem'
					asm_line=asm_line +"mov "+operand1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"	 
				elif loc1 != 'mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				elif loc1 =='mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
						
				asm_line=asm_line +"jne "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			opnumber=opnumber+1
		
		elif t_op == "<" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			LESS="LESS" + str(opnumber)
			NLESS="NLESS" +str(opnumber)
			if isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line=asm_line +"move $"+str(int(int(operand1)<int(operand2)))+", " +destreg + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line=asm_line +"move $"+operand1+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand2+", " +destreg + "\n"
				asm_line=asm_line +"jl "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line=asm_line +"move $"+operand2+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
					
				asm_line=asm_line +"jl "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			elif not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
					
				if loc2 !='mem' and loc1 !='mem':
					asm_line=asm_line +"mov "+loc1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem'
					asm_line=asm_line +"mov "+operand1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"	 
				elif loc1 != 'mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				elif loc1 =='mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
						
				asm_line=asm_line +"jl "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			opnumber=opnumber+1	
		
		elif t_op == ">" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			LESS="LESS" + str(opnumber)
			NLESS="NLESS" +str(opnumber)
			if isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line=asm_line +"move $"+str(int(int(operand1)>int(operand2)))+", " +destreg + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line=asm_line +"move $"+operand1+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand2+", " +destreg + "\n"
				asm_line=asm_line +"jg "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line=asm_line +"move $"+operand2+", " +destreg + "\n"
				if loc2 !='mem':
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				else:
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
					
				asm_line=asm_line +"jg "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			elif not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
					
				if loc2 !='mem' and loc1 !='mem':
					asm_line=asm_line +"mov "+loc1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem'
					asm_line=asm_line +"mov "+operand1+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc2+", " +destreg + "\n"	 
				elif loc1 != 'mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+loc1+", " +destreg + "\n"
				elif loc1 =='mem' and loc2 == 'mem'
					asm_line=asm_line +"mov "+operand2+", " +destreg + "\n"
					asm_line=asm_line +"cmp "+operand1+", " +destreg + "\n"
						
				asm_line=asm_line +"jg "+LESS + "\n"
				asm_line=asm_line +"mov $0, "+ destreg + "\n"
				asm_line=asm_line +"jmp "+"NLESS" + "\n"
				asm_line=asm_line +LESS+":" + "\n"
				asm_line=asm_line +"mov $1, "+ destreg + "\n"
				asm_line=asm_line +NLESS +":" + "\n"
				setReg(destreg,result)
				setLocation(result,destreg)		
			opnumber=opnumber+1
		elif t_op== "&&" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			if not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no) # replace ,t_line with t_line_no everywhere
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
				if loc1 == 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "and " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "and " + loc1 + ", " + destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "and " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "and " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line = asm_line + "mov $" + str(int(operand1) and int(operand2)) + ", " + destreg + "\n"
			
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line = asm_line + "mov $" +operand2 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "and " + operand1 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "and " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line = asm_line + "mov $" +operand1 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "and " + operand2 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "and " + loc2 + ", " + destreg + "\n"
				
			setReg(destreg,result)
			setLocation(result,destreg)
		
		elif t_op== "||" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			if not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no) # replace ,t_line with t_line_no everywhere
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
				if loc1 == 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "or " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "or " + loc1 + ", " + destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "or " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "or " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line = asm_line + "mov $" + str(int(operand1) or int(operand2)) + ", " + destreg + "\n"
			
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line = asm_line + "mov $" +operand2 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "or " + operand1 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "and " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line = asm_line + "mov $" +operand1 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "or " + operand2 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "or " + loc2 + ", " + destreg + "\n"
				
			setReg(destreg,result)
			setLocation(result,destreg)	
		
		elif t_op== "<<" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			if not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no) # replace ,t_line with t_line_no everywhere
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
				if loc1 == 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "shl " operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "shl " + loc1 + ", " + destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "shl " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "shl " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line = asm_line + "mov $" + str(int(operand1)<<int(operand2)) + ", " + destreg + "\n"
			
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line = asm_line + "mov $" +operand2 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "shl " + operand1 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "shl " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line = asm_line + "mov $" +operand1 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "shl " + operand2 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "shl " + loc2 + ", " + destreg + "\n"
				
			setReg(destreg,result)
			setLocation(result,destreg)
		
		elif t_op== ">>" :
			result=t_line[2]
			operand1=t_line[3]
			operand2=t_line[4]
			if not isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no) # replace ,t_line with t_line_no everywhere
				loc1=getLocation(operand1)
				loc2=getLocation(operand2)
				if loc1 == 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "shr " operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 == 'mem' :
					asm_line=asm_line + "mov " + operand2 + ", " + destreg + "\n"
					asm_line=asm_line + "shr " + loc1 + ", " + destreg + "\n"
				elif loc1 == 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "shr " + operand1 + ", " + destreg + "\n"
				elif loc1 != 'mem' and loc2 != 'mem' :
					asm_line=asm_line + "mov " + loc2 + ", " + destreg + "\n"
					asm_line=asm_line + "shr " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				asm_line = asm_line + "mov $" + str(int(operand1)>>int(operand2)) + ", " + destreg + "\n"
			
			elif not isnumber(operand1) and isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)
				asm_line = asm_line + "mov $" +operand2 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "shr " + operand1 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "shr " + loc1 + ", " + destreg + "\n"
			
			elif isnumber(operand1) and not isnumber(operand2):
				destreg=getReg(result,t_line_no)
				loc2=getLocation(operand2)
				asm_line = asm_line + "mov $" +operand1 + ", " + destreg + "\n"
				if loc1 == 'mem':
					asm_line = asm_line + "shr " + operand2 + ", " + destreg + "\n"
				else :
					asm_line = asm_line + "shr " + loc2 + ", " + destreg + "\n"
				
			setReg(destreg,result)
			setLocation(result,destreg)
		
		elif t_op=="~":
			result=t_line[2]
			operand1=t_line[3]
			if not isnumber(operand1):
				destreg=getReg(result,t_line_no)
				loc1=getLocation(operand1)	
				if loc1 != "mem" :
					asm_line=asm_line +"mov "+loc1+", "+ destreg + "\n"
				else :
					asm_line=asm_line +"mov "+operand1+", "+ destreg + "\n"
				asm_line=asm_line +"not" + destreg +"\n" $				
				setReg(destreg,result)
				setLocation(result,destreg)
			elif isnumber(operand1):
				destreg=getReg(result,t_line_no)
				asm_line = asm_line + "mov $" + str(not(int(operand1))) + ", " + destreg + "\n"	
				setReg(destreg,result)
				setLocation(result,destreg)
		elif t_op == "function" :
			funame=t_line[2]
			#just moving value of esp to ebp and pushing and defining functions in conventional way
			asm_line=asm_line + ".global " +  funame + "\n"
			asm_line=asm_line + ".type " +  funame + ", @function"+ "\n"
			asm_line=asm_line +funame + "\n"
			asm_line=asm_line + "push %ebp \n"
			asm_line=asm_line + "mov %esp, %ebp \n"	
		#elif t_op=="pop":
		#	asm_line=asm_line + "add $4, $esp " +"\n"
		
		elif t_op==" return":
			val = t_line[2]
			for var in varlist:
			loc = getLocation(var)
			if loc == "%eax":
				asm_line=asm_line + "mov " + loc + ", " + var + "\n"
				setLocation(var, "mem")
				break
			if isnumber(val):
				val = "$" + val
			asm_line = asm_line + "mov " + val + ", %eax\n"
			asm_line = asm_line + "mov %ebp, %esp\n"
			asm_line = asm_line + "pop %ebp\n"
			asm_line = asm_line + "ret\n"							
return asm_line


	
	
	


				
