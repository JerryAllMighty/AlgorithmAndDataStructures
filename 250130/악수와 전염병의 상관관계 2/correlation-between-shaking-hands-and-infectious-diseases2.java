import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int k = input[1];
        int p = input[2];
        int t = input[3];

        int[] developers = new int[n+1];
        int[] poisonedDevelopers = new int[n+1];
        //미감염은 -1, 그 이상은 감염
        Arrays.fill(poisonedDevelopers, -1);
        poisonedDevelopers[p] = k;

        int[][] shakeInfoList = new int[t][3];

        for (int i = 0; i < t; i++) {
            int[] info = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            shakeInfoList[i] = info;
        }
        Arrays.sort(shakeInfoList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < t; i++) {
            int[] eachShakeInfo = shakeInfoList[i];
            int time = eachShakeInfo[0];
            int x = eachShakeInfo[1];
            int y = eachShakeInfo[2];

            int availablePoisonCountX = poisonedDevelopers[x];
            int availablePoisonCountY = poisonedDevelopers[y];

            //x 감염  y감염
            //전염된 사람끼리도 횟수 포함
            if (availablePoisonCountX > -1 && availablePoisonCountY > -1) {
                if (poisonedDevelopers[x] > 0) {
                    poisonedDevelopers[x]--;
                }
                if (poisonedDevelopers[y] > 0) {
                    poisonedDevelopers[y]--;
                }
            }

            //x 감염 y감염x
            if (availablePoisonCountX > -1 && availablePoisonCountY == -1) {
                if (poisonedDevelopers[x] > 0) {
                    poisonedDevelopers[y] = k;
                    poisonedDevelopers[x]--;
                }
            }
            //x 감염x y감염
            if (availablePoisonCountX == -1 && availablePoisonCountY > -1) {
                if (poisonedDevelopers[y] > 0) {
                    poisonedDevelopers[x] = k;
                    poisonedDevelopers[y]--;
                }
            }
        }

        for(int i = 1; i < poisonedDevelopers.length ; i++){
            int poisonedDeveloper = poisonedDevelopers[i];
            if(poisonedDeveloper > -1){
                System.out.print("1");
            }else{
                System.out.print("0");
            }

        }
    }
}






