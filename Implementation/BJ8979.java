package Implementation;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ8979 {
    /*
    * n2026.02.12  개인 풀이, 부분 통과, 20점
    *   static class Grades {

        private int country;
        private int gold;
        private int silver;
        private int bronze;

        public Grades(int country, int gold, int silver, int bronze) {
            this.country = country;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Grades grades = (Grades) o;
            return gold == grades.gold && silver == grades.silver && bronze == grades.bronze;
        }

        @Override
        public int hashCode() {
            return Objects.hash(gold, silver, bronze);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int k = info[1];
        Grades[] arr = new Grades[n];
        for (int i = 0; i < n; i++) {
            int[] medals = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i] = new Grades(medals[0], medals[1], medals[2], medals[3]);
        }

        Arrays.sort(arr, new Comparator<Grades>() {
            @Override
            public int compare(Grades o1, Grades o2) {
                if (o1.gold == o2.gold) {
                    if (o2.silver == o1.silver) {
                        return o2.bronze - o1.bronze;
                    }
                    return o2.silver - o1.silver;
                }
                return o2.gold - o1.gold;
            }
        });
        int rank = 1;
        int index = 0;
        boolean isContinousSame = false;
        while (index < n - 1) {
            Grades currentGrade = arr[index];
            Grades nextGrade = arr[++index];
            if (currentGrade.country == k) {
                break;
            }
            if (!currentGrade.equals(nextGrade)) {
                if (isContinousSame) {
                    isContinousSame = false;
                    rank = ++index;
                } else {
                    rank++;
                }
            } else {
                isContinousSame = true;
            }
        }
        bw.write(String.valueOf(rank));
        bw.flush();
        bw.close();
        br.close();
    }
     */
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
