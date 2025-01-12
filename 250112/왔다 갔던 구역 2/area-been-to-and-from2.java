import java.util.*;

public class Main {
    static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = new int[2001];
        Arrays.fill(lst, 0);
        int start = 0;
        String previousDirection = "";
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int cnt = Integer.parseInt(input[0]);
            String direction = input[1];
            if (!direction.equals(previousDirection) && previousDirection.equals("R")) {
                start--;
            } else if (!direction.equals(previousDirection) && previousDirection.equals("L")) {
                start++;
            }
            for (int j = 0; j < cnt; j++) {
                lst[start + OFFSET] += 1;
                int val = lst[start + OFFSET];

                if (direction.equals("R")) {
                    previousDirection = "R";
                    start++;
                } else {
                    previousDirection = "L";
                    start--;
                }

            }


        }
        long answer = Arrays.stream(lst).filter(x -> x >= 2).count();
        System.out.println(answer);
    }
}

