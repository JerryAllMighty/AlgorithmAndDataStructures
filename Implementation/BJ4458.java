import java.io.*;

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < n; i++) {
        String[] command = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(command[0].charAt(0)) + command[0].substring(1) + " ");
        for (int j = 1; j < command.length; j++) {
            sb.append(command[j] + " ");
        }
        answer.append(sb.toString() + "\n");
    }
    bw.write(answer.toString());

    bw.flush();
    bw.close();
    br.close();
}