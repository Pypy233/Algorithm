""" Some uncommon points and mistakes are written here."""
from math import sqrt


str = 'demo'
# str[0] = 'x'
'''str' object does not support item assignment'''
'''For it is a tuple, it cannot be changed!'''
print(str)


'''It can be written as this, though we are accustomed to "3 + 5" '''
a = (3).__add__(5)
print(a)
# 8

'''It is possible to change the separator character by setting the sep argument.In addition, each print 
ends with a newline character by default.This behavior can be changed by setting the end argument.'''

print('Hello', 'World!')
# 'Hello World!'

print('Hello', 'World!', sep="***")
# 'Hello***World!'

print('Hello', 'World!', end="***")
# 'Hello World!***'
print()


'''The % operator is a string operator called the format operator.'''
name = 'py'
age = 8
print('The name is %s, age is %d' % (name, age))
# The name is py , age is 8


'''try-catch module'''
a_number = -7
try:
    print(math.sqrt(a_number))
except:
    print("Bad Value for square root")
    print("Using absolute value instead")
    print(sqrt(abs(a_number)))
# Bad Value for square root
# Using absolute value instead
# 2.6457513110645907


'''Or throw an error directly'''
if a_number < 0: raise RuntimeError('You can\'t use a negative number')
else:
    print(sqrt(a_number))
# RuntimeError: You can't use a negative number

