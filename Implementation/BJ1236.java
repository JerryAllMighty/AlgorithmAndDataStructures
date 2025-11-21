package Implementation;

import java.util.Scanner;

import static java.lang.Math.max;

public class BJ1236 {
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] givens = sc.nextLine().split(" ");

        int row = Integer.valueOf(givens[0]);
        int col = Integer.valueOf(givens[1]);

        int rowAnswer = 0;
        int colAnswer = 0;

        char[][] map = new char[row][col];

        //char로 된 배열로 만드는 과정
        for(int i = 0; i < row; i++){
            map[i] = sc.nextLine().toCharArray();
        }

        //row 검사
        for(int i = 0; i < row; i++){
            boolean isValidRow = false;
            for(int j = 0; j < col; j++) {
                char eachChar = map[i][j];
                if(eachChar != '.'){
                    isValidRow = true;
                    break;
                }
            }
            if(!isValidRow){
                rowAnswer += 1;
            }
        }

        //col 검사
        for(int j = 0; j < col; j++){
            boolean isValidCol = false;
            for(int i = 0; i < row; i++) {
                char eachChar = map[i][j];
                if(eachChar != '.'){
                    isValidCol = true;
                    break;
                }
            }
            if(!isValidCol){
                colAnswer += 1;
            }
        }

        System.out.println(max(rowAnswer, colAnswer));
        sc.close();
    }
}

/*
* 2025.11.21 2번째 풀이, 통과 완료
*
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split("");
            arr[i] = row;
        }

        int[] rows = new int[n];
        int[] columns = new int[m];
        for (int i = 0; i < n; i++) {
            rows[i] = i;
        }
        for (int i = 0; i < m; i++) {
            columns[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ("X".equals(arr[i][j])) {
                    rows[i] = -1;
                    columns[j] = -1;
                }
            }
        }
        int answer = Math.max(n, m);
        int rowCount = 0;
        int colCount = 0;
        for (int i = 0; i < n; i++) {
            if (rows[i] != -1) {
                rowCount++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (columns[i] != -1) {
                colCount++;
            }
        }
        answer = Math.max(rowCount, colCount);
        bw.write(Integer.toString(answer));


        bw.flush();
        bw.close();
        br.close();
    }
 */
