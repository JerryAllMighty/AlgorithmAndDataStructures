package Search.BruteForce;

import java.util.Scanner;

public class BJ1730 {

    static char[][] board;
    static char[] rows;

    //특정 포인트에 흔적을 남기는 함수
    static void makeFootStep(int row, int col, char directions) {
        //잘못된row와 col이 들어온 경우
        if (row < 0 || row > board.length - 1 || col < 0 || col > board.length - 1) {
            return;
        }

        char c = board[row][col];

        if (directions == 'U') {
            if (c == '.') {
                board[row][col] += 78;
            } else if (c == '-') {
                board[row][col] -= 2;
            }
        } else if (directions == 'D') {
            if (c == '.') {
                board[row][col] += 78;
            } else if (c == '-') {
                board[row][col] -= 2;
            }
        } else if (directions == 'L') {
            if (c == '.') {
                board[row][col]--;
            } else if (c == '|') {
                board[row][col] -= 81;
            }
        } else if (directions == 'R') {
            if (c == '.') {
                board[row][col]--;
            } else if (c == '|') {
                board[row][col] -= 81;
            }
        }

    }

    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        char[] directions = sc.nextLine().toCharArray();

        board = new char[cnt][cnt];
        rows = new char[cnt];

//        Arrays.fill(rows, '.');
//        Arrays.fill(board, rows);

//        for(int i =0; i < cnt; i++){
//            rows[i] = '.';
//        }
//        for(int i =0; i < cnt; i++){
//            board[i] = rows;
//        }

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                board[i][j] = '.';
            }

        }

        int row = 0;
        int col = 0;

        for (char c : directions) {


            if (c == 'U') {
                makeFootStep(row, col, c);
                row--;
                if (row < 0 || row > board.length - 1 || col < 0 || col > board.length - 1) {
                    row++;
                    continue;
                }
                makeFootStep(row, col, c);
            } else if (c == 'D') {
                makeFootStep(row, col, c);
                row++;
                if (row < 0 || row > board.length - 1 || col < 0 || col > board.length - 1) {
                    row--;
                    continue;
                }
                makeFootStep(row, col, c);
            } else if (c == 'L') {
                makeFootStep(row, col, c);
                col--;
                if (row < 0 || row > board.length - 1 || col < 0 || col > board.length - 1) {
                    col++;
                    continue;
                }
                makeFootStep(row, col, c);
            } else if (c == 'R') {
                makeFootStep(row, col, c);
                col++;
                if (row < 0 || row > board.length - 1 || col < 0 || col > board.length - 1) {
                    col--;
                    continue;
                }
                makeFootStep(row, col, c);
            }
        }

        for (char[] chars : board) {
            System.out.println(chars);

        }
    }
}
