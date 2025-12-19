package handsonPractice;

public class NearestNumber {

	static int findNearest (int[] arr, int target) {
		
		int res = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i] - target) <= Math.abs(res - target)) {
				res = arr[i];
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,6,7,8,8,9,15,19,22,32};
		int target = 17;
		int nearestNumber = findNearest(arr, target);
		System.out.println("Nearest number is : " + nearestNumber);
	}
}
