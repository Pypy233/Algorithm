int leafNum(BinaryNode<Type> *root){
	if(root == NULL)
		return 0;
	if(root -> lft == NULL && root -> rht == NULL)
		return 1;
	return leafNum(root -> lft) + leafNum(root -> rht);
}