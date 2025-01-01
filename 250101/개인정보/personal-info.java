import java.util.*;

class Student implements Comparable<Student> {
    public String name;
    public int height;
    public double weight;


    Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student o) {
        return o.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            double weight = Double.parseDouble(input[2]);
            Student eachStudent = new Student(name, height, weight);
            students[i] = eachStudent;
        }

        HashMap<String, Integer> nameIdxMap = new HashMap<>();
        String[] nameList = new String[5];
        for (int i =0; i < 5; i++) {
            nameIdxMap.put(students[i].name, i);
            nameList[i] = students[i].name;
        }
        Arrays.sort(nameList);
        System.out.println("name");
        for (int i =0; i < 5; i++) {
            int idx = nameIdxMap.get(nameList[i]);
            System.out.println(students[idx].name + " " + students[idx].height + " " + students[idx].weight);
        }
        System.out.println();

        Arrays.sort(students);
        System.out.println("height");
        for (Student student : students) {
            System.out.println(student.name + " " + student.height + " " + student.weight);
        }






    }

}






