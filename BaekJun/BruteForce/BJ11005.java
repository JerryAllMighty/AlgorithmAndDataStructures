
import java.lang.reflect.Method;
import java.util.Scanner;

public class BJ11005{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] given = sc.nextLine().split(" ");
    sc.close();

    int num = Integer.parseInt(given[0]);
    int jb = Integer.parseInt(given[1]);

    String answer = "";

    
    while (num >= jb){
      int cur = -1;
      cur = num % jb;
      num = num / jb;
      if(cur >= 10){
        answer = (char)(cur + 55) + answer;
      }else{
        answer = cur + answer;
      }
      
      
    }
    if(num % jb >= 10){
      answer = (char)(num % jb + 55) + answer;
    }else{
      answer = num % jb + answer;
    }
    System.out.println(answer);




    
  }

  /*2024.02.24
  다른 풀이 시도, 시존보다 성능 안 좋음
   */
//  import java.util.Scanner;

//  public class com.main.javacompiler.Main {
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      String[] given = sc.nextLine().split(" ");
//      int toChange = Integer.parseInt(given[0]);
//      int jb = Integer.parseInt(given[1]);
//
//      char[] overTens = new char[36];
//      for(int i = 0; i < 36;i++){
//        if(i >= 10){
//          overTens[i] = (char)(i+55);
//        }else{
//          overTens[i] = Character.forDigit(i, 10);
//        }
//
//      }
//
//      String answer = "";
//      while(true){
//        if(toChange >= jb){
//          answer = overTens[toChange%jb] + answer;
//          toChange = toChange/jb;
//        }else{
//          answer = overTens[toChange] + answer;
//          break;
//        }
//      }
//
//      System.out.println(answer);
//    }
//  }

}