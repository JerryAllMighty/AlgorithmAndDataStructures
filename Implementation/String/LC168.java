package Implementation.String;

public class LC168 {
    
    //2025.10.27 개인풀이
    //TODO : -1 index 구조 다시 이해 필요
//    package com.main.javacompile;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//    class Solution {
//        public String convertToTitle(int columnNumber) {
//            // 진법의 개념을 활용하면 쉽게 풀 수 있다는 접근이 필요
//            StringBuilder sb = new StringBuilder();
//
//            while (columnNumber > 0) {
//                columnNumber --;
//                int remain = (columnNumber) % 26;
//                sb.insert(0, (char)('A' + remain));
//                columnNumber /= 26;
//            }
////        sb.insert(0, (char)('A' + (columnNumber - 1) % 26));
//            return sb.toString();
//
//        }
//    }
//
//    public class Main {
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            int input = Integer.parseInt(br.readLine());
//            Solution solution = new Solution();
//            System.out.println(solution.convertToTitle(input));
//        }
//    }



}
