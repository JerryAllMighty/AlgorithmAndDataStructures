package Search.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LC15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);
        // solution set must not contain duplicate triplets.
        Set<List<Integer>> answers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = Arrays.binarySearch(nums, -(nums[i] + nums[j]));
                if (k > -1) {
                    if (i != j && j != k && i != k) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            Collections.sort(temp);
                            answers.add(temp);
                        }
                    }
                }
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (i != j && j != k && i != k) {
//                        if (nums[i] + nums[j] + nums[k] == 0) {
//                            List<Integer> temp = new ArrayList<>();
//                            temp.add(nums[i]);
//                            temp.add(nums[j]);
//                            temp.add(nums[k]);
//                            Collections.sort(temp);
//                            answers.add(temp);
//                            break;
//                        }
//                    }
//                }
            }
        }

        for (List<Integer> lst : answers) {
            System.out.print("[");
            for (int i = 0; i < lst.size(); i++) {
                if (i < lst.size() - 1) {
                    System.out.print(lst.get(i) + ",");
                } else {
                    System.out.print(lst.get(i));
                }

            }
            System.out.println("]");
        }

    }
}
