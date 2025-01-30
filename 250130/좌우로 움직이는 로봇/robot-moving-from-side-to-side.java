import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int[] lstA = new int[25000000];
        int[] lstB = new int[25000000];

        int previousIdxA = 0;
        int previousIdxB = 0;

        int previousTimeA = 0;
        int previousTimeB = 0;


        for (int i = 0; i < n; i++) {
            String[] directionCnt = sc.nextLine().split(" ");
            int cnt = Integer.parseInt(directionCnt[0]);
            String direction = directionCnt[1];

            for (int j = 1; j <= cnt; j++) {
                if (direction.equals("L")) {
                    lstA[previousTimeA + j] = previousIdxA - 1;
                    previousIdxA--;
                }
                if (direction.equals("R")) {
                    lstA[previousTimeA + j] = previousIdxA + 1;
                    previousIdxA++;
                }

            }
            previousTimeA += cnt;
        }
        Arrays.fill(lstA, previousTimeA + 1, 25000000, previousIdxA);

        for (int i = 0; i < m; i++) {
            String[] directionCnt = sc.nextLine().split(" ");
            int cnt = Integer.parseInt(directionCnt[0]);
            String direction = directionCnt[1];

            for (int j = 1; j <= cnt; j++) {
                if (direction.equals("L")) {
                    lstB[previousTimeB + j] = previousIdxB - 1;
                    previousIdxB--;
                }
                if (direction.equals("R")) {
                    lstB[previousTimeB + j] = previousIdxB + 1;
                    previousIdxB++;
                }

            }
            previousTimeB += cnt;
        }
        Arrays.fill(lstB, previousTimeB + 1, 25000000, previousIdxB);

        int answer = 0;
        for (int i = 1; i < Math.max(previousTimeA, previousTimeB); i++) {
            if ((lstA[i - 1] != lstB[i - 1]) && (lstA[i] == lstB[i])) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}






