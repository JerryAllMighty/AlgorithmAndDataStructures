package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int idx = 0;
        int answer = 0;
        while (idx + b.length() <= a.length()) {
            String s = a.substring(idx, idx + b.length());
            if (s.equals(b)) {
                answer++;
                idx += b.length();
            } else {
                idx++;
            }
        }
        System.out.println(answer);


    }
}
//2025.10.26 다른 문제풀이 추가
//package com.main.javacompile;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        String targetString = br.readLine();
//        int answer = 0;
//        int index = 0;
//        while(index <= input.length() - targetString.length()){
//            String s = input.substring(index, index + targetString.length());
//            if (s.equals(targetString)) {
//                answer++;
//                index = index + targetString.length();
//            }else {
//                index++;
//            }
//
//        }
//        System.out.println(answer);
//    }
//}

