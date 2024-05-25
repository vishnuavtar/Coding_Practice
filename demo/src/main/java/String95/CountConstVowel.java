package String95;

public class CountConstVowel {

	public static void main(String[] args) {

		String str = "This is Hyderabad";
		String str2 = str.toLowerCase();

		long v = str2.chars().filter(i -> "aeiou".indexOf(i) != -1).count();
		long c = str.chars().filter(i -> "aeiou".indexOf(i) == -1).count();

		System.out.println(v);
		System.out.println(c);

	}
}
