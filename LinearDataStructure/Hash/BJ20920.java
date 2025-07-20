package LinearDataStructure.Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ20920 {
    public static void main(String[] args) throws IOException {
        //속도가 더 빠른 BufferedReader를 Scanner 대신 사용하는 것으로
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> temp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() >= m) {
                //기본 값 지정 가능
                temp.put(s, temp.getOrDefault(s, 0) + 1);
            }
        }
        br.close();

        //리스트의 커스텀 정렬은 Comparator의 체이닝 정렬을 활용
        //정렬 안에서 개수를 세기 위해서 또 반복문을 도는 것 보다는 해쉬맵을 활용해서 개수를 저장하고 이를 활용하는 것이 더 일반적
        List<Map.Entry<String, Integer>> lst = new ArrayList<>(temp.entrySet());
        lst.sort(
                Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(y -> y.getKey().length(), Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey)
        );


        StringBuilder sb = new StringBuilder();
        lst.forEach(x -> sb.append(x.getKey() + "\n"));
        System.out.println(sb);

        //출력은 한 번만 하는 것으로
//        lst.forEach(x -> System.out.println(x.getKey()));

    }

}
