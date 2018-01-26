# Implement binary search.


def binary_search(a_list, item):
    if len(a_list) == 0:
        return False
    else:
        mid = len(a_list) // 2

    if a_list[mid] == item:
        return True
    else:
        if a_list[mid] < item:
            return binary_search(a_list[mid + 1:], item)
        if a_list[mid] > item:
            return binary_search(a_list[:mid], item)


test_list = [0, 1, 2, 8, 13, 17, 19, 32, 42,]
print(binary_search(test_list, 3))
print(binary_search(test_list, 13))
