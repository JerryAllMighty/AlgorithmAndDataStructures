import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] lst = new int[100][100];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = input[0];
            int y1 = input[1];
            int x2 = input[2];
            int y2 = input[3];

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    int val = lst[j][k];
                    if (val == 0) {
                        lst[j][k] = 1;
                    }
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


