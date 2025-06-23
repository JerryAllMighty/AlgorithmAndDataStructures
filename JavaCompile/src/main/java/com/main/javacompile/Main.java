package com.main.javacompile;

import java.util.*;

public class Main {
    //변수 선언
    static ListIterator<String> it;
    static List<String> lst = new ArrayList<>();

    static void fn(String[] encryptMsgArray) {
        String encryptMsg = encryptMsgArray[0];

        if (encryptMsg.equals("L")) {
            if (it.hasPrevious()) {
                it.previous();
            }
        } else if (encryptMsg.equals("R")) {
            if (it.hasNext()) {
                it.next();
            }
        } else if (encryptMsg.equals("D")) {
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
        } else if (encryptMsg.equals("P")) {
            if (encryptMsgArray.length > 1) {
                it.add(encryptMsgArray[1].toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cntList = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = cntList[0];
        int m = cntList[1];

        //변수 초기화
        String[] targetMsg = sc.nextLine().split("");
        for (int i = 0; i < n; i++) {
            lst.add(targetMsg[i]);
        }
        it = lst.listIterator(n);
        for (int i = 0; i < m; i++) {
            String[] encryptMsgArray = sc.nextLine().split(" ");
            fn(encryptMsgArray);
        }

        lst.forEach(x -> System.out.print(x + ""));
    }
}
