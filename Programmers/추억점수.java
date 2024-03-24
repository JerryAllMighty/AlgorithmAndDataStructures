package Programmers;

public class 추억점수 {
    public static class Solution {
        public static int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            for (int i = 0; i < photo.length; i++) {
                int ans = 0;
                String[] each = photo[i];
                for (int j = 0; j < each.length; j++) {
                    String cmp = each[j];
                    for (int k = 0; k < name.length; k++) {
                        String eachName = name[k];
                        if (eachName.equals(cmp)) {
                            ans += yearning[k];
                            break;
                        }
                    }
                }
                answer[i] = ans;
            }
            return answer;
        }

    }


    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};
        int[] a = Solution.solution(name, yearning, photo);
        for (int b : a) {
            System.out.println(b);
        }


    }
}





