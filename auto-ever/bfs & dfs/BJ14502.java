/*
 * 20260325 컨디션 난조, 복기 하다가 말음
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = Integer.MIN_VALUE;

    static int countSafeArea() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    static List<int[]> wallAvailable = new ArrayList<>();

    static void search() {
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int column = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = row + dx[i];
                int ny = column + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (map[nx][ny] == 0) {
                    wallAvailable.add(new int[]{nx, ny});
                }
            }
        }

        for (int i = 0; i < wallAvailable.size(); i++) {
            dfs(1, i);
        }
    }

    static void dfs(int count, int index) {
        int[] current = wallAvailable.get(index);
        int row = current[0];
        int column = current[1];
        map[row][column] = 1;

        if (count == 3) {
            int[][] originalMap = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    originalMap[i][j] = map[i][j];
                }
            }
            spreadVirus();
            answer = Math.max(answer, countSafeArea());
            map = originalMap;
            return;
        }

        for (int i = index + 1; i < wallAvailable.size(); i++) {
            dfs(count + 1, i);
        }

        map[row][column] = 0;
    }

    static void spreadVirus() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 2) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                            continue;
                        }

                        if (map[nx][ny] == 0) {
                            map[i][j] = 2;
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int[] row = new int[m];
            for (int j = 0; j < m; j++) {
                int number = Integer.parseInt(stringTokenizer.nextToken());
                row[j] = number;
            }
            map[i] = row;
        }

        search();

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}






 */