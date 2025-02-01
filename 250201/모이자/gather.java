import java.util.*;

public class Main {
    //N R S L
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] houseCnt = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    temp += houseCnt[j] * Math.abs(i-j);
                }
            }
            if (temp < answer) {
                answer = temp;
            }
        }
        System.out.println(answer);


    }
}









