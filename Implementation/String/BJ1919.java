package Implementation.String;

package com.main.javacompile;

import java.io.*;
/*
 * 2026.01.14 통과
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





