void swapChild(BinaryNode *p){
	if(p == NULL)
		return;
	BinaryNode *tmp = p -> lft;
	p -> lft = p -> rht;
	p -> rht = tmp;
	swapChild(p -> lft);
	swapChild(p -> rht);
}