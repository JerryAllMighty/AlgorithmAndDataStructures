import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int cnt = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String[] lst = sc.nextLine().split(" ");
        int[] sortedLst = Arrays.stream(lst).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(sortedLst);
        System.out.println(sortedLst[k-1]);
    }
}



