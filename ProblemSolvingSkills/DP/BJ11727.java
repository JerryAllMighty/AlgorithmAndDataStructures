package ProblemSolvingSkills.DP;

import java.io.*;

public class BJ11727 {

    static long[] arr = new long[1001];

    static long fivo(int n) {
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = (fivo(n - 1) + fivo(n - 2) + fivo(n - 2)) % 10007;
        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        arr[1] = 1L;
        arr[2] = 3L;
        int n = Integer.parseInt(br.readLine());
        bw.write(Long.toString(fivo(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}
