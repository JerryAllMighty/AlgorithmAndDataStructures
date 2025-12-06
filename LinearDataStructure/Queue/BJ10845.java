import com.main.javacompile.Main;

import java.io.*;
public class BJ10845 {
    static class Queue {
        int[] queue;
        int size;
        int capacity;

        public Queue(int size) {
            queue = new int[size];
            capacity = size;
        }

        public void push(int data) {
            queue[size++] = data;
        }

        public int pop() {
            if (size == 0) {
                return -1;
            }
            int num = queue[0];
            for (int i = 1; i < size; i++) {
                queue[i - 1] = queue[i];
            }
            queue[--size] = 0;
            return num;
        }

        public int size() {
            return size;
        }

        public int isEmpty() {
            if (size == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public int front() {
            if (size == 0) {
                return -1;
            }
            return queue[0];

        }

        public int back() {
            if (size == 0) {
                return -1;
            }
            return queue[size - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Main.Queue queue = new Main.Queue(n);
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            if ("push".equals(command[0])) {
                queue.push(Integer.parseInt(command[1]));
                continue;
            } else if ("pop".equals(command[0])) {
                bw.write(String.valueOf(queue.pop()));
            } else if ("size".equals(command[0])) {
                bw.write(String.valueOf(queue.size()));
            } else if ("empty".equals(command[0])) {
                bw.write(String.valueOf(queue.isEmpty()));
            } else if ("front".equals(command[0])) {
                bw.write(String.valueOf(queue.front()));
            } else if ("back".equals(command[0])) {
                bw.write(String.valueOf(queue.back()));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}