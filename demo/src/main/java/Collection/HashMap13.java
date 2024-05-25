package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap13 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new  HashMap<String, String>();
		
		map.put("b", "Vishnu");
		map.put("a", "vishnu");
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " "  + entry.getValue());
		}   
	}

}
