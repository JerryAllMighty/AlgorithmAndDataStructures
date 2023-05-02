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

    final int changeOverTen(int targetNum){
      int ans = 0;
      if(targetNum > 10){
        Char ch = (char)targetNum;
      }
      return ans;
    }
    
    while (true){
      String cur = "";
      cur += num % jb;

      answer = cur + answer;
      num = num / jb;

      if (num < jb){
        answer = num + answer;
        break;
      }
    }
      System.out.println(answer);




    
  }
}