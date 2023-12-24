package BaekJun.implementation;

import java.util.Scanner;

import static java.lang.Math.max;

public class BJ1236 {
    public static void main(String[] args) {
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
