import java.util.*;

public class Main {
    static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            grid[i] = input;
        }
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-2; j++) {
                int firstCnt = 0;
                for (int k = 0; k < 3; k++) {
                    if (inRange(i, j + k, n, n)
                            && grid[i][j+k] == 1) {
                        firstCnt++;
                    }
                }
                //2nd grid
                for (int r = 0; r < n; r++) {
                    if(r == i){
                        for (int c = j+3; c < n-2; c++) {
                            int secondCnt = 0;
                            for (int l = 0; l < 3; l++) {
                                if (inRange(r, c + l, n, n)
                                        && grid[r][c + l] == 1) {
                                    secondCnt++;
                                }
                            }
                            answer = Math.max(answer, firstCnt+secondCnt);
                        }
                    }else{
                        for (int c = 0; c < n-2; c++) {
                            int secondCnt = 0;
                            for (int l = 0; l < 3; l++) {
                                if (inRange(r, c + l, n, n)
                                        && grid[r][c + l] == 1) {
                                    secondCnt++;
                                }
                            }
                            answer = Math.max(answer, firstCnt+secondCnt);
                        }
                    }

                }
            }
        }
        System.out.println(answer);


    }
}










