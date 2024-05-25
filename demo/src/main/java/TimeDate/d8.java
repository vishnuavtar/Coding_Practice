package TimeDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class d8 {

	
	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY-MM-SS HH:mm:SS");
		
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));
		
		
	}
}
