import math
sum = 0
def countOne(N):
	global sum
	if(N == 0):
		print("The number of 1's in number is ", sum)
	elif(IsOdd(N)):
		sum += 1
		countOne(N//2)
		print(N, ' ', sum)
	else:
		countOne(N//2)

def IsOdd(N):
	if N % 2 ==0:  return False
	else:		   return True
def main():
	print('Enter the number N :')
	N = input()
	countOne(N)
main()