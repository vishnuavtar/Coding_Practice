package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PrintVowel13 {
	
	public static void main(String[] args) {
		
		String str2 = "This is Banaglore";
		String str = str2.toLowerCase();
		//str.chars().filter(i->"aeiou".indexOf(i)!=-1).forEach(System.out::print);
		
		List<String> list = Arrays.asList(str);
		
		str.chars().filter(i->"aeiou".indexOf(i)!=-1).mapToObj(c->(char)c).forEach(System.out::print);
	}

}
