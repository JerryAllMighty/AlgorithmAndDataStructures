package Implementation.Recursive;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ11725 {
    static Node[] nodes;

    static class Node {
        private Node parent;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public static void linkNodes(Node firstNode, Node secondNode) {
            if (firstNode.value == 1) {
                secondNode.parent = firstNode;
            } else if (secondNode.value == 1) {
                firstNode.parent = secondNode;
            } else if (firstNode.parent != null) {
                secondNode.parent = firstNode;
            } else {
                firstNode.parent = secondNode;
            }
            nodes[firstNode.value] = firstNode;
            nodes[secondNode.value] = secondNode;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        nodes = new Node[n + 1];
        int[][] infos = new int[n - 1][];
        for (int i = 0; i < n - 1; i++) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            infos[i] = info;
        }
        Arrays.sort(infos, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        for (int[] info : infos) {
            Node firstNode = nodes[info[0]] == null ? new Node(info[0]) : nodes[info[0]];
            Node secondNode = nodes[info[1]] == null ? new Node(info[1]) : nodes[info[1]];
            Node.linkNodes(firstNode, secondNode);
        }

        for (int i = 2; i <= n; i++) {
            bw.write(String.valueOf(nodes[i].parent.value) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
