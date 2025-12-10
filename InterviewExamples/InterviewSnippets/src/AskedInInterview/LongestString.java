package AskedInInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class LongestString {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple","Banana","Kiwi");
		
		// Longest length
		OptionalInt longestOptional = names.stream().mapToInt(String::length).max();
		int longestLength = longestOptional.orElse(0);
		System.out.println(longestLength);
		
		// Longest String
		Optional<String> longestStringOptional = names.stream().max(Comparator.comparingInt(String::length));
		String longestString = longestStringOptional.orElse(null);
		System.out.println(longestString);
	}
}
