package Sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ10814 {
    public class Main {
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
                    return o1[0].compareTo(o2[0]);
                }
            });
            for (String[] i : arr) {
                bw.write(i[0] + " " + i[1] + "\n");
            }

            bw.flush();
            bw.close();
            br.close();
        }
    }
}
