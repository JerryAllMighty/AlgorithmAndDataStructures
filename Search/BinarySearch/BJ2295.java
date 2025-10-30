package Search.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2295 {
    static int[] nums;

    static int binarySearch(int startIndex, int endIndex, int targetNum) {
        int midIndex = (startIndex + endIndex) / 2;
        while (startIndex <= endIndex) {
            if (nums[midIndex] < targetNum) {
                startIndex = midIndex + 1;
            } else if (nums[midIndex] > targetNum) {
                endIndex = midIndex - 1;
            } else {
                return midIndex;
            }
            midIndex = (startIndex + endIndex) / 2;
        }
        return -1;
    }

    static boolean isThreeSumExist(int targetNum, int targetNumIndex) {
        int startNum;
        for (int i = 0; i < nums.length - 3; i++) {
            startNum = nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
                int foundIndex = binarySearch(j + 1, targetNumIndex - 1, targetNum - (startNum + nums[j]));
                if (foundIndex != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        nums = new int[m];

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
        }

//        nums = Arrays.stream(nums)
//                .boxed()
//                .sorted(Collections.reverseOrder())
//                .mapToInt(Integer::intValue)
//                .toArray();

        Arrays.sort(nums);

        //해당 수를 만족하는 (역순) 세수의 합이 있는지
        int answer = 0;
        for (int i = m - 1; i >= 0; i--) {
            int targetNum = nums[i];
            if (isThreeSumExist(targetNum, i)) {
                answer = targetNum;
                break;
            }
        }
        System.out.println(answer);
    }
}
