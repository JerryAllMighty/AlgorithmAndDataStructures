import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        int[] lstA = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] lstB = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int i = 0; i <= n - m; i++) {
            int[] temp = new int[m];
            Arrays.fill(temp, 0);
            List<Integer> visited = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int val = lstA[i + j];
                for (int k = 0; k < lstB.length; k++) {
                    if (val == lstB[k] && !visited.contains(k)) {
                        temp[j] = val;
                        visited.add(k);
                        break;
                    }

                }

            }
            //아름다운 수인지 판단
            long cnt = Arrays.stream(temp).filter(x -> x != 0).count();
            if (cnt == m) {
                answer++;
            }


        }
        System.out.println(answer);


    }
}










