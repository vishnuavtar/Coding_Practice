import java.util.HashMap;
import java.util.Map;

public class AAA {
	
	public static void main(String[] args) {
		
		
		System.out.println(20+20+"test");
		System.out.println("test"+20+20);
		
		
		HashMap<String,String> map = new HashMap<String, String>();
		
		map.put("A", "ABC");
		map.put("b", "Laptop");
		map.put("c", "Pc");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
			
		}
		
		
	}

}
