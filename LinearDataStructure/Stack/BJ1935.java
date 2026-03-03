/*
* 2026.03.03 개인 문제 풀이, 통과 완료
* import java.io.*;
import java.util.Stack;

public class Main {
    static int[] numbers;

    static double calculate(char operand, double operandTargetA, double operandTargetB) {
        if (operand == '+') {
            return operandTargetA + operandTargetB;
        } else if (operand == '-') {
            return operandTargetA - operandTargetB;
        } else if (operand == '*') {
            return operandTargetA * operandTargetB;
        }
        return operandTargetA / operandTargetB;
    }

    static double convertToInteger(char c) {
        return numbers[(int) c - 'A'];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[] expression = br.readLine().toCharArray();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
        }
        Stack<Double> stack = new Stack<>();
        for (char c : expression) {
            if (Character.isAlphabetic(c)) {
                double convertedInteger = convertToInteger(c);
                stack.add(convertedInteger);
            } else {
                double operandTargetA = stack.pop();
                double operandTargetB = stack.pop();
                double calculatedResult = calculate(c, operandTargetB, operandTargetA);
                stack.add(calculatedResult);
            }
        }
        double answer = stack.pop();
        bw.write(String.format("%.2f", answer));
        bw.flush();
        bw.close();
    }
}
 */
