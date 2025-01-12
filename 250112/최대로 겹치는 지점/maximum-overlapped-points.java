import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = new int[101];
        Arrays.fill(lst, 0);
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            for (int j = start; j <= end; j++) {
                lst[j] += 1;
            }
        }

        Integer[] sortedLst = Arrays.stream(lst).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedLst, Collections.reverseOrder());
        System.out.println(sortedLst[0]);

    }
}

