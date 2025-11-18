import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo (Student that) {
        return 0;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        
        Comparator<Student> com = new Comparator<Student>() {
            
            public int compare (Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> students = new ArrayList<>();
        students.add(new Student(38, "Bhanu"));
        students.add(new Student(35, "Geetha"));
        students.add(new Student(7, "Bhavish"));
        students.add(new Student(30, "Lakshmeesh"));

        Collections.sort(students, com);
        for (Student student : students) {
            System.out.println(student);
        }   
    }
}
