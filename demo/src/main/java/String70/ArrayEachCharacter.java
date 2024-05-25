package String70;

import java.util.Arrays;

public class ArrayEachCharacter {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,89};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		Arrays.stream(aa).mapToInt(null)
	}

}
