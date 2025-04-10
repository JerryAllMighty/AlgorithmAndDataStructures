import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int val = 0;
                for (int k = i; k <= j; k++) {
                    val += nums[k];
                }
                double avg = (double) val / (j - i + 1);
                for (int l = i; l <= j; l++) {
                    if (nums[l] == avg) {
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}










