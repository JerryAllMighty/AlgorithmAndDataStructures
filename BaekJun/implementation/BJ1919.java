package BaekJun.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ1919 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    sc.close();

    int[] countA = new int[26]; //문자열 개수 카운트
    int[] countB = new int[26];

    for(int i = 0; i < a.length(); i++){
      countA[a.charAt(i) - 'a']++;


    }
    for(int i = 0; i < b.length(); i++){
      countB[b.charAt(i) - 'a']++; 


    }
    int ans = 0;
    for (int i = 0; i < 26; i++){
      if(countA[i] > countB[i]){
        ans += countA[i] - countB[i];
      }else if(countB[i] > countA[i]){
        ans += countB[i] - countA[i];
      }
    }
    System.out.println(ans);

  }
}

//2023.12.25 새로운 문제풀이 추가

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import static java.lang.Math.max;
//
//public class Main {
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    char[] first = sc.nextLine().toCharArray();
//    char[] second = sc.nextLine().toCharArray();
//
//    //A에서 같은 글자 개수를 찾는다
//    int answer = 0;
//    int sameACnt = 0;
//    ArrayList<Integer> foundA = new ArrayList<Integer>();
//    for (int i = 0; i < first.length; i++) {
//      String eachA = String.valueOf(first[i]);
//      for (int j = 0; j < second.length; j++) {
//        String eachB = String.valueOf(second[j]);
//        if (eachA.equals(eachB) && !foundA.contains(j)) {
//          sameACnt++;
//          foundA.add(j);
//          break;
//        }
//      }
//    }
//    answer += (first.length - sameACnt) + (second.length - sameACnt);
//    System.out.println(answer);
//    sc.close();
//  }
//
//
//}
