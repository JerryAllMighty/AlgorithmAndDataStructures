package Implementation;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class BJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] infos = new int[n][2];
        for (int i = 0; i < n; i++) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            infos[i] = info;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < infos.length; i++) {
            int[] info = infos[i];
            int weight = info[0];
            int height = info[1];
            int rank = 1;
            for (int j = 0; j < infos.length; j++) {
                if (j != i && infos[j][0] > weight && infos[j][1] > height) {
                    rank++;
                }
            }
            map.put(i, rank);
        }

        for (int i = 0; i < infos.length; i++) {
            int value = map.get(i);
            bw.write(Integer.toString(value) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
