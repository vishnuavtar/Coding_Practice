package StreamApi;

import java.util.Arrays;

public class PrintVowel11 {

	
	public static void main(String[] args) {
		
		String str = "This is Banaglore";
		String str2 = str.toLowerCase();
		
		str2.chars().filter(i->"aeiou".indexOf(i)!=-1).mapToObj(c->(char)c).forEach(System.out::print);
	}
}
