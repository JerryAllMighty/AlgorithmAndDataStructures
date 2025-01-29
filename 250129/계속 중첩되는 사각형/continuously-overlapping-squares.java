import java.util.*;

public class Main {
    static int OFFSET = 100;
    static int[][] lst = new int[201][201];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean bFlag = false;
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (!bFlag) {
                        lst[j+OFFSET][k+OFFSET] = 1;
                    } else {
                        lst[j+OFFSET][k+OFFSET] = 2;
                    }
                }
            }
            if (!bFlag) {
                bFlag = true;
            } else {
                bFlag = false;
            }
        }
        int answer = 0;
        for (int[] eachList : lst) {
            answer += Arrays.stream(eachList).filter(x -> x == 2).count();
        }
        System.out.println(answer);
    }
}



