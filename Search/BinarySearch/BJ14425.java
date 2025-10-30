package Search.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ14425 {
    //2025.10.30 통과한 문제 풀이 케이스
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            String nInput = br.readLine();
            s[i] = nInput;
        }

        Arrays.sort(s);

        int answer = 0;
        for (int i = 0; i < m; i++) {
            String mInput = br.readLine();
            //집합 s에 포함되어있는 것이 몇 개인지
            int index = Arrays.binarySearch(s, mInput);
            if (index >= 0) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}
//2025.10.30 내 개인풀이 (실패한 케이스) (이후 성공)
// 문자열 비교는 Comparable 인터페이스를 String이 구현하고 있기 때문에 compareTo를 사용가능하다
//public class Main {
//
//    static boolean binarySearch(String[] arr, String targetString) {
//        int l = 0;
//        int r = arr.length - 1;
//        int m = (l + r) / 2;
//        while (l <= r) {
//            if (arr[m].compareTo(targetString) < 0) {
//                l = m + 1;
//            } else if (arr[m].compareTo(targetString) > 0) {
//                r = m - 1;
//            } else {
//                return true;
//            }
//            m = (l + r) / 2;
//
//        }
//        return false;
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int n = input[0];
//        int m = input[1];
//
//        String[] s = new String[n];
//        for (int i = 0; i < n; i++) {
//            String nInput = br.readLine();
//            s[i] = nInput;
//        }
//
//        Arrays.sort(s);
//
//        int answer = 0;
//        for (int i = 0; i < m; i++) {
//            String mInput = br.readLine();
//            //집합 s에 포함되어있는 것이 몇 개인지
//            answer += binarySearch(s, mInput) == true ? 1 : 0;
//        }
//
//        System.out.println(answer);
//
//    }
//}



