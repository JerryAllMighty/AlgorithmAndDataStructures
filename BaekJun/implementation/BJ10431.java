package BaekJun.implementation;

import java.util.Scanner;

class BJ10431
{
    public static void Test (String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while (P-- > 0) {
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++)
                h[i] = sc.nextInt();

            int cnt = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (h[j] > h[i]) {
                        int myH = h[i];
                        // 뒤로 한 칸씩 밀기
                        for (int k = i; k > j; k--) {
                            h[k] = h[k - 1];
                            cnt++;
                        }
                        h[j] = myH;
                        break;
                    }
                }
            }
            System.out.println(T + " " + cnt);
        }
    }
}

//2023.12.25 다른 풀이도 추가
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import static java.lang.Math.max;
//
//public class com.Test.javacompiler.Test {
//    public static void Test(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        sc.nextLine();
//        ArrayList<String> answerList = new ArrayList<String>();
//
//        for (int i = 1; i < cnt + 1; i++) {
//            int answer = 0;
//            String[] each = sc.nextLine().split(" ");
//            ArrayList<Integer> tempList = new ArrayList<Integer>();
//
//            for (int j = 1; j < each.length; j++) {
//                //비교 숫자
//                int cmp = Integer.valueOf(each[j]);
//                int idx = 0;
//                for (int k = 0; k < tempList.size(); k++) {
//                    int tempNum = tempList.get(k);
//                    if (cmp < tempNum) {
//                        answer += tempList.size() - k;
//                        idx = k;
//                        break;
//                    } else {
//                        idx = k + 1;
//                    }
//                }
//                tempList.add(idx, cmp);
//
//            }
//            answerList.add(Integer.toString(i) + " " + answer);
//        }
//
//        for (int i = 0; i < answerList.size(); i++) {
//            System.out.println(answerList.get(i));
//        }
//
//        sc.close();
//    }
//}