import java.util.*;

public class Main {
    static List<Integer> lst = new ArrayList<>();

    static void pushBack(int n) {
        lst.add(n);
    }

    static void popBack() {
        lst.remove(lst.size() - 1);
    }

    static int size() {
        return lst.size();
    }


    static int get(int idx) {
        return lst.get(idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String cmd = input[0];
            if (cmd.equals("push_back")) {
                int num = Integer.parseInt(input[1]);
                pushBack(num);
            } else if (cmd.equals("pop_back")) {
                popBack();
            } else if (cmd.equals("size")) {
                System.out.println(size());
            } else if (cmd.equals("get")) {
                int num = Integer.parseInt(input[1]);
                System.out.println(get(num));
            }


        }
    }


}











