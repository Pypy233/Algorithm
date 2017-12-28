public static int findMax(ListNode f){
	if(f.link == null)
		return f.data;
	int tmp = findMax(f.link);
	if(tmp > f.data)
		return tmp;
	return f.data;
}