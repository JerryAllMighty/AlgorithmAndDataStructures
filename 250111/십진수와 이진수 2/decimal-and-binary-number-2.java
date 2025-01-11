import java.util.*;

public class Main {
    static int getMultiplyToNumOf(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] binary = sc.nextLine().split("");
        int num = 0;
        for (int i = 0; i < binary.length; i++) {
            int multiplyToNumOf = getMultiplyToNumOf(2, binary.length - 1 - i);
            num += Integer.parseInt(binary[i]) * multiplyToNumOf;
        }
        num *= 17;
        List<String> answer = new ArrayList<>();
        while (true) {
            if (num < 2) {
                answer.add(0, Integer.toString(num));
                break;
            }
            int mod = num % 2;
            answer.add(0, Integer.toString(mod));
            num /= 2;
        }
        for (String ans : answer) {
            System.out.print(ans);

        }

    }
}
