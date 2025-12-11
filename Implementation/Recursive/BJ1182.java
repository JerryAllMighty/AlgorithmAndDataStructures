package Implementation.Recursive;

import java.io.*;
import java.util.Arrays;

public class BJ1182 {
    static int[] arr;
    static int answer;
    static int n;
    static int s;

    static void recursive(int index, int sum) {
        if (s == sum) {
            answer++;
//            return;
        }
        if (index == n - 1) {
            return;
        }
        for (int i = index + 1; i < n; i++) {
            recursive(i, sum + arr[i]);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = info[0];
        s = info[1];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            recursive(i, arr[i]);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
