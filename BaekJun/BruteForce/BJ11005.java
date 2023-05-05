
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
}