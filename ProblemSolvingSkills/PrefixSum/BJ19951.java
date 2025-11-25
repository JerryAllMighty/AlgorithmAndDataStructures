package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.Arrays;

public class BJ19951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] grounds = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        for (int i = 0; i < m; i++) {
            int[] order = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = order[0];
            int b = order[1];
            int k = order[2];
            for (int j = a - 1; j < b; j++) {
                grounds[j] += k;
            }
        }
        for (int ground : grounds) {
            bw.write(Integer.toString(ground) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
