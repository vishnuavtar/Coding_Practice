package StreamApi;

import java.util.Arrays;
import java.util.List;

public class ProgramToSumOddEven {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,11,12,1,3,14,15,16);
		
		int evenSum = list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		int oddSum = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		
		int allSum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(evenSum);
		System.out.println(oddSum);
		
		System.out.println(allSum);
		
		
		
	}

}
