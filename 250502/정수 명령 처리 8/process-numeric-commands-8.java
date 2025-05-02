import java.util.*;

public class Main {
    static LinkedList<Integer> lst = new LinkedList<>();

    static void pushFront(int n) {
        lst.addFirst(n);
    }

    static void pushBack(int n) {
        lst.addLast(n);
    }

    static int popFront() {
        return lst.pollFirst();
    }

    static int popBack() {
        return lst.pollLast();
    }

    static int size() {
        return lst.size();
    }

    static int empty() {
        return lst.isEmpty() ? 1 : 0;
    }

    static int front() {
        return lst.getFirst();
    }

    static int back() {
        return lst.getLast();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String cmd = input[0];
            ;
            if (cmd.equals("push_front")) {
                int num = Integer.parseInt(input[1]);
                pushFront(num);
            } else if (cmd.equals("push_back")) {
                int num = Integer.parseInt(input[1]);
                pushBack(num);
            } else if (cmd.equals("pop_front")) {
                int m = popFront();
                System.out.println(m);
            } else if (cmd.equals("pop_back")) {
                int m = popBack();
                System.out.println(m);
            } else if (cmd.equals("size")) {
                int m = size();
                System.out.println(m);
            } else if (cmd.equals("empty")) {
                int m = empty();
                System.out.println(m);
            } else if (cmd.equals("front")) {
                int m = front();
                System.out.println(m);
            } else if (cmd.equals("back")) {
                int m = back();
                System.out.println(m);
            }
        }
    }
}











