import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int answer = Integer.MAX_VALUE;
        int[][] checkpoints = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            checkpoints[i] = input;
        }

        for (int i = 1; i < checkpoints.length - 1; i++) {
            int temp = 0;
            int idx = 0;
            for (int j = 0; j < checkpoints.length - 1; j++) {
                if (j == i) {
                    continue;
                }
                idx = j + 1;
                if (idx == i) {
                    idx++;
                }
                temp += Math.abs(checkpoints[j][0] - checkpoints[idx][0]) + Math.abs(checkpoints[j][1] - checkpoints[idx][1]);
            }
            answer = Math.min(answer, temp);
        }
        System.out.println(answer);
    }
}









