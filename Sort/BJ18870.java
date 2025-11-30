package Sort;

import java.io.*;
import java.util.*;

public class BJ18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new TreeSet<>();
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            set.add(num);
        }
        Map<Integer, Integer> sortedIndex = new HashMap<>();
        int idx = 0;
        for (int x : set) {
            sortedIndex.put(x, idx++);
        }
        for (int i = 0; i < n; i++) {
            sortedIndex.get(arr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
