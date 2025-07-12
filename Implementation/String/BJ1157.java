package Implementation.String;

import java.util.*;


public class Test {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                int val = map.get(c);
                map.put(c, val + 1);
            }

        }
        int maxNum = 0;
        String maxKey = "";
        for (Character key : map.keySet()) {
            int val = map.get(key);
            if (val >= maxNum) {
                maxNum = val;
                maxKey = key.toString();
            }
        }
        for (Character key : map.keySet()) {
            int val = map.get(key);
            if (val == maxNum && !key.toString().equals(maxKey)) {
                maxKey = "?";
                break;
            }
        }

        System.out.println(maxKey.toUpperCase());

    }
}