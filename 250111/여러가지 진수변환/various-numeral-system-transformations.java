import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        List<String> answer = new ArrayList<>();
        while (true) {
            if (num < b) {
                answer.add(0, Integer.toString(num));
                break;
            }
            int mod = num % b;
            answer.add(0, Integer.toString(mod));
            num /= b;

        }
        for (String ans : answer) {
            System.out.print(ans);
        }


    }
}
