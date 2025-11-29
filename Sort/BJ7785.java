package Sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][];
        for (int i = 0; i < n; i++) {
            String[] info = br.readLine().split(" ");
            arr[i] = info;
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2[0].compareTo(o1[0]);
            }
        });
        int index = 0;
        while (index < n) {
            if (index != n - 1
                    && arr[index][0].equals(arr[index + 1][0])
                    && "enter".equals(arr[index][1]) && "leave".equals(arr[index + 1][1])) {
                index++;
            } else {
                bw.write(arr[index][0] + "\n");
            }
            index++;

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
