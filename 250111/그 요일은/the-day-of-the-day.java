import java.util.*;

public class Main {
    static String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    static int[] daysPerMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getDayGap(int m1, int m2) {
        int result = 0;
        int startMonth = Math.min(m1, m2) + 1;

        while (startMonth < Math.max(m1, m2)) {
            result += daysPerMonth[startMonth];
            startMonth++;
        }

        return m1 < m2 ? result : -result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int m1 = Integer.parseInt(input[0]);
        int d1 = Integer.parseInt(input[1]);
        int m2 = Integer.parseInt(input[2]);
        int d2 = Integer.parseInt(input[3]);
        String dayOfTheWeek = sc.nextLine();
        int dayOfTheWeekIdx = 0;
        for (int i = 0; i < days.length; i++) {
            String day = days[i];
            if (day.equals(dayOfTheWeek)) {
                dayOfTheWeekIdx = i;
            }
        }

        int dayGap = 0;
        if (m1 < m2) {
            dayGap = daysPerMonth[m1] - d1 + d2;
        } else if (m1 > m2) {
            dayGap = -(daysPerMonth[m2] - d2 + d1);
        } else {
            dayGap = d2 - d1;
        }
        int totalDayGap = getDayGap(m1, m2) + dayGap;
        int answer = 1 + ((totalDayGap - dayOfTheWeekIdx) / 7);
        if (m1 == m2 && d1 == d2) {
            answer -= 1;
        }
        System.out.println(answer);


    }
}
