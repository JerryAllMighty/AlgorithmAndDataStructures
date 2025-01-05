import java.util.*;

class Person {
    int height;

    int weight;

    int num;

    Person(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;

    }
}

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        Person[] people = new Person[cnt];
        int num = 1;
        for (int i = 0; i < cnt; i++) {
            String[] a = sc.nextLine().split(" ");

            int[] toIntA = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();

            people[i] = new Person(toIntA[0], toIntA[1], num++);
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.height - o2.height == 0) {
                    return o2.weight - o1.weight;
                }
                return o1.height - o2.height;
            }
        });

        for (Person person : people) {
            System.out.println(person.height + " " + person.weight + " " + person.num);
        }


    }
}
