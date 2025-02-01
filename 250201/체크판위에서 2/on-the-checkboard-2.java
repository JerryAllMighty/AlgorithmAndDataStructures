import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rc = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = rc[0];
        int c = rc[1];

        String[][] grid = new String[r][c];
        for (int i = 0; i < r; i++) {
            String[] row = sc.nextLine().split(" ");
            grid[i] = row;
        }
        int answer = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int temp = 0;
                String color = grid[i][j];
                int col = j;
                for (int k = i + 1; k < r; k++) {
                    for (int l = col + 1; l < c; l++) {
                        if (!color.equals(grid[k][l])) {
                            temp++;
                            color = grid[k][l];
                            col = l;
                            break;
                        }
                    }

                }
                if (temp == 3) {
                    answer++;
                }

            }

        }
        System.out.println(answer);
    }
}









