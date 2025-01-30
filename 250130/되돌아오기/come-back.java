import java.util.*;

public class Main {
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {-1, 0, 0, 1};

    static int getDir(String d) {
        if (d.equals("W")) {
            return 0;
        } else if (d.equals("S")) {
            return 1;
        } else if (d.equals("N")) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x = 0;
        int y = 0;
        int time = 0;
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String direction = input[0];
            int cnt = Integer.parseInt(input[1]);
            int d = getDir(direction);
            for (int j = 0; j < cnt; j++) {
                x += dx[d];
                y += dy[d];
                time++;
                if(x == 0 && y == 0){
                    System.out.println(time);
                    System.exit(0);
                }
            }


        }
        System.out.println(-1);

    }
}








