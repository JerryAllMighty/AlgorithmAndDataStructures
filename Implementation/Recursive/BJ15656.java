/*
 * 2026.03.04 개인 문제 풀이, 통과 완료
 * import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static StringBuilder answers = new StringBuilder();

    static void recursive(List<Integer> recursiveList, int startIndex) {
        recursiveList.add(arr[startIndex]);

        if (recursiveList.size() == m) {
            for (Integer i : recursiveList) {
                answers.append(i + " ");
            }
            answers.append("\n");
            recursiveList.remove(recursiveList.size() - 1);
            return;
        }

        for (int i = 0; i < n; i++) {
            recursive(recursiveList, i);
        }
        recursiveList.remove(recursiveList.size() - 1);
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

        bw.write(answers.toString());
        bw.flush();
        bw.close();
    }
}
 */