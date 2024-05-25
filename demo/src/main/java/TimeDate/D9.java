package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class D9 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:SS");
		
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));
		
	}

}
