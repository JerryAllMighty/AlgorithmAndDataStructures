import java.util.*;

public class Main {

    static int isBeautifulNum(int[] temp, int[] bArray) {
        for (int i = 0; i < temp.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < bArray.length; j++) {
                if (bArray[j] == temp[i]) {
                    isExist = true;
                }
            }
            if (!isExist) {
                return 0;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] givenNums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = givenNums[0];
        int m = givenNums[1];
        int[] aArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int i = 0; i + m <= n; i++) {
            int[] temp = new int[m];
            for (int j = 0; j < m; j++) {
                temp[j] = aArray[i + j];
            }
            answer += isBeautifulNum(temp, bArray);

        }
        System.out.println(answer);

    }
}










