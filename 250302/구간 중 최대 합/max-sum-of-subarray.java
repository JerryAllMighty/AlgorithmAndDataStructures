import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int k = input[1];

        int answer = 0;

        for (int i = 0; i <= n - k; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += nums[j];
            }
            answer = Math.max(answer, temp);
        }
        System.out.println(answer);




    }
}










