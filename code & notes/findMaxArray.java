public static int findMax(int[] a, int n){
	if(n == 1)
		return a[0];
	int tmp = findMax(a, n - 1);
	if(a[n - 1] > tmp)
		return tmp;
	return a[n - 1];
}