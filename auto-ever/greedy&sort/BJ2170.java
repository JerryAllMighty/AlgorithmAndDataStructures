/*
 * 복기 떄 통과 완료
 * import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] lines = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            lines[i] = new int[]{x, y};
        }

        Arrays.sort(lines, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        long answer = lines[0][1]-lines[0][0];
        int end = lines[0][1];
        for (int i = 1; i < lines.length; i++) {
            int nx = lines[i][0];
            int ny = lines[i][1];
            if (nx <= end) {
                if (end <= ny) {
                    answer += ny - end;
                    end = ny;
                }
            } else {
                answer += ny - nx;
                end = ny;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}




 */