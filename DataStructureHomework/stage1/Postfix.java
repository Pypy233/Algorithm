package stage1;

/**
 * Created by py on 2017/10/7.
 */
import java.util.Stack;
public class Postfix {
    public static void main(String[] args) {
        String s = "3+(2-1)*6/3";
        System.out.println("The infix expression:           " + s);
        Postfix postfix = new Postfix();
        System.out.println("The postfix expression:         " + postfix.trans(s));
        System.out.println("The postfix expression result : " + postfix.getRes(postfix.trans(s)));

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
                   break;
               default: res += ch;
                        break;
           }
       }
       while(!stack.isEmpty())
           res += stack.pop();
           return res;

   }
   public double getRes(String postfix){
        Stack<Double> stack = new Stack<>();
        double res = 0;
        for(int i = 0; i < postfix.length(); i++){

           if(Character.isDigit(postfix.charAt(i))) {
              
               stack.push((double) (postfix.charAt(i)) - '0');
           }
            else{
                double num1 = stack.pop();
                double num2 = stack.pop();

              res =  calculate(num2, num1, postfix.charAt(i) + "");
              stack.push(res);

            }
        }

        return  stack.pop();
   }
   public static double calculate(double x, double y, String s){
        switch (s){
            case "+":   return x + y;
            case "-":   return x - y;
            case "*":   return x * y;
            case "/":   return x / y;

        }
        return 0;
   }
}
