import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int getDir(String c) {
        if (c.equals("U")) {
            return 0;
        } else if (c.equals("D")) {
            return 2;
        } else if (c.equals("R")) {
            return 1;
        } else {
            return 3;
        }

    }

    static boolean inRange(int row, int col, int n) {
        if (row < 1 || row > n  || col < 1 || col > n) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int t = input[1];

        int[][] grid = new int[n][n];
        String[] info = sc.nextLine().split(" ");
        int r = Integer.parseInt(info[0]);
        int c = Integer.parseInt(info[1]);
        int d = getDir(info[2]);
        int[] answer = {r, c};

        for (int i = 1; i <= t; i++) {
            int x = dx[d];
            int y = dy[d];
            if (inRange(answer[0] + x, answer[1] + y, n)) {
                answer[0] += x;
                answer[1] += y;
            } else {
                d = (d + 2) % 4;
            }
        }

        System.out.println(Integer.toString(answer[0]) + " " + Integer.toString(answer[1]));


    }
}







