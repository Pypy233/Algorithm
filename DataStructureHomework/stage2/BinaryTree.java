package stage2;

/**
 * Created by py on 2017/10/11.
 */
// Assume that the binary tree is composition of string "abcdefg"
    // What's more, the 'a' the root , then b, c , d, e , f and g.
    //Print infix, postfix and prefix of the tree/=.
public class BinaryTree {
    class BinaryNode {
        BinaryNode root;
        BinaryNode lft, rht;
        String element;

        public BinaryNode(String element) {
            this.element = element;
        }

        public BinaryNode(String element, BinaryNode lft, BinaryNode rht) {
            this.element = element;
            this.lft = lft;
            this.rht = rht;
        }
    }
        public BinaryNode createTree(){
            BinaryNode root = new BinaryNode("a");
            BinaryNode node1 = new BinaryNode("b");
            BinaryNode node2 = new BinaryNode("c");
            BinaryNode node3 = new BinaryNode("d");
            BinaryNode node4 = new BinaryNode("e");
            BinaryNode node5 = new BinaryNode("f");
            BinaryNode node6 = new BinaryNode("g");
            root = new BinaryNode(root.element, node1, node2);
            node1.lft = node3;
            node1.rht = node4;
            node2.lft = node5;
            node2.rht = node6;
            return root;
        }
        public void printInfix(BinaryNode root){
            if(root != null){
                printInfix(root.lft);
                System.out.print(root.element);
                printInfix(root.rht);
            }
        }
        public void printPostfix(BinaryNode root){
            if(root != null){
                printInfix(root.lft);
                printInfix(root.rht);
                System.out.print(root.element);
            }
        }
        public void printPrefix(BinaryNode root){
            if(root != null){
                System.out.print(root.element);
                printInfix(root.lft);
                printInfix(root.rht);
            }
        }
        public static void main(String[] args){
            BinaryTree tree = new BinaryTree();
            BinaryNode root = tree.createTree();
            System.out.print("Infix:   ");
            tree.printInfix(root);
            System.out.println();
            System.out.print("Postfix: ");
            tree.printPostfix(root);
            System.out.println();
            System.out.print("Prefix:  ");
            tree.printPrefix(root);
        }

}
