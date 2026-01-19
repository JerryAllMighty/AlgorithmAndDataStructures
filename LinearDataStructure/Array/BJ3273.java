package LinearDataStructure.Array;

import java.io.*;
import java.util.Arrays;

public class BJ3273 {

    /*
     * 2026.01.19 다시 풀이, 통과 완료
     *   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(arr, x - arr[i]);
            if (i < index) {
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
     */

    static int binarySearch(int[] arr, int key) {
        int l = 0;
        int r = arr.length - 1;
        int mid = (l + r) / 2;
        while (l <= r) {
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                r = mid - 1;
            } else if (arr[mid] < key) {
                l = mid + 1;
            }
            mid = (l + r) / 2;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
//            int index = Arrays.binarySearch(arr, x - arr[i]);
            int index = binarySearch(arr, x - arr[i]);
            if (index > -1 && i < index) {
                answer++;
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
