package Sort.Sort.Selection;

public class SelectionSort {
    /* 한국방송통신대학교 알고리즘 예제
   선택 정렬 예제
    */
    public static void Test(String[] args) {
        //선택 정렬 예제 2.1
        int[] lst = {30, 20, 40, 35, 5, 10, 45, 50, 25, 15};
        int[] answers = new int[10];

        //선택 정렬 예제 2.2
//        int[] lst = {60,20,70,10,80,30,50,40};
//        int[] answers = new int[8];

        //나올 수 있는 가장 큰 수가 99999라고 가정

        for (int i = 0; i < lst.length; i++) {
            int min = 99999;
            int changeIdx = 99999;
            for (int j = i; j < lst.length; j++) {
                int currentNum = lst[j];
                if (currentNum < min) {
                    min = currentNum;
                    changeIdx = j;
                }
            }
            if (changeIdx != 99999) {
                int temp = lst[i];
                lst[i] = lst[changeIdx];
                lst[changeIdx] = temp;
            }

            answers[i] = min;
        }

        for (int i : answers) {
            System.out.println(i);

        }
    }
}
