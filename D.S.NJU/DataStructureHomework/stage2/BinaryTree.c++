#include <iostream>
using namespace std;
struct Node
{
	int data;
	Node *lft;
	Node *rht;
	Node(int data){
		this -> data = data;
		this -> lft = NULL;
		this -> rht = NULL;
	}
};
class BinaryTree
{
public:
	Node *root;
	Node *createTree();
	void preOrder(Node *);
	void inOrder(Node *);
	void postOrder(Node *);
};

Node* BinaryTree::createTree(){
	Node *p1 = new Node(1);
	Node *p2 = new Node(2);
	Node *p3 = new Node(3);
	Node *p4=new Node(4);  
    Node *p5=new Node(5);  
    Node *p6=new Node(6);  
    Node *p7=new Node(7);  
    Node *p8=new Node(8);  
    Node *p9=new Node(9);  
    p1->lft=p2;  
    p1->rht=p3;  
    p2->lft=p4;  
    p2->rht=p5;  
    p5->lft=p6;  
    p3->lft=p7;  
    p3->rht=p8;  
    p8->rht=p9;  
    root = p1;
    return root;
}

void BinaryTree::preOrder(Node *r){
	if(r == NULL)	return;
	else{
		cout << r -> data << ' ';
		preOrder(r -> lft);
		preOrder(r -> rht);
	}	
}

void BinaryTree::inOrder(Node *r){
	if(r == NULL)	return;
	else{
		inOrder(r -> lft);
		cout << r -> data << ' ';
		inOrder(r -> rht);
	}
} 

void BinaryTree::postOrder(Node *r){
	if(r == NULL)	return;
	else{
		postOrder(r -> lft);
		postOrder(r -> rht);
		cout << r -> data << ' ';
	}

}

int main(){
	BinaryTree t;
	t.createTree();

	cout << "PreOrder: ";
	t.preOrder(t.root);
	cout << endl;

	cout << "InOrder: ";
	t.inOrder(t.root);
	cout << endl;

	cout << "PostOrder: ";
	t.postOrder(t.root);
	cout << endl;

}


