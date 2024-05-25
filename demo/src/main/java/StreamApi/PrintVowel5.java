package StreamApi;

import java.util.Arrays;
import java.util.List;

public class PrintVowel5 {

	
	public static void main(String[] args) {
		
		String str2 = "This is Bangalore";
		
		String str = str2.toLowerCase();
		
		List<String> list = Arrays.asList(str);
		
		str.chars().filter(i->"aeiou".indexOf(i)!=-1).mapToObj(c->(char)c).forEach(System.out::print);
	}
}
