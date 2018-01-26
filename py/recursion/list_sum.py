# Two ways to calculate the sum, loop and recursive
def list_sum(num_list):
    the_sum = 0

    for i in num_list:
        the_sum += i

    return the_sum


print(list_sum([1, 2, 3, 4, 5]))


def list_sum(num_list):
    if len(num_list) == 1:
        return num_list[0]

    return num_list[0] + list_sum(num_list[1:])


print(list_sum([1, 3, 5, 7, 9]))
