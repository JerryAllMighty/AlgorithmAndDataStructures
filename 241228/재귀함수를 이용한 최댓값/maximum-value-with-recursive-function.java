import java.util.*;


public class Main {

    public static int recursive(int[] lst, int n) {
        if (n == lst.length-1) {
            return lst[n];
        }
        return Math.max(lst[n], recursive(lst, n+1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        String[] givenList = sc.nextLine().split(" ");
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(givenList[i]);
            lst[i] = num;
        }
        int result = recursive(lst, 0);
        System.out.println(result);


    }
}


