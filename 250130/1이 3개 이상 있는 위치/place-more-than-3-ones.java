import java.util.*;

public class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static boolean inRange(int row, int col, int n) {
        if (row < 0 || row > n - 1 || col < 0 || col > n - 1) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            grid[i] = row;
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                int oneCnt = 0;
                for (int k = 0; k < 4; k++) {
                    int x = dx[k];
                    int y = dy[k];
                    if (inRange(i + x, j + y, n) && grid[i + x][j + y] == 1) {
                        oneCnt++;
                    }
                }
                if (oneCnt >= 3) {
                    answer++;
                }

            }
        }
        System.out.println(answer);


    }
}







