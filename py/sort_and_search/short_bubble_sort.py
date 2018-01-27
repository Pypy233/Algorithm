# A bubble sort can be modified to stop early if it finds that the list has become sorted.
#  This means that for lists that require just a few passes, a bubble sort may have an advantage
# in that it will recognize the sorted list and stop.


def short_bubble_sort(a_list):
    exchanges = True
    pass_num = len(a_list) - 1

    while pass_num > 0 and exchanges:
        exchanges = False
        for i in range(pass_num):
            if a_list[i] > a_list[i + 1]:
                exchanges = True
                temp = a_list[i]
                a_list[i] = a_list[i + 1]
                a_list[i + 1] = temp


a_list=[20, 30, 40, 90, 50, 60, 70, 80, 100, 110]
short_bubble_sort(a_list)
print(a_list)