package StreamApi;

import java.util.Arrays;

public class Longest1 {

	
	public static void main(String[] args) {
		
		String str[] = {"vishnu","avtar","VishnuAvtar"};
		
		System.out.println(Arrays.stream(str).reduce((word1, word2)->word1.length()>word2.length()?word1:word2).get());
	}
}
