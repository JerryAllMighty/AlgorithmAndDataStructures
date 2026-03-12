/*
* 2026.03.12 복기 떄 통과 완료
* import java.io.*;
import java.util.Arrays;

public class Main {
    static class GPT implements Comparable<GPT> {
        private final int x;
        private final Integer y;

        public GPT(int x, Integer y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return y != null ? x + "." + y : String.valueOf(x);
        }

        @Override
        public int compareTo(GPT o) {
            if (this.x == o.x) {
                if (this.y == null) {
                    if(o.y == null){
                        return 0;
                    }
                    return -1;
                } else if (o.y == null) {
                    return 1;
                }
                return this.y - o.y;
            }

            return this.x - o.x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        GPT[] gpts = new GPT[n];
        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            String[] number = cmd.split("\\.");
            int x = Integer.parseInt(number[0]);
            Integer y = number.length > 1 ? Integer.parseInt(number[1]) : null;
            gpts[i] = new GPT(x, y);
        }

        Arrays.sort(gpts);
        for (GPT number : gpts) {
            bw.write(number.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}





 */