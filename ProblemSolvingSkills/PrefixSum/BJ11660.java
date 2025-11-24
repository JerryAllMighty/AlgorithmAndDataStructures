package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.Arrays;

public class BJ11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        int[][] prefixSum = new int[n][];
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] temp = arr.clone();
            for (int j = 1; j < n; j++) {
                temp[j] += temp[j - 1];
            }
            prefixSum[i] = temp;
        }
        for (int i = 0; i < m; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = arr[0];
            int y1 = arr[1];
            int x2 = arr[2];
            int y2 = arr[3];
            int answer = 0;
            for (int j = x1 - 1; j <= x2 - 1; j++) {
                if (y1 >= 2) {
                    answer += prefixSum[j][y2 - 1] - prefixSum[j][y1 - 2];
                } else {
                    answer += prefixSum[j][y2 - 1];
                }
            }
            bw.write(String.valueOf(answer) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
