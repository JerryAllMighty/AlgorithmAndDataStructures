package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i] = temp;
        }

        int answer = 0;
        int maxCnt = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int[] row = arr[i]; // 각 학생
            List<Integer> metBefore = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (k != i && arr[k][j] == row[j]) {
                        if (!metBefore.contains(k)) {
                            metBefore.add(k);
                        }
                    }
                }
            }
            if (metBefore.size() > maxCnt) {
                answer = i + 1;
                maxCnt = metBefore.size();
            }

        }
        System.out.println(answer);
    }

}
