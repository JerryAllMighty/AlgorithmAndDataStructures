import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int k = input[1];

        String[] lst = new String[10000];
        for (int i = 0; i < n; i++) {
            String[] given = sc.nextLine().split(" ");
            int idx = Integer.parseInt(given[0]);
            String direction = given[1];
            lst[idx] = direction;
        }
        int answer = 0;
        for (int i = 1; i < 10000 - k; i++) {
            int temp = 0;
            for (int j = i; j <= i + k; j++) {
                if (lst[j] != null) {
                    temp += lst[j].equals("G") ? 1 : 2;
                }
            }
            answer = Math.max(answer, temp);
        }
        System.out.println(answer);


    }
}










