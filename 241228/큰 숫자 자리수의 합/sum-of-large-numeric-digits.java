import java.util.*;


public class Main {

    public static int recursive(int[] lst, int n) {
        if (n == 0) {
            return lst[n];
        }
        return lst[n] * recursive(lst, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] givenList = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = recursive(givenList, 2);
        String resultStr = Integer.toString(result);
        int answer = 0;
        for (int i = 0; i < resultStr.length(); i++) {
            int num = Integer.parseInt(resultStr.substring(i, i + 1));
            answer += num;
        }
        System.out.println(answer);


    }
}


