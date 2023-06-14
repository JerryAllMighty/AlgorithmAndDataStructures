import java.util.ArrayList;
import java.util.Scanner;

public class BJ11068{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();

    for(int i = 0; i < cnt; i++){
      int num = sc.nextInt();
      int jb = 2;
      int result = 0;
      while (jb <= 64){
      //check whether it is a pelindrome or not, in each jb
      result = isPalindrome(num, jb);
      if(result == 1){
      break;
      }else{
        jb += 1;}
      }
    System.out.println(result);
    }

    sc.close();
  }

  private static int isPalindrome(int num, int jb) {
int result = 0;
int nmg = 0;
// to change into jb Nums
while(1 == 1){
  nmg = num % jb;
  
num = num / jb;


}
//to check whether it is a pelindrome
String targetNum = Integer.toString(num);
String reverseNum = "";
for(int i = targetNum.length() -1; i >= 0;i--){
reverseNum += targetNum.substring(i, i+1);
}
// targetNum.substring(targetNum.length() -1, 0);
return result;
  }

}