import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (Math.abs(i - lst[0]) > 2) {
                a++;
            }
            if (Math.abs(i - lst[1]) > 2) {
                b++;
            }
            if (Math.abs(i - lst[2]) > 2) {
                c++;
            }
        }
        System.out.println((n * n * n) - (a * b * c));

    }
}











