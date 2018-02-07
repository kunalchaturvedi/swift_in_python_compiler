import symtab
from pythonds.basic.stack import Stack
fout = open("a.s", "wb")
with open ("lib.s", 'r') as myfile:
      data=myfile.read()

fout.write(data)

gb = 'section .data\n'

count_label = 0
count_temp = 0
data = ''

class Stack:
     def __init__(self):
         self.items = []

     def isEmpty(self):
         return self.items == []

     def push(self, item):
         self.items.append(item)

     def pop(self):
         return self.items.pop()

     def peek(self):
         return self.items[len(self.items)-1]

     def size(self):
         return len(self.items)
s=Stack()
s2=Stack()

class BinOp():
  """docstring for BinOp"""
  def __init__(self,destination='',source_1='',source_1add='',operand='',source_2='',source_2add=''):
    global data
    self.source_1 = source_1
    self.source_2 = source_2
    self.operand = operand
    self.destination = destination
    source1 = source_1
    source2 = source_2
    if source_1add != '':
      source1 = source_1add
    if source_2add != '':
      source2 = source_2add
    # print source1,source2
    if source1.startswith("array"):
      k = source1.split(" ")[1]
      data = data + '\tmov eax, '+k+'\n'
      data = data + '\tmov eax, [eax]\n'
    else:
      data = data + '\tmov eax, ' + str(source1)+'\n'
    if source2.startswith("array"):
      k = source2.split(" ")[1]
      data = data + '\tmov ecx, '+k+'\n'
      data = data + '\tmov ecx, [ecx]\n'
    else:
      data = data + '\tmov ecx, ' + str(source2)+'\n'
    if operand == '+':
      
      data = data + '\tadd eax, ecx\n'
    if operand == '-':
      data = data + '\tsub eax, ecx\n'
    if operand == '*':
      data = data + '\timul eax, ecx\n'
    if operand == '/':
      data = data + '\tcdq\n'
      data = data + '\tidiv ecx\n'
    if operand == '%':
      data = data + '\tcdq\n'
      data = data + '\tidiv ecx\n'
    if operand == '==':
      data = data + '\tcmp eax, ecx\n'
      data = data + '\tsete al\n'
      data = data + '\tmovzx eax, '+'al'+'\n'
    if operand == '<':
      data = data + '\tcmp eax, ecx\n'
      data = data + '\tsetl al\n'
      data = data + '\tmovzx eax, '+'al'+'\n'
    if operand == '>':
      data = data + '\tcmp eax, ecx\n'
      data = data + '\tsetg al\n'
      data = data + '\tmovzx eax, '+'al'+'\n'
    if operand == '<=':
      data = data + '\tcmp eax, ecx\n'
      data = data + '\tsetle al\n'
      data = data + '\tmovzx eax, '+'al'+'\n'
    if operand == '>=':
      data = data + '\tcmp eax, ecx\n'
      data = data + '\tsetge al\n'
      data = data + '\tmovzx eax, '+'al'+'\n'
    if operand == '&':
      data = data + '\tand eax, ecx\n'
    if operand == '|':
      data = data + '\tor eax, ecx\n'
    if operand == '^':
      data = data + '\txor eax, ecx\n'
    if operand == '&&':
      data = data + '\tmovzx eax, dl'+'\n'
    if operand == '||':
      data = data + '\tmovzx eax, dl'+'\n'
    data = data + '\tmov '+destination+', eax'+'\n'
  def __repr__(self):
    return self.destination + ' = ' + self.source_1 + self.operand + self.source_2

class Function_definition():
  """docstring for Function_definition"""
  def __init__(self,name=''):
    self.name = name
  def __repr__(self):
    return self.name



def Jump(arg, arg2):
  global data
  if(arg2 == 'je'):
    data = data + '\tje '+str(arg).rstrip(':')+'\n'
  if(arg2 == 'jmp'):
    data = data + '\tjmp '+str(arg).rstrip(':')+'\n'
  if(arg2 == 'jne'):
    data = data + '\tjne '+str(arg).rstrip(':')+'\n'


def Compare(arg1,add1,arg2,add2):
  global data
  a1 = arg1
  a2 = arg2
  data = data + '\txor ebx, ebx'+'\n'
  data = data + '\txor ecx, ecx'+'\n'

  if add1 != '':
      a1 = add1
  if add2 != '':
      a2 = add2
  if a1.startswith("array"):
    k = a1.split(" ")[1]
    data = data + '\tmov ebx, '+k+'\n'
    data = data + '\tmov ebx, [ebx]\n'
  else:
    data = data + '\tmov ebx, ' + str(a1)+'\n'
  if a2.startswith("array"):
    k = a2.split(" ")[1]
    data = data + '\tmov ecx, '+k+'\n'
    data = data + '\tmov ecx, [ecx]\n'
  else:
    data = data + '\tmov ecx, ' + str(a2)+'\n'
  data = data + '\tcmp ebx, ecx\n'


def PushParam(arg1,add1):
  global data
  a1 = arg1

  if add1 != '':
      a1 = add1
  if a1.startswith("array"):
    k = a1.split(" ")[1]
    data = data + '\tmov eax, '+k+'\n'
    data = data + '\tmov eax, [eax]\n'
  else:
    data = data + '\tmov eax, ' + str(a1)+'\n'

  data = data + '\tpush eax'+'\n'

def FuncCall(arg1,add1):
  global data
  k = int(get_argc_symbol_table(str(arg1.value),'s0'))
  # print "+++",get_argc_symbol_table(str(arg1.value),'s0')
  data = data + '\tcall ' + str(arg1.value) + '\n'
  for i in range(0,k):
    data = data + '\tpop edx'+'\n'
  data = data + '\tmov '+add1+ ', eax\n'
def BeginFunc(offset):
  global data
  data = data + '\tpush ebp'+'\n'
  data = data + '\tmov ebp, esp'+'\n'
  data = data + '\tsub esp, '+ str(offset)+'\n'
def EndFunc(offset):
  global data
  data = data + '\tadd esp, '+ str(offset)+'\n'
  data = data + '\tpop ebp'+'\n'
  data = data + '\tret'+'\n'
def Ret(arg1, add1,offset):
  global data
  if add1 == '':
    data = data + '\tmov eax, '+ str(arg1)+'\n'
  else:
    data = data + '\tmov eax, '+ add1+'\n'
  EndFunc(offset)



class label(object):
  def __init__(self,_id = 0,name=''):
    global count_label
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
    global data
    self.source = source
    self.destination = destination
    
    if sourceadd.startswith('array'):
      k = sourceadd.split(" ")[1]
      data = data + '\tmov eax, '+k+'\n'   
    if destinationadd != '':
      if destinationadd.startswith("array"):
        y = destinationadd.split(" ")[1]
        data = data + '\tmov edx, '+y+'\n'
        data = data + '\tmov ecx, [edx]\n'
      else:
        data = data + '\tmov ecx, '+destinationadd+'\n'
    else:
      data = data + '\tmov ecx, '+destination+'\n'
    if sourceadd.startswith('array'):
      data = data + '\tmov [eax]'+', ecx'+'\n'
    else:
      data = data + '\tmov '+sourceadd+', ecx'+'\n'
  def __repr__(self):
    return self.source + ' = ' + self.destination


offset = 0;
