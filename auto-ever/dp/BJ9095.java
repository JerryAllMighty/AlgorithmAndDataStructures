/*
 * 2026 03 23 개인 문제 풀이 통과 완료
 * import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2; // 11  2
        dp[3] = 4; // 111 12 21 3
        for (int i = 4; i <= 11; i++) {
            dp[i] += dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            stringBuilder.append(String.valueOf(dp[n]));
            stringBuilder.append("\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}






 */