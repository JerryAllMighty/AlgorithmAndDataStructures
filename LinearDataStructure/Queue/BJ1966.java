/*
 * 20260302 개인 문제 풀이, 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int documentCount = info[0];
            int targetDocumentIndex = info[1];
            int[] priorities = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Queue<int[]> queue = new ArrayDeque<>(documentCount);
            for (int j = 0; j < documentCount; j++) {
                queue.add(new int[]{j, priorities[j]});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int targetNumber = queue.peek()[1];
                int topPriority = Integer.MIN_VALUE;

                for (int[] ints : queue) {
                    topPriority = Math.max(topPriority, ints[1]);
                }

                if (targetNumber != topPriority) {
                    int[] top = queue.poll();
                    queue.add(top);
                    continue;
                }
                int[] top = queue.poll();
                count++;
                if (top[0] == targetDocumentIndex) {
                    break;
                }
            }
            bw.write(String.valueOf(count) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
 */