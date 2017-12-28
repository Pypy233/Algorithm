public void reverse(ListNode f){
	if(f == null)
		return;

	ListNode p = f.link, pr = null;
	while(p != null){
		f.link = pr;
		pr = f;
		f = p;
		p = p.link;
	}
	f.link = pr;
}