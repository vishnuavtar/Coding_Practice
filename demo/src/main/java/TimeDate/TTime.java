package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TTime {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yy/mm/dd h:m:s");
		
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));
	}

}
