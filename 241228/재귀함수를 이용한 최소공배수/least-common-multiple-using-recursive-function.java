import java.util.*;


public class Main {
    public static int minMultiply(int a, int b) {
        int result = 0;
        List<Integer> divideList = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                divideList.add(i);
            }
        }
        for (int j = 1; j <= b; j++) {
            if (b % j == 0) {
                divideList.add(j);
            }
        }
        List<Integer> commonDivideList = new ArrayList<>();
        divideList.stream().filter(
                        x -> Collections.frequency(divideList, x) == 2)
                .forEach(commonDivideList::add);
        Collections.sort(commonDivideList, Collections.reverseOrder());
        int maxDivide = commonDivideList.get(0);
        return maxDivide * (a / maxDivide) * (b / maxDivide);
    }

    public static int recursive(int[] lst, int idx) {
        if (idx == lst.length - 1) {
            return lst[idx];
        }
        return minMultiply(lst[idx], recursive(lst, idx + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lst = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
//        System.out.println(minMultiply(4,6));
        int result = recursive(lst, 0);

        System.out.println(result);

    }
}


