import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = lst[0];
        int m = lst[1];
        int k = lst[2];
        int[] students = new int[n];
        int answer = -1;
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(sc.nextLine());
            students[num - 1]++;
            if (students[num - 1] >= k) {
                answer = num;
                break;
            }

        }
        System.out.println(answer);


    }
}



