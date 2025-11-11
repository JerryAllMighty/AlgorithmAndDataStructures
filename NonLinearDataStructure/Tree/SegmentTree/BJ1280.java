package NonLinearDataStructure.Tree.SegmentTree;

import java.io.*;
import java.math.BigInteger;

public class BJ1280 {

    static int[] positions;

    static BigInteger getCost(int index) {
        BigInteger result = new BigInteger("0");
        //각각의 나무를 심는데 드는 비용은 현재 심어져있는 모든 나무 까지 거리의 합
        for (int i = 0; i < index; i++) {
            BigInteger addNum = new BigInteger(Integer.toString(Math.abs(positions[index] - positions[i])));
            result = result.add(addNum);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        positions = new int[n];
        BigInteger answer = new BigInteger("1");

        for (int i = 0; i < n; i++) {
            int position = Integer.parseInt(br.readLine());
            positions[i] = position;
            BigInteger cost = getCost(i);
            if (i != 0) {
                answer = answer.multiply(cost);
            }
        }

        bw.write(answer.mod(new BigInteger("1000000007")).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
