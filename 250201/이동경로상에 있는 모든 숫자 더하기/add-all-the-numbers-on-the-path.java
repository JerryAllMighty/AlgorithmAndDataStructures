import java.util.*;

public class Main {
    //N R S L
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int t = input[1];
        int d = 0;
        int x = n / 2;
        int y = n / 2;


        String directions = sc.nextLine();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            grid[i] = row;

        }
        int answer = grid[x][y];
        for (int i = 0; i < directions.length(); i++) {
            String direction = directions.substring(i, i + 1);
            if (direction.equals("L")) {
                d = (d + 3) % 4;
            } else if (direction.equals("R")) {
                d = (d + 1) % 4;
            } else {
                if(inRange(x + dx[d],y + dy[d],n,n)){
                    x += dx[d];
                    y += dy[d];
                    answer += grid[x][y];
                }
            }

        }
        System.out.println(answer);


    }
}









