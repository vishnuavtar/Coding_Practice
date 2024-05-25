package String90;

public class VowelPrint {

	public static void main(String[] args) {

		String str2 = "This is BangaloreE";
		String str = str2.toLowerCase();
		str.chars().filter(i -> "aeiou".indexOf(i) != -1).mapToObj(c -> (char) c).forEach(System.out::print);
	}

}
