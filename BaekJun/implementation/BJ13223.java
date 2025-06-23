package BaekJun.implementation;

import java.util.Scanner;

public class BJ13223 {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String drop = sc.next();
        sc.close();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropSecond = Integer.parseInt(dropUnit[2]);
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;


        int needSecondAmount = dropSecondAmount - currentSecondAmount;

        if (needSecondAmount <= 0) {
            needSecondAmount += 24 * 3600;
        }


        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }


}

//2024.01.01 자체 문제 풀이 추가
//public static void Test(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    String[] currentTime = sc.nextLine().split(":");
//    String[] targetTime = sc.nextLine().split(":");
//
//    String hourGap = "";
//    String minGap = "";
//    String secGap = "";
//
//
//    int targetTimeHour = Integer.valueOf(targetTime[0]);
//    int currentTimeHour = Integer.valueOf(currentTime[0]);
//
//    int targetTimeMin = Integer.valueOf(targetTime[1]);
//    int currentTimeMin = Integer.valueOf(currentTime[1]);
//
//    int targetTimeSec = Integer.valueOf(targetTime[2]);
//    int currentTimeSec = Integer.valueOf(currentTime[2]);
//
//    if (currentTimeSec > targetTimeSec) {
//        secGap = String.valueOf(60 - Math.abs(targetTimeSec - currentTimeSec));
//        targetTimeMin--;
//    } else {
//        secGap = String.valueOf(targetTimeSec - currentTimeSec);
//    }
//
//    if (currentTimeMin > targetTimeMin) {
//        minGap = String.valueOf(60 - Math.abs(targetTimeMin - currentTimeMin));
//        targetTimeHour--;
//    } else {
//        minGap = String.valueOf(targetTimeMin - currentTimeMin);
//    }
//
//
//    if (currentTimeHour >= targetTimeHour) {
//        hourGap = String.valueOf(24 - Math.abs(targetTimeHour - currentTimeHour));
//    } else {
//        hourGap = String.valueOf(targetTimeHour - currentTimeHour);
//    }
//
//    //한자리수인 경우 0을 붙여서 형태맞추기
//    if (secGap.length() < 2) {
//        secGap = "0" + secGap;
//    }
//    if (minGap.length() < 2) {
//        minGap = "0" + minGap;
//    }
//    if (hourGap.length() < 2) {
//        hourGap = "0" + hourGap;
//    }
//
//
//    System.out.println(hourGap+":"+minGap+":"+secGap);
//    sc.close();
//}