package BaekJun.Math;

import java.util.Scanner;

public class BJ10158 {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int T = sc.nextInt();

        int currentX = (T + P) % (2 * W);
        int currentY = (T + Q) % (2 * H);
        if(currentX > W) currentX = 2 * W - currentX;
        if(currentY > H) currentY = 2 * H - currentY;

        System.out.println(currentX + " " + currentY);
        sc.close();
    }
}
