import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        int previousTimeA = 0;
        int previousTimeB = 0;

        int previousDistanceA = 0;
        int previousDistanceB = 0;

        int[] lstA = new int[30];
        int[] lstB = new int[30];

        for (int i = 0; i < n; i++) {
            int[] vt = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int v = vt[0];
            int t = vt[1];

            for (int j = 1; j <= t; j++) {
                lstA[previousTimeA + j] = previousDistanceA + v;
                previousDistanceA += v;
            }
            previousTimeA += t;

        }
        for (int i = 0; i < m; i++) {
            int[] vt = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int v = vt[0];
            int t = vt[1];

            for (int j = 1; j <= t; j++) {
                lstB[previousTimeB + j] = previousDistanceB + v;
                previousDistanceB += v;
            }
            previousTimeB += t;
        }

        int answer = 0;
        String honor = "";
        for (int i = 0; i < Math.max(previousTimeA, previousTimeB); i++) {
            if (lstA[i] > 0 && lstB[i] > 0) {
                if (lstA[i] > lstB[i]) {
                    if (!honor.equals("A")) {
                        honor = "A";
                        answer++;
                    }
                } else if (lstA[i] < lstB[i]) {
                    if (!honor.equals("B")) {
                        honor = "B";
                        answer++;
                    }
                } else {
                    if (!honor.equals("BOTH")) {
                        honor = "BOTH";
                        answer++;
                    }
                }


            }
        }
        System.out.println(answer);
    }
}






