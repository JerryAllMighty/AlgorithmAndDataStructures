package BaekJun.implementation;

import java.util.Scanner;

public class BJ1157 {
  public static int getAlphabetCount(String str, char alp){
    int count = 0;
    for(int i =0; i < str.length(); i++){
        if(alp == str.charAt(i))count++;

    }
    return count;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next().toUpperCase();

    int maxCount = -1;
    int maxAlphabet = '?';

    for(char alp = 'A'; alp <= 'Z';alp++){
      int count = getAlphabetCount(str, alp);

      if(count > maxCount){
        maxCount = count;
        maxAlphabet = alp;
        }else if(count == maxCount){
          maxAlphabet = '?'; 
        }
    }

    System.out.println((char)(maxAlphabet));

  }
  
}
