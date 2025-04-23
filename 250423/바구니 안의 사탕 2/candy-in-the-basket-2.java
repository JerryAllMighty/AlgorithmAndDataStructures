import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];

        int[] candies = new int[101];
        for (int i = 0; i < n; i++) {
            int[] infos = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int cnt = infos[0];
            int direction = infos[1];
            candies[direction] += cnt;
        }

        int answer = 0;
        for (int i = 0; i < 101; i++) {
            int temp = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (j >= 0 && j < 101) {
                    temp += candies[j];
                }

            }
            answer = Math.max(answer, temp);
        }
        System.out.println(answer);

    }
}










