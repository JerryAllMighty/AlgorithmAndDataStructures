package Implementation.String;

import java.io.*;
/*
 * 2026.01.14 통과
 * 다음에는 문자열의 갯수를 담는 배열을 활용해보는 것으로...
 */

public class BJ1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String wordA = br.readLine();
        String wordB = br.readLine();

        String wordACompare = "";
        String wordBCompare = "";

        for (int i = 0; i < wordA.length(); i++) {
            wordACompare += String.valueOf(wordA.charAt(i));
        }
        for (int i = 0; i < wordB.length(); i++) {
            wordBCompare += String.valueOf(wordB.charAt(i));
        }
        int answer = 0;
        for (int i = 0; i < wordA.length(); i++) {
            wordBCompare = wordBCompare.replaceFirst(String.valueOf(wordA.charAt(i)), "");
        }
        answer += wordBCompare.length();

        for (int i = 0; i < wordB.length(); i++) {
            wordACompare = wordACompare.replaceFirst(String.valueOf(wordB.charAt(i)), "");
        }
        answer += wordACompare.length();
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
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

//2025.10.26 정답 코드 추가
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
//        int[] firstInputCount = new int[26];
//        int[] secondInputCount = new int[26];
//
//        // 각 알파벳 마다 몇 개가 있는지
//        for (char c : firstInput) {
//            firstInputCount[c - 'a']++;
//        }
//
//        for (char c : secondInput) {
//            secondInputCount[c - 'a']++;
//        }
//
//        int answer = 0;
//        for (int i = 0; i < 26; i++) {
//            answer += Math.abs(firstInputCount[i] - secondInputCount[i]);
//        }
//        System.out.println(answer);
//    }
//}

//2023.12.25 새로운 문제풀이 추가

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import static java.lang.Math.max;
//
//public class com.Test.javacompiler.Test {
//  public static void Test(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    char[] first = sc.nextLine().toCharArray();
//    char[] second = sc.nextLine().toCharArray();
//
//    //A에서 같은 글자 개수를 찾는다
//    int answer = 0;
//    int sameACnt = 0;
//    ArrayList<Integer> foundA = new ArrayList<Integer>();
//    for (int i = 0; i < first.length; i++) {
//      String eachA = String.valueOf(first[i]);
//      for (int j = 0; j < second.length; j++) {
//        String eachB = String.valueOf(second[j]);
//        if (eachA.equals(eachB) && !foundA.contains(j)) {
//          sameACnt++;
//          foundA.add(j);
//          break;
//        }
//      }
//    }
//    answer += (first.length - sameACnt) + (second.length - sameACnt);
//    System.out.println(answer);
//    sc.close();
//  }
//
//
//}


//public static void Test(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String a = sc.next();
//    String b = sc.next();
//
//    sc.close();
//
//    int[] countA = new int[26]; //문자열 개수 카운트
//    int[] countB = new int[26];
//
//    for(int i = 0; i < a.length(); i++){
//        countA[a.charAt(i) - 'a']++;
//
//
//    }
//    for(int i = 0; i < b.length(); i++){
//        countB[b.charAt(i) - 'a']++;
//
//
//    }
//    int ans = 0;
//    for (int i = 0; i < 26; i++){
//        if(countA[i] > countB[i]){
//            ans += countA[i] - countB[i];
//        }else if(countB[i] > countA[i]){
//            ans += countB[i] - countA[i];
//        }
//    }
//    System.out.println(ans);
//
//}





