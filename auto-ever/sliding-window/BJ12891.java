/*
 * 2026.03.08
 * 슬라이딩 윈도우와 투 포인터를 쓰는 기준 명확히
 * STring Tokenizer 도 활용 가능해야함
 * import java.io.*;
import java.util.*;

public class Main {
    static int[] requirements;

    static int getIndex(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return -1;
        }
    }

    static int[] add(int[] checked, char c) {
        int index = getIndex(c);
        checked[index]++;
        return checked;
    }

    static int[] remove(int[] checked, char c) {
        int index = getIndex(c);
        if (checked[index] < 0) {
            checked[index] = 0;
        } else {
            checked[index]--;
        }
        return checked;
    }

    static boolean isValid(int[] checked) {
        for (int i = 0; i < requirements.length; i++) {
            if (checked[i] < requirements[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        String word = br.readLine();
        requirements = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            requirements[i] = Integer.parseInt(st.nextToken());
        }
        int[] checked = new int[4];
        for (int i = 0; i < p; i++) {
            char c = word.charAt(i);
            int index = getIndex(c);
            checked[index]++;
        }
        int answer = 0;
        if (isValid(checked)) {
            answer++;
        }

        int index = 0;
        while (index + p < s) {
            remove(checked, word.charAt(index));
            add(checked, word.charAt(index + p));
            if (isValid(checked)) {
                answer++;
            }
            index++;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}


 */