import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        String[] x = sc.nextLine().split(" ");
        int[] toIntX = Arrays.stream(x).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(toIntX);
        Arrays.stream(toIntX).forEach(y -> System.out.print(String.valueOf(y) + " "));
        System.out.println();
        Integer[] toIntegerX = Arrays.stream(toIntX).boxed().toArray(Integer[]::new);
        Arrays.sort(toIntegerX, Collections.reverseOrder());
        Arrays.stream(toIntegerX).forEach(y -> System.out.print(String.valueOf(y) + " "));

    }
}


