import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] sortedA = a.toCharArray();
        char[] sortedB = b.toCharArray();
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);
        System.out.println(Arrays.equals(sortedA, sortedB)?"Yes":"No");

    }
}




