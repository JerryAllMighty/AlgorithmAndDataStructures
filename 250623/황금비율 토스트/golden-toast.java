import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cntList = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = cntList[0];
        int m = cntList[1];
        char[] charArray = sc.nextLine().toCharArray();
        List<Character> lst = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            lst.add(charArray[i]);
        }
        ListIterator<Character> it = lst.listIterator(lst.size());
        for (int i = 0; i < m; i++) {
            String[] encryptMsgArray = sc.nextLine().split(" ");
            String encryptMsg = encryptMsgArray[0];

            if (encryptMsg.equals("L")) {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (encryptMsg.equals("R")) {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (encryptMsg.equals("D")) {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (encryptMsg.equals("P")) {
                if (encryptMsgArray.length > 1) {
                    it.add(encryptMsgArray[1].toCharArray()[0]);
                }
            }
        }
        lst.forEach(x -> System.out.print(x + ""));
    }
}
