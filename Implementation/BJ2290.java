/*
 * 2026.03.05 개인 문제 풀이, 통과 못 함
 * import java.io.*;

public class Main {
    static String makeHorizon(int s, char targetNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        if (targetNumber == '1' || targetNumber == '4') {
            for (int i = 0; i < s + 2; i++) {
                stringBuilder.append(" ");
            }
        } else {
            stringBuilder.append(" ");
            for (int i = 0; i < s; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append(" ");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    static String makeUpperVertical(int s, char targetNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        if (targetNumber == '1' || targetNumber == '2' || targetNumber == '3' || targetNumber == '7') {
            for (int i = 0; i < s + 1; i++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append("|");
        } else if (targetNumber == '5' || targetNumber == '6') {
            stringBuilder.append("|");
            for (int i = 0; i < s + 1; i++) {
                stringBuilder.append(" ");
            }
        } else {
            stringBuilder.append("|");
            for (int i = 0; i < s; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("|");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    static String makeLowerVertical(int s, char targetNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        if (targetNumber == '1' || targetNumber == '3' || targetNumber == '4' || targetNumber == '5' || targetNumber == '7' || targetNumber == '9') {
            for (int i = 0; i < s + 1; i++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append("|");
        } else if (targetNumber == '2') {
            stringBuilder.append("|");
            for (int i = 0; i < s + 1; i++) {
                stringBuilder.append(" ");
            }
        } else {
            stringBuilder.append("|");
            for (int i = 0; i < s; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("|");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] info = br.readLine().split(" ");
        int s = Integer.parseInt(info[0]);
        String n = info[1];
        StringBuilder sb = new StringBuilder();
        for (char c : n.toCharArray()) {
            //가로
            String horizonString = makeHorizon(s, c);
            sb.append(horizonString);
            sb.append(" ");
        }
        for (char c : n.toCharArray()) {
            for (int i = 0; i < s; i++) {
                String verticalString = makeUpperVertical(s, c);
                sb.append(verticalString);
                sb.append(" ");
            }
        }
        for (char c : n.toCharArray()) {
            //가로
            String horizonString = makeHorizon(s, c);
            sb.append(horizonString);
            sb.append(" ");
        }
        for (char c : n.toCharArray()) {
            for (int i = 0; i < s; i++) {
                String verticalString = makeLowerVertical(s, c);
                sb.append(verticalString);
                sb.append(" ");
            }
        }
        for (char c : n.toCharArray()) {
            //가로
            String horizonString = makeHorizon(s, c);
            sb.append(horizonString);
            sb.append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
 */