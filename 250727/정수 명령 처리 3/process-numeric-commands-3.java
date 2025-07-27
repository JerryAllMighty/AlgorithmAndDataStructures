
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Deque dq = new ArrayDeque();
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().split(" ");
            String cmd = info[0];
            if (cmd.equals("push_front")) {
                dq.addFirst(info[1]);
            } else if (cmd.equals("push_back")) {
                dq.addLast(info[1]);
            } else if (cmd.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            } else if (cmd.equals("pop_back")) {
                System.out.println(dq.pollLast());
            } else if (cmd.equals("size")) {
                System.out.println(dq.size());
            } else if (cmd.equals("empty")) {
                System.out.println(dq.isEmpty() ? 1 : 0);
            } else if (cmd.equals("front")) {
                System.out.println(dq.peekFirst());
            } else if (cmd.equals("back")) {
                System.out.println(dq.peekLast());
            }
        }
    }
}
