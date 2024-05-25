package String;
import java.util.*;

public class RemoveCharcter {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter character -- ");
		String str2 = sc.nextLine();
		System.out.println(str2);
		System.out.println(ToRemove(str,str2));
		
	}
	
	public static String ToRemove(String str,String str2) {
		return str.replaceAll(str2  , "");
	}

}
