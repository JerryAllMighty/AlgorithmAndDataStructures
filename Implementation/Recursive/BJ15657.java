/*
 * 2026.03.04 개인 문제 풀이, 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static LinkedHashSet<List<Integer>> set = new LinkedHashSet<>();

    static void recursive(List<Integer> list, int startIndex) {
        list.add(arr[startIndex]);

        if (list.size() == m) {
            List<Integer> deepCopyList = List.copyOf(list);
            set.add(deepCopyList);
            list.remove(list.size() - 1);
            return;
        }
        for (int i = startIndex; i < n; i++) {
            recursive(list, i);
        }
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = info[0];
        m = info[1];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            recursive(new ArrayList<>(), i);
        }

        StringBuilder sb = new StringBuilder();
        for (List<Integer> eachSet : set) {
            for (Integer i : eachSet) {
                sb.append(i + " ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
 */