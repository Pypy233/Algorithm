#!/Users/py/GitHub/Algorithm/py/basic\ structure
# -*- coding: UTF-8 -*-
import Stack


def par_checker(symobl_string):
	s = Stack()
	balanced = True
	idx = 0
	while idx < len(symobl_string) and balanced:
		symobl = symobl_string[idx]
		if symobl == '(':
			s.push(symobl)
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