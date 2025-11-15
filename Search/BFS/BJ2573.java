package Search.BFS;

import java.io.*;
import java.util.Arrays;

public class BJ2573 {
    //통과 못한 개인 풀이

    static int[][] graph;
    static int[][] visited;
    static int row;
    static int col;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};

    static int countPart() {
        int result = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (graph[i][j] != 0 && visited[i][j] != 1) {
                    dfs(i, j);
                    result++;
                }
            }
        }
        return result;
    }

    static void dfs(int r, int c) {
        visited[r][c] = 1;
        for (int i = r - 1; i < r + 2; i++) {
            for (int j = c - 1; j < c + 2; j++) {
                if (i < 0 || i >= row || j < 0 || j >= col) {
                    continue;
                }
                if (graph[i][j] != 0 && visited[i][j] != 1) {
                    dfs(i, j);
                }
            }
        }
    }

    static int getSurroundedZeros(int r, int c) {
        int result = 0;
        if (r < 0 || r >= row || c < 0 || c >= col) {
            return -1;
        }
        if (c + 1 >= 0 && c + 1 < col && graph[r][c + 1] == 0) {
            result++;
        }
        if (c - 1 >= 0 && c - 1 < col && graph[r][c - 1] == 0) {
            result++;
        }
        if (r + 1 >= 0 && r + 1 < row && graph[r + 1][c] == 0) {
            result++;
        }
        if (r - 1 >= 0 && r - 1 < row && graph[r - 1][c] == 0) {
            result++;
        }
        return result;
    }

    static void yearPass() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int zeroCount = getSurroundedZeros(i, j);
                graph[i][j] = zeroCount >= 0 ? zeroCount : 0;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        row = input[0];
        col = input[1];
        graph = new int[row][col];
        visited = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[i] = info;
        }

        int year = 0;
        while (true) {
            int countPart = countPart();
            if (countPart >= 2) {
                break;
            }
            yearPass();
            year++;
        }

        bw.write(Integer.toString(year));
        bw.flush();
        bw.close();
        br.close();
    }
}
