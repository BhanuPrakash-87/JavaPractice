package AskedInInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesUsingStream {

	public static void main(String[] args) {
		
		List<Integer> elements = Arrays.asList(32, 15, 8, 28, 45, 8, 85, 32, 14);
		Set<Integer> uniqueElements = new HashSet<Integer>();
		Set<Integer> duplicateElements = elements.stream()
										.filter(n -> !uniqueElements.add(n))
										.collect(Collectors.toSet());
	
		System.out.println("Original list : " + elements);
		System.out.println("Duplicate elements : " + duplicateElements);
	}
}
