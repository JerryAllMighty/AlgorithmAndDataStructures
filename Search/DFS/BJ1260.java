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

/* 2025.11.15 2회차 풀이
* Stack을 활용한 dfs 로직은 순서를 보장하는 부분에 있어서 추가 코드 필요. 
* 이런 경우는 재귀 활용이 용이

    static int[][] graph;
    static int n;
    static boolean[] visited;
    static List<Integer> bfsList = new ArrayList<>();
    static List<Integer> dfsList = new ArrayList<>();

    static void dfs(int node) throws IOException {
        visited[node] = true;
        dfsList.add(node);
        for (int i = 1; i < graph.length; i++) {
            if (graph[node][i] != 0 && !visited[i]) {
                dfs(i);
            }
        }
    }

      static void dfs2(int node) throws IOException {
        Stack<Integer> stack = new Stack<>();
        stack.add(node);
        visited[node] = true;
        while (!stack.isEmpty()) {
            int now = stack.pop();
            dfsList.add(now);
            for (int i = graph.length - 1; i >= 0; i--) {
                if (graph[now][i] != 0 && !visited[i]) {
                    stack.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void bfs(int node) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(node);
        visited[node] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            bfsList.add(now);
            for (int i = 1; i < graph.length; i++) {
                if (graph[now][i] != 0 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int v = input[2];
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int[] nodes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[nodes[0]][nodes[1]] = 1;
            graph[nodes[1]][nodes[0]] = 1;
        }
        dfs(v);
        visited = new boolean[n + 1];
        bfs(v);

        dfsList.forEach(x -> {
            try {
                bw.write(Integer.toString(x) + " ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.write("\n");
        bfsList.forEach(x -> {
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
 */
