import java.util.ArrayList;
import java.util.Scanner;

public class BJ11068{
  static Boolean isPalindrome(final int n, final int j){ 
    int targetNum = n;
    String jbNum = String.valueOf(targetNum);
    while(targetNum >= j){
      int nmg = targetNum %j;
      jbNum = String.valueOf(nmg) + jbNum;
      targetNum = targetNum/j;

    }
    jbNum = String.valueOf(targetNum) + jbNum;


    String cmp = "";
    for(int i =jbNum.length()-1; i >= 0; i--){
      cmp += jbNum.charAt(i);

    }

    return jbNum.equals(cmp) ? true:false;
}

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