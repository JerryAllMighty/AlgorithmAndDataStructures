import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int d = 3;

    static void getDir(String s) {
        if (s.equals("L")) {
            d = (d + 3) % 4;
        } else if (s.equals("R")) {
            d = (d + 1) % 4;
        }
    }

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

        int[][] grid = new int[n][n];

        for (int i = 0; i < m; i++) {
            int[] rc = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int r = rc[0];
            int c = rc[1];
            grid[r - 1][c - 1] = 1;

            int adjacentCnt = 0;
            for (int j = 0; j < 4; j++) {
                if (inRange(r - 1 + dx[j], c - 1 + dy[j], n, n) && grid[r - 1 + dx[j]][c - 1 + dy[j]] == 1) {
                    adjacentCnt++;
                }
            }
            if (adjacentCnt == 3) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}








