class symbol_table(object):
    """docstring for symbol_table."""
    def __init__(self):
        # super(symbol_table, self).__init__()
        self.table={
        'scope':    'global',
        'type':     'function',
        'parent_scope':  'None'
        }
        self.scopelist=[self.table]
    # def get_size(idtype):
    #     width = {'int':4, 'float':8, 'short':4, 'long':8, 'double':8, 'char':4, 'string': 4, 'function': 4}
    #     if width.has_key(idtype):
    #         return width[idtype]
    #     else:
    #         return 4 #???
    def find_id(self,identifier,scope_length):
        if scope_length==-1:
            return {}
        tscope=self.scopelist[scope_length]
        if tscope.has_key(identifier):
            return tscope[identifier]
        else:
            return self.find_id(identifier,scope_length-1) # ?????
    def add_new_scope(self,func_name,scope_type,parameter_list):
        tscope=self.scopelist[-1]
        new_table={
            'scope':    func_name,
            'type':     scope_type,
            'parent_scope': tscope['scope'],
            'parameter_list': parameter_list
        }
        tscope[func_name]={
            'scope':    scope_type,
            'order': 0,
            'pointer': True
        }
        self.scopelist.append(new_table)
    def lookup(self,identifier):
        return self.find_id(identifier,len(self.scopelist)-1)
    def lookup_current(self,identifier,scope_length=-1):
        tscope=self.scopelist[scope_length]
        if tscope.has_key(identifier):
            return tscope[identifier]
    def delete_scope(self,func_name):
        del self.scopelist[func_name]
    def add_identifier(self,identifier,idtype,order,blocks):
        current_scope=self.scopelist[-1]
        width = {'int':4, 'float':8, 'short':4, 'long':8, 'double':8, 'char':4, 'string': 4, 'function': 4}
        if width.has_key(idtype):
        	varsize=width[idtype]
        else:
        	varsize=4
        # varsize = get_size(idtype)
        if blocks!=0:
            varsize=varsize*blocks
        if not current_scope.has_key(identifier):
            current_scope[identifier]={
                'size':     varsize,
                'type':     idtype,
                'order':    order
            }
        else:
            print identifier+" : variable declared again"
            exit()
    def add_attribute_id(self,identifier,attribute_name,attribute_value):
        temp=self.lookup(identifier)
        print type(temp),temp
        if temp !={}:
            if temp.has_key(attribute_name):
                temp[attribute_name].append(attribute_value)
            else:
                temp[attribute_name]=attribute_value
        else:
            print identifier + " : not declared"
