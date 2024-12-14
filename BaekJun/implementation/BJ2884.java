import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int totalMinutes = hour * 60 + minute;
        int intHour = (totalMinutes - 45) / 60;
        int intMinute = (totalMinutes - 45) % 60;
        if (totalMinutes < 45) {
            intHour = 23;
            intMinute = 60 + (intMinute);
        }
        String answerHour = Integer.toString(intHour);
        String answerMinute = Integer.toString(intMinute);
        System.out.println(answerHour + " " + answerMinute);
    }
}

