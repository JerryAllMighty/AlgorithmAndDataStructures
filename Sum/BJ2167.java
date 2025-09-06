package Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2167 {
    public static void BJ2167(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int m = arr[1];

        int[][] givenArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            givenArray[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int k = Integer.parseInt(br.readLine());
        int[] answers = new int[k];
        for (int a = 0; a < k; a++) {
            int[] eachArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int i = eachArray[0];
            int j = eachArray[1];
            int x = eachArray[2];
            int y = eachArray[3];
            int temp = 0;
            for (int b = i - 1; b < x; b++) {
                for (int c = j - 1; c < y; c++) {
                    temp += givenArray[b][c];
                }
            }
            answers[a] = temp;

        }
        for (int i = 0; i < k; i++) {
            System.out.println(answers[i]);

        }


    }

}
