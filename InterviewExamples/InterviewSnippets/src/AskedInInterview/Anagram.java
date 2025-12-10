package AskedInInterview;

import java.util.Arrays;

public class Anagram {
	
	public boolean checkAnagram (String str1, String str2) {
		
		if (str1.isEmpty() && str2.isEmpty()) {
			return true;
		}
		
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
	}

	public static void main(String[] args) {
		
		String str1 = "aba";
		String str2 = "abc";
		
		Anagram anagram = new Anagram();
		
		System.out.println("checkAnagram : " +anagram.checkAnagram(str1, str2));

	}

}
