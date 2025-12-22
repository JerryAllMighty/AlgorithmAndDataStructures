package NonLinearDataStructure.Tree.Heap;

import java.io.*;

public class BJ11279 {

    static class PriorityQueue {
        int[] heap;
        int size;

        public PriorityQueue(int n) {
            heap = new int[n];
        }

        public void insert(int n) {
            heap[size++] = n;
            //가장 큰 값이 위쪽에 위치
            int child = size;
            int parent = (child - 1) / 2;
            while (parent > 0) {
                if (heap[child] > heap[parent]) {
                    int temp = heap[parent];
                    heap[parent] = heap[child];
                    heap[child] = temp;
                    child = parent;
                    parent = (child - 1) / 2;
                }
            }
        }

        public int pop() {
            int num = heap[0];
            if (--size > 0) {
                int left = 1;
                int right = left + 1;
                if (heap[left] > heap[right]) {
                    heap[0] = heap[left];
                } else {
                    heap[0] = heap[right];
                }
//                while () {
//                    if () {
//
//                    }
//                }
            }
            return num;


        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue priorityQueue = new PriorityQueue(n);
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                priorityQueue.pop();
            } else {
                priorityQueue.insert(num);
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
