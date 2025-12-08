package LinearDataStructure.Stack;

import java.io.*;

public class BJ10828 {
    static class Stack {
        int[] arr;
        int topIndex;

        Stack(int capacity) {
            arr = new int[capacity];
            topIndex = -1;
        }

        public void push(int num) {
            arr[++topIndex] = num;
        }

        public int pop() {
            if (topIndex == -1) {
                return -1;
            }
            return arr[topIndex--];
        }

        public int size() {
            return topIndex + 1;
        }

        public int empty() {
            return topIndex == -1 ? 1 : 0;
        }

        public int top() {
            if (topIndex == -1) {
                return -1;
            }
            return arr[topIndex];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack(n);
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            if ("push".equals(command[0])) {
                stack.push(Integer.parseInt(command[1]));
            } else if ("pop".equals(command[0])) {
                bw.write(String.valueOf(stack.pop()) + "\n");
            } else if ("size".equals(command[0])) {
                bw.write(String.valueOf(stack.size()) + "\n");
            } else if ("empty".equals(command[0])) {
                bw.write(String.valueOf(stack.empty()) + "\n");
            } else {
                bw.write(String.valueOf(stack.top()) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
