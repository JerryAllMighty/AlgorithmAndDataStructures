/*
* 2026 04 01 개인 문제 풀이 틀림
* import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] grapes = new int[n];
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int grape = Integer.parseInt(br.readLine());
            maxNumber = Math.max(maxNumber, grape);
            grapes[i] = grape;
        }

        //직전을 밟았으면 1
        //안 밟으면 0
        int[][] dp = new int[n + 1][2];
        dp[1][0] = maxNumber;
        dp[1][1] = maxNumber;
        for (int i = 2; i <= n; i++) {
            for (int j =0; j < n; j++) {
                int previousUnStepped = Math.max(dp[i - 2][0], dp[i - 2][1]);
                int previousStepped = dp[i - 1][0];
                dp[i][1] = Math.max(dp[i][1], previousStepped + grapes[j]);
                dp[i][0] = Math.max(dp[i][0], previousUnStepped + grapes[j]);
            }
        }
        int answer = Math.max(dp[n][0], dp[n][1]);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}






 */