package Implementation.Recursive;

import java.io.*;
import java.util.Arrays;

public class BJ1629 {
    //2025.12.16
    //메모리 초과로 통과 못 함
    // TODO: 다시 풀어서 통과 필요

    static int a;
    static int b;

//    static int square(int squaredNum, int count) {
//        if (count == b) {
//            return squaredNum;
//        }
//        return square(a * a, ++count);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        a = info[0];
        b = info[1];
        int c = info[2];
//        bw.write(String.valueOf());
        Math.sqrt(Double.parseDouble(String.valueOf(a)));
//        bw.write(String.valueOf(square(a, 1) % c));
        bw.flush();
        bw.close();
        br.close();
    }
}
