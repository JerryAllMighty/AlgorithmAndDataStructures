package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(":");
        String[] b = sc.nextLine().split(":");
        String answer = "";

        int hourA = Integer.parseInt(a[0]);
        int minuteA = Integer.parseInt(a[1]);
        int secondsA = Integer.parseInt(a[2]);

        int hourB = Integer.parseInt(b[0]);
        int minuteB = Integer.parseInt(b[1]);
        int secondsB = Integer.parseInt(b[2]);

        int hourGap = 0;
        int minuteGap = 0;
        int secondsGap = 0;

        if(hourA == hourB && minuteA == minuteB && secondsA == secondsB){
            System.out.println("24:00:00");
            return;
        }

        if (secondsB >= secondsA) {
            secondsGap = secondsB - secondsA;
        } else {
            secondsGap = (secondsB + 60) - secondsA;
            minuteB -= 1;
        }
        if (minuteB >= minuteA) {
            minuteGap = minuteB - minuteA;
        } else {
            minuteGap = (minuteB + 60) - minuteA;
            hourB -= 1;
        }
        if (hourB >= hourA) {
            hourGap = hourB - hourA;
        } else {
            hourGap = (hourB + 24) - hourA;
        }

        String hourGapFormat = Integer.toString(hourGap).length() < 2 ? "0" + Integer.toString(hourGap) : Integer.toString(hourGap);
        String minuteGapFormat = Integer.toString(minuteGap).length() < 2 ? "0" + Integer.toString(minuteGap) : Integer.toString(minuteGap);
        String secondsGapFormat = Integer.toString(secondsGap).length() < 2 ? "0" + Integer.toString(secondsGap) : Integer.toString(secondsGap);
        System.out.println(hourGapFormat + ":" + minuteGapFormat + ":" + secondsGapFormat);


    }
}

//2025.10.26
//package com.main.javacompile;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] currentTimeInput = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
//        int[] targetTimeInput = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
//
//        int totalSecondsOfCurrenttime = (currentTimeInput[0] * 3600) +  (currentTimeInput[1] * 60) +  (currentTimeInput[2]);
//        int totalSecondsOfTargetTime = (targetTimeInput[0] * 3600) +  (targetTimeInput[1] * 60) +  (targetTimeInput[2]);
//
//        int totalSecondsGap = totalSecondsOfTargetTime > totalSecondsOfCurrenttime ? totalSecondsOfTargetTime - totalSecondsOfCurrenttime : (totalSecondsOfTargetTime + (24*3600)) - totalSecondsOfCurrenttime;
//
//        int hour = totalSecondsGap / 3600;
//        totalSecondsGap %= 3600;
//
//
//        int minute = totalSecondsGap / 60;
//        totalSecondsGap %= 60;
//
//        int second = totalSecondsGap;
//
//        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
//    }
//}

