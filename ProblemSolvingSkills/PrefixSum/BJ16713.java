package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.Arrays;

public class BJ16713 {
    //TODO : XOR 연산자 숙지
    /*
    * 2026.01.27 개인 문제 풀이, 통과 못 함
    *  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int q = input[1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] acc = new int[n + 1];
        acc[1] = arr[0];
        for (int i = 2; i <= n; i++) {
            acc[i] = acc[i - 1] ^ arr[i - 1];
        }
        int answer = -1;
        for (int i = 0; i < q; i++) {
            int[] scope = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int s = scope[0];
            int e = scope[1];
            int accXor = acc[e] - acc[s - 1];
            if (answer == -1) {
                answer = accXor;
            } else {
                answer = answer ^ accXor;
            }
        }
        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
     */

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
