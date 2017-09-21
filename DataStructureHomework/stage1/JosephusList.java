import java.util.Scanner;

/**
 * Created by py on 2017/9/20.
 */
public class JosephusList {
    private static int n, m;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number n: ");
        n = input.nextInt();
        System.out.println("Enter the choosen number m: ");
        m = input.nextInt();
        JosephusList jlist = new JosephusList();
        jlist.JosephusListFind();
    }
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
        }
    }
    public void JosephusListFind(){
        Node head = new Node(1);
        Node pointer = head;
        if(n == 1) {
            System.out.println("The only person..., end");
            return;
        }
        else{
            for(int i = 2; i <= n; i++){
                pointer.next = new Node(i);
                pointer = pointer.next;
            }
        }
        pointer.next = head;  // Loop
        while(pointer != pointer.next){
            for(int i = 1; i < m; i++){
                pointer = pointer.next;
            }
            System.out.print(pointer.next.data+ " ");
            pointer.next = pointer.next.next;
        }
        System.out.println();
        System.out.println("The last survivor is " + pointer.data);
    }
}
