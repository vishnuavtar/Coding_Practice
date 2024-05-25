package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class D3 {

	
	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS");
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));
		
	}
}
