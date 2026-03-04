/*
 * 2026.06.04 개인 문제 풀이, 통과 완료
 * import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            queue.add(number);
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int nextStackAddNumber = 1;
        boolean isExtractable = true;
        while (!queue.isEmpty() && isExtractable) {
            int targetNumber = queue.peek();
            if(stack.isEmpty()){
                stack.add(nextStackAddNumber++);
                stringBuilder.append("+\n");
            }else{
                int nextStackPopNumber = stack.peek();
                if (nextStackPopNumber == targetNumber) {
                    stack.pop();
                    queue.poll();
                    stringBuilder.append("-\n");
                } else if (targetNumber < nextStackPopNumber) {
                    isExtractable = false;
                } else {
                    stack.add(nextStackAddNumber++);
                    stringBuilder.append("+\n");
                }
            }
        }

        if (!isExtractable) {
            bw.write("NO");
        } else {
            bw.write(stringBuilder.toString());
        }
        bw.flush();
        bw.close();
    }
}
 */