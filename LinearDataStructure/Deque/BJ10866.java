package LinearDataStructure.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ10866 {
    static class Deque {
        List<Integer> lst = new ArrayList<>();

        void pushFront(int n) {
            lst.add(0, n);
        }

        void pushBack(int n) {
            lst.add(n);
        }

        int popFront() {
            if (lst == null || lst.isEmpty()) {
                return -1;
            }
            int num = lst.get(0);
            lst.remove(0);
            return num;
        }

        int popBack() {
            if (lst == null || lst.isEmpty()) {
                return -1;
            }
            int num = lst.get(lst.size() - 1);
            lst.remove(lst.size() - 1);
            return num;
        }

        int size() {
            return lst.size();
        }

        int empty() {
            return lst.isEmpty() ? 1 : 0;
        }

        int front() {
            if (lst == null || lst.isEmpty()) {
                return -1;
            } else {
                return lst.get(0);
            }
        }

        int back() {
            if (lst == null || lst.isEmpty()) {
                return -1;
            } else {
                return lst.get(lst.size() - 1);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque deque = new Deque();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                deque.pushFront(num);
            } else if (cmd.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                deque.pushBack(num);
            } else if (cmd.equals("pop_front")) {
                System.out.println(deque.popFront());
            } else if (cmd.equals("pop_back")) {
                System.out.println(deque.popBack());
            } else if (cmd.equals("size")) {
                System.out.println(deque.size());
            } else if (cmd.equals("empty")) {
                System.out.println(deque.empty());
            } else if (cmd.equals("front")) {
                System.out.println(deque.front());
            } else if (cmd.equals("back")) {
                System.out.println(deque.back());
            }
        }
    }
}
