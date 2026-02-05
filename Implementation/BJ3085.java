package Implementation;

public class BJ3085 {
    /*
    * 2026.02.05 개인 문제 풀이, 틀림
    *  static char[][] arr;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int getAdjacentCount(int startIndex, int endIndex) {
        int count = 0;
        //인접한 부분이 있는지 검사
        for (int i = 0; i < 4; i++) {
            int tempCount = 1;
            int x = startIndex + dx[i];
            int y = endIndex + dy[i];
            if (x < 0 || x > arr.length - 1 || y < 0 || y > arr.length - 1) {
                continue;
            }
            //있다면 같은 방향으로 검사시작
            if (arr[x][y] == arr[startIndex][endIndex]) {
                tempCount++;
                count = Math.max(count, tempCount);
                int nextRowIndex = x + dx[i];
                int nextColumnIndex = y + dy[i];
                while (nextRowIndex >= 0 && nextRowIndex < arr.length
                        && nextColumnIndex >= 0 && nextColumnIndex < arr.length) {
                    if (arr[startIndex][endIndex] == arr[nextRowIndex][nextColumnIndex]) {
                        tempCount++;
                        count = Math.max(count, tempCount);
                    } else {
                        //인접한 부분을 바꿔서 탐색 가능한지
                        boolean isChangeable = false;
                        for (int j = 0; j < 4; j++) {
                            int adjacentNextRowIndex = nextRowIndex + dx[j];
                            int adjacentNextColumnIndex = nextColumnIndex + dy[j];
                            if (adjacentNextRowIndex < 0 || adjacentNextRowIndex > arr.length - 1 || adjacentNextColumnIndex < 0 || adjacentNextColumnIndex > arr.length - 1) {
                                continue;
                            }
                            if (adjacentNextRowIndex == x && adjacentNextColumnIndex == y) {
                                continue;
                            }
                            if (arr[adjacentNextRowIndex][adjacentNextColumnIndex] == arr[startIndex][endIndex]) {
                                isChangeable = true;
                            }
                        }
                        if (isChangeable) {
                            tempCount++;
                            count = Math.max(count, tempCount);
                            nextRowIndex += dx[i];
                            nextColumnIndex += dy[i];
                        } else {
                            break;
                        }
                    }
                    nextRowIndex += dx[i];
                    nextColumnIndex += dy[i];
                }
            }

        }

        return count;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][];
        for (int i = 0; i < n; i++) {
            char[] input = br.readLine().toCharArray();
            arr[i] = input;
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer = Math.max(answer, getAdjacentCount(i, j));
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
     */
}
