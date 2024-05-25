package String84;

import java.util.Arrays;

public class Longest {

	public static void main(String[] args) {

		String str[] = { "vishnu", "avtar", "vishnuavtar" };

		System.out.println(
				Arrays.stream(str).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get());
	}
}
