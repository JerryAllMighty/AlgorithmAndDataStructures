package BaekJun.implementation;

import java.util.*;

public class Main {
    static String[] answers = new String[2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        int[] score = new int[2];

        int currentWinningTeam = 0;
        String winningStartTime = "";
        for (int i = 0; i < cnt; i++) {
            String[] lst = sc.nextLine().split(" ");
            int team = Integer.parseInt(lst[0]);
            String time = lst[1];

            score[team-1]++;

            //현재 이기고 있는 팀을 계산
            //그 팀이 계속 이기고 있다면 첫 이긴 시간을 저장
            //다른 팀이 비기게 된다면 첫 이긴 시간과 비기게 된 시점의 시간 차이를 정답에 합산
            //다른 팀이 확실하게 이기게 된다면 비기게 된 시점의 시간과 이기게 된 시점의 시간을 정답에 확산


        }

        for(String answer : answers){
            System.out.println(answer);
        }


    }
}













