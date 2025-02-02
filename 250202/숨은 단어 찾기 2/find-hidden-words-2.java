import java.util.*;

public class Main {
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    static String[][] grid;

    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        grid = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] characters = sc.nextLine().split("");
            grid[i] = characters;
        }
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String s = grid[i][j];
                if (s.equals("L")) {
                    for (int k = 0; k < 8; k++) {
                        if (inRange(i + dx[k], j + dy[k], n, m)
                        && grid[i + dx[k]][j + dy[k]].equals("E")
                        && inRange(i + dx[k] +dx[k], j + dy[k] + dy[k], n, m)
                        && grid[i + dx[k] + dx[k]][j + dy[k] + dy[k]].equals("E")) {
                            answer++;
                        }else{
                            continue;
                        }
                    }
                }
            }
        }
        System.out.println(answer);


    }
}










