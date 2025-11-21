package Implementation;

import java.util.Scanner;

class BJ10431
{
    public static void Test (String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while (P-- > 0) {
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++)
                h[i] = sc.nextInt();

            int cnt = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (h[j] > h[i]) {
                        int myH = h[i];
                        // 뒤로 한 칸씩 밀기
                        for (int k = i; k > j; k--) {
                            h[k] = h[k - 1];
                            cnt++;
                        }
                        h[j] = myH;
                        break;
                    }
                }
            }
            System.out.println(T + " " + cnt);
        }
    }
}

//2023.12.25 다른 풀이도 추가
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import static java.lang.Math.max;
//
//public class com.Test.javacompiler.Test {
//    public static void Test(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        sc.nextLine();
//        ArrayList<String> answerList = new ArrayList<String>();
//
//        for (int i = 1; i < cnt + 1; i++) {
//            int answer = 0;
//            String[] each = sc.nextLine().split(" ");
//            ArrayList<Integer> tempList = new ArrayList<Integer>();
//
//            for (int j = 1; j < each.length; j++) {
//                //비교 숫자
//                int cmp = Integer.valueOf(each[j]);
//                int idx = 0;
//                for (int k = 0; k < tempList.size(); k++) {
//                    int tempNum = tempList.get(k);
//                    if (cmp < tempNum) {
//                        answer += tempList.size() - k;
//                        idx = k;
//                        break;
//                    } else {
//                        idx = k + 1;
//                    }
//                }
//                tempList.add(idx, cmp);
//
//            }
//            answerList.add(Integer.toString(i) + " " + answer);
//        }
//
//        for (int i = 0; i < answerList.size(); i++) {
//            System.out.println(answerList.get(i));
//        }
//
//        sc.close();
//    }
//}

/*
* 2025.11.21 2번쨰 풀이, 25분 안에 못 품
*
    static int countStepBack(int[] arr) {
        int result = 0;
        int l = 1;
        int r = 2;

        while () {
            for (int i = 0; i < r; i++) {
                if (arr[i] > arr[r]) {
                    int[] temp = new int[20];
                    temp[0] = arr[r];
                    for (int j = 0; j < 19; j++) {
                        temp[j + 1] = arr[j];
                    }
                    result += r;
                }

            }

            r++;


        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int p = Integer.parseInt(br.readLine());
        for (int i = 0; i < p; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(arr[0] + " " + countStepBack(arr));
        }

        bw.flush();
        bw.close();
        br.close();
    }
 */