/*
 * 2026.03.09
 *  복기 후에도 틀림
 * 마지막 포인터 값 처리 못한 듯
 * import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int s = Integer.parseInt(stringTokenizer.nextToken());
        StringTokenizer arrayStringTokenizer = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrayStringTokenizer.nextToken());
        }
        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int currentSum = 0;
        while (true) {
            if (currentSum >= s) {
                answer = Math.min(answer, right - left);
                currentSum -= arr[left++];
            } else if (left >= n) {
                break;
            } else {
                currentSum += arr[right++];
            }
        }
        if (answer == Integer.MAX_VALUE) {
            bw.write(String.valueOf(0));
        } else {
            bw.write(String.valueOf(answer));
        }
        bw.flush();
        bw.close();
    }
}


 */