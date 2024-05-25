package String90;

import java.util.Arrays;

public class CountConstVowel {

	public static void main(String[] args) {

		String str = "This is BangaloreiiBBBi";
		String str2 = str.toLowerCase();

		System.out.println(str2.chars().filter(i -> "aeiou".indexOf(i) != -1).count());
		System.out.println(str2.chars().filter(i -> "aeiou".indexOf(i) == -1).count());

	}

}
