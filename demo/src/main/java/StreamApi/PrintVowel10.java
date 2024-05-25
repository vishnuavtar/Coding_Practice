package StreamApi;

import java.util.Arrays;
import java.util.List;

public class PrintVowel10 {

	public static void main(String[] args) {

		String str = "This is Banaglore";

		List<String> list = Arrays.asList(str);

		str.chars().filter(i -> "aeiou".indexOf(i) != -1).mapToObj(c -> (char) c).forEach(System.out::print);
	}

}
