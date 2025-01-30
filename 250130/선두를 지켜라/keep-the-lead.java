import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int[] lstA = new int[1000000];
        int[] lstB = new int[1000000];

        int previousTimeA = 0;
        int previousTimeB = 0;

        int previousDistanceA = 0;
        int previousDistanceB = 0;

        for (int i = 0; i < n; i++) {
            int[] vt = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int v = vt[0];
            int t = vt[1];

            for (int j = 1; j <= t; j++) {
                lstA[j + previousTimeA] = previousDistanceA + v;
                previousDistanceA += v;
            }
            previousTimeA += t;
        }

        for (int i = 0; i < m; i++) {
            int[] vt = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int v = vt[0];
            int t = vt[1];

            for (int j = 1; j <= t; j++) {
                lstB[j + previousTimeB] = previousDistanceB + v;
                previousDistanceB += v;
            }
            previousTimeB += t;
        }
        int answer = 0;
        String ahead = "";

        for (int k = 0; k < 1000000; k++) {
            if(lstA[k] > 0 && lstB[k] > 0){
                if(lstA[k]  > lstB[k]){
                    if(ahead.isEmpty()){
                        ahead = "A";
                    }else if(ahead.equals("B")){
                        ahead = "A";
                        answer ++;
                    }
                }else if(lstA[k]  < lstB[k]){
                    if(ahead.isEmpty()){
                        ahead = "B";
                    }else if(ahead.equals("A")){
                        ahead = "B";
                        answer ++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}






