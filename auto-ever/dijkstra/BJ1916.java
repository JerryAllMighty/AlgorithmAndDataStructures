/*
 * 2026 03 17 개인 문제 풀이 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static int[] shortestPath;
    static List<Connection>[] costs;

    static class Connection implements Comparable<Connection> {
        private int targetNode;
        private int cost;

        public Connection(int targetNode, int cost) {
            this.targetNode = targetNode;
            this.cost = cost;
        }

        @Override
        public int compareTo(Connection o) {
            return this.cost - o.cost;
        }
    }

    static void search(int start) {
        PriorityQueue<Connection> queue = new PriorityQueue<>();
        queue.add(new Connection(start, 0));
        shortestPath[start] = 0;

        while (!queue.isEmpty()) {
            Connection currentConnection = queue.poll();
            int currentCity = currentConnection.targetNode;
            int currentCost = currentConnection.cost;

            if (currentCost > shortestPath[currentCity]) {
                continue;
            }

            List<Connection> connectionList = costs[currentCity];
            for (Connection connection : connectionList) {
                if (shortestPath[connection.targetNode] > shortestPath[currentCity] + connection.cost) {
                    shortestPath[connection.targetNode] = shortestPath[currentCity] + connection.cost;
                    queue.add(new Connection(connection.targetNode, shortestPath[connection.targetNode]));
                }

            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        shortestPath = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            shortestPath[i] = Integer.MAX_VALUE;
        }
        costs = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            costs[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            int cost = Integer.parseInt(stringTokenizer.nextToken());
            costs[start].add(new Connection(end, cost));
        }

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int targetStart = Integer.parseInt(stringTokenizer.nextToken());
        int targetEnd = Integer.parseInt(stringTokenizer.nextToken());
        search(targetStart);
        bw.write(String.valueOf(shortestPath[targetEnd] - shortestPath[targetStart]));
        bw.flush();
        bw.close();
    }
}






 */