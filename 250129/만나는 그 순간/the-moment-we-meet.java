import java.util.*;

public class Main {
    static int OFFSET = 1000000;
    static int[] lstA = new int[2000001];
    static int[] lstB = new int[2000001];

    static int lastIndexA = 0;
    static int lastIndexB = 0;

    static int timeA = 0;
    static int timeB = 0;

    static Scanner sc = new Scanner(System.in);

    static void move(int[] targetLst, int n, int targetLastIdx, int targetTime) {
        for (int i = 0; i < n; i++) {
            String[] directionCnt = sc.nextLine().split(" ");
            int cnt = Integer.parseInt(directionCnt[1]);
            String direction = directionCnt[0];
            for (int j = 0; j < cnt; j++) {
                targetTime++;
                if (direction.equals("L")) {
                    targetLastIdx--;
                } else {
                    targetLastIdx++;
                }

                targetLst[targetTime + OFFSET] = targetLastIdx;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        Arrays.fill(lstA, -2000002);
        Arrays.fill(lstB, -2000002);
        move(lstA, n, lastIndexA, timeA);
        move(lstB, m, lastIndexB, timeB);

        boolean isSame = false;
        for (int i = 0; i < lstA.length; i++) {
            if (lstA[i] != -2000002 && (lstA[i] == lstB[i])) {
//                System.out.println(Integer.toString(i-OFFSET) + " A " + Integer.toString(lstA[i]));
//                System.out.println(Integer.toString(i-OFFSET) + " B " + Integer.toString(lstB[i]));
                System.out.println(i-OFFSET);
                isSame = true;
                break;
            }
        }
        if(!isSame){
            System.out.println(-1);
        }


    }
}



