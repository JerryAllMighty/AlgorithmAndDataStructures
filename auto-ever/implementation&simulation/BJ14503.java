/*
 * 2026 03 26 복기 때 못 품
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] rooms;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int r;
    static int c;
    static int d;

    static int count;

    static void search(int x, int y) {
        int row = x;
        int column = y;

        while (true) {
//        현재 칸이 아직 청소되지 않은 경우, 현재 칸을 청소한다.
            if (rooms[row][column] == 0) {
                rooms[row][column] = 1;
                count++;
            }
            boolean isCleanable = false;
            for (int i = 0; i < 4; i++) {
                int nx = row + dx[i];
                int ny = column + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
//        현재 칸의 주변 4$칸 중 청소되지 않은 빈 칸이 있는 경우,
//        반시계 방향으로    90^\circ$ 회전한다.
                if (rooms[nx][ny] == 0) {
                    isCleanable = true;
                    d = (d + 3) % 4;
//        바라보는 방향을 기준으로 앞쪽 칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
                    int nr = row + dx[d];
                    int nc = column + dy[d];
                    if (nr < 0 || nr >= n || nc < 0 || nc >= m
                            && rooms[nr][nc] == 0) {
                        row = nr;
                        column = nc;
                        break;
                    }
//        1번으로 돌아간다.
                }
            }
            //        현재 칸의 주변
            //        $4$칸 중 청소되지 않은 빈 칸이 없는 경우,
            if (!isCleanable) {
//        바라보는 방향을 유지한 채로 한 칸 후진할 수 있다면 한 칸 후진하고 1번으로 돌아간다.
//        바라보는 방향의 뒤쪽 칸이 벽이라 후진할 수 없다면 작동을 멈춘다.
                int nx = row - dx[d];
                int ny = column - dy[d];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m
                || rooms[nx][ny] == 1) {
                    break;
                }
                row = nx;
                column = ny;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        rooms = new int[n][m];

        stringTokenizer = new StringTokenizer(br.readLine());
        r = Integer.parseInt(stringTokenizer.nextToken());
        c = Integer.parseInt(stringTokenizer.nextToken());
        d = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int[] row = new int[m];
            for (int j = 0; j < m; j++) {
                int number = Integer.parseInt(stringTokenizer.nextToken());
                row[j] = number;
            }
            rooms[i] = row;
        }

        search(r, c);

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}






 */
/*
 * 2026.03.01 복기 떄 못 품
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
        while (true) {
            if (rooms[row][column] == 0) {
                rooms[row][column] = 2;
                answer++;
            }

            boolean isFound = false;
            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4;
                int nx = row + dx[d];
                int ny = column + dy[d];

                if (isValid(nx, ny) && rooms[nx][ny] == 0) {
                    row = nx;
                    column = ny;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                continue;
            }
            int nx = row - dx[d];
            int ny = column - dy[d];
            if (isValid(nx, ny)) {
                row = nx;
                column = ny;
            } else {
                return;
            }

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