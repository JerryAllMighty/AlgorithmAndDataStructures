/*
 * 2026 03 21 2번쨰 복기 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int l;
    static int r;
    static int[][] grounds;
    static int day = 0;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<int[]> visitedQueue;

    static void search() {
        while (true) {
            visited = new boolean[n][n];
            boolean isMovable = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j]) {
                        visitedQueue = new ArrayDeque<>();
                        int totalCount = bfs(i, j);
                        if (visitedQueue.size() > 1) {
                            isMovable = true;
                        }
                        for (int[] ints : visitedQueue) {
                            int row = ints[0];
                            int column = ints[1];
                            grounds[row][column] = totalCount;
                        }
                    }
                }
            }

            if (!isMovable) {
                break;
            }
            day++;
        }
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        visitedQueue.add(new int[]{x, y});

        int count = 0;
        int totalSum = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int column = current[1];
            count++;
            totalSum += grounds[row][column];

            for (int i = 0; i < 4; i++) {
                int nx = row + dx[i];
                int ny = column + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (!visited[nx][ny]) {
                        int gap = Math.abs(grounds[row][column] - grounds[nx][ny]);
                        if (gap >= l && gap <= r) {
                            queue.add(new int[]{nx, ny});
                            visited[nx][ny] = true;
                            visitedQueue.add(new int[]{nx, ny});
                        }
                    }
                }
            }

        }

        return totalSum / count;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        l = Integer.parseInt(stringTokenizer.nextToken());
        r = Integer.parseInt(stringTokenizer.nextToken());
        grounds = new int[n][n];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int ground = Integer.parseInt(stringTokenizer.nextToken());
                grounds[i][j] = ground;
            }
        }

        search();

        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}






 */