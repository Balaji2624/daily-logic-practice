// Write a program to check given two string are Anagram or NOT.

package date18_04;

import java.util.Arrays;

public class AnagramStr {
	public static void main(String args[]) {

		String str1 = "Race";
		String str2 = "Care";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			boolean result = Arrays.equals(arr1, arr2);

			if (result) {
				System.out.println("Given String is Anagram");
			} else {
				System.out.println("Given String is NOT Anagram");
			}

		}
	}
}
