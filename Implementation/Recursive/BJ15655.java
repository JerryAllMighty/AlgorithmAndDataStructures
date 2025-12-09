package Implementation.Recursive;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 2025.12.09 시간복잡도 개선 : O(n * n!) > O(n! /m!)
 */
public class BJ15655 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static int m;

    static boolean isAscending(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;

    }

    public static void recursive(List<Integer> selected, int start) throws IOException {
        if (selected.size() == m) {
            if (!isAscending(selected)) {
                return;
            }
            for (Integer i : selected) {
                bw.write(String.valueOf(i) + " ");
            }
            bw.write("\n");
//            selected.remove(m - 1);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (!selected.contains(arr[i])) {
                selected.add(arr[i]);
                recursive(selected, i + 1);
                selected.remove(selected.size() - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        m = info[1];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            List<Integer> selected = new ArrayList<>();
            selected.add(arr[i]);
            recursive(selected, i + 1);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
