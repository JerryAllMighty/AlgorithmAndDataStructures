import java.util.Scanner;


public class BJ2744 {
    public static void BJ2744(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            int toAscii = (int) c;
            if (toAscii >= 97) {
                input[i] = (char)(toAscii - 32);
            }else if (toAscii >= 65 && toAscii < 97){
                input[i] = (char)(toAscii + 32);
            }
        }
        System.out.println(input);

    }
}