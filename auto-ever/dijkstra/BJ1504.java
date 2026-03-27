/*
 * 2026 03 27 복기 풀이 완료
 * import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int e;
    static int v1;
    static int v2;
    static List<Node>[] graph;
    static int[] shortestPath;
    static final int INF = 200000000;

    static class Node implements Comparable<Node> {
        private int targetNode;
        private int weight;

        public Node(int targetNode, int weight) {
            this.targetNode = targetNode;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }

    static long search(int start, int end) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start, 0));

        Arrays.fill(shortestPath, Integer.MAX_VALUE);
        shortestPath[start] = 0;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int currentNode = current.targetNode;
            int currentWeight = current.weight;

            if (shortestPath[currentNode] < currentWeight) {
                continue;
            }

            List<Node> nodeList = graph[currentNode];
            for (Node node : nodeList) {
                if (shortestPath[node.targetNode] > shortestPath[currentNode] + node.weight) {
                    shortestPath[node.targetNode] = shortestPath[currentNode] + node.weight;
                    queue.add(new Node(node.targetNode, shortestPath[node.targetNode]));
                }
            }
        }

        return shortestPath[end];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        e = Integer.parseInt(stringTokenizer.nextToken());
        graph = new List[n + 1];
        shortestPath = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < e; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }
        stringTokenizer = new StringTokenizer(br.readLine());
        v1 = Integer.parseInt(stringTokenizer.nextToken());
        v2 = Integer.parseInt(stringTokenizer.nextToken());

        long result1 = 0;
        result1 += search(1, v1);
        result1 += search(v1, v2);
        result1 += search(v2, n);

        long result2 = 0;
        result2 += search(1, v2);
        result2 += search(v2, v1);
        result2 += search(v1, n);

        long answer = Math.min(result1, result2);
        if (result1 >= INF && result2 >= INF) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(answer));
        }

        bw.flush();
        bw.close();
    }
}






 */
/*
 * 2026 03 24 복기 풀이 실패
 * import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        private int targetNode;
        private int cost;

        public Node(int targetNode, int cost) {
            this.targetNode = targetNode;
            this.cost = cost;
        }
    }

    static List<Node>[] nodes;
    static int n;
    static int e;
    static int u;
    static int v;
    static int[] answer;
    static List<Integer>[] visited;

    static int dijkstra(int start, int end) {
        answer = new int[n + 1];
        Arrays.fill(answer, Integer.MAX_VALUE);
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if(){}

            List<Node> nodeList = nodes[currentNode.targetNode];
            for (Node node : nodeList) {
                int targetNode = node.targetNode;
                int cost = node.cost;
                if (answer[targetNode] > answer[currentNode.targetNode] + cost) {
                    answer[targetNode] = answer[currentNode.targetNode] + cost;
                    queue.add(new Node(targetNode, answer[targetNode]));
                }
            }
        }
        return answer[end];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        e = Integer.parseInt(stringTokenizer.nextToken());
        nodes = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }
        visited = new List[n + 1];
        for (int i = 0; i < e; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int current = Integer.parseInt(stringTokenizer.nextToken());
            int target = Integer.parseInt(stringTokenizer.nextToken());
            int cost = Integer.parseInt(stringTokenizer.nextToken());
            nodes[current].add(new Node(target, cost));
            nodes[target].add(new Node(current, cost));
        }

        stringTokenizer = new StringTokenizer(br.readLine());
        u = Integer.parseInt(stringTokenizer.nextToken());
        v = Integer.parseInt(stringTokenizer.nextToken());

        long firstDistanceToCompare = 0;
        firstDistanceToCompare += dijkstra(1, u);
        firstDistanceToCompare += dijkstra(u, v);
        firstDistanceToCompare += dijkstra(v, n);

        long secondDistanceToCompare = 0;
        secondDistanceToCompare += dijkstra(1, v);
        secondDistanceToCompare += dijkstra(v, u);
        secondDistanceToCompare += dijkstra(v, n);

//        bw.write(answer[]String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}






 */