package stage1;

/**
 * Created by py on 2017/10/7.
 */
import java.util.Stack;
public class Postfix {
    public static void main(String[] args) {
        String s = "3+(2-5)*6/3";
        Postfix postfix = new Postfix();
        System.out.println("The postfix expression: " + postfix.trans(s));
    }
   public String trans(String str) {
       String res = "";
       Stack<Character> stack = new Stack<>();
       int len = str.length();
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           switch (ch) {
               case ' ':    break;
               case '(':    stack.push(ch);
                            break;
               case '+':
               case '-':
                   while(!stack.isEmpty()){
                       char temp = stack.pop();
                       if(temp == '('){
                           stack.push(temp);
                           break;
                       }
                       res += temp;
                   }
                   stack.push(ch);
                   break;
               case '*':
               case '/':
                   while(!stack.isEmpty()){
                       char temp = stack.pop();
                        if(temp == '+' || temp == '-' || temp == '('){
                            stack.push(temp);
                            break;
                        }
                            res += temp;
                   }
                   stack.push(ch);
                   break;
               case ')':
                   while(!stack.isEmpty()){
                       char temp = stack.pop();
                       if(temp == '(')
                           break;
                       else
                           res += temp;
                   }
               default: res += ch;
                        break;
           }
       }
       while(!stack.isEmpty())
           res += stack.pop();
           return res;

   }
}
