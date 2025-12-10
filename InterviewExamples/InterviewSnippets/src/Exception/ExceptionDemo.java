package Exception;

public class ExceptionDemo { 
	
	public static void main(String[] args) {
		
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			if(j==0)
				throw new BhanuException("I dont want to print zero");
		} catch (BhanuException e) {
			System.out.println("BhanuException : " + e);
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} 
	}
}
