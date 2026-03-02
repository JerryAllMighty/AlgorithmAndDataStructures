/*
* 2026.03.02
* import java.io.*;

public class Main {
    static class AC {
        private int[] arr;

        public AC(int[] arr) {
            this.arr = arr;
        }

        private void R() {
            int[] reversedArr = new int[arr.length];
            for (int i = arr.length - 1; i >= 0; i--) {
                reversedArr[arr.length - 1 - i] = arr[i];
            }
            this.arr = reversedArr;
        }

        private void D() {
            if (arr.length == 0) {
                return;
            }
            int[] newArr = new int[arr.length - 1];
            for (int i = 1; i < arr.length; i++) {
                newArr[i - 1] = arr[i];
            }
            this.arr = newArr;
        }

        @Override
        public String toString() {
            if (arr.length == 0) {
                return "error";
            }
            //Arrays.toString(arr);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for (int i = 0; i < arr.length; i++) {
                stringBuilder.append(arr[i]);
                if (i != arr.length - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            char[] function = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());

            String[] arr = br.readLine().split(",");
            int[] convertedArr = new int[n];
            int index = 0;
            boolean isEmpty = false;
            for (String s : arr) {
                if (s.contains("[")) {
                    s = s.substring(1);
                }
                if (s.contains("]")) {
                    s = s.substring(0, s.length() - 1);
                }
                if (s.isEmpty()) {
                    isEmpty = true;
                    break;
                }
                convertedArr[index++] = Integer.parseInt(s);
            }
            AC ac = new AC(convertedArr);
            for (char c : function) {
                if (c == 'R') {
                    ac.R();
                } else if (c == 'D') {
                    ac.D();
                }
            }
            if (!isEmpty) {
                bw.write(ac.toString() + "\n");
            } else {
                bw.write("error" + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
 */