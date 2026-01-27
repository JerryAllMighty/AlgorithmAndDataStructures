package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.Arrays;

public class BJ11659 {
    /*
    * 2026.01.27 개인 문제 풀이, 통과 완료
    * public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] acc = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            acc[i] = acc[i - 1] + arr[i - 1];
        }
        for (int k = 0; k < m; k++) {
            int[] scope = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int i = scope[0];
            int j = scope[1];
            bw.write(String.valueOf(acc[j] - acc[i - 1]) + "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] prefixSum = arr.clone();
        for (int i = 1; i < n; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }

        for (int i = 0; i < m; i++) {
            int[] interval = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int j = interval[1] - 1;
            int k = interval[0] - 2;
            if (k >= 0) {
                bw.write(String.valueOf(prefixSum[j] - prefixSum[k]) + "\n");
            } else {
                bw.write(String.valueOf(prefixSum[j]) + "\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
