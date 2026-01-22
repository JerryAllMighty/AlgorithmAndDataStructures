package Implementation;

import java.io.*;
import java.util.Arrays;

public class BJ2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = Integer.MIN_VALUE;
        int ascendingCount = Integer.MIN_VALUE;
        int descendingCount = Integer.MIN_VALUE;
        int index = 1;
        int continuousCount = 2;
        while (index < n) {
            int previous = index - 1;
            int now = index;
            int next = now + 1;
            if (arr[previous] < arr[now]) {
                while (next < n) {
                    if (arr[now] > arr[next]) {
                        continuousCount = 2;
                        index = now;
                        break;
                    }
                    now++;
                    next++;
                    ascendingCount = Math.max(ascendingCount, ++continuousCount);
                }
            } else if (arr[previous] > arr[now]) {
                while (next < n) {
                    if (arr[now] > arr[next]) {
                        continuousCount = 2;
                        index = now;
                        break;
                    }
                    now++;
                    next++;
                    descendingCount = Math.max(descendingCount, ++continuousCount);
                }
            } else {
                continuousCount++;
            }
            index++;
        }
        answer = Math.max(ascendingCount, descendingCount);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
