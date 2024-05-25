package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DAte4 {

	public static void main(String[] args) {
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yy/mm/dd h:m:s");
				
		LocalDateTime t = LocalDateTime.now();
		System.out.println(f.format(t));
		
		Date date = new Date();
		
		System.out.println(date);
		
	}

}
