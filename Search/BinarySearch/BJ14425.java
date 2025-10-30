package Search.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            String nInput = br.readLine();
            s[i] = nInput;
        }

        Arrays.sort(s);

        int answer = 0;
        for (int i = 0; i < m; i++) {
            String mInput = br.readLine();
            //집합 s에 포함되어있는 것이 몇 개인지
//            answer += binarySearch(s, mInput) == true ? 1 : 0;
            int index = Arrays.binarySearch(s, mInput);
            if (index >= 0) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}
//2025.10.30 내 개인풀이
//TODO : 문자열 정렬하는 다른 방법 알아놓기
//package com.main.javacompile;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class Main {
//
//    static int compareString(String s1, String s2) {
//        for (int i = 0; i < s1.length(); i++) {
//            char c = s1.charAt(i);
//            if (s2.length() >= (i + 1)) {
//                char ch = s2.charAt(i);
//                if (c > ch) {
//                    return 1;
//                } else if (c < ch) {
//                    return -1;
//                } else {
//                    continue;
//                }
//            }else{
//                return 1;
//            }
//
//        }
//        return 0;
//
//    }
//
//    static boolean binarySearch(String[] arr, String targetString) {
//        int l = 0;
//        int r = arr.length - 1;
//        int m = (l + r) / 2;
//        while (l <= r) {
//            if (compareString(arr[m], targetString) < 0) {
//                l = m + 1;
//            } else if (compareString(arr[m], targetString) > 0) {
//                r = m - 1;
//            } else {
//                return true;
//            }
//            m = (l + r) / 2;
//
//        }
//        return false;
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int n = input[0];
//        int m = input[1];
//
//        String[] s = new String[n];
//        for (int i = 0; i < n; i++) {
//            String nInput = br.readLine();
//            s[i] = nInput;
//        }
//
//        Arrays.sort(s);
//
//        int answer = 0;
//        for (int i = 0; i < m; i++) {
//            String mInput = br.readLine();
//            //집합 s에 포함되어있는 것이 몇 개인지
//            answer += binarySearch(s, mInput) == true ? 1 : 0;
////            int index = Arrays.binarySearch(s, mInput);
////            if (index >= 0) {
////                answer++;
////            }
//        }
//
//        System.out.println(answer);
//
//    }
//}



