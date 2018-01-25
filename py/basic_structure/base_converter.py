from basic_structure import stack


def base_converter(dec_number, base):
    digits = '123456789ABCDEF'

    rem_stack = stack.Stack()
    while dec_number > 0:
        rem = dec_number % base
        rem_stack.push(rem)
        dec_number //= base

    base_str = ''
    while not rem_stack.is_empty():
        base_str += digits[rem_stack.pop()]

    return base_str


print(base_converter(25, 2))
print(base_converter(25, 16))
