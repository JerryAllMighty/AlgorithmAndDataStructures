import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int d = 3;

    static void getDir(String s) {
        if (s.equals("L")) {
            d = (d + 3) % 4;
        } else if (s.equals("R")) {
            d = (d + 1) % 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int x = 0;
        int y = 0;
        int time = 0;
        for (int i = 0; i < input.length(); i++) {
            String direction = input.substring(i, i + 1);
            getDir(direction);
            if (direction.equals("F")) {
                x += dx[d];
                y += dy[d];

                if (x == 0 && y == 0) {
                    time++;
                    System.out.println(time);
                    System.exit(0);

                }
            }
            time++;
        }

        System.out.println(-1);
    }
}








