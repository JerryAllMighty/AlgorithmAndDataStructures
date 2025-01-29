import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int answer = 0;
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            lst[i] = num;
        }
        int continuousCnt = 0;
        for (int i = 0; i < n; i++) {
            if(i == 0 || lst[i] == lst[i-1]){
                continuousCnt++;
                if(continuousCnt > answer){
                    answer = continuousCnt;
                }
            } else{
                continuousCnt = 1;
            }
        }
        System.out.println(answer);
    }
}



