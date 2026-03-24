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