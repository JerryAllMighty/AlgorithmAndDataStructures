import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            grid[i] = row;
        }
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                int cnt = 0;
                for (int k = j; k < j + 3; k++) {
                    if (grid[i][k] == 1) {
                        cnt++;
                    }
                }
                answer = Math.max(answer, cnt);
            }
        }
        System.out.println(answer);
    }
}









