package handsonPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringPractice {

	public static void main(String[] args) {
		
		String s1 = "hello";
	    String s2 = "hello";
	    
	    System.out.println("s1 == s2 : "+ s1 == s2);
	    //System.out.println("s1 === s2 : "+ s1 === s2);
	    //There is no === in Java, In JavaScript its there, above gives syntax error
	    System.out.println(s1.toUpperCase());
	    
	    List<String> words = Arrays.asList("hello", "world", "java", "method", "reference");
	    List<String> uppercaseWords = words.stream()
	    									.map(String::toUpperCase) // Using Method reference here
	    									.collect(Collectors.toList());
	    System.out.println(uppercaseWords);
	}
}
