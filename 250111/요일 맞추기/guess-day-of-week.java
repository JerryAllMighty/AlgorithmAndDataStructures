import java.util.*;

public class Main {
    static String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getDayGap(int m1, int m2) {
        int result = 0;
        int startMonth = m1;

        while (startMonth < m2) {
            result += daysPerMonth[startMonth];
            startMonth++;
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int m1 = Integer.parseInt(input[0]);
        int d1 = Integer.parseInt(input[1]);
        int m2 = Integer.parseInt(input[2]);
        int d2 = Integer.parseInt(input[3]);


        int totalDayGap = getDayGap(m1, m2) + d2 - d1;

        System.out.println(days[1 + (totalDayGap % 7)]);


    }
}
