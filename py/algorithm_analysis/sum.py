# Compare the two ways of calculating the sum of 1 to n.
import time


def sum_of_n(n):
    the_sum = 0
    for i in range(1, n + 1):
        the_sum += i

    return the_sum


print(sum_of_n(10))


def foo(tom):
    fred = 0
    for bill in range(1, tom + 1):
        barney = bill
        fred += barney

    return fred


print(foo(10))


def sum_of_n2(n):
    start = time.time()

    the_sum = 0
    for i in range(1, n + 1):
        the_sum += i

    end = time.time()
    return the_sum, end - start


for i in range(5):
    print('Sum is %d required %10.7f seconds.' % sum_of_n2(10000))

for i in range(5):
    print('Sum is %d required %10.7f seconds.' % sum_of_n2(1000000))


'''
Sum is 50005000 required  0.0007789 seconds.
Sum is 50005000 required  0.0007579 seconds.
Sum is 50005000 required  0.0007489 seconds.
Sum is 50005000 required  0.0007482 seconds.
Sum is 50005000 required  0.0007398 seconds.
Sum is 500000500000 required  0.0733187 seconds.
Sum is 500000500000 required  0.0899811 seconds.
Sum is 500000500000 required  0.0800550 seconds.
Sum is 500000500000 required  0.0794630 seconds.
Sum is 500000500000 required  0.0819361 seconds.
'''

# In this case, the average again turns out to be about 10 times the previous.


def sum_of_n3(n):
    start = time.time()
    res = n * (n + 1) / 2
    end = time.time()

    return res, end - start


print(sum_of_n3(10))

for i in range(1, 6):
    print('Sum is %d required %10.7f seconds.' % sum_of_n3(10**i*10000))

'''
Sum is 5000050000 required  0.0000010 seconds.
Sum is 500000500000 required  0.0000000 seconds.
Sum is 50000005000000 required  0.0000000 seconds.
Sum is 5000000050000000 required  0.0000012 seconds.
Sum is 500000000500000000 required  0.0000000 seconds.
'''

# It appears that sum_of_n_3 is hardly impacted by the number of integers being added.
