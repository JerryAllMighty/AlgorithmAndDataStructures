package Implementation;

import java.io.*;

public class BJ1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int maxLength = String.valueOf(n).length();
        int answer = 0;
        for (int i = 1; i < maxLength; i++) {
            int tenTimes = 1;
            int loopCountNumber = i;
            while (--loopCountNumber > 0) {
                tenTimes *= 10;
            }
            answer += i * (tenTimes * 9);
        }
        int minimumSquareNumber = 1;
        int loopCountNumber = maxLength;
        while (--loopCountNumber > 0) {
            minimumSquareNumber *= 10;
        }
        answer += (n - minimumSquareNumber + 1) * maxLength;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
