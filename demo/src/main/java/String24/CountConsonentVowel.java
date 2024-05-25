package String24;

public class CountConsonentVowel {

	public static void main(String[] args) {

		String str = "This is Hyerabad";
		String str2 = str.toLowerCase();

		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o'
					|| str2.charAt(i) == 'u') {
				count1++;
			} else if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
				count2++;
			}
		}

		System.out.println("Vowel is = " + count1);
		System.out.println("Consonent is =  " + count2);
	}

}
