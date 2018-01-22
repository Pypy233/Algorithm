package stage1;

import java.util.Scanner;

/**
 * Created by py on 2017/9/11.
 */
public class Combination2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = input.nextInt();
        System.out.println("Enter the number r: ");
        int r = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i + 1;
        }
        int[] temp = new int[r];
        Combination2 cmb = new Combination2();
        cmb.combination2(arr, temp, n, r);
        }

    public void combination2(int[]arr, int[] temp, int n , int r){
       for(int i = r; i <= n; i++){
           temp[r - 1] = arr[i - 1];
           if(r > 1)
               combination2(arr, temp, i - 1, r - 1);
           else{
               for(int j = 0; j < temp.length; j++)
                   System.out.print(temp[j]);
               System.out.println();
           }
       }
    }

}
