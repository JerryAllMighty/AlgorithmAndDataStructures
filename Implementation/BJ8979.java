package Implementation;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ8979 {
    static class Nation {
        private int nationNumber;
        private int goldMedalCount;
        private int silverMedalCount;
        private int bronzeMedalCount;

        private int rank;

        public Nation(int nationNumber, int goldMedalCount, int silverMedalCount, int bronzeMedalCount) {
            this.nationNumber = nationNumber;
            this.goldMedalCount = goldMedalCount;
            this.silverMedalCount = silverMedalCount;
            this.bronzeMedalCount = bronzeMedalCount;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];
        Nation[] nations = new Nation[n];
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            nations[i] = new Nation(arr[0], arr[1], arr[2], arr[3]);
        }
        Arrays.sort(nations, new Comparator<Nation>() {
            @Override
            public int compare(Nation o1, Nation o2) {
                if (o1.goldMedalCount == o2.goldMedalCount) {
                    if (o1.silverMedalCount == o2.silverMedalCount) {
                        return o2.bronzeMedalCount - o1.bronzeMedalCount;
                    } else {
                        return o2.silverMedalCount - o1.silverMedalCount;
                    }
                }
                return o2.goldMedalCount - o1.goldMedalCount;
            }
        });
        int rank = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nations[i].nationNumber == k) {
                bw.write(String.valueOf(rank));
                break;
            } else {
                if (nations[i].goldMedalCount == nations[i + 1].goldMedalCount
                        && nations[i].silverMedalCount == nations[i + 1].silverMedalCount
                        && nations[i].bronzeMedalCount == nations[i + 1].bronzeMedalCount) {
                    continue;
                }
                rank++;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
