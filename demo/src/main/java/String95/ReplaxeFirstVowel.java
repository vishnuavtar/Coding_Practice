package String95;

import java.util.List;

public class ReplaxeFirstVowel {

	public static void main(String[] args) {

		String str = "This is Hyderabad";

		List<Character> list = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		StringBuffer bb = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {
			if (list.contains(str.charAt(i))) {
				bb.setCharAt(i, '*');
				break;
			}
		}

		System.out.println(bb);
	}

}
