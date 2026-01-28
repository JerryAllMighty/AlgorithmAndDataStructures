package Search.BinarySearch;

import java.io.*;
import java.util.Arrays;

public class BJ6236 {
    /*
    * 2026.01.28 개인 문제 풀이, 틀림
    *  static int[] spendings;

    static int binarySearch(int m) {
        int l = 0;
        int r = 100000;
        int mid = (l + r) / 2;
        while (l <= r) {
            mid = (l + r) / 2;
            int count = countMoneyDraw(mid);
            if (count <= m) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return mid;

    }

    static int countMoneyDraw(int money) {
        int count = 1;
        int index = 0;
        int currentMoney = money;
        while (index < spendings.length) {
            int moneyToSpend = spendings[index];
            if (moneyToSpend <= currentMoney) {
                currentMoney -= moneyToSpend;
            } else {
                if (money < moneyToSpend) {
                    int mod = moneyToSpend / money;
                    count += ++mod;
                    currentMoney = (money * mod) - moneyToSpend;
                } else {
                    count++;
                    currentMoney = money - moneyToSpend;
                }

            }
            index++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        spendings = new int[n];
        for (int i = 0; i < n; i++) {
            spendings[i] = Integer.parseInt(br.readLine());
        }
        int money = binarySearch(m);
        bw.write(String.valueOf(money));
        bw.flush();
        bw.close();
        br.close();
    }
     */
    static int[] budgets;

    static int getCount(int money) {
        int count = 1;
        int currentMoney = money;
        for (int budget : budgets) {
            if (budget < currentMoney) {
                currentMoney -= budget;
                //정확히 M번을 맞추기 위해서 남은 금액이 그날 사용할 금액보다 많더라도 남은 금액은 통장에 집어넣고 다시 K원을 인출할 수 있다.
            } else {
                currentMoney = money;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        budgets = new int[n];
        for (int i = 0; i < n; i++) {
            int budget = Integer.parseInt(br.readLine());
            budgets[i] = budget;
        }

        Arrays.sort(budgets);

        int l = 1;
        int r = budgets[n - 1];
        int mid = (l + r) / 2;
        while (l <= r) {
            int count = getCount(mid);
            if (count <= m) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            mid = (l + r) / 2;
        }

        bw.write(Integer.toString(mid));
        bw.flush();
        bw.close();
        br.close();
    }
}

//2025.11.07 다시 문제 풀이 (반례 통과 못함)

//static int[] budgets;
//static int m;
//
//static boolean isPossible(int draw) {
//    int currentMoney = draw;
//    int count = 1;
//    for (int budget : budgets) {
//        if (budget > draw) {
//            return false;
//        }
//        if (budget < currentMoney) {
//            currentMoney -= budget;
//        } else {
//            currentMoney = draw - budget;
//            count++;
//        }
//    }
//    return count >= m;
//}
//
//public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//    int n = input[0];
//    m = input[1];
//
//    budgets = new int[n];
//    for (int i = 0; i < n; i++) {
//        int num = Integer.parseInt(br.readLine());
//        budgets[i] = num;
//    }
//
//    int l = 1;
//    int r = n * 10000;
//    int mid = (l + r) / 2;
//    int answer = Integer.MAX_VALUE;
//    while (l <= r) {
//        if (!isPossible(mid)) {
//            l = mid + 1;
//        } else {
//            answer = Math.min(answer, mid);
//            r = mid - 1;
//        }
//        mid = (l + r) / 2;
//    }
//
//    bw.write(Integer.toString(answer));
//    bw.flush();
//    bw.close();
//    br.close();
//}
