package ProblemSolvingSkills.DP;

import java.io.*;
import java.util.Arrays;

public class BJ2293 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];
        dp = new int[k]; //i원을 만드는 경우의 수가 배열의 값
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            values[i] = num;
            dp[num] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[i - j] * dp[j];

            }


        }

        // 1
        // 11, 2
        // 111. 12
        // 1111, 112, 22 // 1 111, 1 12, 1 21, 2 11, 2 2, 3 1
        // 11111, 1112, 122, 5
        // 111111, 11112, 1122, 15, 222
        // 1111111, 111112, 11122, 1222
        // 11111111, 1111112, 111122, 11222, 2222
        // 111111111, 11111112, 1111122, 111222, 12222
        //

        bw.flush();
        bw.close();
        br.close();
    }
}
