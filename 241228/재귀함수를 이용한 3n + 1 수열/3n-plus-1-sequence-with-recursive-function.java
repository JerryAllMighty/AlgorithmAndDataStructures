import java.util.*;


public class Main {

    public static int recursive(int n) {
        if (n == 1) {
            return 1;
        }
        if(n % 2==0){
            n /= 2;
        }else{
            n = (n*3) +1;
        }
        return 1 + recursive(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = recursive(n);
        System.out.println(result-1);

    }
}


