import java.util.*;

public class Main {
    //L, R, D, U
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};

    static HashMap<String, Integer> getStartIdx(int startDirectionIdx, int n, int k) {
        HashMap<String, Integer> result = new HashMap<>();
        int row;
        int col;

        if (startDirectionIdx == 3) {
            row = n - 1;
            col = k - 1;
        } else if (startDirectionIdx == 2) {
            row = 0;
            col = k - 1;
        } else if (startDirectionIdx == 1) {
            row = n - 1;
            col = ((k % n) + (n - 1)) % n;
        } else{
            row = (k % n) - 1;
            col = n - 1;
        }

        result.put("row", row);
        result.put("col", col);
        return result;
    }

    static int getStartDir(int k, int n) {
        int portion = 1;
        while (true) {
            if (k <= n * portion) {
                break;
            } else {
                portion++;
            }

        }
        if (portion == 1) {
            return 2;
        } else if (portion == 2) {
            return 1;
        } else if (portion == 3) {
            return 3;
        } else return 0;
    }

    static int getDir(String type, int startDirectionIdx) {
        //L, R, D, U
        if (type.equals("/")) {
            if (startDirectionIdx == 3) {
                return 1;
            } else if (startDirectionIdx == 2) {
                return 0;
            } else if (startDirectionIdx == 1) {
                return 2;
            } else return 3;

        } else {
            if (startDirectionIdx == 2) {
                return 1;
            } else if (startDirectionIdx == 3) {
                return 0;
            } else if (startDirectionIdx == 1) {
                return 2;
            } else return 3;

        }

    }

    static int getDirIdx(String direction) {
        if (direction.equals("U")) {
            return 3;
        } else if (direction.equals("D")) {
            return 2;
        } else if (direction.equals("R")) {
            return 1;
        } else return 0;
    }

    static boolean inRange(int row, int col, int n, int m) {
        return row >= 0 && col >= 0 && row <= n - 1 && col <= m - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] grid = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            grid[i] = input;
        }


        int k = Integer.parseInt(sc.nextLine());
        int d = getStartDir(k, n);
        HashMap<String, Integer> startIdx = getStartIdx(d, n, k);
        int x = startIdx.get("row");
        int y = startIdx.get("col");

        //L, R, D, U
        int answer = 1;
        while (true) {
            String type = grid[x][0].substring(y,y+1);
            d = getDir(type, d);
            x += dx[d];
            y += dy[d];
            if (!inRange(x, y, n, n)) {
                break;
            }
            answer++;

        }
        System.out.println(answer);


    }
}








