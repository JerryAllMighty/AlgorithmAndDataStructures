import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 1; i < n; i++) {
            int val = lst[i];
            int idx = i - 1;
            while(idx >= 0 && lst[idx] > val){
                lst[idx+1] = lst[idx];
                idx --;
            }
            lst[idx+1] = val;
        }

        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + " ");

        }

    }
}
