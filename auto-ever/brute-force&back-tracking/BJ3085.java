/*
 * 2026.03.09
 * 개인 문제 풀이, 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;

    static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    static int getLongestCount() {
        int rowCountMax = Integer.MIN_VALUE;
        int columnCountMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int rowCount = 1;
            int columnCount = 1;
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == (board[i][j + 1])) {
                    rowCount++;
                } else {
                    rowCountMax = Math.max(rowCountMax, rowCount);
                    rowCount = 1;
                }
                if (board[j][i] == (board[j + 1][i])) {
                    columnCount++;
                } else {
                    columnCountMax = Math.max(columnCountMax, columnCount);
                    columnCount = 1;
                }
            }
            rowCountMax = Math.max(rowCountMax, rowCount);
            columnCountMax = Math.max(columnCountMax, columnCount);
        }
        return Math.max(rowCountMax, columnCountMax);
    }

    static void swap(int i, int j, int x, int y) {
        char before = board[i][j];
        board[i][j] = board[x][y];
        board[x][y] = before;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        board = new char[n][];
        for (int i = 0; i < n; i++) {
            char[] row = br.readLine().toCharArray();
            board[i] = row;
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    int checkX = i + dx[k];
                    int checkY = j + dy[k];
                    if (isValid(checkX, checkY)) {
                        swap(i, j, checkX, checkY);
                        int longestCount = getLongestCount();
                        answer = Math.max(answer, longestCount);
                        swap(checkX, checkY, i, j);
                    }
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

 */