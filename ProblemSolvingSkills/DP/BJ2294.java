package ProblemSolvingSkills.DP;

import java.io.*;
import java.util.Arrays;

public class BJ2294 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            values[i] = value;
        }
        Arrays.sort(values);

        int answer = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int result = 0;
            int compareIndex = i;
            int moneyLeft = k;
            while (compareIndex > -1) {
                if (moneyLeft == 0) {
                    break;
                }
                if (values[compareIndex] <= moneyLeft) {
                    int share = moneyLeft / values[compareIndex];
                    moneyLeft -= values[compareIndex] * share;
                    result += share;
                }
                compareIndex--;
            }
            answer = result != 0 ? Math.min(answer, result) : answer;
        }
        bw.write(answer == Integer.MAX_VALUE ? "-1" : Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
