/*
 * 20260323 개인 풀이 틀림
 * import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(stringTokenizer.nextToken());
            numbers[i] = number;
        }
        int left = 0;
        int right = left + 1;
        int count = 1;
        while (right < n) {
            if (numbers[left] < numbers[right]) {
                count++;
                left = right;
            }
            right++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}






 */