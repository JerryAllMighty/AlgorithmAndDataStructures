package LinearDataStructure.List;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] info = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int k = info[1];
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int[] arr = new int[n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = num++;
        }
        int idx = 0;
        int cnt = 1;
        int changeCnt = 0;
        while (changeCnt < n) {
            if (arr[idx] != 0) {
                if (cnt < k) {
                    cnt++;
                } else {
                    sb.append(arr[idx] + ", ");
                    arr[idx] = 0;
                    changeCnt++;
                    cnt = 1;
                }
            }
            idx = (idx + 1) % n;
        }
        sb.replace(sb.length()-2, sb.length(), ">");
        System.out.println(sb);
    }
}

/*
 * 2025.11.28 리스트 활용한 문제 풀이, 통과 완료
 * public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int k = info[1];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int index = k - 1;
        while (n-- > 0) {
            int value = list.get(index);
            sb.append(value + ", ");
            list.remove(index);
            if (!list.isEmpty()) {
                index = (index + (k - 1)) % list.size();
            } else {
                break;
            }
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
 */
