import java.util.*;

public class Main {
    static ListIterator<Character> it;

    static void fn(String[] type) {
        String dir = type[0];
        Character chr = null;
        if (type.length > 1) {
            chr = type[1].toCharArray()[0];
        }

        if (dir.equals("L")) {
            if (it.hasPrevious()) {
                it.previous();
            }

        } else if (dir.equals("R")) {
            if (it.hasNext()) {
                it.next();
            }
        } else if (dir.equals("D")) {
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
        } else if (dir.equals("P") && chr != null) {
            it.add(chr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cntList = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = cntList[0];
        int m = cntList[1];

        String encryptMsg = sc.nextLine();
        LinkedList<Character> lst = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            lst.add(encryptMsg.charAt(i));
        }

        it = lst.listIterator(n);
        String[][] infos = new String[m][];
        for (int i = 0; i < m; i++) {
            String[] info = sc.nextLine().split(" ");
            infos[i] = info;
        }
        for (int i = 0; i < m; i++) {
            fn(infos[i]);
        }

        lst.forEach(x -> System.out.print(x + ""));


    }
}
