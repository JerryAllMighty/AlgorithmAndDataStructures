import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += input[k];
                }
                double avg = (double)temp / (j - i + 1);
                boolean isExist = Arrays.stream(input).anyMatch(x -> x == avg);
                if (isExist) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}










