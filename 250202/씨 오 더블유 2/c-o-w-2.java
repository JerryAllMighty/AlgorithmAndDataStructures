import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == 'C') {
                for (int j = i + 1; j < n; j++) {
                    if (input.charAt(j) == 'O') {
                        for (int k = j + 1; k < n; k++) {
                            if (input.charAt(k) == 'W') {
                                answer++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}









