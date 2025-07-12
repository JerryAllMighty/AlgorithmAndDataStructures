package CompleteSearch.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class BJ2309
{
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int cur = arr[i];
                    for (int k = i; k > j; k--)
                        arr[k] = arr[k - 1];
                    arr[j] = cur;
                    break;
                }
            }
        }
    }

    public static void Test (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] h = new int[9];
        for (int i = 0; i < 9; i++)
            h[i] = sc.nextInt();

        // Arrays.sort(h);
        sort(h);

        int sum = Arrays.stream(h).sum();
        boolean find = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++)
                if (sum - h[i] - h[j] == 100) {
                    h[i] = h[j] = -1;
                    find = true;
                    break;
                }
            if (find) break;
        }

        for (int i = 0; i < 9; i++)
            if (h[i] > 0)
                System.out.println(h[i]);
    }
}

//2023.01.02
//public static void Test(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    ArrayList<Integer> given = new ArrayList<>();
//
//    for (int i = 0; i < 9; i++) {
//        int num = sc.nextInt();
//        given.add(num);
//    }
//    Collections.sort(given);
//
//    for (int i = 0; i < 9; i++) {
//        ArrayList<Integer> answers = new ArrayList<>();
//        int current = given.get(i);
//        answers.add(current);
//        for (int j = i + 1; j < 9; j++) {
//            if (current + given.get(j) < 100) {
//                answers.add(given.get(j));
//                current += given.get(j);
//            } else if (current + given.get(j) > 100) {
//                answers.remove(given.get(j-1));
//                current -= given.get(j-1);
//
//            } else {
//                if (answers.size() == 7) {
//                    answers.forEach(x -> System.out.println(x.intValue()));
//                    return;
//                } else {
//                    break;
//                }
//
//            }
//        }
//    }
//
//
//    sc.close();
//}