/**
 * Created by py on 2017/9/9.
 */
public class BubbleSort {
    public static void main(String[] args){
        BubbleSort b = new BubbleSort();
        int[]arr = {0 ,1 , 3, 5, 3, 8, 6, 7, 9};
        b.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public void sort(int[] arr){
        if(arr.length == 0) return;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length ; j++){
                if(arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

