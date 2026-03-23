/*
 * 케이스 1개 틀림, 알고리즘 판단과 나머지 구현은 모두 양호
 * import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] heights;
    static int maxHeight = Integer.MIN_VALUE;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count;

    static void search(int height) {
        count = 0;
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && heights[i][j] > height) {
                    bfs(i, j, height);
                    count++;
                }

            }

        }

    }

    static void bfs(int x, int y, int height) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int column = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = row + dx[i];
                int ny = column + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n
                        && !visited[nx][ny]
                        && heights[nx][ny] > height) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        heights = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                int height = Integer.parseInt(stringTokenizer.nextToken());
                row[j] = height;
                maxHeight = Math.max(maxHeight, height);
            }
            heights[i] = row;
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= maxHeight; i++) {
            search(i);
            answer = Math.max(answer, count);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}






 */