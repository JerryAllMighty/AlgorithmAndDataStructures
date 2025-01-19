import java.util.*;

public class Main {
    static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] lst = new int[2001][2001];

        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = input[0];
            int y1 = input[1];
            int x2 = input[2];
            int y2 = input[3];

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i == 0) {
                        lst[j + OFFSET][k + OFFSET]++;
                    } else {
                        lst[j + OFFSET][k + OFFSET] += 2;
                    }

                }
            }
        }
        int minRow = 2000;
        int minCol = 2000;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < lst.length; i++) {
            int[] row = lst[i];
            for (int j = 0; j < row.length; j++) {
                int val = row[j];
                if (val == 1) {
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }
        System.out.println((maxRow + 1 - minRow) * (maxCol + 1 - minCol));
    }
}



