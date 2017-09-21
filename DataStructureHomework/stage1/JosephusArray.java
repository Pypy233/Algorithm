package stage1;

import java.util.Scanner;

/**
 * Created by py on 2017/9/20.
 */
public class JosephusArray {
    private static int n, m;
    private static int[] arr;
    public static void main(String[] args){
        System.out.println("Enter the total number n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Enter the choosen number m: ");
        m = input.nextInt();
        JosephusArray jarray = new JosephusArray(n, m);
        jarray.find();
    }
    public JosephusArray(int n, int m){
       arr = new int[n];
       for(int i = 0; i < arr.length; i++){
           arr[i] = i + 1;
       }
    }
    public void find() {
            int count = n;
            int i = 0;
            int j = 1;  // j as the number to be checked
            int sign = 1;
            while(count > 0){
                if(arr[i % n] > 0){
                    if(j % m == 0){
                        System.out.print("The "+ sign +" person: "+arr[i % n]+ " ");
                       if(sign == arr.length) {
                           System.out.println();
                           System.out.print("The last survivor: " + arr[i % n] + " ");
                       }
                        j = 1;
                        i++;
                        count--;
                        sign++;
                        arr[i % n] =0;
                    }
                    else{
                        i++;
                        j++;
                    }
                }
                else{
                    i++;
                }
            }
        }
    }

