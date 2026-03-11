/*
 * 20260311 복기 떄 통과
 * import java.io.*;
import java.util.*;

public class Main {
    static int minimun = Integer.MAX_VALUE;
    static int maximum = Integer.MIN_VALUE;
    static int[] numbers;
    static int[] operands;

    static void dfs(int totalSum, int targetNumberIndex) {
        if (targetNumberIndex == numbers.length) {
            minimun = Math.min(minimun, totalSum);
            maximum = Math.max(maximum, totalSum);
            return;
        }
        for (int j = 0; j < 4; j++) {
            int operand = operands[j];
            if (operand > 0) {
                operands[j]--;
                if (j == 0) {
                    dfs(totalSum + numbers[targetNumberIndex], targetNumberIndex + 1);
                } else if (j == 1) {
                    dfs(totalSum - numbers[targetNumberIndex], targetNumberIndex + 1);
                } else if (j == 2) {
                    dfs(totalSum * numbers[targetNumberIndex], targetNumberIndex + 1);
                } else if (j == 3) {
                    dfs(totalSum / numbers[targetNumberIndex], targetNumberIndex + 1);
                }
                operands[j]++;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(stringTokenizer.nextToken());
            numbers[i] = number;
        }

        StringTokenizer operandStringTokenizer = new StringTokenizer(br.readLine());
        operands = new int[4];
        for (int i = 0; i < 4; i++) {
            int operand = Integer.parseInt(operandStringTokenizer.nextToken());
            operands[i] = operand;
        }

        dfs(numbers[0], 1);

        bw.write(String.valueOf(maximum) + "\n");
        bw.write(String.valueOf(minimun));

        bw.flush();
        bw.close();
    }
}



 */