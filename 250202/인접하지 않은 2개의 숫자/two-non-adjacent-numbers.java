import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 2; j < n; j++) {
                answer = Math.max(answer, lst[i] + lst[j]);
            }
        }
        System.out.println(answer);


    }
}









