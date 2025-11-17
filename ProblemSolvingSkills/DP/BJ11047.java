package ProblemSolvingSkills.DP;

import java.io.*;
import java.util.Arrays;

public class BJ11047 {


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

        int answer = 0;
        int compareIndex = n - 1;
        int moneyLeft = k;
        while (moneyLeft != 0) {
            if (values[compareIndex] <= moneyLeft) {
                int share = moneyLeft / values[compareIndex];
                moneyLeft -= values[compareIndex] * share;
                answer += share;
            }
            compareIndex--;
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
/*
2025.11.17 정답 코드 추가
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

        int answer = 0;
        int compareIndex = n - 1;
        int moneyLeft = k;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= values[i]) {
                answer += moneyLeft / values[i];
                moneyLeft %= values[i];
            }

        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
 */
