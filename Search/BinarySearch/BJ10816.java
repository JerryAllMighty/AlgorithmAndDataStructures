package Search.BinarySearch;

import java.io.*;
import java.util.Arrays;

public class BJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(br.readLine());
        int[] targetArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        String[] answers = new String[m];
        Arrays.fill(answers, "0");
        for (int i = 0; i < targetArray.length; i++) {
            int target = targetArray[i];
            int l = 0;
            int r = n - 1;
            int mid = (l + r) / 2;
            int index = n - 1;
            //Upper Bound
            while (l <= r) {
                if (arr[mid] < target) {
                    r = mid - 1;
                    index = Math.min(index, mid);
                } else {
                    l = mid + 1;
                }
                mid = (l + r) / 2;
            }

            //Lower Bound
            int l2 = 0;
            int r2 = n - 1;
            int mid2 = (l2 + r2) / 2;
            int index2 = 0;
            while (l2 <= r2) {
                if (arr[mid2] < target) {
                    l2 = mid2 + 1;
                    index2 = Math.max(index2, mid2);
                } else {
                    r2 = mid2 - 1;
                }
                mid2 = (l2 + r2) / 2;
            }

            answers[i] = Integer.toString(mid - (mid2 + 1));

//            int count = 0;
//            for (int j = minimumIndex; j < arr.length; j++) {
//                if (arr[j] == target) {
//                    count++;
//                }
//            }
//            answers[i] = Integer.toString(count);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String answer : answers) {
            bw.write(answer + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
