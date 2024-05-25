package String25;

public class CountConsonentVowel {

	public static void main(String[] args) {

		String str = "This is String";

		String str2 = str.toLowerCase();

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < str2.length(); i++) {

			if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o'
					|| str2.charAt(i) == 'u') {
				count1++;
			} else if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
				count2++;
			}

		}

		System.out.println("Vowel = " + count1);
		System.out.print("Consonent = " + count2);

	}

}
