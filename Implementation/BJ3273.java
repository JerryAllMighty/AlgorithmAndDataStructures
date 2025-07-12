package Implementation;

import java.util.Scanner;


public class Test{

  public static void Test(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N];

    for(int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    int X = sc.nextInt();

    int[] cnt = new int[1000001];
    for(int i = 0; i< N; i++)
      cnt[a[i]]++;

    long ans = 0;
    for(int i = 0; i <= (X - 1)/2; i++)
      if(X - i <= 1000000)
        ans += (long)cnt[i] * cnt[X - i];



}
}