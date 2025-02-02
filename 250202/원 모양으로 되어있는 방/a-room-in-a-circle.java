import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] houseCnt = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = Integer.parseInt(sc.nextLine());
            houseCnt[i] = cnt;
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {//시작하는방
            int temp = 0;
            for (int j = 0; j < n; j++) {//옮기는 방
                int num = i;
                if (num > j) {
                    num = n - num + j;
                } else {
                    num = j - num;
                }
                temp += (num) * houseCnt[j];
            }
            answer = Math.min(answer, temp);
        }
        System.out.println(answer);


    }
}









