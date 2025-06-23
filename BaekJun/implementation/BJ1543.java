package BaekJun.implementation;

import java.util.Scanner;

public class BJ1543 {
  public static void Test(String[] args) {
    Scanner sc = new Scanner(System.in);
    String doc = sc.nextLine();
    String word = sc.nextLine(); 
    sc.close();
    int count = 0;
    int startIndex = 0;

    while (true){
      int findIndex = doc.indexOf(word, startIndex);
      if (findIndex < 0 ){
        break;
      }
      count++;
      startIndex = findIndex + word.length();

    }
    System.out.println(count);
  }

  //2024.01.01 재시도, java 내장 함수 사용 아닌 일일히 구현.
  //결과는 메모리 초과
//  public static void Test(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String given = sc.nextLine();
//    String toSearch = sc.nextLine();
//
//    int startIdx = 0;
//    int endIdx = 1;
//    int answer = 0;
//
//    while (true) {
//      if (startIdx == given.length()) {
//        break;
//      }
//      String targetString = given.substring(startIdx, endIdx);
//      if (targetString.equals(toSearch)) {
//        answer++;
//        startIdx = endIdx;
//        endIdx = startIdx + 1;
//        continue;
//      } else {
//        endIdx++;
//      }
//
//      if (endIdx == given.length()+1) {
//        startIdx++;
//        endIdx = startIdx + 1;
//      }
//    }
//    System.out.println(answer);
//    sc.close();
//  }
}
