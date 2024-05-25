package StreamApi;

public class PrintVowel25 {

	public static void main(String[] args) {

		String str = "This is Hyderabad";
		String str2 = str.toLowerCase();
		str.chars().filter(i -> "aeiou".indexOf(i) != -1).mapToObj(c -> (char) c).forEach(System.out::print);

	}

}
