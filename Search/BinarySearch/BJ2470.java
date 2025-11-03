package Search.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2470 {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        int[] answers = new int[2];
        int gap = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int pivot = arr[i];

            int l = i+1;
            int r = n - 1;
            int m = (l + r) / 2;

            while (l <= r) {
                if (pivot + arr[m] > 0) {
                    r = m - 1;
                } else if (pivot + arr[m] < 0) {
                    l = m + 1;
                } else {
                    answers[0] = Math.min(pivot, arr[m]);
                    answers[1] = Math.max(pivot, arr[m]);
                    break;
                }

                if (gap > Math.abs((pivot + arr[m]))) {
                    gap = Math.abs((pivot + arr[m]));
                    answers[0] = Math.min(pivot, arr[m]);
                    answers[1] = Math.max(pivot, arr[m]);
                }

                m = (l + r) / 2;
            }
        }

        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
