package StreamApi;

import java.util.Arrays;
import java.util.List;

public class OddEvenSum {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,89,9);
		
		int even = list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		int odd = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		
		System.out.println(even);
		System.out.println(odd);
	}

}
