package String73;

import java.util.Arrays;
import java.util.List;

public class Longest {

	public static void main(String[] args) {
		
		String str[] = {"vishnu","avtar","vishnuavtar"};
		
		List<String> list = Arrays.asList(str);
		
		System.out.println(list.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get());
	}

}
