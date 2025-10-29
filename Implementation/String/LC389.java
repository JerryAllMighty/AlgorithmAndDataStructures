package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LC389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            t = t.replaceFirst(str, "");
        }

        System.out.println( t.charAt(0));


    }
}

//2025.10.29 다른 사람 문제 풀이 추가
//public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    String s = br.readLine();
//    String t = br.readLine();
//
//    char c = 0;
//    for(char cs : s.toCharArray()) c ^= cs;
//    for(char ct : t.toCharArray()) c ^= ct;
//    System.out.println(c);
//}
