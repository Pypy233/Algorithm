# Transform decimal number to binary number by using stack defined before.
# The complexity is O(logn)

from basic_structure import stack
def divide_by_2(dec_number):
    rem_stack = stack.Stack()

    while dec_number > 0:
        rem_number = dec_number % 2
        rem_stack.push(rem_number)
        dec_number //= 2

    bin_num = ''
    while not rem_stack.is_empty():
        bin_num += (str)(rem_stack.pop())
    return bin_num

print(divide_by_2(42))