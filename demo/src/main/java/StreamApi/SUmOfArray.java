package StreamApi;

import java.util.Arrays;

public class SUmOfArray {

	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.stream(a).mapToInt(Integer::intValue).sum());
	}
}
