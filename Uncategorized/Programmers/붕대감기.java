package Uncategorized.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 붕대감기 {
    static class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
            int answer = health;

            int recoveryTotalTime = bandage[0];
            int recoveryPerSec = bandage[1];
            int bonusRecovery = bandage[2];

            int lastAttackTime = attacks[attacks.length - 1][0];

            int time = 0;
            int continuousTime = 0;

            while (++time <= lastAttackTime) {
                boolean isAttacked = false;
                //공격시간일 때 공격
                for (int[] i : attacks) {
                    if (i[0] == time) {
                        answer -= i[1];
                        //체력이 0 이하면 죽음
                        if (answer <= 0) {
                            return -1;
                        }

                        //연속시간 0
                        continuousTime = 0;
                        //기술 취소
                        isAttacked = true;
                        break;
                    }
                }
                if (!isAttacked) {
                    //회복
                    answer += recoveryPerSec;
                    continuousTime++;
                    //연속 붕대 감기 추가 회복
                    if (continuousTime == recoveryTotalTime) {
                        answer += bonusRecovery;
                        //기술이 끝나면 붕대감기 다시 사용
                        continuousTime = 0;
                    }
                    //최대 회복치 넘지 못함
                    if (answer >= health) {
                        answer = health;
                    }
                }
            }
            return answer;
        }

    }

    public static void Test(String[] args) {
        Solution solution = new Solution();
        int[] bandage = {3, 2, 7};
        int health = 20;
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(solution.solution(bandage, health, attacks));

    }
}
