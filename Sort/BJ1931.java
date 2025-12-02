package Sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] infos = new int[n][];
        for (int i = 0; i < n; i++) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            infos[i] = info;
        }
        Arrays.sort(infos, new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (infos[i][1] <= infos[j][1]) {
                    count++;
                }
            }
            answer = Math.max(answer, count);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
