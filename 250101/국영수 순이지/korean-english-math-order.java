import java.util.*;

class Student implements Comparable<Student>{
    public String name;
    public int kor;
    public int eng;
    public int math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student o) {
        if(o.kor - this.kor == 0){
            if(o.eng - this.eng == 0){
                return o.math - this.math;
            }
            return o.eng - this.eng;
        }
        return o.kor - this.kor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[cnt];
        for (int i = 0; i < cnt; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int kor = Integer.parseInt(input[1]);
            int eng = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);
            Student eachStudent = new Student(name, kor, eng, math);
            students[i] = eachStudent;
        }
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.name + " " + student.kor + " " + student.eng + " " + student.math);
        }
    }

}





