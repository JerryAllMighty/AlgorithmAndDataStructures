import java.util.*;

public class Main {
    static int[] merge_sort(int[] lst, int low, int high) {
        if (low >= high) {
            return new int[]{
                    lst[low]
            };
        }
        //잘라서 두 부분 만들기
        int mid = (high + low) / 2;
        int[] aList = merge_sort(lst, low, mid);
        int[] bList = merge_sort(lst, mid + 1, high);
        return merge(aList, bList);

    }

    static int[] merge(int[] aList, int[] bList) {
        int[] result = new int[aList.length + bList.length];
        // 두 부분을 정렬하며 합치기
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < aList.length && j < bList.length) {
            if (aList[i] < bList[j]) {
                result[idx] = aList[i];
                i++;
            } else {
                result[idx] = bList[j];
                j++;
            }
            idx++;
        }
        while (i < aList.length) {
            result[idx] = aList[i];
            i++;
            idx++;
        }
        while (j < bList.length) {
            result[idx] = bList[j];
            j++;
            idx++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sortedLst = merge_sort(lst, 0, n-1);
        for(int i =0; i < n; i++){
            System.out.print(sortedLst[i] + " ");

        }


    }
}
