package OptionalPkg;
import java.util.*;
public class OptionalClass {
	
	public static void main(String[] args) {
		
		String str[] = new String[20];
		
		Optional<String> o = Optional.ofNullable(str[10]);
		
		if(o.isPresent()) {
			System.out.println("fine");
		}else {
			System.out.println("not fine");
		}
	}

}
