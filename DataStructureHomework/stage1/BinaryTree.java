package stage1;

/**
 * Created by py on 2017/10/11.
 */
import  java.util.ArrayList;
public class BinaryTree {
    Node root;
   class Node{
       Node  lft, rht;
       String data;
       public Node(String data){
           this.data = data;
       }
       public Node(Node lft, Node rht, String data){
           this.lft = lft;
           this.rht = rht;
           this.data = data;
       }
   }
   public void create(String str){
       char[] arr = str.toCharArray();
       String data = "";
       ArrayList<String> opeList = new ArrayList<>();
       ArrayList<Node> numList = new ArrayList<>();
       for(int i = 0; i < arr.length; i++){
           if(arr[i] >= '0' && arr[i] <= '9'){
               data += arr[i];
           }
           else{
                numList.add(new Node(data));
                data = "";
                opeList.add(arr[i] + "");
           }
       }
       numList.add(new Node(data));

       while(opeList.size() > 0){
           Node lft = numList.remove(0);
           Node rht = numList.remove(0);
           String ope = opeList.remove(0);
           numList.add(0, new Node(lft, rht, ope));

       }
       root = numList.get(0);
   }
   public void print(Node node){
       if(node.lft != null)
           print(node.lft);
       System.out.print(node.data);
       if(node.rht != null)
           print(node.rht);

   }
    public void print(){
       print(root);
    }
   public static void main(String[] args){
       String s = "45+23*56/2-5";
       BinaryTree bTree = new BinaryTree();
       bTree.create(s);
       bTree.print();
   }
}
