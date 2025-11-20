package ProblemSolvingSkills.DP;

import java.io.*;

public class BJ11727 {

    static long[] arr = new long[1001];

    static long fivo(int n) {
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = (fivo(n - 1) + fivo(n - 2) + fivo(n - 2)) % 10007;
        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        arr[1] = 1L;
        arr[2] = 3L;
        int n = Integer.parseInt(br.readLine());
        bw.write(Long.toString(fivo(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}

/*
* 2025.11.20 2번째 풀이, 개인풀이 통과
*
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 2];
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
        }
        // 21
        // 21 21, 12 12, 22
        //21 21 21, 21 12 12, 21 22
        //1212 21
        //22 21
        // 21 21 21 21, 21 21 12 12, 21 21 22
        // 12 12 21 21, 12 12 12 12, 12 12 22
        // 22 21 21, 22 12 12, 22 22

        bw.write(Integer.toString(dp[n]));
        bw.flush();
        bw.close();
        br.close();
    }
 */
