package Exception;

import java.util.Scanner;

public class ExceptionHirarchy {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int number = scanner.nextInt();
			
			System.out.println(number);
			if (number < 0) {
				throw new IllegalArgumentException("Number cannot be negative.");
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
	}
}
