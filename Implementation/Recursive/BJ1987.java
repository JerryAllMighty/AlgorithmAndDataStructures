package Implementation.Recursive;

import java.io.*;
import java.util.Arrays;

public class BJ1987 {
    static String[][] boards;
    static boolean[] visited = new boolean[97];
    static int visitedCount = 0;
    static int answer = Integer.MIN_VALUE;
    static int r;
    static int c;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean isValid(int row, int col) {
        if (row < 0 || row > r - 1 ||
                col < 0 || col > c - 1) {
            return false;
        }
        return true;
    }

    static void recursive(int startRow, int startCol) {
        visited[boards[startRow][startCol].toCharArray()[0]] = true;
        answer = Math.max(answer, ++visitedCount);

        for (int i = 0; i < 4; i++) {
            int x = startRow + dx[i];
            int y = startCol + dy[i];
            if (isValid(x, y)
                    && !visited[boards[x][y].toCharArray()[0]]) {
                recursive(x, y);
            }
        }

        visited[boards[startRow][startCol].toCharArray()[0]] = false;
        visitedCount--;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        r = info[0];
        c = info[1];
        boards = new String[r][c];
        for (int i = 0; i < r; i++) {
            String[] row = br.readLine().split("");
            boards[i] = row;
        }

        recursive(0, 0);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}