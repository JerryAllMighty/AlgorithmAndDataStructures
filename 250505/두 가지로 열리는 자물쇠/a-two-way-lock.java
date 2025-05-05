import java.util.*;

public class Main {
    static boolean isDistanceValid(int a, int b, int n) {
        return a > b ? Math.abs(a - b) > 2 && Math.abs(a - (b+n)) > 2
                :  Math.abs(a - b) > 2 && Math.abs(b - (a+n)) > 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //어느 한 자리라도 첫번째 조합과 거리가 2보다 크면서 어느 한 자리라도 두번쨰 조합과 거리가 2보다 크다
        int excludeCaseCnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
//                    if (i == j || j == k || i == k) {
//                        continue;
//                    }
                    if ((isDistanceValid(i, a[0], n) || isDistanceValid(j, a[1], n) || isDistanceValid(k, a[2], n)) &&
                            (isDistanceValid(i, b[0], n) || isDistanceValid(j, b[1], n) || isDistanceValid(k, b[2], n))) {
                        excludeCaseCnt++;

                    }

                }
            }

        }
        System.out.println((n * n * n) - excludeCaseCnt);


    }
}











