import java.util.ArrayList;
import java.util.Scanner;

public class BJ11068{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int[] answers = new int[cnt];

    private Boolean isPalindrome(int num, int jb){ 
        String jbNum = "";
        while(num >= jb){
          int nmg = num %jb;
          jbNum = String.valueOf(nmg) + jbNum;
          num = num/jb;

        }
        String cmp = "";
        for(int i =jbNum.length()-1; i >= 0; i--){
          cmp += jbNum[i];

        }

        return jbNum.equals(cmp) ? true:false;
    }


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