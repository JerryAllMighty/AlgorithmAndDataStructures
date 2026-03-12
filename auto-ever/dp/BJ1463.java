/*
 * 2026.03.13 개인 문제 풀이 통과 완료
 * import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[Math.max(3, n + 1)];
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            int compareNumber = Integer.MAX_VALUE;
            if (i % 3 == 0) {
                compareNumber = Math.min(compareNumber, dp[i / 3] + 1);
            }
            if (i % 2 == 0) {
                compareNumber = Math.min(compareNumber, dp[i / 2] + 1);
            }
            compareNumber = Math.min(compareNumber, dp[i - 1] + 1);
            dp[i] = compareNumber;
        }
        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }
}





 */