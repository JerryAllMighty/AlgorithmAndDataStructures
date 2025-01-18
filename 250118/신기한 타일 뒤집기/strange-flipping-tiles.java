import java.util.*;

public class Main {
    static int OFFSET = 100000;
    static HashMap<Integer, String> lst = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int current = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int cnt = Integer.parseInt(input[0]);
            String direction = input[1];

            for (int j = 0; j < cnt; j++) {
                String val = lst.get(current);
                if (val == null) {
                    val = "";
                }
                if (!val.contains("G")) {
                    if (direction.equals("R")) {
                        val = "B";
                    } else if (direction.equals("L")) {
                        val = "W";
                    }
                    lst.put(current, val);
                }
                if (direction.equals("R") && j != cnt - 1) {
                    current++;
                } else if (direction.equals("L") && j != cnt - 1) {
                    current--;
                }
            }
        }
        long whiteCnt = lst.values().stream().filter(x -> x != null && x.equals("W")).count();
        long blackCnt = lst.values().stream().filter(x -> x != null && x.equals("B")).count();

        System.out.println(whiteCnt + " " + blackCnt);


    }
}

