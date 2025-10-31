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

    static int binarySearch2(int targetNum) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
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
        for (int i = 0; i < targetNumIndex; i++) {
            for (int j = i; j < targetNumIndex; j++) {
                int foundIndex = binarySearch(i, targetNumIndex, targetNum - (nums[i] + nums[j]));
//                int foundIndex = binarySearch2(targetNum - (nums[i] + nums[j]));
                if (foundIndex != -1) {
                    return true;
                }
//                int foundIndex = Arrays.binarySearch(nums, targetNum - (nums[i] + nums[j]));
//                if (foundIndex > -1) {
//                    return true;
//                }
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


//2025.10.31 아직 개인적인 의문 남음. 문제는 해결
//2025.11.01 왜 시간 초과가 나는지 파악 완료 (targetNumIndex 는 왜 시간 초과가 나고, nums.length -1은 왜 안 나는지)
// 호출 오버헤드 + 캐시 비효율로 인한 차이 : 1. 매번 바뀌는 인자에 따른 다른 스택 프레임 생성 2. 실제 targetNumIndex 와 배열의 마지막이 큰 차이가 나지 않는 케이스도 발생




