import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 학생들의 정보를 나타내는 클래스 선언
class Student {
    String name;

    int height;

    int weight;

    Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[cnt];
        for (int i = 0; i < cnt; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.height - o2.height == 0) {
                    return o2.weight - o1.weight;
                }
                return o1.height - o2.height;
            }
        });

        for(Student student : students){
            System.out.println(student.name + " " + student.height + " " + student.weight);
        }


    }
}