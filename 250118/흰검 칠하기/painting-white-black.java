import java.util.*;

public class Main {
    static int OFFSET = 100000;
    static HashMap<Integer, List<String>> lst = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int current = 0;
        String previousDirection = "";

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int cnt = Integer.parseInt(input[0]);
            String direction = input[1];

            for (int j = 0; j < cnt; j++) {
                List<String> val = lst.get(current);
                if (val == null) {
                    val = new ArrayList<>();
                }
                if (!val.contains("G")) {
                    if (direction.equals("R")) {
                        val.add("B");
                    } else if (direction.equals("L")) {
                        val.add("W");
                    }
                    int blackCnt = (int) val.stream().filter(x -> x.equals("B")).count();
                    int whiteCnt = (int) val.stream().filter(x -> x.equals("W")).count();
                    if (blackCnt >= 2 && whiteCnt >= 2) {
                        val.remove(val.size() - 1);
                        val.add("G");
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
        long whiteCnt = lst.values().stream().filter(x -> x != null && x.size() > 0 && x.get(x.size() - 1).equals("W")).count();
        long blackCnt = lst.values().stream().filter(x -> x != null && x.size() > 0 && x.get(x.size() - 1).equals("B")).count();
        long greyCnt = lst.values().stream().filter(x -> x != null && x.size() > 0 && x.get(x.size() - 1).equals("G")).count();

        System.out.println(whiteCnt + " " + blackCnt + " " + greyCnt);


    }
}

