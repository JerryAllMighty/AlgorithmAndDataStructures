package Implementation.Recursive;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ6603 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void recursive(int[] arr, int index, List<Integer> visited, int length) throws IOException {
        visited.add(arr[index]);
        if (visited.size() == 6) {
            for (Integer i : visited) {
                bw.write(String.valueOf(i) + " ");
            }
            bw.write("\n");
            visited.remove(5);
            return;
        }
        for (int i = index + 1; i < length; i++) {
            recursive(arr, i, visited, length);
        }
        visited.remove(visited.size() - 1);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int k = info[0];
            if (k == 0) {
                break;
            }
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = info[i + 1];
            }
            for (int i = 0; i < k - 5; i++) {
                recursive(arr, i, new ArrayList<>(), k);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}