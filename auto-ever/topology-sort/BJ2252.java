/*
 * 2026.03.13 개인 문제 풀이 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int[] inDegree = new int[n + 1];
        List<Integer>[] adjacentArray = new List[n + 1];
        for (int i = 0; i < n + 1; i++) {
            adjacentArray[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer compareStringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(compareStringTokenizer.nextToken());
            int b = Integer.parseInt(compareStringTokenizer.nextToken());
            inDegree[b]++;
            adjacentArray[a].add(b);
        }

        StringBuilder stringBuilder = new StringBuilder();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int number = queue.poll();
            stringBuilder.append(String.valueOf(number) + " ");
            for (int i : adjacentArray[number]) {
                if (--inDegree[i] == 0) {
                    queue.add(i);
                }
            }
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}





 */