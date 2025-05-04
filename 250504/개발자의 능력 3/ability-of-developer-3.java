import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < lst.length; i++) {
            sum += lst[i];
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < lst.length - 2; i++) {
            for (int j = i + 1; j < lst.length - 1; j++) {
                for (int k = j + 1; k < lst.length; k++) {
                    answer = Math.min(answer,
                            Math.abs(
                                    (lst[i] + lst[j] + lst[k]) -
                                            (sum - (lst[i] + lst[j] + lst[k]))
                            )
                    );
                }
            }
        }
        System.out.println(answer);


    }
}











