import java.util.Scanner;

/**
 * Created by py on 2017/9/5.
 */
public class Ex_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        Ex_2 ex_2 = new Ex_2();
        ex_2.permute(str);

    }
    public void permute(String str){
        char[] arr = str.toCharArray();
        permute(arr, 0, str.length() - 1);
    }
    private void permute(char[] str, int low, int high){
        if(low == high){
            for(int i = 0; i <= high; i++)
                System.out.print(str[i]);
            System.out.println();
        }
        else{
            for(int i = low; i <= high; i++){
                swap(low, i, str);
                permute(str, low+1, high);
                swap(low, i, str);
            }
        }
    }
    public static void swap(int a, int b, char[] str){
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
}
