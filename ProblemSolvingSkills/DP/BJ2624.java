package ProblemSolvingSkills.DP;

import java.io.*;
import java.util.Arrays;

public class BJ2624 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] dp = new int[t]; //i원을 만드는 경우의 수
        for (int i = 0; i < k; i++) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int coin = info[0];
            int count = info[1];
            for (int j = 1; j <= count; j++) {
                dp[coin * j] += 1;
            }
        }

        for (int i = t; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                dp[i] += dp[j];
            }
        }
        // 1:1, 5:1, 10:
        // 11111 5, 5 5, 10

        // 1 AB
        // 2 CDE
        // 3 AC AD AE BC BD BE
        // 4 ACA ADA AEA BCA BDA BEA, ACB ADB AEB BCB BDB BEB,
        //ACA ADA AEA   ,    BCB BDB BEB,


        bw.flush();
        bw.close();
        br.close();
    }
}
