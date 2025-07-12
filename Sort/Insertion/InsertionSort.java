package Sort.Insertion;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void Test(String[] args) {
        //삽입 정렬의 경우 기존 정렬된 리스트에 데이터 삽입이 이루어지기에, 원할하게 데이터 삽입이 이루어지는 List를 활용
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(30, 20, 40, 35, 5, 10, 45, 50, 25, 15));
        ArrayList<Integer> sortedList = new ArrayList<>();
        ArrayList<Integer> sortedListDesc = new ArrayList<>();

        //예제 2.7
        //초기값 삽입
        int initNumber = lst.get(0);
        sortedList.add(initNumber);

        //하나씩 데이터를 뽑아서 이미 정렬된 리스트에 삽입해주는 방식 (오름차순)
        for (int i = 1; i < lst.size(); i++) {
            //뽑은 하나의 데이터
            int num = lst.get(i);
            //이미 정렬된 리스트에 들어갈 위치를 탐색
            int insertIdx = sortedList.size();
            for (int j = sortedList.size() - 1; j >= 0; j--) {
                int sortedNum = sortedList.get(j);
                if (sortedNum > num) {
                    insertIdx = j;
                } else {
                    break;
                }
            }
            //삽입
            sortedList.add(insertIdx, num);
        }

        for (int i : sortedList) {
            System.out.println(i);
        }

        /*
        예제 2.8

        //초기값 삽입
        int initNumber = lst.get(0);
        sortedListDesc.add(initNumber);

        //하나씩 데이터를 뽑아서 이미 정렬된 리스트에 삽입해주는 방식 (내림차순)
        for (int i = 1; i < lst.size(); i++) {
            //뽑은 하나의 데이터
            int num = lst.get(i);
            //이미 정렬된 리스트에 들어갈 위치를 탐색
            int insertIdx = sortedListDesc.size();
            for (int j = sortedListDesc.size() - 1; j >= 0; j--) {
                int sortedNum = sortedListDesc.get(j);
                if (sortedNum < num) {
                    insertIdx = j;
                }else{
                    break;
                }
            }
            //삽입
            sortedListDesc.add(insertIdx, num);
        }

        for (int i : sortedListDesc) {
            System.out.println(i);
        }

        */
    }
}
