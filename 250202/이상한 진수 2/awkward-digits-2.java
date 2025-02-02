import java.util.*;

public class Main {
    static int toNumber(String binary) {
        int result = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int twoToTheNumberOf = 1;
            //3 2 1 0
            // 0 1 2 3
            for (int j = i; j < binary.length() - 1; j++) {
                twoToTheNumberOf *= 2;
            }
            result += twoToTheNumberOf * Integer.parseInt(binary.substring(i, i + 1));

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < a.length(); i++) {
            String replaceA = a.charAt(i) == '0' ? a.substring(0,i) + "1" + a.substring(i+1): a.substring(0,i) + "0" + a.substring(i+1);
            int num = toNumber(replaceA);
            answer = Math.max(answer, num);
        }
        System.out.println(answer);


    }
}









