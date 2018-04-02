#!/usr/bin/python3
def print_tac(pclass):
	print("----printing tac----")
	print(pclass)
	c = 1
	for member in pclass:
		print(type(member))
		print(member['code'])
		for line in member['code']:
			if line != "":
				print(str(c) + ", " + line)
				c = c + 1
