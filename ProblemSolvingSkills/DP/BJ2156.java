package ProblemSolvingSkills.DP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BJ2156 {

    static List<Integer> indexes = new ArrayList<>();

    static boolean isThreeInARow(int index) {
        for (int i = 0; i < indexes.size(); i++) {
            if ((indexes.contains(index + 1) && indexes.contains(index + 2)) ||
                    (indexes.contains(index + 1) && indexes.contains(index - 1)) ||
                    (indexes.contains(index - 1) && indexes.contains(index - 2))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] wines = new int[n];
        for (int i = 0; i < n; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }
        int answer = Integer.MIN_VALUE;
        int index = 0;
        int sum = 0;
        while (index < n) {
            if (isThreeInARow(index)) {
                index++;
                continue;
            }
            indexes.add(index);
            sum += wines[index];
            index++;
            answer = Math.max(answer, sum);
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
