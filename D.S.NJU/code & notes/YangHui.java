/**
 * Created by py on 2017/9/25.
 */
public class YangHui {
    public static void main(String[] args){
        YangHui delta = new YangHui();
        delta.printYangHui(20);
    }
    public void printYangHui(int n){
        int[][] mat = new int[n][];
        int i, j;
        for(i = 0; i < n; i++){
            mat[i] = new int[i + 1];
            mat[i][0] = mat[i][i] = 1;
            for(j = 1; j < i; j++){
                mat[i][j] = mat[i - 1][j] + mat[i - 1][j - 1];
            }
        }
        for(i = 0; i < n; i++){
            for(j = 0; j < n - i; j++){
              System.out.print(" ");
             }
            for(j = 0; j < i + 1; j++){
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }
}
