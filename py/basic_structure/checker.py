#!/Users/py/GitHub/Algorithm/py/basic\ structure
# -*- coding: UTF-8 -*-
from basic_structure import stack


def par_checker(symobl_string):
	s = stack.Stack()
	balanced = True
	idx = 0
	while idx < len(symobl_string) and balanced:
		symbol = symobl_string[idx]
		if symbol == '(':
			s.push(symbol)
		else:
			if(s.is_empty()):
				balanced = False
			else:
				s.pop()

		idx += 1

	if s.is_empty() and balanced:
		return True
	else:
		return False


print(par_checker('(((())))'))
print(par_checker('((()'))

def par_checker2(symbol_string):
	s = stack.Stack()
	balanced = True
	idx = 0
	while idx < len(symbol_string) and balanced:
		symbol = symbol_string[idx]
		if symbol in '[({' :
			s.push(symbol)
		else:
			if s.is_empty():
				balanced = False
			else:
				top = s.pop()
				if not matches(top, symbol):
					return False
		idx += 1

	if balanced and s.is_empty():
		return True
	else:
		return False


def matches(open, close):
	opens = '([{'
	closes = ')]}'
	return opens.index(open) == closes.index(close)

print()
print(par_checker2('{{([][])}()}'))
print(par_checker2('[{()]'))