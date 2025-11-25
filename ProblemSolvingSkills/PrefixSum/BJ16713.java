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
        int[] arr = new int[n + 1];
        int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <= n; i++) {
            arr[i] = temp[i - 1];
        }
        int[] prefixSumArr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSumArr[i] = arr[i] ^ prefixSumArr[i - 1];
        }
        int answer = 0;
        for (int i = 0; i < q; i++) {
            int[] queries = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int j = queries[1];
            int k = queries[0];
            answer = prefixSumArr[j] ^ prefixSumArr[k - 1];
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
