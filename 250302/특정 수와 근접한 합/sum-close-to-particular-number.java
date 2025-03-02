import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int s = input[1];

        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                List<Integer> visited = new ArrayList<>();
                visited.add(i);
                visited.add(j);
                for (int k = 0; k < n; k++) {
                    if (!visited.contains(k)) {
                        temp += nums[k];
                        visited.add(k);
                    }
                }
                lst.add(Math.abs(s - temp));
            }

        }
        Collections.sort(lst);
        System.out.println(lst.get(0));


    }
}










