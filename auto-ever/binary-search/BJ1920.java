/*
 * 20260313 개인 문제 풀이 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(numbers);

        int m = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer searchTargetStringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int searchTargetNumber = Integer.parseInt(searchTargetStringTokenizer.nextToken());
            int index = Arrays.binarySearch(numbers, searchTargetNumber);
            if (index >= 0) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
            stringBuilder.append("\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}





 */