/*
 * 20260314 재시도, 개인 문제 풀이, 통과 완료
 * import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static List<Node>[] graph;
    static int[] shortestPath;

    static class Node implements Comparable<Node> {
        private int targetNumber;
        private int weight;

        public Node(int targetNumber, int weight) {
            this.targetNumber = targetNumber;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }

    static void dijkstra(int startNode) {
        shortestPath[startNode] = 0;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(startNode, 0));

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            int currentVertex = currentNode.targetNumber;
            int currentWeight = currentNode.weight;

            if (currentWeight > shortestPath[currentVertex]) continue;

            List<Node> adjacentList = graph[currentVertex];
            for (Node nextNode : adjacentList) {
                if (shortestPath[currentVertex] + nextNode.weight < shortestPath[nextNode.targetNumber]) {
                    shortestPath[nextNode.targetNumber] = shortestPath[currentVertex] + nextNode.weight;
                    priorityQueue.add(new Node(nextNode.targetNumber, shortestPath[nextNode.targetNumber]));
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
        graph = new List[V + 1];
        for (int i = 0; i < V + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        shortestPath = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            shortestPath[i] = INF;
        }
        for (int i = 0; i < E; i++) {
            StringTokenizer lineStringTokenizer = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(lineStringTokenizer.nextToken());
            int v = Integer.parseInt(lineStringTokenizer.nextToken());
            int w = Integer.parseInt(lineStringTokenizer.nextToken());
            graph[u].add(new Node(v, w));
        }

        dijkstra(K);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (shortestPath[i] == INF) {
                stringBuilder.append("INF");
            } else {
                stringBuilder.append(shortestPath[i]);
            }
            stringBuilder.append("\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}





 */
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