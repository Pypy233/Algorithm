package stage1;

import java.util.Scanner;

/**
 * Created by py on 2017/9/20.
 */
public class Polynomial {
    class Node{
        private int coeff, exp;
        Node next;
        public Node(int coeff, int exp){
            this.coeff = coeff;
            this.exp = exp;
        }
    }
    public static void main(String[] args){
        Node head1 = null;
        Node head2 = null;
        Polynomial pol = new Polynomial();
        head1 = pol.initalPol(head1, 3);
        head2 = pol.initalPol(head2, 3);
        Node aimHead = pol.add(head1, head2);
        System.out.print("The first polynomial: " );
        pol.printList(head1);
        System.out.print("The second polynomial: ");
        pol.printList(head2);
        System.out.print("The added polynomial: ");
        pol.printList(aimHead);
    }
    public Node insertItem(Node head, int coeff1, int exp1) {
        //Node node = new Node(coeff1, exp1);
        //node.next = head;
        //head = node;
        //return head;
        Node node = new Node(coeff1, exp1);
        for(Node n = head; n != null && n.exp < exp1; n = n.next){
            if(n.next.exp > exp1){
                node.next = n.next;
                n.next = node;
            }
        }
        return head;
    }
    public Node initalPol(Node head, int maxDegree){
        System.out.println("Enter the coefficients and exponents: ");
        Scanner input = new Scanner(System.in);
        int coeff1, exp1;
        for(int i = 0; i < maxDegree; i++){
            coeff1 = input.nextInt();
            exp1 = input.nextInt();
            head = insertItem(head, coeff1, exp1);
        }
        return head;
    }
    public int cmpExp(int a, int b){
        if(a > b)
            return 1;
        else if(a < b)
            return -1;
        else
            return 0;
    }
    public Node add(Node lst1, Node lst2){
        Node addList = null;
        while(lst1 != null && lst2 != null){
            switch (cmpExp(lst1.exp, lst2.exp)){
                case 0:
                    addList = insertItem(addList, lst1.coeff + lst2.coeff, lst1.exp);
                    lst1 = lst1.next;
                    lst2 = lst2.next;
                    break;
                case 1:
                    addList = insertItem(addList, lst1.coeff, lst1.exp);
                    lst1 = lst1.next;
                    break;
                case -1:
                    addList = insertItem(addList, lst2.coeff, lst2.exp);
                    lst2 = lst2.next;
                    break;
            }
            while(lst1 != null){
                addList = insertItem(addList, lst1.coeff, lst1.exp);
                lst1 = lst1.next;
            }
            while(lst2 != null){
                addList = insertItem(addList, lst2.coeff, lst2.exp);
                lst2 = lst2.next;
            }
        }
        return addList;
    }
    public void printList(Node head){
        Node pointer = head;
        while(pointer != null){
            System.out.print("(" + pointer.coeff + "x^ " + pointer.exp + ") +");
            pointer = pointer.next;
        }
        System.out.println();
    }
}
