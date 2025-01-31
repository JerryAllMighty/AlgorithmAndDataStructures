import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int num = 65;
        int x = 0;
        int y = 0;
        int d = 0;
        int[][] grid = new int[n][m];
        int cnt = 0;
        while (cnt < (n * m)) {
            if(num > 90){
                num -= 26;
            }
            grid[x][y] = num;
            num++;
            int toBeX = x + dx[d];
            int toBeY = y + dy[d];
            if (!inRange(toBeX, toBeY, n, m) || grid[toBeX][toBeY] != 0) {
                d = (d + 1) % 4;
                toBeX = x + dx[d];
                toBeY = y + dy[d];
            }

            x = toBeX;
            y = toBeY;
            cnt++;

        }


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print((char)grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}









