package StreamApi;

import java.util.Arrays;
import java.util.HashSet;

public class Dublicate11 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,6};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		HashSet<Integer> set = new HashSet<>();
		
		Arrays.stream(aa).filter(i->!set.add(i)).forEach(System.out::print);
	}

}
