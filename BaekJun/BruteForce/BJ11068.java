import java.util.ArrayList;
import java.util.Scanner;

public class BJ11068{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int[] answers = new int[cnt];
    for(int i = 0; i< cnt; i++){
      int num = sc.nextInt();
      int jb =1;
      Boolean bFlag = false;
      while (true){
        bFlag= isPalindrome(num, jb);

        if (bFlag == true){
          answers[i] = jb;
          break;
        }

        jb++;
      }

    }
    sc.close();

  }
}