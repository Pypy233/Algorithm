average = 0
def Average(arr, start, end):
	global average
	if start > end:
		print("The average is ", average)
	else:
		average += arr[start]/len(arr)
		Average(arr, start + 1, end)
def main():
	arr = (1, 1, 1, 1, 1, 1)
	Average(arr, 0, len(arr) - 1)
main()