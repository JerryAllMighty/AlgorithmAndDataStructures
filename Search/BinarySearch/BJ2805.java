package Search.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2805 {
    static int[] heights;

    static Long getLeftOver(int height) {
        Long result = 0L;
        for (int i : heights) {
            if (i > height) {
                result += (i - height);
            }
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        heights = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(heights);

        //적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값
        int l = 0;
        int r = heights[n - 1];
        int mid = (l + r) / 2;
        int answer = 0;
        while (l <= r) {
            if (getLeftOver(mid) >= m) {
                l = mid + 1;
                answer = mid;
            } else {
                r = mid - 1;
            }
            mid = (l + r) / 2;
        }
        System.out.println(answer);
    }
}
