import java.util.*;

public class Main {
    static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = new int[2001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            lst[i + OFFSET] = num;
        }
        int answer = 0;
        int continousCnt = 0;
        for (int i = 0; i < lst.length; i++) {
            if (i == 0 || (lst[i] > 0 && lst[i - 1] > 0) || (lst[i] < 0 && lst[i - 1] < 0)) {
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



