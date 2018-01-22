/**
 * Created by py on 2017/9/9.
 */
public class RankSort {
    public static void main(String[] args){
        int[] a = {3, 0 , 88, 23, 2, 11, 23, 9, 4};
        int n = a.length;
        int[] r = new int[n];
        RankSort rnk = new RankSort();
        rnk.rank(a, r, n);
        rnk.reArrange(a, r, n);
        for(int i: a)
            System.out.print(i + " ");
    }
    public void rank(int[] a, int[] r, int n){
        for(int i = 0; i < n; i++)
            r[i] = 0;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(a[i] >= a[j])
                    r[i]++;
                else
                    r[j]++;
            }
        }
    }
    public void reArrange(int[] a, int[]r, int n){
        for(int i = 0; i < n; i++){
            while(i != r[i]){
                swap(a, i, r[i]);
                swap(r, i ,r[i]);
            }

        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
