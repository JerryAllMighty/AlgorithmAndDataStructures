/*
 * 2026.03.13 복기 때 통과
 * import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        private int nextNode;
        private int weight;

        public Node(int nextNode, int weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }

    static int[] shortestPath;
    static List<Node>[] adjacentList;

    static void dijkstra(int startNode) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(startNode, 0));
        shortestPath[startNode] = 0;

        while (!priorityQueue.isEmpty()) {
            Node targetNode = priorityQueue.poll();
            int currentNode = targetNode.nextNode;
            int currentWeight = targetNode.weight;

            if (currentWeight > shortestPath[currentNode]) {
                continue;
            }

            List<Node> adjacentNodeList = adjacentList[currentNode];
            for (Node node : adjacentNodeList) {
                if (shortestPath[currentNode] + node.weight < shortestPath[node.nextNode]) {
                    shortestPath[node.nextNode] = shortestPath[currentNode] + node.weight;
                    priorityQueue.add(new Node(node.nextNode, shortestPath[node.nextNode]));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(stringTokenizer.nextToken());
        int E = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(br.readLine());
        shortestPath = new int[V + 1];
        Arrays.fill(shortestPath, Integer.MAX_VALUE);
        adjacentList = new List[V + 1];
        for (int i = 0; i <= V; i++) {
            adjacentList[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            StringTokenizer lineStringTokenizer = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(lineStringTokenizer.nextToken());
            int v = Integer.parseInt(lineStringTokenizer.nextToken());
            int w = Integer.parseInt(lineStringTokenizer.nextToken());
            adjacentList[u].add(new Node(v, w));
        }
        dijkstra(K);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            int pathCount = shortestPath[i];
            if (pathCount == Integer.MAX_VALUE) {
                stringBuilder.append("INF");
            } else {
                stringBuilder.append(pathCount);
            }
            stringBuilder.append("\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}





 */