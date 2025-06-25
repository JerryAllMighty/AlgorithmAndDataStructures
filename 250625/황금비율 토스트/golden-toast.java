import java.util.*;

public class Main {
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

        ListIterator<Character> it = lst.listIterator(n);

        for (int i = 0; i < m; i++) {
            char dir = sc.next().charAt(0);
            if (dir == 'L') {
                if (it.hasPrevious()) {
                    it.previous();
                }

            } else if (dir == 'R') {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (dir == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (dir == 'P') {
                Character chr = sc.next().charAt(0);
                it.add(chr);
            }
        }


        //출력
        it = lst.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());

        }


    }
}
