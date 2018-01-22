/**
 * Created by py on 2017/9/5.
 */
public class Ex_3_1 {
    private int max;
    public static void main(String[] args){
        Ex_3_1 ex_3_1 = new Ex_3_1();
        int[] arr = {999, 2, 4, 2, 7, 23, 321, 3, 3, 10000};
        ex_3_1.findMax(arr, 0, arr.length - 1);
    }
    public void findMax(int[] arr, int start, int end){
        if(arr.length == 0)
            return;
        if(start > end)
            System.out.println("The maximum is " + max);
        else{
            if(arr[start] >= max){
                max = arr[start];
            }
            findMax(arr, start + 1, end);
        }

    }
}
