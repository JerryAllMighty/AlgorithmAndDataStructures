import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String T = input[2];
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (word.startsWith(T)) {
                strList.add(word);
            }
        }
        Collections.sort(strList);
//        System.out.println(strList);
        System.out.println(strList.get(k - 1));

    }
}




