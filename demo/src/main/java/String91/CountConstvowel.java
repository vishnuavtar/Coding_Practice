package String91;

public class CountConstvowel {

	public static void main(String[] args) {

		String str2 = "This is Hyderabad";

		String str = str2.toLowerCase();

		System.out.println(str.chars().filter(i -> "aeiou".indexOf(i) != -1).count());
		System.out.println(str.chars().filter(i -> "aeiou".indexOf(i) == -1).count());
	}

}
