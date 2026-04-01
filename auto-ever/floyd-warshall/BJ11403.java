/*
 * 2026 03 30 개인 문제 풀이 틀림
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] graph;

    static void search() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1) {
                    List<Integer> visited = new ArrayList<>();
                    dfs(j, visited);
                }
            }
        }
    }


    static void dfs(int start, List<Integer> visited) {
        if(!visited.contains(start)){
            visited.add(start);
        }

        for (Integer j : visited) {
            graph[j][start] = 1;
        }
        for (int i = start; i < n; i++) {
            if (graph[start][i] == 1) {
                dfs(i, visited);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                int number = Integer.parseInt(stringTokenizer.nextToken());
                row[j] = number;
            }
            graph[i] = row;
        }

        search();

        for (int[] row : graph) {
            for (int i : row) {
                bw.write(String.valueOf(i) + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}






 */