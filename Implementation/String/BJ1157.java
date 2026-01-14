package Implementation.String;

class BJ1157 {
    
/*
 * 2026.01.14 문제 풀이 , 통과 완료
 * package com.main.javacompile;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] word = br.readLine().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int answerCount = 0;
        String answer = "";
        for (char c : word) {
            if (map.get(Character.toLowerCase(c)) == null) {
                map.put(Character.toLowerCase(c), 1);
//                if (answerCount == 0) {
//                    answerCount = 1;
//                    answer = String.valueOf(Character.toUpperCase(c));
//                }
            } else {
                int value = map.get(Character.toLowerCase(c)) + 1;
//                if (answerCount == value) {
//                    answer = "?";
//                } else if (value > answerCount) {
//                    answer = String.valueOf(Character.toUpperCase(c));
//                    answerCount = value;
//                }
                map.put(Character.toLowerCase(c), value);
            }
        }
        for (Character c : map.keySet()) {
            if(map.get(c) > answerCount){
                answer = String.valueOf(Character.toUpperCase(c));
                answerCount = map.get(c);
            }else if(map.get(c) == answerCount){
                answer = "?";
            }

        }

        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}


 */

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
}



//public static int getAlphabetCount(String str, char alp){
//    int count = 0;
//    for(int i =0; i < str.length(); i++){
//        if(alp == str.charAt(i))count++;
//
//    }
//    return count;
//
//}
//public static void Test(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String str = sc.next().toUpperCase();
//
//    int maxCount = -1;
//    int maxAlphabet = '?';
//
//    for(char alp = 'A'; alp <= 'Z';alp++){
//        int count = getAlphabetCount(str, alp);
//
//        if(count > maxCount){
//            maxCount = count;
//            maxAlphabet = alp;
//        }else if(count == maxCount){
//            maxAlphabet = '?';
//        }
//    }
//
//    System.out.println((char)(maxAlphabet));
//
//}