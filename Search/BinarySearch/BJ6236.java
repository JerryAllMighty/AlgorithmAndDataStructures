package Search.BinarySearch;

import java.io.*;
import java.util.Arrays;

public class BJ6236 {
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
