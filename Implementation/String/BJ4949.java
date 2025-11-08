package Implementation.String;

import java.io.*;
import java.util.Stack;

public class BJ4949 {


    static boolean isMatch(String s, char chr1, char chr2) {
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == chr1) {
                stack.push(new int[]{i, c});
            } else if (c == chr2) {
                int[] values = stack.peek();
                String targetString = s.substring(values[0]+1, i);
                if (isBalance(targetString)) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isSameCount(String s, char chr1, char chr2) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == chr1) {
                stack.push(c);
            } else if (c == chr2) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    static boolean isBalance(String s) {
//        모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
        if (!isMatch(s, '(', ')')) {
            return false;
        }
//        모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
        if (!isMatch(s, '{', '}')) {
            return false;
        }

//        모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
        if (!isSameCount(s, ')', '(')
                || !isSameCount(s, '}', '{')) {
            return false;
        }
//                모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
//        짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
        //소괄호("()") 와 대괄호("[]")로 2종류
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            while (true) {
                String sentence = br.readLine();
                if (sentence.trim().equals(".")) {
                    break;
                }
                boolean isBalance = isBalance(sentence);
                bw.write(isBalance ? "yes" : "no");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.flush();
            bw.close();
            br.close();
        }
    }
}
