import java.util.*;

class Student implements Comparable<Student> {
    public int height;
    public int weight;

    public int num;

    Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student o) {
        if(o.height - this.height == 0){
            if(o.weight - this.weight == 0){
                return o.num - this.num;
            }
            return o.weight - this.weight;
        }
        return o.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[cnt];
        int num = 1;
        for (int i = 0; i < cnt; i++) {
            String[] input = sc.nextLine().split(" ");
            int height = Integer.parseInt(input[0]);
            int weight = Integer.parseInt(input[1]);
            Student eachStudent = new Student(height, weight, num++);
            students[i] = eachStudent;
        }
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.height + " " + student.weight + " " + student.num);
        }
    }

}





