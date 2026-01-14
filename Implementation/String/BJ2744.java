package Implementation.String;

import java.util.Scanner;


public class BJ2744 {
    public static void BJ2744(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            int toAscii = (int) c;
            if (toAscii >= 97) {
                input[i] = (char)(toAscii - 32);
            }else if (toAscii >= 65 && toAscii < 97){
                input[i] = (char)(toAscii + 32);
            }
        }
        System.out.println(input);

    }
}

//2025.10.26 정답 풀이 추가
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
//        char[] input = br.readLine().toCharArray();
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : input) {
//            //대문자
//            if (c >= 'A' && c <= 'Z') {
//                sb.append((char)('a' + c - 'A'));
//            } else {
//                sb.append((char)('A' + c - 'a'));
//            }
//        }
//
//        System.out.println(sb.toString());
//
//    }
//}

/*
 * 2026.01.14 다시 풀이 , 통과 완료
 * package com.main.javacompile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                sb.append(Character.toLowerCase(word.charAt(i)));
            } else {
                sb.append(Character.toUpperCase(word.charAt(i)));
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
 *
 */



