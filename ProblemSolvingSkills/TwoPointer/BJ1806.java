package ProblemSolvingSkills.TwoPointer;

import java.io.*;
import java.util.Arrays;

public class BJ1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int s = info[1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] acc = new int[n]; //누적합
        acc[0] = arr[0];
        for (int i = 1; i < n; i++) {
            acc[i] = acc[i - 1] + arr[i];
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int r = i;
            int currentSum;
            boolean doesMatch = false;
            while (r < n) {
                currentSum = acc[r] - acc[i] + arr[i];
                if (currentSum >= s) {
                    doesMatch = true;
                    break;
                }
                r++;
            }
            if (doesMatch) {
                answer = Math.min(answer, (r - i + 1));
            }
        }

        if (answer == Integer.MAX_VALUE) {
            bw.write(String.valueOf(0));
        } else {
            bw.write(String.valueOf(answer));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
