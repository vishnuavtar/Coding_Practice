package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _ReplaceFirstVowel {

	public static void main(String[] args) {

		//int max_count = 0;
		//char max_char = Character.MIN_VALUE;
		ArrayList<Character> arr = new ArrayList<Character>(
				Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		System.out.println("Java program to Replace first Vowel With '-' ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = sc.nextLine();
		StringBuilder tempStr = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			if (arr.contains(str.charAt(i))) {
				tempStr.setCharAt(i, '-');
				break;
			}
		}
		System.out.println("String after replacing first vowel");
		System.out.println(tempStr);
	}
}
