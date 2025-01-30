import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int currentDirectionIdx = 0;
        int[] answer = {0, 0};
        for (int i = 0; i < input.length(); i++) {
            String direction = input.substring(i, i + 1);
            if (direction.equals("L")) {
                currentDirectionIdx = (currentDirectionIdx + 3) % 4;
            } else if (direction.equals("R")) {
                currentDirectionIdx = (currentDirectionIdx + 1) % 4;
            } else if (direction.equals("F")) {
                answer[0] += dx[currentDirectionIdx];
                answer[1] += dy[currentDirectionIdx];
            }
        }
        System.out.println(Integer.toString(answer[0]) + " " + Integer.toString(answer[1]));


    }
}






