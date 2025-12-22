package NonLinearDataStructure.Tree.Heap;

import java.io.*;

public class BJ1927 {
    static class PriorityQueue {
        int size;
        int[] heap;

        PriorityQueue() {
            heap = new int[100001];
            size = 0;
        }

        public void push(int n) {
            heap[++size] = n;
            int child = size;
            int parent = child / 2;
            while (parent > 0) {
                if (heap[child] < heap[parent]) {
                    int temp = heap[parent];
                    heap[parent] = heap[child];
                    heap[child] = temp;
                    child = parent;
                    parent = child / 2;
                }
            }
        }

        public int pop() {
            int result = heap[1];
            if (size < 1) {
                return result;
            }
            heap[1] = heap[size--];
            int current = 1;
            while (size >= current * 2) {
                int left = current * 2;
                int right = left + 1;
                int child = left;
                if (heap[left] > heap[right]) {
                    child = right;
                }
                if (heap[current] > heap[child]) {
                    int temp = heap[current];
                    heap[current] = heap[child];
                    heap[child] = temp;
                    current = child;
                }

            }
            return result;


        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue priorityQueue = new PriorityQueue();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                bw.write(String.valueOf(priorityQueue.pop()));
            } else {
                priorityQueue.push(num);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
