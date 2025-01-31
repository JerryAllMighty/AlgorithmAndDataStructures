import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int num = 0;
        int x = 0;
        int y = 0;
        int d = 0;
        int[][] grid = new int[n][m];

        while (true) {
            num++;
            grid[x][y] = num;
            if (num == n*m) {
                break;
            }
            if (!inRange(x + dx[d], y + dy[d], n, m) || grid[x + dx[d]][y + dy[d]] > 0) {
                d = (d + 1) % 4;
            }
            x += dx[d];
            y += dy[d];
        }
        for(int i =0; i < grid.length;i++){
            for(int j =0; j < grid[i].length;j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}









