/*
 * 2026.03.10 개인 문제 풀이 통과
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int stair = Integer.parseInt(br.readLine());
            stairs[i] = stair;
        }
        //직전 값을 안 밟고 가는 경우, 밟고 가는 경우
        int[][] dp = new int[n + 1][];
        dp[0] = new int[]{stairs[0], stairs[0]};
        dp[1] = new int[]{stairs[1], stairs[1]};
        for (int i = 2; i <= n; i++) {
            //직전을 안 밟는 경우
            int previousUnStepped = Math.max(dp[i - 2][0], dp[i - 2][1]) + stairs[i];
            //직전을 밟는 경우
            int previousStepped = dp[i - 1][0] + stairs[i];
            dp[i] = new int[]{previousUnStepped, previousStepped};
        }
        int answer = Math.max(dp[n][0], dp[n][1]);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}


 */