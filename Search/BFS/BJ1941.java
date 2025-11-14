package Search.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BJ1941 {

    static class Student {
        int row;
        int col;
        String type;

        public Student(int row, int col, String type) {
            this.row = row;
            this.col = col;
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return row == student.row && col == student.col && Objects.equals(type, student.type);
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col, type);
        }
    }

    static String[][] seats = new String[5][5];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};
    static List<Student> combinations = new ArrayList<>();
    static int answer;

    static void dfs(int r, int c) {
        if (r < 0 || r >= 5 || c < 0 || c >= 5) {
            return;
        }
        Student student = new Student(r, c, seats[r][c]);
        if (combinations.contains(student)) {
            return;
        }
        combinations.add(student);

        //이름이 이름인 만큼, 7명의 여학생들로 구성되어야 한다.
        if (combinations.size() == 7) {
            int dasomCount = 0;
            for (Student combination : combinations) {
                if (combination.type.equals("S")) {
                    dasomCount++;
                }
            }
            // 그러나 생존을 위해, ‘이다솜파’가 반드시 우위를 점해야 한다. 따라서 7명의 학생 중 ‘이다솜파’의 학생이 적어도 4명 이상은 반드시 포함되어 있어야 한다.
            if (dasomCount < 4) {
                return;
            }
            answer++;
            combinations = new ArrayList<>();
        }


        //화합과 번영을 위해, 반드시 ‘이다솜파’의 학생들로만 구성될 필요는 없다.
        // 강한 결속력을 위해, 7명의 자리는 서로 가로나 세로로 반드시 인접해 있어야 한다.
        for (int i = 0; i < 4; i++) {
            int x = r + dx[i];
            int y = c + dy[i];
            dfs(x, y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String[] row = br.readLine().split("");
            seats[i] = row;
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j);
            }
        }

    }
}
