package String94;

public class CountCOnstVowel {

	public static void main(String[] args) {

		String str = "This is Hyderabad";

		long v = str.chars().filter(i -> "aeiou".indexOf(i) != -1).count();
		long c = str.chars().filter(i -> "aeiou".indexOf(i) == -1).count();

		System.out.println(v);
		System.out.println(c);
	}

}
