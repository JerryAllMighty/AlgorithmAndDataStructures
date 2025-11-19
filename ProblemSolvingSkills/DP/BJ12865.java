package ProblemSolvingSkills.DP;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ12865 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];

        int[][] values = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            values[i] = nums;
        }
        //13/2 2 1/2 5/12
        //72/156,65/156


        //무게당 가치 찾기
        int[][] valuesPerWeights = new int[n][];
        for (int i = 0; i < n; i++) {
            valuesPerWeights[i] = new int[]{i, values[i][1] / values[i][0]};

        }
        Arrays.sort(valuesPerWeights, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        // k가 될때까지 차례로 가장 가치가 높은 것부터 삽입
        int answer = 0;
        int index = 0;
        while (k >= 0) {
            int[] row = valuesPerWeights[index];
            if (values[row[0]][0] < k) {
                k -= values[row[0]][0];
                answer += values[row[0]][1];
                index++;
            } else {
                k--;
                answer += row[1];
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
