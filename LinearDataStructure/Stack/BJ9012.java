/*
 * 2026.02.28 개인 문제 풀이, 40분, 통과 완료
 * import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            Stack<String> openParenthesis = new Stack<>();
            String[] parenthesisArray = br.readLine().split("");
            boolean isValid = true;
            for (String s : parenthesisArray) {
                if ("(".equals(s)) {
                    openParenthesis.add(s);
                } else {
                    if(!openParenthesis.isEmpty()){
                        openParenthesis.pop();
                    }else{
                        isValid = false;
                    }
                }
            }
            if(!isValid){
                bw.write("NO\n");
            }else{
                bw.write(openParenthesis.isEmpty() ? "YES\n" : "NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
 */