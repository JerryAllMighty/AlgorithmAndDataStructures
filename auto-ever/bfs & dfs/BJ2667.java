/*
 * 2026 03 16 복기 떄 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static List<Integer> answer = new ArrayList<>(); //각 단지내 집의 수
    static int count;

    static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    static void search(int x, int y) {
        map[x][y] = 2;
        for (int j = 0; j < 4; j++) {
            int nx = x + dx[j];
            int ny = y + dy[j];
            if (isValid(nx, ny) && map[nx][ny] == 1) {
                count++;
                search(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                row[j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
            map[i] = row;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    count = 1;
                    search(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(answer.size());
        stringBuilder.append("\n");
        for (Integer i : answer) {
            stringBuilder.append(String.valueOf(i));
            stringBuilder.append("\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}






 */