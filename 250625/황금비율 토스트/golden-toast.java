
import java.util.*;

public class Main {
    static ListIterator<String> it;

    static void fn(String[] type) {
        String dir = type[0];
        String chr = "";
        if (type.length > 1) {
            chr = type[1];
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

        } else if (dir.equals("P") && !chr.isEmpty()) {
            it.add(chr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cntList = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = cntList[0];
        int m = cntList[1];

        String encryptMsg = sc.nextLine();
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(encryptMsg.substring(i, i + 1));
        }

        it = lst.listIterator(n);
        for (int i = 0; i < m; i++) {
            String[] info = sc.nextLine().split(" ");
            fn(info);
        }

        lst.forEach(x -> System.out.print(x + ""));


    }
}
