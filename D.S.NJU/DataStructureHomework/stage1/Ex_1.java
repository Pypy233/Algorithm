import java.util.Scanner;

/**
 * Created by py on 2017/9/5.
 */
/*Algorithm：
	The count is the number of 1's in N;
	if n is odd   count(N) = count(N/2) + 1
	else 	   	  count(N) = count(N/2)
	Then recursive program.
	*/
public class Ex_1{
    private int count = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number N: ");
        int N = input.nextInt();
        Ex_1 ex_1 = new Ex_1();
        ex_1.countOne(N);
    }
    public void countOne(int N){
        if(N==0) {
            System.out.println("The number of 1's is " + count);
        }
        else if(isOdd(N)){
            count++;
            countOne(N/2);
        }
        else {
            countOne(N / 2);
        }
    }
    public boolean isOdd(int N){
        if(N % 2 == 0)
            return false;
        else
            return true;
    }
}

