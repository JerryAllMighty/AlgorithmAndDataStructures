/*
* 2026.03.11 2번째 복기에 통과 완료
* import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int n;

    static class Direction {
        private final int time;
        private final String direction;

        public Direction(int time, String direction) {
            this.time = time;
            this.direction = direction;
        }
    }

    static int changeDirection(int currentDirection, String direction) {
        if ("D".equals(direction)) {
            return (currentDirection + 1) % 4;
        } else {
            return (currentDirection + 3) % 4;
        }
    }

    static boolean isValid(int row, int column) {
        return row >= 0 && row < n && column >= 0 && column < n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for (int i = 0; i < k; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(stringTokenizer.nextToken());
            int column = Integer.parseInt(stringTokenizer.nextToken());
            board[row - 1][column - 1] = 1;
        }

        Queue<Direction> directionQueue = new ArrayDeque<>();
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            String c = stringTokenizer.nextToken();
            directionQueue.add(new Direction(x, c));
        }

        int time = 0;
        int currentRow = 0;
        int currentColumn = 0;
        int currentDirection = 0;

        Queue<int[]> tailIndexQueue = new ArrayDeque<>();
        tailIndexQueue.add(new int[]{0, 0});

        Direction nextDirection = directionQueue.poll();
        while (true) {
            //시간 증가
            time++;

            //먼저 뱀은 몸길이를 늘려 머리를 다음칸에 위치시킨다.
            int nx = currentRow + dx[currentDirection];
            int ny = currentColumn + dy[currentDirection];

            //만약 벽이나 자기자신의 몸과 부딪히면 게임이 끝난다
            if (!isValid(nx, ny)) {
                break;
            }

            if (board[nx][ny] == 2) {
                break;
            }

            //만약 이동한 칸에 사과가 있다면, 그 칸에 있던 사과가 없어지고 꼬리는 움직이지 않는다.
//            else if (board[nx][ny] == 1) {
//                board[nx][ny] = 2;
//            }

            // 만약 이동한 칸에 사과가 없다면, 몸길이를 줄여서 꼬리가 위치한 칸을 비워준다. 즉, 몸길이는 변하지 않는다
            else if (board[nx][ny] == 0) {
                if (!tailIndexQueue.isEmpty()) {
                    int[] nextTailRemovalIndex = tailIndexQueue.poll();
                    int removeRowIndex = nextTailRemovalIndex[0];
                    int removeColumnIndex = nextTailRemovalIndex[1];
                    board[removeRowIndex][removeColumnIndex] = 0;
                }
            }

            board[nx][ny] = 2;
            tailIndexQueue.add(new int[]{nx, ny});
            currentRow = nx;
            currentColumn = ny;

            //해당 시간이 끝난 후 방향 전환
            if (time == nextDirection.time) {
                currentDirection = changeDirection(currentDirection, nextDirection.direction);
                if (!directionQueue.isEmpty()) {
                    nextDirection = directionQueue.poll();
                }
            }
        }

        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
    }
}


 */