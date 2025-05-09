import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int[] info = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int cnt = info[0];
            int idx = info[1];
            int[] priorities = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Queue<Map<Integer, Integer>> q = new LinkedList<>();
            for (int j = 0; j < cnt; j++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(j, priorities[j]);
                q.offer(map);
            }
            int answer = 0;
            while (!q.isEmpty()) {
                Map<Integer, Integer> peek = q.poll();
                Map.Entry<Integer, Integer> peekEntry = peek.entrySet().iterator().next();
                int key = peekEntry.getKey();
                int val = peekEntry.getValue();
                Iterator<Map<Integer, Integer>> iterator = q.iterator();
                boolean isValid = true;
                while (iterator.hasNext()) {
                    Map<Integer, Integer> next = iterator.next();
                    Map.Entry<Integer, Integer> nextQ = next.entrySet().iterator().next();
                    int cmpKey = nextQ.getKey();
                    int cmpVal = nextQ.getValue();
                    if (val < cmpVal) {
                        isValid = false;
                        break;
                    }
                }
                if (!isValid) {
                    Map<Integer, Integer> map = new HashMap<>();
                    map.put(key, val);
                    q.offer(map);
                }else{
                    answer++;
                    if (key == idx) {
                        break;
                    }
                }

            }
            System.out.println(answer);
        }
    }
}
