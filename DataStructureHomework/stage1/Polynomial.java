package stage1;

/**
 * Created by py on 2017/10/6.
 */
public class Polynomial {
    public static void main(String[] args) {
        Polynomial pol = new Polynomial();
        Node lst1 = null, lst2 = null;
        for(int i = 1; i <= 5; i++)
            lst1 = pol.insert(lst1, 1, i);
        pol.display(lst1);

    }
     class Node{
        Node head;
        Node next;
        int coef, exp;
        public Node(int coef, int exp){
            this.coef = coef;
            this.exp = exp;
        }
    }
    public Node insert(Node head, int coef, int exp){
        Node node = new Node(coef, exp);
        node.next = head;
        head = node;
        return head;
    }
    public void display(Node head){
        while(head != null){
            boolean isEnd = false;
            boolean isCoefOne = false;
            if(head.next == null)
                isEnd = true;
            if(head.coef == 1)
                isCoefOne = true;

            String midStr = head.coef + "x^"+ head.exp+ " + ";
            String endStr = head.coef + "x^"+ head.exp;
            String coefOneStr = "x^" + head.exp +" + ";
            String coefOneEndStr = "x^" + head.exp;

            if(isEnd && isCoefOne)
                System.out.print(coefOneEndStr);
            if(isEnd && !isCoefOne)
                System.out.print(endStr);
            if(!isEnd && isCoefOne)
                System.out.print(coefOneStr);
            if(!isEnd && !isCoefOne)
                System.out.print(midStr);
            head = head.next;
        }
    }
   
}
