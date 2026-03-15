/*
 * 2026.03.15 개인 풀이 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static class Deque {
        private int[] array;
        private int capacity;
        private int size;

        public Deque(int capacity) {
            this.array = new int[capacity];
            this.capacity = capacity;
            this.size = 0;
        }

        private void increaseCapacity() {
            int[] newArray = new int[++capacity];
            for (int i = 0; i < capacity; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        public void pushFront(int number) {
            if (size++ == capacity) {
                increaseCapacity();
            }
            int[] newArray = new int[capacity];
            for (int i = 0; i < size(); i++) {
                newArray[i + 1] = array[i];
            }
            newArray[0] = number;
            array = newArray;
        }

        public void pushBack(int number) {
            if (size++ == capacity) {
                increaseCapacity();
            }
            array[size - 1] = number;
        }

        public int popFront() {
            if (empty() == 1) {
                return -1;
            }
            //pop
            int result = array[0];
            for (int i = 1; i < size(); i++) {
                array[i - 1] = array[i];
            }
            array[size - 1] =0;
            size--;
            return result;
        }

        public int popBack() {
            if (empty() == 1) {
                return -1;
            }
            //pop
            int result = array[size - 1];
            array[size - 1] = 0;
            size--;
            return result;
        }

        public int size() {
            return size;
        }

        public int empty() {
            return size == 0 ? 1 : 0;
        }

        public int front() {
            if (empty() == 1) {
                return -1;
            }
            return array[0];
        }

        public int back() {
            if (empty() == 1) {
                return -1;
            }
            return array[size() - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque deque = new Deque(n);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            String command = stringTokenizer.nextToken();
            if ("push_front".equals(command)) {
                int number = Integer.parseInt(stringTokenizer.nextToken());
                deque.pushFront(number);
            } else if ("push_back".equals(command)) {
                int number = Integer.parseInt(stringTokenizer.nextToken());
                deque.pushBack(number);
            } else if ("pop_front".equals(command)) {
                int number = deque.popFront();
                stringBuilder.append(String.valueOf(number));
                stringBuilder.append("\n");
            } else if ("pop_back".equals(command)) {
                int number = deque.popBack();
                stringBuilder.append(String.valueOf(number));
                stringBuilder.append("\n");
            } else if ("size".equals(command)) {
                int number = deque.size();
                stringBuilder.append(String.valueOf(number));
                stringBuilder.append("\n");
            } else if ("empty".equals(command)) {
                int number = deque.empty();
                stringBuilder.append(String.valueOf(number));
                stringBuilder.append("\n");
            } else if ("front".equals(command)) {
                int number = deque.front();
                stringBuilder.append(String.valueOf(number));
                stringBuilder.append("\n");
            } else if ("back".equals(command)) {
                int number = deque.back();
                stringBuilder.append(String.valueOf(number));
                stringBuilder.append("\n");
            }
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}





 */