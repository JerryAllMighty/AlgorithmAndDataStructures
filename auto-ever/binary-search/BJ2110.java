/*
* 2026 03 21 복기 떄 통과
* import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int c;
    static int[] homes;

    static boolean isPlaceable(int distance) {
        int count = 1;
        int previousHome = homes[0];
        for (int i = 1; i < n; i++) {
            if (homes[i] - previousHome >= distance) {
                if (++count >= c) {
                    return true;
                }
                previousHome = homes[i];
            }
        }
        return false;
    }

    static int binarySearch() {
        int left = 1;
        int right = homes[n - 1] - homes[0];
        int answer = Integer.MIN_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPlaceable(mid)) {
                answer = Math.max(answer, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        c = Integer.parseInt(stringTokenizer.nextToken());
        homes = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            homes[i] = number;
        }
        Arrays.sort(homes);
        int distance = binarySearch();

        bw.write(String.valueOf(distance));
        bw.flush();
        bw.close();
    }
}






 */