import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] info = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = info[0];
        int height = info[1];
        int continuousCnt = info[2];

        int answer = 101;
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= lst.length - continuousCnt; i++) {
            int temp = 0;
            for (int j = i; j < i + continuousCnt; j++) {
                temp += Math.abs(height - lst[j]);

            }
            answer = Math.min(answer, temp);

        }
        System.out.println(answer);


    }
}
