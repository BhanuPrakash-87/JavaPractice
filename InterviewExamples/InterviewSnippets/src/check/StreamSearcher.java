package check;

import java.util.List;

public class StreamSearcher {

	public String findElementsStartingWIth (List<String> list, String startsWithValue) {
		return list.stream()
				.filter(n -> n.startsWith(startsWithValue))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("No element found starting with : " + startsWithValue));
	}
	
	public static void main(String[] args) {
		
		StreamSearcher searcher = new StreamSearcher();
		List<String> words = List.of("apple", "banana", "apricot", "grape", "orange");

		try {
			String found = searcher.findElementsStartingWIth(words, "at");
			System.out.println("Found : " + found);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
}
