package Implementation;

import java.io.*;
import java.util.Arrays;

public class BJ2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int k = info[1];

        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        int answer = 0;
        int index = 2;
        int removalCount = 0;
        while (index <= n) {
            if (arr[index] != 0) {
                int multipleIndex = index;
                while (multipleIndex <= n) {
                    if (arr[multipleIndex] != 0) {
                        if (++removalCount == k) {
                            answer = arr[multipleIndex];
                            break;
                        }
                        arr[multipleIndex] = 0;
                    }
                    multipleIndex += index;
                }
            }
            if (answer != 0) {
                break;
            }
            index++;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
