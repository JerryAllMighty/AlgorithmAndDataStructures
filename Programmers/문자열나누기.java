package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 문자열나누기 {
    static class Solution {
        static int divideString(String s) {
            if (s.isEmpty() || s == null) {
                return 0;
            }

            int answer = 0;

            String x = s.substring(0, 1);
            int xCnt = 0;
            int notXCnt = 0;

            for (int i = 0; i < s.length(); i++) {
                String s1 = s.substring(i, i + 1);
                if (s1.equals(x)) {
                    xCnt++;
                } else {
                    notXCnt++;
                }
                if (xCnt == notXCnt) {
                    answer++;
                    answer += divideString(s.substring(i + 1, s.length()));
                    return answer;
                }
            }

            return ++answer;

        }


        public int solution(String s) {
            int answer = 0;
            answer = divideString(s);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("aaabbaccccabba"));

    }

}
