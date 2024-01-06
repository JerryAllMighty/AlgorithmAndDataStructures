package BaekJun.Sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            cnt[n]++;
        }

        for (int i = 1; i <= 10000; i++)
            while (cnt[i]-- > 0) {
                bw.write(i + "\n");
            }
        bw.flush();
    }
}

//2024.01.06 새로운 시도, 두 정렬 방법 모두 시간 초과
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = Integer.parseInt(sc.nextLine());
//        ArrayList<Integer> given = new ArrayList<Integer>();
//
//        //정렬
//        //1
//        //Collections.sort(given);
//
//        //2
////        for (int i = 0; i < cnt; i++) {
////            int num = Integer.parseInt(sc.nextLine());
////            int idx = 0;
////            boolean bFlag = false;
////            for (int j = 0; j < given.size(); j++) {
////                idx = j;
////                if (num <= given.get(j)) {
////                    bFlag = true;
////                    break;
////                }
////            }
////            if (!bFlag) {
////                given.add(num);
////            } else {
////                given.add(idx, num);
////            }
////
////        }
//
//
//
//
//        given.forEach(x -> System.out.println(x));
//
//
//        sc.close();
//    }
//}
