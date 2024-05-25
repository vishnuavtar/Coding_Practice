package String84;

public class CountCOnstVowel {

	public static void main(String[] args) {

		int vowel = 0;
		int consto = 0;
		String str2 = "This is Bangalore";

		String str = str2.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowel++;
			} else {
				consto++;
			}
		}

		System.out.println(vowel);
		System.out.println(consto);
	}

}
