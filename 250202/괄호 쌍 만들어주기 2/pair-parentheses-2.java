import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int answer = 0;
        for (int i = 0; i < input.length() - 3; i++) {
            if (input.charAt(i) == '(' && input.charAt(i + 1) == '(') {
                for (int l = i + 2; l < input.length() - 1; l++) {
                    if (input.charAt(l) == ')' && input.charAt(l + 1) == ')') {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);


    }
}









