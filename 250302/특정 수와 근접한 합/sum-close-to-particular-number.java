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
            int num1 = nums[i];
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                List<Integer> visited = new ArrayList<>();
                int num2 = nums[j];
                for (int k = 0; k < n; k++) {
                    if (nums[k] != num1 && nums[k] != num2 && !visited.contains(nums[k])) {
                        temp += nums[k];
                        visited.add(nums[k]);
                    }
                }
                lst.add(Math.abs(s - temp));
            }

        }
        Collections.sort(lst);
        System.out.println(lst.get(0));


    }
}










