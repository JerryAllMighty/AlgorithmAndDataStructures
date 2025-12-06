import com.main.javacompile.Main;

import java.io.*;

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    Main.Queue queue = new Main.Queue(n);
    for (int i = 0; i < n; i++) {
        String[] command = br.readLine().split(" ");
        if ("push".equals(command[0])) {
            queue.push(Integer.parseInt(command[1]));
            continue;
        }else if ("pop".equals(command[0])) {
            bw.write(String.valueOf(queue.pop()));
        }else if ("size".equals(command[0])) {
            bw.write(String.valueOf(queue.size()));
        }else if ("empty".equals(command[0])) {
            bw.write(String.valueOf(queue.isEmpty()));
        }else if ("front".equals(command[0])) {
            bw.write(String.valueOf(queue.front()));
        }else if ("back".equals(command[0])) {
            bw.write(String.valueOf(queue.back()));
        }
        bw.write("\n");
    }

    bw.flush();
    bw.close();
    br.close();
}