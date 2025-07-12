package Implementation.Math;

import java.util.*;


public class BJ1094 {
    public static int[] sum(List<Integer> lst) {
        int[] result = new int[3];
        int totalSum = 0;
        int shortest = 64;
        int shortestIdx = 0;
        for (int i = 0; i < lst.size(); i++) {
            int num = lst.get(i);
            totalSum += num;
            if (num < shortest) {
                shortest = num;
                shortestIdx = i;
            }
        }
        result[0] = totalSum;
        result[1] = shortest;
        result[2] = shortestIdx;
        return result;

    }

    public static int cut(int x) {
        List<Integer> lst = new ArrayList<>();
        lst.add(64);
        //지민이가 가지고 있는 막대의 길이를 모두 더한다. 처음에는 64cm 막대 하나만 가지고 있다.
        int[] sumResult = sum(lst);
        int totalSum = sumResult[0];
        int shortest = sumResult[1];
        int shortestIdx = sumResult[2];

        // 64 > 32 > 16 16 > 16 8 8 > 16 8 > 16 4 4 > 16 4 2 2 > 16 4 2 1 1
        while (totalSum != x) {
            //이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
            if (totalSum > x) {
                //가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
                lst.remove(shortestIdx);
                int half = shortest / 2;
                lst.add(half);
                lst.add(half);
                //만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
                if (totalSum - half >= x) {
                    lst.remove(lst.size()-1);
                }
            }
            sumResult = sum(lst);
            totalSum = sumResult[0];
            shortest = sumResult[1];
            shortestIdx = sumResult[2];
        }

        return lst.size();
    }

    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = cut(x);
        System.out.println(result);

    }
}


