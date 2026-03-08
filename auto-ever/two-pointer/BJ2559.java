/*
 * 2026.03.08 개인 문제 풀이, 통과
 * 최소 최댓값을 이용해 정답을 갱신할 시 Interg.MAX, MIN 값 활용하기
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int k = info[1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long answer = Integer.MIN_VALUE;
        int count = 0;
        long currentSum = 0;
        int removalIndex = 0;
        for (int i = 0; i < n; i++) {
            int number = arr[i];
            count++;
            currentSum += number;

            if (count == k) {
                answer = Math.max(answer, currentSum);
                count--;
                currentSum -= arr[removalIndex++];
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

 */