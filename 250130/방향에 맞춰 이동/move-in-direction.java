import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] answer = {0, 0};
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String direction = input[0];
            int cnt = Integer.parseInt(input[1]);
            if (direction.equals("W")) {
                answer[0] += dx[0] * cnt;
                answer[1] += dy[0] * cnt;
            } else if (direction.equals("S")) {
                answer[0] += dx[1] * cnt;
                answer[1] += dy[1] * cnt;
            } else if (direction.equals("N")) {
                answer[0] += dx[2] * cnt;
                answer[1] += dy[2] * cnt;
            } else if (direction.equals("E")) {
                answer[0] += dx[3] * cnt;
                answer[1] += dy[3] * cnt;
            }
        }
        System.out.println(Integer.toString(answer[0]) + " " + Integer.toString(answer[1]));


    }
}






