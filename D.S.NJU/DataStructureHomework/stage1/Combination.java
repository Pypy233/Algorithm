import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

/**
 * Created by py on 2017/9/4.
 */
// As (n, r) represents Cnr, then (n, r) = (n - 1, r) + (n - 1, r-1)
public class Combination {
    public static int[] arr = null;
    public static int[] temp = null; // temp[] store the results.
    public static  int k = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = input.nextInt();
        System.out.println("Enter the number r: ");
        int r = input.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = i + 1;
        k = r;
        temp = new int[k];
        Combination cob = new Combination();
        cob.combine1(n, k);
    }
    public void combine1(int n, int r) {
        if(r == 0){
            for(int i = 0; i < k; i++){
                System.out.print(temp[i]);
            }
            System.out.println();
        }else if(n < r){
            return;
        }else{
            combine1(n-1, r); // (n - 1, r)
            combine1(n-1, r-1); //(n - 1, r -1)
            temp[r-1] = arr[n-1];
        }
    }
}
