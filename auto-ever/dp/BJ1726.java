/*
 * 2026 03 10 개인 문제 풀이 통과 못 함
 * import java.io.*;

import java.util.*;



public class Main {

public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

int n = Integer.parseInt(br.readLine());

int[] dp = new int[n + 1];

dp[1] = 1;

dp[2] = 2;

for (int i = 3; i <= n; i++) {

dp[i] = dp[i - 1] + dp[i - 2];

}

bw.write(String.valueOf(dp[n] % 10007));

bw.flush();

bw.close();
 */