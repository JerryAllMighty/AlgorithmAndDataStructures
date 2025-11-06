package Search.BinarySearch;

import java.io.*;
import java.util.Arrays;

//TODO : 해당 클래스 다시 풀어보기
public class BJ2110 {
    static int[] houses;
    static int c;

    static int getPossibleCount(int end, int distance) {
        int count = 0;
        int index = 0;
        int nextIndex = end + 1;
        while (nextIndex <= houses.length) {
            if (houses[nextIndex] - houses[index] > distance) {
                count++;
                index = nextIndex;
            }
            nextIndex++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        c = input[1];

        //C개의 공유기를 N개의 집에 적당히 설치해서, 가장 인접한 두 공유기 사이의 거리를 최대로 하는 프로그램
        houses = new int[n];
        for (int i = 0; i < n; i++) {
            int position = Integer.parseInt(br.readLine());
            houses[i] = position;
        }

        Arrays.sort(houses);

        //차이
        int l = houses[0];
        int r = houses[n - 1] - houses[0];
        while (l <= r) {
            int mid = (l + r) / 2;
//            int distance = getPossibleCount(mid);


        }


    }
}
