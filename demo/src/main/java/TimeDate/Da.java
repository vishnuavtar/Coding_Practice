package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Da {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY-MM-DD h:m:s");
		LocalDateTime t = LocalDateTime.now();
		System.out.println(f.format(t));
	}
	
}
