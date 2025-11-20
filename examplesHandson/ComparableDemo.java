import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(38, "Bhanu"));
        students.add(new Student(35, "Geetha"));
        students.add(new Student(7, "Bhavish"));
        students.add(new Student(30, "Lakshmeesh"));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}