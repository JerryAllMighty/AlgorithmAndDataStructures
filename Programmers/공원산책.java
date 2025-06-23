package Programmers;

public class 공원산책 {

    public static class Solution {
        public static int[] solution(String[] park, String[] routes) {
            int[] answer = new int[2];
            int rLen = park.length;
            int cLen = park[0].length();
            //row
            int w = 0;
            //col
            int h = 0;

            for (int i = 0; i < park.length; i++) {
                String s = park[i];
                for (int j = 0; j < s.length(); j++) {
                    Character eachStr = s.charAt(j);
                    if (eachStr.equals('S')) {
                        w = j;
                        h = i;
                    }
                }

            }
            for (String s : routes) {
                char[] chars = s.toCharArray();
                char direction = chars[0];
                int amount = Integer.parseInt(Character.toString(chars[2]));
                if (direction == 'N') {
                    boolean hasMetJang = false;
                    while (amount-- > 0) {
                        h--;
                        if (h < 0 || park[h].charAt(w) == 'X') {
                            hasMetJang = true;
                            break;
                        }
                    }
                    if (hasMetJang) {
                        h += (Integer.parseInt(Character.toString(chars[2])) - amount);
                        continue;
                    }
                } else if (direction == 'S') {
                    boolean hasMetJang = false;
                    while (amount-- > 0) {
                        h++;
                        if (h >= rLen || park[h].charAt(w) == 'X') {
                            hasMetJang = true;
                            break;
                        }
                    }
                    if (hasMetJang) {
                        h -= (Integer.parseInt(Character.toString(chars[2])) - amount);
                        continue;
                    }
                } else if (direction == 'W') {
                    boolean hasMetJang = false;
                    while (amount-- > 0) {
                        w--;
                        if (w < 0 || park[h].charAt(w) == 'X') {
                            hasMetJang = true;
                            break;
                        }
                    }
                    if (hasMetJang) {
                        w += (Integer.parseInt(Character.toString(chars[2])) - amount);
                        continue;
                    }
                } else if (direction == 'E') {
                    boolean hasMetJang = false;
                    while (amount-- > 0) {
                        w++;
                        if (w >= cLen || park[h].charAt(w) == 'X') {
                            hasMetJang = true;
                            break;
                        }
                    }
                    if (hasMetJang) {
                        w -= (Integer.parseInt(Character.toString(chars[2])) - amount);
                        continue;
                    }
                }
            }
            //주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
            //      주어진 방향으로 이동 중 장애물을 만나는지 확인합니다
            //위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
            answer[0] = h;
            answer[1] = w;
            return answer;
        }

    }


    public static void Test(String[] args) {
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
        int[] aa = Solution.solution(park, routes);
        for (int a : aa) {
            System.out.println(a);
        }
    }
}
