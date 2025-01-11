import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int day = Integer.parseInt(input[0]);
        int hour = Integer.parseInt(input[1]);
        int minute = Integer.parseInt(input[2]);

        int dayGap = day - 11;
        int hourGap = hour - 11;
        int minuteGap = minute - 11;

        int totalMinutes = dayGap * (60 * 24) + hourGap * (60) + minuteGap;

        System.out.println(totalMinutes < 0 ? -1 : totalMinutes);


    }
}
