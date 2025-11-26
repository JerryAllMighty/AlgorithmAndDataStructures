package ProblemSolvingSkills.PrefixSum;

import java.io.*;
import java.util.Arrays;

public class BJ19951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] grounds = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        for (int i = 0; i < m; i++) {
            int[] order = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = order[0];
            int b = order[1];
            int k = order[2];
            for (int j = a - 1; j < b; j++) {
                grounds[j] += k;
            }
        }
        for (int ground : grounds) {
            bw.write(Integer.toString(ground) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

/*
 * 2025.11.26
 * import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] origin = new int[N + 1];
        for (int i = 1; i <= N; i++)
            origin[i] = sc.nextInt();

        int[] delta = new int[N + 2];
        while (M-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            delta[a] += k;
            delta[b + 1] -= k;
        }

        int[] accDelta = new int[N + 1];
        for (int i = 1; i <= N; i++)
            accDelta[i] = accDelta[i - 1] + delta[i];

        for (int i = 1; i <= N; i++)
            System.out.print(origin[i] + accDelta[i] + " ");
        System.out.println();
    }
}
 */
