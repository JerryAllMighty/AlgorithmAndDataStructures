/*
 * 2026 04 01 개인 문제 풀이 통과 완료
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int w = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(br.readLine());
//        int[] trucks = new int[n];
        Queue<Integer> trucks = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int truck = Integer.parseInt(stringTokenizer.nextToken());
            trucks.offer(truck);
        }
        int answer = 0;
        int currentLoaded = 0;
        Deque<Integer> currentTrucks = new ArrayDeque<>(w);
        for (int i = 0; i < w; i++) {
            currentTrucks.offer(0);
        }
        while (true) {
            currentLoaded -= currentTrucks.pollFirst();
            if(!trucks.isEmpty()){
                int expectedTruck = trucks.peek();
                if (currentLoaded + expectedTruck <= L) {
                    int newTruck = trucks.poll();
                    currentTrucks.offer(newTruck);
                    currentLoaded += newTruck;
                }else{
                    currentTrucks.offer(0);
                }
            }

            answer++;
            if (trucks.isEmpty() && currentTrucks.isEmpty()) {
                break;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}






 */
/*
* 2026.03.08, 개인 문제 풀이, 테케 통과 못함, 복기 때 통과 성공
* 시간 당 수행되어야하는 작업 단위 분리, 큐를 다 뽑고 나서 0을 큐에 적재하는 분기를 구분 못했음
* import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] weights = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int w = info[1];
        int L = info[2];
        Queue<Integer> availableTrucks = new ArrayDeque<>();
        for (int weight : weights) {
            availableTrucks.add(weight);
        }

        Queue<Integer> currentTrucks = new ArrayDeque<>();
        for (int i = 0; i < w; i++) {
            currentTrucks.add(0);
        }

        int currentWeight = 0;
        int answer = 0;
        while (!currentTrucks.isEmpty()) {
            answer++;
            //이동
            currentWeight -= currentTrucks.poll();
            //새 트럭 진입 가능한지
            if (!availableTrucks.isEmpty()) {
                if (currentWeight + availableTrucks.peek() <= L && currentTrucks.size() <= w) {
                    int nextTruck = availableTrucks.poll();
                    currentWeight += nextTruck;
                    currentTrucks.add(nextTruck);
                }else{
                    currentTrucks.add(0);
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
*/