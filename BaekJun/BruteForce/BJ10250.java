//package BaekJun.BruteForce;
//
//import java.util.Scanner;
//
//public class BJ10250 {
//    public static void Test(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = Integer.parseInt(sc.nextLine());
//        int[] answers = new int[cnt];
//
//        for (int i = 0; i < cnt; i++) {
//            String[] info = sc.nextLine().split(" ");
//            int h = Integer.parseInt(info[0]);
//            int w = Integer.parseInt(info[1]);
//            int n = Integer.parseInt(info[2]);
//
//            int floor = (n % h);
//            int room = (n / h)+1;
//            if(floor == 0){
//                floor = h;
//                room -= 1;
//            }
//            answers[i] = (floor * 100) + (room);
//        }
//
//        for (int s : answers) {
//            System.out.println(s);
//        }
//    }
//
//}
