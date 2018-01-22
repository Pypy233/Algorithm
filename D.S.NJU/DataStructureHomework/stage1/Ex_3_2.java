/**
 * Created by py on 2017/9/5.
 */
public class Ex_3_2 {
    private double average;
    public static void main(String[] args){
        int[] arr = {1 , 1, 1 ,1, 1, 1};
        Ex_3_2 ex_3_2 = new Ex_3_2();
        ex_3_2.Average(arr, 0, arr.length - 1);
        String str = "9999999999999999";
        System.out.print(str.length());
    }
    public void Average(int[] arr, int start, int end){
        int length = arr.length;
        if(start > end){
            System.out.println("The average is " + average);
        }
        else{
            average += arr[start] * 1.0 /length;
            Average(arr, start + 1, end);
        }
    }
}
