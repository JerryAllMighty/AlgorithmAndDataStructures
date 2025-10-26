package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Test {
    public static List<Integer> isExist = new ArrayList<>();
    public static void containsCharThenRemove(char c, char[] charList) {
        for (int i = 0; i < charList.length; i++) {
            char eachChar = charList[i];
            if (eachChar == c && !isExist.contains(i)) {
                isExist.add(i);
                break;
            }
        }
    }

    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            containsCharThenRemove(c, b);
        }
        System.out.println((b.length - isExist.size()) + (a.length - isExist.size()));

    }
}


//2025.10.26 다른 문제풀이 초안 (정답아님)
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        char[] firstInputArray = br.readLine().toCharArray();
//        char[] secondInputArray = br.readLine().toCharArray();
//        int firstDistinctStringCount = 0;
//        int secondDistinctStringCount = 0;
//
//        for (char c : firstInputArray) {
//            boolean isExist = false;
//            for (char cmp : secondInputArray) {
//                if (c == cmp) {
//                    isExist = true;
//                }
//            }
//            if (!isExist) {
//                firstDistinctStringCount++;
//            }
//        }
//
//        for (char c : secondInputArray) {
//            boolean isExist = false;
//            for (char cmp : firstInputArray) {
//                if (c == cmp) {
//                    isExist = true;
//                }
//            }
//            if (!isExist) {
//                secondDistinctStringCount++;
//            }
//        }
//
//        System.out.println(firstDistinctStringCount + secondDistinctStringCount);
//    }
//}

//package com.main.javacompile;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        char[] firstInput = br.readLine().toCharArray();
//        char[] secondInput = br.readLine().toCharArray();
//
//        int answer = 0;
//
//        for (char c : firstInput) {
//            boolean isExist = false;
//            for (char ch : secondInput) {
//                if (c == ch) {
//                    isExist = true;
//                    break;
//                }
//            }
//            if (!isExist) {
//                answer++;
//            }
//
//        }
//
//        for (char c : secondInput) {
//            boolean isExist = false;
//            for (char ch : firstInput) {
//                if (c == ch) {
//                    isExist = true;
//                    break;
//                }
//            }
//            if (!isExist) {
//                answer++;
//            }
//
//        }
//
//        System.out.println(answer);
//
//    }
//}



