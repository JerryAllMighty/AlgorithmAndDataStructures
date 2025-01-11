import java.util.*;

public class Main {
    static List<String> convertNum(int n, int b) {
        int num = n;
        List<String> result = new ArrayList<>();
        while (true) {
            if (num < b) {
                result.add(0, Integer.toString(num));
                break;
            }
            int mod = num % b;
            result.add(0, Integer.toString(mod));
            num /= b;

        }
        return result;

    }

    static int numToTheNumberOf(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    static int toNum(int a, String n) {
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            int numToTheNumberOf = numToTheNumberOf(a, n.length() - 1 - i);
            result += Integer.parseInt(Character.toString(n.charAt(i))) * numToTheNumberOf;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        String n = sc.nextLine();
        int num = toNum(a, n);
        List<String> answer = convertNum(num, b);
        for (String ans : answer) {
            System.out.print(ans);

        }


    }
}
