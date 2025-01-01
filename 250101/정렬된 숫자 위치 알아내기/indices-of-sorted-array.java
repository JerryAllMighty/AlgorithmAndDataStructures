import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Number {
    int num;
    int idx;

    Number(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }
}


public class Main {
    public static int findIdx(Number number, Number[] targetNumber) {
        int result = 0;
        for (int i = 0; i < targetNumber.length; i++) {
            Number eachNumber = targetNumber[i];
            if (eachNumber.num == number.num && eachNumber.idx == number.idx) {
                result = i;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");


        int[] lst = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        Number[] numbers = new Number[cnt];
        int idx = 1;
        for (int i = 0; i < cnt; i++) {
            int val = lst[i];
            numbers[i] = new Number(lst[i], idx++);
        }
        Number[] numbersCopy = numbers.clone();


        Arrays.sort(numbers, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                return o1.num - o2.num;
            }
        });
        int[] answers = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            Number number = numbersCopy[i];
            int foundIdx = findIdx(number, numbers);
            answers[i] = foundIdx + 1;
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print(answers[i] + " ");
        }

    }
}