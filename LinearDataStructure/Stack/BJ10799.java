package LinearDataStructure.Stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
/*
 * 2026.02.28 개인 문제 풀이, 시간 초과
 * import java.io.*;
import java.util.Stack;

public class Main {
    static String[] arr;

    static int countLaser(int left, int right) {
        int result = 0;
        for (int i = left + 1; i < right - 1; i++) {
            String current = arr[i];
            String next = arr[i + 1];
            if ("(".equals(current) && ")".equals(next)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        arr = br.readLine().split("");
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while (index < arr.length) {
            String current = arr[index];

            if(index + 1 < arr.length){
                String next = arr[index + 1];
                //skip laser
                if ("(".equals(current) && ")".equals(next)) {
                    index += 2;
                    continue;
                }
            }

            if ("(".equals(current)) {
                stack.add(index);
            } else if (")".equals(current)) {
                int left = stack.pop();
                int right = index;
                int laserCount = countLaser(left, right);
                answer += laserCount + 1;
            }
            index++;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
 */

public class BJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] info = br.readLine().split("");
        int[] lines = new int[info.length];
        Deque<String[]> deque = new ArrayDeque<>();
        for (int i = 0; i < info.length - 1; i++) {
            if ("(".equals(info[i]) && ")".equals(info[i + 1])) {

            }
            if ("(".equals(info[i])) {

                deque.add(new String[]{"(", String.valueOf(i)});
            } else {
                String[] values = deque.pollLast();
                for (int j = Integer.parseInt(values[1]); j <= i; j++) {
                    lines[j] += 1;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
