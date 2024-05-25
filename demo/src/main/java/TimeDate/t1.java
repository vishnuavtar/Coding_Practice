package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class t1 {

	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));
		
		Date date = new Date();
		
		System.out.println(date);
		
	}
}
