package CompleteSearch.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1018 {

    static String[][] arr;

    private static int countColor(int row, int col) {
        if (row < 0 || row + 7 >= arr.length || col < 0 || col + 7 >= arr[0].length) {
            return Integer.MAX_VALUE;
        }
        int result = 0;
        int temp1 = 0;
        String answerColor = arr[row][col];
        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j ++) {
                String color = arr[i][j];
                if (!color.equals(answerColor)) {
                    temp1++;
                }
                if(j != col + 7){
                    answerColor = answerColor.equals("B") ? "W" : "B";
                }

            }
        }

        int temp2 = 0;
        String newAnswerColor = arr[row][col].equals("B") ? "W" : "B";
        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j ++) {
                String color = arr[i][j];
                if (!color.equals(newAnswerColor)) {
                    temp2++;
                }
                if(j != col + 7){
                    newAnswerColor = newAnswerColor.equals("B") ? "W" : "B";
                }
            }
        }
        return Math.min(temp1, temp2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] info = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] row = sc.nextLine().split("");
            arr[i] = row;
        }
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i + 7 < n; i++) {
            for (int j = 0; j + 7 < m; j++) {
                answer = Math.min(answer, countColor(i, j));
            }
        }
        System.out.println(answer);
    }
}
