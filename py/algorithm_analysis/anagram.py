def anagram_solution(s1, s2):
    a_list = list(s2)

    pos1 = 0
    still_ok = True

    while pos1 < len(s1) and still_ok:
        pos2 = 0
        found = False

        while pos2 < len(a_list) and not found:
            if s1[pos1] == a_list[pos2]:
                found = True
            else:
                pos2 += 1
        if found:
            a_list[pos2] = None
        else:
            still_ok = False

        pos1 += 1

    return still_ok


print(anagram_solution('abcd', 'dcba'))


# The code is not so simple and readable?
# The number of visits then becomes the sum of the integers from 1 to 𝑛.

def anagram_solution2(s1, s2):
    a_list = list(s1)
    b_list = list(s2)

    a_list.sort()
    b_list.sort()

    pos = 0
    matches = True

    while pos < len(s1) and matches:
        if a_list[pos] == b_list[pos]:
            pos += 1
        else:
            matches = False

    return matches


print(anagram_solution2('abcde','edcba'))


# The code is simple and readable.
# The two calls to the Python sort method are not without their own cost, sorting is
# typically either 𝑂(𝑛2) or 𝑂(𝑛 log 𝑛)


def anagram_solution4(s1, s2):
    c1 = [0] * 26
    c2 = [0] * 26

    for i in range(len(s1)):
        pos = ord(s1[i]) - ord('a')
        c1[pos] += 1

    for i in range(len(s2)):
        pos = ord(s2[i]) - ord('a')
        c2[pos] += 1

    j = 0
    still_ok = True
    while j < 26 and still_ok:
        if c1[j] == c2[j]:
            j += 1
        else:
            still_ok = False

    return still_ok


print(anagram_solution4('apple','pleap'))

# Adding it all up gives us 𝑇 (𝑛) = 2𝑛 + 26 steps. That is 𝑂(𝑛).
# Found a linear order of magnitude algorithm for solving this problem.
