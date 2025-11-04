package Search.BinarySearch;

import java.io.*;
import java.util.Arrays;

public class BJ1654 {

    static int[] nums;

    static int getLanWireCount(long length) {
        int result = 0;
        if (length == 0) {
            return nums.length;
        }
        for (int num : nums) {
            result += num / length;
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = input[0];
        int n = input[1];

        nums = new int[k];
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
        }

        Arrays.sort(nums);
        long l = 1L; //
        long r = nums[k - 1];
        long m = (l + r) / 2;
        long answer = 0;
        while (l <= r) {
            int test = getLanWireCount(m);
            if (getLanWireCount(m) < n) {
                r = m - 1;
            } else {
                l = m + 1;
                answer = Math.max(answer, m);
            }
            m = (l + r) / 2;
        }

        bw.write(Long.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
