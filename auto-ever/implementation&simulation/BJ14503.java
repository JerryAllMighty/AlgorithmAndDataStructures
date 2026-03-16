/*
 * 2026.03.16 개인 문제 풀이, 틀림
 * import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] rooms;
    static int n;
    static int m;
    static int r;
    static int c;
    static int d;
    static int answer;

    static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    static void search(int row, int column) {
        if (rooms[row][column] == 0) {
            rooms[row][column] = 1;
            answer++;
        }
        for (int i = 3; i >= 0; i--) {
            int nx = row + dx[d];
            int ny = column + dy[d];
            if (!isValid(nx, ny)) {
                continue;
            }
            if (rooms[nx][ny] == 0) {
                d = (d + 3) % 4;
                search(nx, ny);
            }
        }

        int nx = row - dx[d];
        int ny = column - dy[d];
        if (isValid(nx, ny)) {
            search(nx, ny);
        } else {
            return;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());

        StringTokenizer initialStringTokenizer = new StringTokenizer(br.readLine());
        r = Integer.parseInt(initialStringTokenizer.nextToken());
        c = Integer.parseInt(initialStringTokenizer.nextToken());
        d = Integer.parseInt(initialStringTokenizer.nextToken());

        rooms = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            StringTokenizer roomStringTokenizer = new StringTokenizer(br.readLine());
            int[] row = new int[m];
            for (int j = 0; j < m; j++) {
                int room = Integer.parseInt(roomStringTokenizer.nextToken());
                row[j] = room;
            }
            rooms[i] = row;
        }

        search(r, c);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}





 */