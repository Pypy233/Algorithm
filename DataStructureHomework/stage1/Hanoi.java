import java.util.Scanner;

/**
 * Created by py on 2017/9/4.
 */
public class Hanoi {
    private static int count = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sum of plates:");
        int sum = input.nextInt();
        Hanoi hanoi = new Hanoi();
        hanoi.move('A', 'B', 'C', sum);
        System.out.println("The total times is " + count+".");
    }
    public void move(char A, char B, char C, int sum) {
        if(sum == 1){
            System.out.println("The plate move from " + A +" to " + C+".");
            count++;
        }
        else{
            move(A, C, B, sum - 1);
            System.out.println("The plate move from " + A +" to " + C+".");
            count++;
            move(B, A, C, sum-1);
        }
    }
}

