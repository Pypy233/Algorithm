float average(int[] a, int n){
	if(n == 1)
		return a[0];
	return (a[n - 1] + average(a, n - 1)) / n;
}