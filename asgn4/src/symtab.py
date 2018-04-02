#!/usr/bin/python3

from copy import deepcopy

base_table = None


class type :
	"""docstring for type"""
	def __init__(self, name, isbasic, isarray, ispointer, width, elem_type, length):
		self.name = name
		self.isbasic = isbasic
		self.isarray = isarray
		self.ispointer = ispointer
		self.width = width
		self.elem_type = elem_type
		#if it is array or ptr what is element's type (int, char etc)
		self.length = length

	def type_name(self):
		if self.isbasic:
			return self.name
		elif self.isarray :
			return "array [" + self.elem_type.type_name +  "]"

class table:
	"""docstring for table."""
	def __init__(self, prev = None):
		self.hash = {}
		self.width = 0
		self.parent = prev
		self.children = []

	def insert_variable(self, var_type, identifier):
		self.hash[identifier] = {}
		self.hash[identifier]['type'] = var_type
		self.hash[identifier]['category'] = 'variable'

	def insert_temp(self, var_type, identifier):
		if identifier not in self.hash :
			self.hash[identifier] = {}
			self.hash[identifier]['type'] = var_type
			self.hash[identifier]['category'] = 'temporary'
			return True
		else:
			return False

	def insert_array(self, var_type, identifier):
		self.hash[identifier] = {}
		self.hash[identifier]['type'] = var_type
		self.hash[identifier]['category'] = 'array'

	# def lookup(self, identifier, table):
	# 	if table == None:
	# 		return None
	# 	v = table.lookup_table(identifier)
	# 	if v == None:
	# 		lookup(self, identifier, table.parent)

	def insert_function(self, method_name, return_type, param_types, param_num):
		if method_name not in self.hash:
			self.hash[method_name] = {}
			self.hash[method_name]['type'] = return_type
			self.hash[method_name]['category'] = 'function'
			self.hash[method_name]['arg_num'] = param_num
			self.hash[method_name]['arg_types'] = param_types

	def lookup_table(self, identifier):
		if identifier in self.hash:
			return self.hash[identifier]
		else:
			return None

	def print_symbol_table(self):
		print("---table---")
		print("---- parent : " + str(self.parent) + "----")
		for key in self.hash:
			print("name : ", key)
			print (self.hash[key])
		print("----------------")

####################################################################

class environment:
	"""docstring for environment."""
	def __init__(self):
		self.curr_table = table()
		self.label_count = 0
		self.temp_count =0
		global base_table
		base_table =self.curr_table

	def make_temp(self, temp_type, table):
		while table.insert_temp(temp_type, "T" + str(self.temp_count)):
			self.temp_count+=1
		temp_name = "T" + str(self.temp_count)
		return temp_name

	def new_label(self):
		label = "L" + str(self.label_count)
		self.label_count+=1
		return label

	def begin_scope(self):
		new_table = table(self.curr_table)
		self.curr_table.children.append(new_table)
		self.curr_table = new_table
		return self.curr_table

	def end_scope(self):
		self.curr_table = self.curr_table.parent

	def insert_variable(self, var_type, identifier):
		self.curr_table.insert_variable(var_type, identifier)

	def insert_temp(self, var_type, identifier):
		self.curr_table.insert_temp(var_type, identifier)

	def insert_array(self, var_type, identifier):
		self.curr_table.insert_array(var_type, identifier)

	def lookup(self, identifier, table):
		if table != None:
			v = table.lookup_table(identifier)
			if v == None:
				return self.lookup(identifier, table.parent)
			return v
		else:
			return None

	def insert_function(self, method_name, return_type, param_types, param_num):
		self.curr_table.insert_function(method_name, return_type, param_types, param_num)

	def lookup_table(self, identifier):
		self.curr_table.lookup_table(identifier)

	def print_symbol_table(self, t):
		t.print_symbol_table()
		print("--****----****--")
		for c in t.children:
			self.print_symbol_table(c)
