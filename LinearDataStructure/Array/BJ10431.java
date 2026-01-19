package LinearDataStructure.Array;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ10431 {
    static int getCount(int[] arr) {
        int count = 0;
        List<Integer> sortedArray = new ArrayList<>();
        sortedArray.add(0, arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int targetNumber = arr[i];
            int tallerStudentMinimumIndex = Integer.MAX_VALUE;
            for (int j = sortedArray.size() - 1; j >= 0; j--) {
                if (sortedArray.get(j) > targetNumber && j < tallerStudentMinimumIndex) {
                    tallerStudentMinimumIndex = j;
                }
            }
            if (tallerStudentMinimumIndex != Integer.MAX_VALUE) {
                count += sortedArray.size() - (tallerStudentMinimumIndex);
                sortedArray.add(tallerStudentMinimumIndex, targetNumber);
            } else {
                sortedArray.add(targetNumber);
            }
        }
        return count;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            bw.write(String.valueOf(arr[0]) + " " + getCount(arr) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
