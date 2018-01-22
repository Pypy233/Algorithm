package stage2;

import java.util.Scanner;

/**
 * Created by py on 2017/10/11.
 */
// Assume that the binary tree is composition of string "abcdefg"
    // What's more, the 'a' the root , then b, c , d, e , f and g.
    //Print infix, postfix and prefix of the tree/=.

    /** Later, change the requirements ???... So I change the BinaryTree to
     * BinarySearch Tree... By input the integers, all the integers shouldn't be '-1'.
     *
    **/
public class BinaryTree {
    class BinaryNode {
        BinaryNode root;
        BinaryNode lft, rht;
        int element;

        public BinaryNode(int element) {
            this.element = element;
        }

        public BinaryNode(int element, BinaryNode lft, BinaryNode rht) {
            this.element = element;
            this.lft = lft;
            this.rht = rht;
        }
    }
        public BinaryNode insert(int x, BinaryNode t){
            if(t == null)
                return new BinaryNode(x, null, null);
            if(x > t.element)
                t.rht = insert(x, t.rht);
            else if(x < t.element)
                t.lft = insert(x, t.lft);
            else;
            return  t;
        }
        public BinaryNode createTree(){
            BinaryNode r = null;
            Scanner input = new Scanner(System.in);
            while(true){
                int a = input.nextInt();
                if(a == -1)
                    break;
                else{
                    r = insert(a, r);
                }
            }
            return r;
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
                printPostfix(root.lft);
                printPostfix(root.rht);
                System.out.print(root.element);
            }
        }
        public void printPrefix(BinaryNode root){
            if(root != null){
                System.out.print(root.element);
                printPrefix(root.lft);
                printPrefix(root.rht);
            }
        }
        public BinaryNode findMax(BinaryNode r){
            if(r == null)
                return null;
            else if(r.rht == null)
                return r;
            return findMax(r.rht);
        }
        public BinaryNode findMin(BinaryNode r){
            if(r == null)
                return null;
            else if(r.lft == null)
                return r;
            return findMin(r.lft);
        }
        public static void main(String[] args){
            BinaryTree tree = new BinaryTree();
            BinaryNode r = tree.createTree();
            System.out.println(r);
            System.out.print("Infix:   ");
            tree.printInfix(r);
            System.out.println();
            System.out.print("Postfix: ");
            tree.printPostfix(r);
            System.out.println();
            System.out.print("Prefix:  ");
            tree.printPrefix(r);
            System.out.println();
            System.out.println("The max element: " + tree.findMax(r).element);
            System.out.println("The min element: " + tree.findMin(r).element);
        }

}
