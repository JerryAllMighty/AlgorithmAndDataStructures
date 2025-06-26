import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] answers = new int[n];

        //기수 정렬

        int pos = Integer.MIN_VALUE; //자릿수
        for (int i = 0; i < n; i++) {
            pos = Math.max(pos, Integer.toString(nums[i]).length());
        }
        int[] stored_arr = nums; //매번 자릿수를 정렬하며 그 결과를 저장할 배열
        //끝자리부터 0~9 순으로 정렬
        while (--pos >= 0) {
            int[] temp = new int[n];
            int idx = 0;
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < n; i++) { // 배열 각각의 자릿수
                    String tempStr = Integer.toString(stored_arr[i]);
                    if (tempStr.length() != pos + 1) {
                        for (int k = 0; k < (pos + 1) - tempStr.length(); k++) {
                            tempStr = "0" + tempStr;
                        }
                    }
                    String digit = tempStr.substring(pos, pos + 1);
                    if (digit.equals(Integer.toString(j))) {
                        temp[idx] = stored_arr[i];
                        idx++;
                    }
                }
            }
            stored_arr = temp;
        }
        answers = stored_arr;

        for (int i = 0; i < n; i++) {
            System.out.print(answers[i] + " ");
        }


    }
}
