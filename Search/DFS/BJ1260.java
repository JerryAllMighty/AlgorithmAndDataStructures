package Search.DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BJ1260 {

    static int[][] adjacentArray;
    static int v;

    static List<Integer> dfs(int start, List<Integer> visited) {
        if (!visited.contains(start)) {
            visited.add(start);
        }
        for (int i = 1; i < adjacentArray[start].length; i++) {
            if (adjacentArray[start][i] != 0) {
                dfs(i, visited);
            }
        }
        return visited;
    }

    static List<Integer> bfs(int start, List<Integer> visited) {
        if (!visited.contains(start)) {
            visited.add(start);
        }
        List<Integer> toVisit = new ArrayList<>();
        for (int i = 1; i < adjacentArray[start].length; i++) {
            if (adjacentArray[start][i] != 0) {
                if (!visited.contains(i)) {
                    visited.add(i);
                    toVisit.add(i);
                }
            }
        }
        for (Integer i : toVisit) {
            bfs(i, visited);
        }
        return visited;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        v = input[2];
        adjacentArray = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int[] positions = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int source = positions[0];
            int destiny = positions[1];
            adjacentArray[source][destiny] = 1;
        }


        dfs(v, new ArrayList<>()).forEach(x -> {
            try {
                bw.write(Integer.toString(x) + " ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.write("\n");
        bfs(v, new ArrayList<>()).forEach(x -> {
            try {
                bw.write(Integer.toString(x) + " ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.flush();
        bw.close();
        br.close();
    }
}
