import java.util.*;

class Person {
    public String name;

    public int height;

    public int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        Person[] people = new Person[cnt];
        for(int i = 0; i < cnt; i++){
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            Person eachPerson = new Person(name, height, weight);
            people[i] = eachPerson;
        }
        Arrays.sort(people, (a,b) -> a.height - b.height);
        for (Person person : people){
            System.out.println(person.name + " " + person.height + " " + person.weight);
        }
    }

}





