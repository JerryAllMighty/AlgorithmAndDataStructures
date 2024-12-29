import java.util.*;


public class Main {

    public static int recursive(int n) {
        if (n == 1) {
            return 1;
        }
        return recursive(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = recursive(n);
        System.out.println(result);


    }
}


