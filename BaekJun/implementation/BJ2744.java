package BaekJun.implementation;
import java.util.Scanner;

public class Main {

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