/*
 * 2026.03.12 개인 문제 풀이 통과
 *import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        StringTokenizer arrayStringTokenizer = new StringTokenizer(br.readLine());
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(arrayStringTokenizer.nextToken());
            prefixSum[i] = prefixSum[i - 1] + number;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < m; k++) {
            StringTokenizer sumStringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(sumStringTokenizer.nextToken());
            int j = Integer.parseInt(sumStringTokenizer.nextToken());
            stringBuilder.append(prefixSum[j] - prefixSum[i - 1] + "\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}





 */