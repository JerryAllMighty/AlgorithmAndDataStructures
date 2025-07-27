import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }
        while (dq.size() > 1) {
            dq.pollFirst();
            int num = dq.pollFirst();
            dq.addLast(num);
        }
        dq.forEach(x -> System.out.println(x));
    }

}
