package BaekJun.Sort;

import java.util.Scanner;

public class BJ23881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] given = sc.nextLine().split(" ");
        String[] stringList = sc.nextLine().split(" ");

        int listSize = Integer.parseInt(given[0]);
        int idx = Integer.parseInt(given[1]);


        int[] intList = new int[listSize];
        int listIdx = 0;
        for (String s : stringList) {
            intList[listIdx++] = Integer.parseInt(s);
        }
        int changedCnt = 0;

        for (int i = listSize - 1; i >= 0; i--) {
            int min = intList[i];
            int changeIdx = 10001;
            for (int j = i - 1; j >= 0; j--) {
                int cmp = intList[j];
                if (cmp > min) {
                    min = cmp;
                    changeIdx = j;
                }

            }
            if (changeIdx != 10001) {
                int tmp = intList[i];
                intList[i] = min;
                intList[changeIdx] = tmp;
                changedCnt++;
                if (changedCnt == idx) {
                    System.out.println(Math.min(min, tmp) + " " + Math.max(min, tmp));
                    break;
                }
            }
        }
        if(changedCnt < idx){
            System.out.println(-1);
        }
    }

}
