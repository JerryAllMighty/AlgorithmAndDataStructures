package ProblemSolvingSkills.DP;

import java.io.*;
import java.util.Arrays;

public class BJ2294 {
    /*
    * 2026.01.23 개인 문제 풀이, 40분, 통과 못 함
    *  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int k = info[1];
        int[] coins = new int[n];
        int[] dp = new int[100001];
        for (int i = 0; i < n; i++) {
            int coin = Integer.parseInt(br.readLine());
            coins[i] = coin;
            dp[coin] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                int coin = coins[j];
                if (i < coin || coin > k) {
                    continue;
                }
                int a = dp[i];
                int b = dp[i - coin];
                int c = dp[coin];
                if (dp[i] == 0) {
                    if (dp[i - coin] != 0 && dp[coin] != 0) {
                        dp[i] = dp[i - coin] + dp[coin];
                    }
                } else {
                    dp[i] = Math.min(dp[i], dp[i - coin] + dp[coin]);
                }

            }
        }
        int answer = dp[k] != 0 ? dp[k] : -1;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
     */


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
/*
* 2025.11.17 정답 코드 추가
* for (int i = n - 1; i >= 0; i--) {
            if (k >= values[i]) {
                answer += moneyLeft / values[i];
                moneyLeft %= values[i];
            }

        }
 */
