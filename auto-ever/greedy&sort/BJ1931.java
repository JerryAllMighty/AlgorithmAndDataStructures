/*
 * 2026.03.09 개인 풀이 틀림
 * 복기 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] meetings = new int[n][];
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            meetings[i] = new int[]{start, end};
        }

        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int answer = 0;
        int count = 1;
        int end = meetings[0][1];
        int loopIndex = 1;
        while (loopIndex < n) {
            if (end <= meetings[loopIndex][0]) {
                end = meetings[loopIndex][1];
                count++;
            }
            loopIndex++;
        }
        answer = Math.max(answer, count);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}


 */