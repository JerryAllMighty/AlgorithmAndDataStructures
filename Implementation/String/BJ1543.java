package Implementation.String;

public class BJ1543 {
    /*
    * 2026.01.14 개인 문제풀이, 통과
    * package com.main.javacompile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String document = br.readLine();
        String target = br.readLine();
        int answer = 0;
        int index = 0;
        while (index <= document.length() - target.length()) {
            if (document.substring(index, index + target.length()).equals(target)) {
                answer++;
                index += target.length();
            } else {
                index++;
            }
        }


        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
     */
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

