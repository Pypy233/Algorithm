package stage1;

/**
 * Created by py on 2017/10/6.
 */
// As modify two polynomials added, be careful that the exponent must be sequential.
public class Polynomial {
    public static void main(String[] args) {
        Polynomial pol = new Polynomial();
        Node lst1 = null, lst2 = null, addLst = null;
        for(int i = 1; i <= 5; i++) {
            lst1 = pol.insert(lst1, 1, i);
            lst2 = pol.insert(lst2, 1, 3 * i);
        }
        pol.display(lst1);
        pol.display(lst2);

        addLst = pol.add(lst1, lst2);
        pol.display(addLst);

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
                System.out.println(coefOneEndStr);
            if(isEnd && !isCoefOne)
                System.out.println(endStr);
            if(!isEnd && isCoefOne)
                System.out.print(coefOneStr);
            if(!isEnd && !isCoefOne)
                System.out.print(midStr);
            head = head.next;
        }
    }
    public Node add(Node lst1, Node lst2){
        Polynomial pol = new Polynomial();
        Node addLst = null;
        while(lst1 != null && lst2 != null){
            if(lst1.exp > lst2.exp){
                addLst = pol.insert(addLst, lst1.coef, lst1.exp);
                lst1 = lst1.next;
            }
            else if(lst1.exp < lst2.exp){
               addLst = pol.insert(addLst, lst2.coef, lst2.exp);
                lst2 = lst2.next;
            }
            else{
                addLst = pol.insert(addLst, lst1.coef + lst2.coef, lst1.exp);
                lst1 = lst1.next;
                lst2 = lst2.next;
            }
        }
        while(lst1!= null) {
            addLst = pol.insert(addLst, lst1.coef, lst1.exp);
            lst1 = lst1.next;
        }
        while(lst2!= null) {
            addLst = pol.insert(addLst, lst2.coef, lst2.exp);
            lst2 = lst2.next;
        }
        return addLst;
    }
   
}
