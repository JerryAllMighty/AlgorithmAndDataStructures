package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] info = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int k = info[1];
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int[] arr = new int[n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = num++;
        }
        int idx = 0;
        int cnt = 1;
        int changeCnt = 0;
        while (changeCnt < n) {
            if (arr[idx] != 0) {
                if (cnt < k) {
                    cnt++;
                } else {
                    sb.append(arr[idx] + ", ");
                    arr[idx] = 0;
                    changeCnt++;
                    cnt = 1;
                }
            }
            idx = (idx + 1) % n;
        }
        sb.replace(sb.length()-2, sb.length(), ">");
        System.out.println(sb);
    }
}
