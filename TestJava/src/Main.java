import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] nums = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            int eachNum = sc.nextInt();
            nums[i] = eachNum;
        }

        //세 삼각수의 합이 배열의 인덱스
        int[] triNums = new int[1000];
        Arrays.fill(triNums, 0);

        for (int j : nums) {
            int first = 1;
            int second = 1;
            int third = 1;

            int idx = 1;
            while (first + second + third < j) {

                if (triNums[first + second + third] == 0) {
                    triNums[first + second + third] = 1;
                } else {
                    if (third == second && second == first) {
                        idx++;
                        third = (idx * (idx + 1)) / 2;
                    }else if (second == first && second != third) {
                        second = (idx * (idx + 1)) / 2;
                    }else if (second == third && second != first) {
                        first = (idx * (idx + 1)) / 2;
                    }

                }

            }


            System.out.println(triNums[j]);
        }


        sc.close();
    }
}