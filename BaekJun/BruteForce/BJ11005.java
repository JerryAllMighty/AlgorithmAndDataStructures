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

    
    while (true){
      String cur = "";
      cur = num % jb;
      if(cur > 10){
        answer = (char)(cur + 87) + answer;
      }else{
        answer = cur + answer;
      }
      
      num = num / jb;

      if (num < jb){
        if(num > 10){
          answer = (char)(num + 87) + answer;
        }else{
          answer = num + answer;
        }
        
        break;
      }
    }
      System.out.println(answer);




    
  }
}