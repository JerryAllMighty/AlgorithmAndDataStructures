import java.util.*;

public class Main {
    static Integer[] lst = new Integer[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        Arrays.fill(lst, 0);
        for (int i = 0; i < k; i++) {
            String[] eachInput = sc.nextLine().split(" ");
            int start = Integer.parseInt(eachInput[0]);
            int end = Integer.parseInt(eachInput[1]);

            for (int j = start; j <= end; j++) {
                lst[j] += 1;
            }
        }

        Arrays.sort(lst, Collections.reverseOrder());

        System.out.println(lst[0]);


    }
}
