float average(ListNode f, int n){
	if(f.link == null)
		return f.data;
	return (f.data + average(f.link, n - 1) * (n - 1)) / n;
}