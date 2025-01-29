import java.util.*;

public class Main {
    static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            lst[i] = num;
        }
        int answer = 0;
        int continousCnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || lst[i] > lst[i - 1]) {
                continousCnt++;
                if (continousCnt > answer) {
                    answer = continousCnt;

                }
            }else{
                continousCnt = 1;
            }
        }
        System.out.println(answer);

    }
}



