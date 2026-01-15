package Implementation;

import java.io.*;
import java.util.HashMap;

public class BJ25206 {
    static HashMap<String, Double> grades = new HashMap<>();

    static void makeGradesMap() {
        grades.put("A+", 4.5);
        grades.put("A0", 4.0);
        grades.put("B+", 3.5);
        grades.put("B0", 3.0);
        grades.put("C+", 2.5);
        grades.put("C0", 2.0);
        grades.put("D+", 1.5);
        grades.put("D0", 1.0);
        grades.put("F", 0.0);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        makeGradesMap();

        double answer = 0.0;
        double totalScore = 0.0;
        for (int i = 0; i < 20; i++) {
            String[] cmd = br.readLine().split(" ");
            double score = Double.parseDouble(cmd[1]);
            String grade = cmd[2];
            if (!"P".equals(grade)) {
                totalScore += score;
                double targetNumber = score * grades.get(grade);
                answer += targetNumber;
            }


        }
        bw.write(String.valueOf(answer / totalScore));
        bw.flush();
        bw.close();
        br.close();
    }
}
