import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        String[] strList = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            String s = sc.nextLine();
            strList[i] = s;
        }

        Arrays.sort(strList);

        for (String str : strList) {
            System.out.println(str);

        }
    }
}



