package LinearDataStructure.Queue;

import java.io.*;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BJ15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayBlockingQueue<>(n);
        while (true) {
            int info = Integer.parseInt(br.readLine());
            if (info == -1) {
                break;
            } else if (info == 0) {
                q.poll();
            } else {
                try {
                    q.add(info);
                } catch (IllegalStateException e) {
                }
            }
        }
        if (q.isEmpty()) {
            bw.write("empty");
        } else {
            while (!q.isEmpty()) {
                bw.write(q.poll() + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
