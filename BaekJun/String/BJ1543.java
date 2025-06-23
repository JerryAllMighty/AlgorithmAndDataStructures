import java.util.*;


public class Test {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int idx = 0;
        int answer = 0;
        while (idx + b.length() <= a.length()) {
            String s = a.substring(idx, idx + b.length());
            if (s.equals(b)) {
                answer++;
                idx += b.length();
            } else {
                idx++;
            }
        }
        System.out.println(answer);


    }
}