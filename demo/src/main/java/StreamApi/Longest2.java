package StreamApi;

import java.util.Arrays;

public class Longest2 {
	
	public static void main(String[] args) {
		
		String str[] = {"vishnu","avtar","vishnuavtar"};
		
		System.out.println(Arrays.stream(str).reduce((word1, word2)->word1.length()>word2.length()?word1:word2).get());
	}

}
