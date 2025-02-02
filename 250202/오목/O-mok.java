import java.util.*;

public class Main {
    static int[][] grid = new int[19][19];

    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m
        && r + 4 > 0 &&  c + 4 >= 0 && r + 4 < n && c + 4 < m;

    }

    static String[] isWinner(int r, int c, int n, int m) {
        String[] result = new String[3];
        if (inRange(r,c,n,m) && grid[r][c] == grid[r][c + 1]
                && (grid[r][c + 1] == grid[r][c + 2])
                && (grid[r][c + 2] == grid[r][c + 3])
                && (grid[r][c + 3] == grid[r][c + 4])) {
            result[0] = "true";
            result[1] = Integer.toString(r);
            result[2] = Integer.toString(c + 2);
            return result;
        }
        if (inRange(r,c,n,m) && (grid[r][c] == grid[r + 1][c])
                && (grid[r + 1][c] == grid[r + 2][c])
                && (grid[r + 2][c] == grid[r + 3][c])
                && (grid[r + 3][c] == grid[r + 4][c])) {
            result[0] = "true";
            result[1] = Integer.toString(r + 2);
            result[2] = Integer.toString(c);
            return result;
        }
        if (inRange(r,c,n,m) && (grid[r][c] == grid[r + 1][c + 1])
                && (grid[r + 1][c + 1] == grid[r + 2][c + 2])
                && (grid[r + 2][c + 2] == grid[r + 3][c + 3])
                && (grid[r + 3][c + 3] == grid[r + 4][c + 4])) {
            result[0] = "true";
            result[1] = Integer.toString(r + 2);
            result[2] = Integer.toString(c + 2);
            return result;
        }
        //왼쪽 아래 대각선
        if (inRange(r,c,n,m) && (grid[r][c] == grid[r + 1][c - 1])
                && (grid[r + 1][c - 1] == grid[r + 2][c - 2])
                && (grid[r + 2][c - 2] == grid[r + 3][c - 3])
                && (grid[r + 3][c - 3] == grid[r + 4][c - 4])) {
            result[0] = "true";
            result[1] = Integer.toString(r + 2);
            result[2] = Integer.toString(c - 2);
            return result;
        }
        //오른쪽 위 대각선
        if (inRange(r,c,n,m) && (grid[r][c] == grid[r - 1][c + 1])
                && (grid[r - 1][c + 1] == grid[r - 2][c + 2])
                && (grid[r - 2][c + 2] == grid[r - 3][c + 3])
                && (grid[r - 3][c + 3] == grid[r - 4][c + 4])) {
            result[0] = "true";
            result[1] = Integer.toString(r - 2);
            result[2] = Integer.toString(c + 2);
            return result;
        }
        //왼쪽 위 대각선
        if (inRange(r,c,n,m) && (grid[r][c] == grid[r - 1][c - 1])
                && (grid[r - 1][c - 1] == grid[r - 2][c - 2])
                && (grid[r - 2][c - 2] == grid[r - 3][c - 3])
                && (grid[r - 3][c - 3] == grid[r - 4][c - 4])) {
            result[0] = "true";
            result[1] = Integer.toString(r - 2);
            result[2] = Integer.toString(c - 2);
            return result;
        }

        result[0] = "false";
        result[1] = Integer.toString(r);
        result[2] = Integer.toString(c);
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) {
            int[] row = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            grid[i] = row;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (grid[i][j] != 0) {
                    String[] isWinnerResult = isWinner(i, j,19,19);
                    int resultX = Integer.parseInt(isWinnerResult[1]);
                    int resultY = Integer.parseInt(isWinnerResult[2]);
                    if (isWinnerResult[0].equals("true")) {
                        System.out.println(grid[i][j]);
                        System.out.println(Integer.toString(resultX + 1) + " " + Integer.toString(resultY + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(0);


    }
}









