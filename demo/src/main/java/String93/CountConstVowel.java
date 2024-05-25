package String93;

public class CountConstVowel {

	public static void main(String[] args) {

		String str = "This is Hyderabad";

		String str2 = str.toLowerCase();

		long vowel = str2.chars().filter(i -> "aeiou".indexOf(i) != -1).count();
		long consta = str2.chars().filter(i -> "aeiou".indexOf(i) == -1).count();

		System.out.println(vowel + " " + consta);

	}

}
