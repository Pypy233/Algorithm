import java.util.Scanner;

/**
 * Created by py on 2017/9/6.
 */

/*
* */
public class Ex_5 {
    public static void main(String[] args){
        Ex_5 ex_5 = new Ex_5();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        System.out.println("Is the string a palindrome? " + ex_5.IsPalindrome(str));
    }
    public boolean IsPalindrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < 'a' || str.charAt(i) > 'z')
                str.replace(str.charAt(i), ' ');
        }
        char[] arr = str.toCharArray();

        return IsPalindrome(arr, 0, arr.length - 1);
    }
    public boolean IsPalindrome(char[] arr, int start, int end){
        if(start >= end)
            return true;
        else{
            if(arr[start] == arr[end])
                return IsPalindrome(arr, start + 1, end -1);
            else
                return false;
        }
    }
}
