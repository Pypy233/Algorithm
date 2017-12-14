package stage1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetCircles {
    public static int[][] graph;
    public static boolean[] visited;
    ArrayList<Integer> trace = new ArrayList<>();
    public static boolean hasCycle = false;
    public static int circleNumber = 0;
    public static int n;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points in the graph: ");
        n = input.nextInt();
        GetCircles getCircles = new GetCircles();

        graph = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                graph[i][j] = -1;
            }
        }

        visited = new boolean[n];
        for(int i = 0; i < n; i++){
            visited[i] = false;
        }

        System.out.println("Enter all the edge: ");
        String s = input.next();
        while(s.equals("end") == false){
            int start = s.charAt(0) - 'A';
            int end = s.charAt(1) - 'A';
            graph[start][end] = 1;
            s = input.next();
        }

        for(int i = 0; i < n; i++){
            getCircles.getCycle(i);
        }
        System.out.println("The sum of cycles is " + circleNumber);

    }

    public void getCycle(int idx){
        if(visited[idx]){
            int j;
            if((j = trace.indexOf(idx)) != -1){
                hasCycle = true;
                circleNumber++;
                System.out.print("Circle: ");
                while(j < trace.size()){
                    System.out.print((char)(trace.get(j) + 'A') + " ");
                    j++;
                }
                System.out.println((char)(trace.get(trace.indexOf(idx)) + 'A'));
                return;
            }
            return;
        }
        visited[idx] = true;
        trace.add(idx);
        for(int i = 0; i < n; i++){
            if(graph[idx][i] == 1)
                getCycle(i);

        }
        trace.remove(trace.size() - 1);
    }


}
