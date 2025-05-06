import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < lst.length; i++) {
            int min = i;
            for (int j = i + 1; j < lst.length; j++) {
                if (lst[j] < lst[min]) {
                    min = j;
                }
            }
            int temp = lst[i];
            lst[i] = lst[min];
            lst[min] = temp;
        }
        for(int i =0; i < lst.length; i++){
            System.out.print(lst[i]);
        }


    }
}
