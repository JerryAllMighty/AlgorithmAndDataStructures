/*
 * 2026.03.08 개인 문제 풀이, 복기 후 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static char[] characterTobe = new char[]{'O', 'I'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;
        int count = 0;
        for (int i = 1; i < m - 1; i++) {
            if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
                count++;
            } else {
                count = 0;
                continue;
            }
            if (count == n) {
                answer++;
                count--;
            }
            i++;

        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

 */