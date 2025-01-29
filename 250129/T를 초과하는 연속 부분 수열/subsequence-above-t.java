import java.util.*;

public class Main {
    static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int t = input[1];
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        int continousCnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || (lst[i] > t && lst[i - 1] > t)) {
                continousCnt++;
                if (continousCnt > answer) {
                    answer = continousCnt;

                }
            } else {
                continousCnt = 1;
            }
        }
        System.out.println(answer);

    }
}



