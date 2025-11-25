package streamHandson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(9,4,5,7,2,10);
		
		nums.stream()
		.filter(n -> n%2==1)
		.map(n -> n * 2)
		.sorted()
		.forEach(n -> System.out.println(n));
		
		System.out.println("Count : " + nums.stream().count());
		
		Stream<Integer> s2 = nums.stream().sorted();
		s2.forEach(n -> System.out.println(n));
		
		int result = nums.stream().reduce(1, (a,b) -> a+b);
		System.out.println("Reduced count : " + result);
	}
}
