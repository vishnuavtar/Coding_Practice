package StreamApi;

import java.util.Arrays;

public class Longest11 {

	public static void main(String[] args) {

		String str[] = { "vishnu", "avtar", "vishnuavtar" };

		String str2 = Arrays.stream(str).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();
		
		System.out.println(str2);
	}

}
