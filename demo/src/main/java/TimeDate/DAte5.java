package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DAte5 {
	
	public static void main(String[] args) {
		
		
		Date date  = new Date();
		System.out.println(date);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yy/mm/dd hh:mm:ss");
		
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));
		
	}

}
