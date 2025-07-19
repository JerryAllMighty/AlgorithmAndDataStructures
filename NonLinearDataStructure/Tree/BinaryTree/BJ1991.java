package NonLinearDataStructure.Tree.BinaryTree;

import java.util.Scanner;

public class BJ1991 {
    static StringBuilder preOrderSb = new StringBuilder();
    static StringBuilder inOrderSb = new StringBuilder();
    static StringBuilder postOrderSb = new StringBuilder();
    static BinaryNode binaryNode = new BinaryNode();

    static class BinaryNode {
        public String head;
        public BinaryNode leftNode;
        public BinaryNode rightNode;

        BinaryNode() {
        }

        BinaryNode(String head) {
            this.head = head;
        }

        BinaryNode(String[] info) {
            this.head = info[0];
            this.leftNode = new BinaryNode(info[1]);
            this.rightNode = new BinaryNode(info[2]);
        }

        void setInfo(String[] info) {
            String head = info[0];
            BinaryNode node = findHead(head, this);
            node.head = head;
            node.leftNode = new BinaryNode(info[1]);
            node.rightNode = new BinaryNode(info[2]);
        }
    }

    static BinaryNode findHead(String head, BinaryNode node) {
        if (node == null) {
            return null;
        }
        if (node.head.equals(head)) {
            return node;
        }
        BinaryNode leftFoundNode = findHead(head, node.leftNode);
        return leftFoundNode == null ? findHead(head, node.rightNode) : leftFoundNode;
    }

    static void preOrder(BinaryNode binaryNode) {
        if (binaryNode.head.equals(".")) {
            return;
        }
        preOrderSb.append(binaryNode.head);
        preOrder(binaryNode.leftNode);
        preOrder(binaryNode.rightNode);
    }

    static void inOrder(BinaryNode binaryNode) {
        if (binaryNode.head.equals(".")) {
            return;
        }
        inOrder(binaryNode.leftNode);
        inOrderSb.append(binaryNode.head);
        inOrder(binaryNode.rightNode);
    }

    static void postOrder(BinaryNode binaryNode) {
        if (binaryNode.head.equals(".")) {
            return;
        }
        postOrder(binaryNode.leftNode);
        postOrder(binaryNode.rightNode);
        postOrderSb.append(binaryNode.head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().split(" ");
            if (info[0].equals("A")) {
                binaryNode = new BinaryNode(info);
            } else {
                binaryNode.setInfo(info);
            }
        }
        preOrder(binaryNode);
        inOrder(binaryNode);
        postOrder(binaryNode);

        System.out.println(preOrderSb.toString());
        System.out.println(inOrderSb.toString());
        System.out.println(postOrderSb.toString());
    }
}
