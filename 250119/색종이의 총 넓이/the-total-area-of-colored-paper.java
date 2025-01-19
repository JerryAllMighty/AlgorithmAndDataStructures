import java.util.*;

public class Main {
    static int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] lst;
        int n = Integer.parseInt(sc.nextLine());
        lst = new int[201][201];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = input[0];
            int y1 = input[1];
            int x2 = x1 + 8;
            int y2 = y1 + 8;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    lst[j + OFFSET][k + OFFSET]++;
                }
            }
        }
        long answer = 0;
        for (int[] eachOne : lst) {
            answer += Arrays.stream(eachOne).filter(y -> y > 0).count();
        }
        System.out.println(answer);


    }
}


