package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.Arrays;

public class BJ11659 {
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
