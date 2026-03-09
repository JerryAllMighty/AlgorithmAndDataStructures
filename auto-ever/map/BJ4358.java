/*
* 2026.03.10
* 개인 문제 풀이, 정답 코드
* import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 백엔드 실무에서도 대용량 텍스트 처리엔 BufferedReader가 국룰!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사전순 정렬을 보장하는 TreeMap 선택
        Map<String, Integer> treeMap = new TreeMap<>();
        int totalCount = 0;

        String s;
        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) break; // 빈 줄 예외 처리

            // Map.getOrDefault는 자바 8 이후 최고의 꿀팁 중 하나죠!
            treeMap.put(s, treeMap.getOrDefault(s, 0) + 1);
            totalCount++;
        }

        StringBuilder sb = new StringBuilder();
        // 이미 정렬되어 있으므로 차례대로 꺼내기만 하면 됨
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String name = entry.getKey();
            double count = entry.getValue();

            // 백분율 계산 및 소수점 4자리 포맷팅
            double ratio = (count * 100) / totalCount;
            sb.append(name).append(" ").append(String.format("%.4f", ratio)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
 */