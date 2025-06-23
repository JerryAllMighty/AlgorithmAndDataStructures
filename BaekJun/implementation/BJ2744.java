package BaekJun.implementation;
import java.util.Scanner;

public class BJ2744 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str =  sc.next(); 
    String ans = "";
    for(int i = 0; i< str.length();i++){
      char ch = str.charAt(i);
      if('A' <= ch && ch <= 'Z'){
        ans += (char)('a' + ch - 'A');

      }else {ans += (char)('A' + ch - 'a');}
    }
    System.out.println(ans);
    
  }
}

//2023.12.25 새로운 문제풀이 추가
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import static java.lang.Math.max;
//
//public class com.main.javacompiler.Main {
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    StringBuilder sb = new StringBuilder();
//    char[] given = sc.nextLine().toCharArray();
//    for (int i = 0; i < given.length; i++) {
//      char each = given[i];
//      if (Character.isUpperCase(each)) {
//        String lowerCase = String.valueOf(each).toLowerCase();
//        sb.append(lowerCase);
//      }else{
//        String upperCase = String.valueOf(each).toUpperCase();
//        sb.append(upperCase);
//      }
//    }
//    System.out.println(sb);
//    sc.close();
//  }
//}