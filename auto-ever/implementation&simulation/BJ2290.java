/*
 * 2026 0331  개인 문제 풀이 통과 못 함
 * import java.io.*;
import java.util.*;

public class Main {
    static final String EMPTY_STRING = " ";
    static int s;
    static StringBuilder stringBuilder = new StringBuilder();

    static void makeString(char c, String type) {
        switch (c) {
            case '1':
                stringBuilder.append(makeOne(type));
            case '2':
                stringBuilder.append(makeTwo(type));
            default:
//                makeWall();
        }
    }

    static String makeOne(String type) {
        StringBuilder stringBuilder = new StringBuilder();
        if ("head".equals(type)) {
            for (int i = 0; i < s + 2; i++) {
                stringBuilder.append(EMPTY_STRING);
            }
            stringBuilder.append("\n");

        } else {
            for (int i = 0; i < s; i++) {
                for (int j = 0; j < s + 1; j++) {
                    stringBuilder.append(EMPTY_STRING);
                }
                stringBuilder.append("|");
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    static String makeTwo(String type) {
        StringBuilder stringBuilder = new StringBuilder();
        if ("head".equals(type)) {
            stringBuilder.append(EMPTY_STRING);
            for (int i = 0; i < s; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append(EMPTY_STRING);
            stringBuilder.append("\n");

        } else {
            for (int i = 0; i < s; i++) {
                for (int j = 0; j < s + 1; j++) {
                    stringBuilder.append(EMPTY_STRING);
                }
                stringBuilder.append("|");
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    static void addNewString(String n) {
        //head
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            stringBuilder.append(makeString(c, "head"));
            stringBuilder.append(makeString(c, "upper"));
            stringBuilder.append(makeString(c, "head"));
            stringBuilder.append(makeString(c, "lower"));
            stringBuilder.append(makeString(c, "head"));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        s = Integer.parseInt(stringTokenizer.nextToken());
        String n = stringTokenizer.nextToken();

        addNewString(n);

        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}






 */