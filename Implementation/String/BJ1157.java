package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                int val = map.get(c);
                map.put(c, val + 1);
            }

        }
        int maxNum = 0;
        String maxKey = "";
        for (Character key : map.keySet()) {
            int val = map.get(key);
            if (val >= maxNum) {
                maxNum = val;
                maxKey = key.toString();
            }
        }
        for (Character key : map.keySet()) {
            int val = map.get(key);
            if (val == maxNum && !key.toString().equals(maxKey)) {
                maxKey = "?";
                break;
            }
        }

        System.out.println(maxKey.toUpperCase());

    }
}

//2025.10.26 다른 문제풀이 추가
//package com.main.javacompile;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] inputArray = br.readLine().toCharArray();
//        Arrays.sort(inputArray);
//        int usedCount = 0;
//        String answer = "";
//        List<Character> visited = new ArrayList<>();
//        for (int i = 0; i < inputArray.length; i++) {
//            int count = 0;
//            boolean isExist = false;
//            if (Character.isUpperCase(inputArray[i])) {
//                if (visited.contains(inputArray[i]) || visited.contains(Character.toLowerCase(inputArray[i]))) {
//                    isExist = true;
//                }
//            } else {
//                if (visited.contains(inputArray[i]) || visited.contains(Character.toUpperCase(inputArray[i]))) {
//                    isExist = true;
//                }
//            }
//
//            if (!isExist) {
//                for (int j = 0; j < inputArray.length; j++) {
//                    if (Character.isUpperCase(inputArray[i])) {
//                        if (inputArray[i] == inputArray[j] || inputArray[i] == Character.toUpperCase(inputArray[j])) {
//                            count++;
//                        }
//                    } else {
//                        if (inputArray[i] == inputArray[j] || inputArray[i] == Character.toLowerCase(inputArray[j])) {
//                            count++;
//                        }
//                    }
//
//                }
//                visited.add(inputArray[i]);
//            } else {
//                continue;
//            }
//            if (usedCount < count) {
//                usedCount = count;
//                answer = String.valueOf(inputArray[i]).toUpperCase();
//            } else if (usedCount == count) {
//                usedCount = count;
//                answer = "?";
//            }
//        }
//        System.out.println(answer);
//
//    }
//}

