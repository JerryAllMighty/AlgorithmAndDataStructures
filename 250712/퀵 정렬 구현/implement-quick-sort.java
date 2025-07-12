
import java.util.*;

public class Main {
    static int[] arr;

    static int partition(int startIdx, int endIdx) {
        int pivot = arr[endIdx];
        int i = startIdx - 1;
        for (int j = startIdx; j < endIdx; j++) {
            if (arr[j] < pivot) {
                i += 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[endIdx] = temp;
        return i + 1;
    }

    static void quickSort(int startIdx, int endIdx) {
        if (startIdx < endIdx) {
            int pos = partition(0, endIdx);
            quickSort(0, pos - 1);
            quickSort(pos + 1, endIdx);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
//        arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //quick sort
        quickSort(0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
