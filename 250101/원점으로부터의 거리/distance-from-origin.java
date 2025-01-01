import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Xy {
    int x;
    int y;

    int num;

    Xy(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        Xy[] xys = new Xy[cnt];
        int num = 1;
        for (int i = 0; i < cnt; i++) {
            String[] input = sc.nextLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            xys[i] = new Xy(x, y, num++);
        }

        Arrays.sort(xys, new Comparator<Xy>() {
            @Override
            public int compare(Xy o1, Xy o2) {
                return ((Math.abs(-o1.x)) + (Math.abs(-o1.y))) - ((Math.abs(-o2.x)) + (Math.abs(-o2.y)));
            }
        });

        for (Xy xy : xys) {
            System.out.println(xy.num);
        }


    }
}