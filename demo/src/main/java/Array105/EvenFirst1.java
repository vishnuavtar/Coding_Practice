package Array105;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFirst1 {
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,23,4,5,6,7,8,1};
		
		Integer aa[]=  Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> even =  Arrays.stream(aa).filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> odd =   Arrays.stream(aa).filter(i->i%2!=0).collect(Collectors.toList());
			
		even.addAll(odd);
		
		Integer aaa = Arrays.stream(aa).
		
		System.out.println(even);
	}

}
