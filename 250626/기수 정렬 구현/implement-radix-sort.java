import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");


        //기수 정렬
        String[] stored_arr = new String[n]; //매번 자릿수를 정렬하며 그 결과를 저장할 배열
        int pos = Integer.MIN_VALUE; //자릿수
        for (int i = 0; i < n; i++) {
            pos = Math.max(pos, nums[i].length());
            stored_arr[i] = nums[i];
        }


        for (int i = 0; i < n; i++) {
            String tempStr = stored_arr[i];
            if (tempStr.length() != pos) {
                for (int k = 0; k < pos - tempStr.length(); k++) {
                    stored_arr[i] = "0" + stored_arr[i];
                }
            }
        }
        //끝자리부터 0~9 순으로 정렬
        while (--pos >= 0) {
            String[] temp = new String[n];
            int idx = 0;
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < n; i++) { // 배열 각각의 자릿수
                    String tempStr = stored_arr[i];
                    String digit = tempStr.substring(pos, pos + 1);
                    if (digit.equals(Integer.toString(j))) {
                        temp[idx] = stored_arr[i];
                        idx++;
                    }
                }
            }
            stored_arr = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(Integer.parseInt(stored_arr[i]) + " ");
        }


    }
}
