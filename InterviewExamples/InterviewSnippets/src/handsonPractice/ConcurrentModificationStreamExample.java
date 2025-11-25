package handsonPractice;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationStreamExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        
        try {
        	names.stream().forEach(name -> {
        		System.out.println("Processing :" + name);
        		if (name.equals("Bob")) {
        			names.remove(name);
        		}
        	});
		} catch (Exception e) {
			System.err.println("Caught exception: " + e.getClass().getSimpleName());
            System.err.println("Message: " + e.getMessage());
		}
	}
}
