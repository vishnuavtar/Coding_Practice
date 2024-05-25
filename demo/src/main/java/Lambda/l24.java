package Lambda;

import java.util.Arrays;

@FunctionalInterface
interface ababa {

	void f1();
}

public class l24 {

	public static void main(String[] args) {

		ababa obj = () -> System.out.println("This is Bangalore");
		obj.f1();
		
		String str = "This is Banaglore";
		
		String str2[] = str.split(" ");
		String str3=" ";
		
		for(int i = str2.length-1; i>=0; i--) {
			 str3 = str2+str3;
		}
		
		System.out.println(Arrays.deepToString(str3));
	}
}
