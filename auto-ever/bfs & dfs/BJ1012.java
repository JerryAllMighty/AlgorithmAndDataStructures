/*
* 2026.03.09 개인 문제 풀이, 통과 완료
* import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static int M;
    static int N;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean isValid(int x, int y) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }

    static void dfs(int x, int y) {
        board[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isValid(nx, ny) && board[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            board = new int[M][N];
            for (int j = 0; j < K; j++) {
                StringTokenizer eachStringTokenizer = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(eachStringTokenizer.nextToken());
                int Y = Integer.parseInt(eachStringTokenizer.nextToken());
                board[X][Y] = 1;
            }
            int answer = 0;
            for (int k = 0; k < M; k++) {
                for (int l = 0; l < N; l++) {
                    if (board[k][l] == 1) {
                        dfs(k, l);
                        answer++;
                    }
                }
            }
            bw.write(String.valueOf(answer) + "\n");
        }
        bw.flush();
        bw.close();
    }
}


 */