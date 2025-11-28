package streamHandson;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {

	public static Optional<Character> findFirstNonRepeated (String str) {
		
		Map<Character, Long> charCounts = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		return charCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
	}
	
	public static void main(String[] args) {
		
		String testString1 = "swiss";
        Optional<Character> result1 = findFirstNonRepeated(testString1);
        result1.ifPresentOrElse(
                c -> System.out.println("First non-repeated char in \"" + testString1 + "\": " + c),
                () -> System.out.println("No non-repeated char found in \"" + testString1 + "\"")
        );
	}
}
