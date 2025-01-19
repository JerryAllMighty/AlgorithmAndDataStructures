import java.util.*;

public class Main {
    static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] lst = new int[2001][2001];

        for (int i = 0; i < 3; i++) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = input[0];
            int y1 = input[1];
            int x2 = input[2];
            int y2 = input[3];

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i != 2) {
                        lst[j + OFFSET][k + OFFSET]++;
                    } else {
                        lst[j + OFFSET][k + OFFSET] += 2;
                    }

                }
            }
        }
        long answer = 0;
        for (int[] eachOne : lst) {
            answer += Arrays.stream(eachOne).filter(y -> y == 1).count();
        }
        System.out.println(answer);


    }
}


