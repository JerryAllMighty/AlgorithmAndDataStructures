import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] A = new int[cnt];
        int[] B = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.equals(A, B) ? "Yes" : "No");
    }
}



