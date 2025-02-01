import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            String character = input.substring(i, i + 1);
            if (character.equals("(")) {
                for (int j = i + 1; j < input.length(); j++) {
                    String anotherCharacter = input.substring(j, j + 1);
                    if (anotherCharacter.equals(")")) {
                        answer++;

                    }
                }
            }
        }
        System.out.println(answer);

    }
}









