package StreamApi;

import java.util.Arrays;
import java.util.List;

public class PrintVowel3 {

	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		String str2 = str.toLowerCase();
		
		List<String> list = Arrays.asList(str2);
		
		str.chars().filter(i->"aeiou".indexOf(i)!=-1).mapToObj(c->(char) c).forEach(System.out::print);
	}

}
