import java.util.*;

public class Main {
    static String[] makeSameLength(String a, String b, String c) {
        String[] result = new String[4];
        int lengthA = a.length();
        int lengthB = b.length();
        int lengthC = c.length();
        int maxLength = Math.max(a.length(), b.length());
        maxLength = Math.max(maxLength, c.length());
        if (a.length() < maxLength) {
            for (int i = 0; i < maxLength - lengthA; i++) {
                a = "0" + a;
            }

        }
        if (b.length() < maxLength) {
            for (int i = 0; i < maxLength - lengthB; i++) {
                b = "0" + b;
            }

        }
        if (c.length() < maxLength) {
            for (int i = 0; i < maxLength - lengthC; i++) {
                c = "0" + c;
            }

        }
        result[0] = a;
        result[1] = b;
        result[2] = c;
        result[3] = Integer.toString(maxLength);
        return result;

    }

    static boolean isCarry(String a, String b, String c) {
        boolean result = false;
        String[] sameLengthParams = makeSameLength(a, b, c);
        int maxLength = Integer.parseInt(sameLengthParams[3]);
        String x = sameLengthParams[0];
        String y = sameLengthParams[1];
        String z = sameLengthParams[2];
        for (int i = maxLength - 1; i >= 0; i--) {
            int toAddA = Integer.parseInt(x.substring(i, i + 1));
            int toAddB = Integer.parseInt(y.substring(i, i + 1));
            int toAddC = Integer.parseInt(z.substring(i, i + 1));
            if (toAddA + toAddB + toAddC > 9) {
                return true;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] lst = new String[n];
        for (int i = 0; i < n; i++) {
            String num = sc.nextLine();
            lst[i] = num;
        }
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (!isCarry(lst[i], lst[j], lst[k])) {
                        int sum = Integer.parseInt(lst[i]) + Integer.parseInt(lst[j]) + Integer.parseInt(lst[k]);
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }
        if(answer == Integer.MIN_VALUE){
            System.out.println(-1);

        }else{
            System.out.println(answer);
        }


    }
}









