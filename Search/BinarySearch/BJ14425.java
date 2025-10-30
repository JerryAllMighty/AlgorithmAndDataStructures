package Search.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ14425 {
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
//            answer += binarySearch(s, mInput) == true ? 1 : 0;
            int index = Arrays.binarySearch(s, mInput);
            if (index >= 0) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}
