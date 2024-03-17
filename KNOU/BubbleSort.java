package KNOU;

public class BubbleSort {
    public static void main(String[] args) {
        //예제 2.3
        int[] lst = {30, 20, 40, 35, 5, 10, 45, 50, 25, 15};
        int[] answers = new int[10];

        //서로 인접한 두 데이터를 비교하여 정렬 기준에 따라 정렬
        //왼쪽에서부터 정렬
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                int left = lst[j];
                int right = lst[j+1];

                if (left > right) {
                    int temp = left;
                    lst[j] = right;
                    lst[j+1] = temp;

                }
            }
        }

        //예제 2.4
        //반대 방향, 오른쪽에서부터 정렬
        for (int i = 10; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                int left = lst[j-1];
                int right = lst[j];

                if (left > right) {
                    int temp = right;
                    lst[j] = left;
                    lst[j-1] = temp;

                }
            }
        }

        for (int i : lst) {
            System.out.println(i);
        }
    }
}
