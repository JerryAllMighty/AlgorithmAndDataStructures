package Uncategorized.Programmers;

public class 유연근무제 {

    //TODO : https://school.programmers.co.kr/learn/courses/30/lessons/388351?language=java >> 에서 틀린 테스트 케이스 정리하기
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        int n = schedules.length;
        for (int i = 0; i < n; i++) {
            int[] timelog = timelogs[i];
            int timeLimit = schedules[i] + 10;
            //10분 더한 시간을 날짜형식에 맟추어서 변환
            if ((timeLimit % 100) >= 60) {
                int hour = (((timeLimit/100) + 1) *  100);
                int minute = (timeLimit % 100) % 60;
                timeLimit = hour + minute;
            }
            for (int j = 0; j < timelog.length; j++) {
                if ((startday + j) != 6 && (startday + j) != 7
                        && timeLimit < timelog[j]) {
                    answer--;
                    break;
                }
            }

        }
        return answer;
    }
}
