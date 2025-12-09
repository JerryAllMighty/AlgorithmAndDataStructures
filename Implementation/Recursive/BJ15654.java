package Implementation.Recursive;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ15654 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static int m;

    public static void recursive(List<Integer> selected) throws IOException {
        if (selected.size() == m) {
            for (Integer i : selected) {
                bw.write(String.valueOf(i) + " ");
            }
            bw.write("\n");
//            selected.remove(m - 1);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!selected.contains(arr[i])) {
                selected.add(arr[i]);
                recursive(selected);
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
            recursive(selected);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
