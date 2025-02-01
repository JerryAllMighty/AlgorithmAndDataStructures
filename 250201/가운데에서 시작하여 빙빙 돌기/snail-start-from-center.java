import java.util.*;

public class Main {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x = n - 1;
        int y = n - 1;
        int num = n*n;
        int cnt = 0;
        int d = 0;
        int[][] grid = new int[n][n];
        while (cnt < n * n) {
            grid[x][y] = num;
            num--;
            if (!inRange(x + dx[d], y + dy[d], n, n) || grid[x + dx[d]][y + dy[d]] != 0) {
                d = (d + 1) % 4;
            }
            x = x + dx[d];
            y = y + dy[d];
            cnt++;
        }

        for(int[] row : grid){
            for(int i =0; i < row.length; i++){
                System.out.print(row[i] + " ");
            }
            System.out.println();

        }

    }
}









