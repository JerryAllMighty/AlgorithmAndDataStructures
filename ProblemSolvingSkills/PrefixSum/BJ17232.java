package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ17232 {

    static String[][] boards;
    static int n;
    static int m;
    static int t;
    static int k;
    static int a;
    static int b;

    static int countLife(int r, int c) {

    }

    static void lifeEveryHour() {
        while (t-- > 0) {
//    생존 : 만약 현재 칸에 생명이 있고, 주위에 a개 이상 b개 이하의 생명이 있다면 현재 칸의 생명은 다음 단계에 살아남는다.
//    고독 : 만약 현재 칸에 생명이 있고, 주위에 a개 미만의 생명이 있다면 현재 칸의 생명은 외로워서 죽는다.
//    과밀 : 만약 현재 칸에 생명이 있고, 주위에 b개 초과의 생명이 있다면 현재 칸의 생명은 과밀로 죽는다.
//    탄생 : 만약 현재 칸에 생명이 없고, 주위에 a개 초과 b개 이하의 생명이 있다면 다음 단계에서 현재 칸에 생명이 생긴다.
            List<int[]> newLifeArr = new ArrayList<>();
            List<int[]> surviveLifeArr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (surviveLifeArr.contains(new int[]{i, j})) {

                    }
                    if (!newLifeArr.isEmpty()) {
                        int[] rc = newLifeArr.get(0);
                        newLifeArr.remove(0);
                        boards[rc[0]][rc[1]] = "*";
                    }
                    if ("*".equals(boards[i][j])) {
                        int countLife = countLife(i, j);
                        if (countLife >= a && countLife <= b) {
                            surviveLifeArr.add(new int[]{i, j});
                        } else if (countLife < a) {
                            boards[i][j] = ".";
                        } else if (countLife > b) {
                            boards[i][j] = ".";
                        } else if (countLife > a && countLife <= b) {
                            newLifeArr.add(new int[]{i, j});
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = info[0];
        m = info[1];
        t = info[2];
        boards = new String[n][m];

        int[] infos = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        k = infos[0];
        a = infos[1];
        b = infos[2];

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split("");
            boards[i] = row;
        }

        lifeEveryHour();


        bw.flush();
        bw.close();
        br.close();
    }
}
