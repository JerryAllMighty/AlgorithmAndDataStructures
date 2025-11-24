package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.Arrays;

public class BJ16713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int q = info[1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] prefixSumArr = arr.clone();
        prefixSumArr[0] = 0;
        for (int i = 1; i < n; i++) {
            prefixSumArr[i] = prefixSumArr[i] == prefixSumArr[i - 1] ? 0 : 1;
        }
        int[] answers = new int[q];
        for (int i = 0; i < q; i++) {
            int[] queries = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int j = queries[1] - 1;
            int k = queries[0] - 2;
            if (k >= 0) {
                answers[i] = prefixSumArr[j] == prefixSumArr[k] ? 0 : 1;
            } else {
                answers[i] = prefixSumArr[j];
            }
        }
        int answer = answers[0];
        for (int i = 1; i < q; i++) {
            answer = answers[i] == answers[i - 1] ? 0 : 1;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
