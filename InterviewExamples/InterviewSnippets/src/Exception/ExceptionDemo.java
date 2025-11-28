package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int i = 20;
		int j = 0;
		
		try {
			int k = i/j;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException : " + e);
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} 
	}
}
