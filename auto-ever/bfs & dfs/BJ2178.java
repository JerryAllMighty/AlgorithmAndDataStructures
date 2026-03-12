/*
 * 2026.03.12 복기 떄 통과 완료
 * import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] maze;
    static int n;
    static int m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean isValid(int row, int column) {
        return row >= 0 && row < n && column >= 0 && column < m;
    }

    static int bfs(int start, int end) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{start, end});

        while (!queue.isEmpty()) {
            int[] mazeInfo = queue.poll();
            int row = mazeInfo[0];
            int column = mazeInfo[1];
            for (int i = 0; i < 4; i++) {
                int nx = row + dx[i];
                int ny = column + dy[i];
                if (!isValid(nx, ny) || maze[nx][ny] != 1) {
                    continue;
                }
                maze[nx][ny] = maze[row][column] + 1;
                queue.add(new int[]{nx, ny});
            }
        }

        return maze[n - 1][m - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int[] row = new int[m];
            for (int j = 0; j < m; j++) {
                row[j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
            maze[i] = row;
        }
        bw.write(String.valueOf(bfs(0, 0)));
        bw.flush();
        bw.close();
    }
}




 */