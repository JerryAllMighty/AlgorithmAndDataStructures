import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static boolean inRange(int row, int col, int n, int m) {
        if (row < 0 || col < 0 || row > n - 1 || col > m - 1) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        int[][] grid = new int[n][m];
        grid[0][0] = 1;
        int x = 0;
        int y = 0;
        int d = 0;
        int num = 1;
        for(int i =0; i < n*m;i++){
            if (!inRange(x + dx[d], y + dy[d], n, m) || grid[x + dx[d]][y + dy[d]] != 0) {
                d = (d + 1) % 4;
            }
            num++;
            grid[x + dx[d]][y + dy[d]] = num;
            x = x + dx[d];
            y = y + dy[d];
        }



        for (int[] row : grid) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();


        }
    }
}








