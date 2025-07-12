package Implementation.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Test {
    public static List<Integer> isExist = new ArrayList<>();
    public static void containsCharThenRemove(char c, char[] charList) {
        for (int i = 0; i < charList.length; i++) {
            char eachChar = charList[i];
            if (eachChar == c && !isExist.contains(i)) {
                isExist.add(i);
                break;
            }
        }
    }

    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            containsCharThenRemove(c, b);
        }
        System.out.println((b.length - isExist.size()) + (a.length - isExist.size()));

    }
}