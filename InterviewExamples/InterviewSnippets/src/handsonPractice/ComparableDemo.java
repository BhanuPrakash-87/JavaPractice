package handsonPractice;

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