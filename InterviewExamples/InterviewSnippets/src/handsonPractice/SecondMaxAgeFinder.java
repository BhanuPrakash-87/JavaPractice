package handsonPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMaxAgeFinder {

	public static void main(String[] args) {
		
		List<Student> student = Arrays.asList(
				new Student(38, "Bhanu"),
				new Student(7, "Bhavish"),
				new Student(35, "Geetha"),
				new Student(30, "Lakshmeesh")
		);
		
		Optional<Integer> secondMaxAge = student.stream()
				.map(Student::getAge)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		
		System.out.println("secondMaxAge : " + secondMaxAge);
	}
}
