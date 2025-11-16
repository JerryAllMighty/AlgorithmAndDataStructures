package ProblemSolvingSkills.DP;

import java.io.*;

public class BJ2748 {

    static long[] arr;

    static long fivo(int n) {
        if (arr[n] != 0 || n == 0) {
            return arr[n];
        }
        arr[n] = fivo(n - 1) + fivo(n - 2);
        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new long[n + 1];
        arr[0] = 0L;
        arr[1] = 1L;
        bw.write(Long.toString(fivo(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}
