package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class D122 {

	public static void main(String[] args) {

		DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY-MM-dd : hh:mm:ss");

		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));

		Date date = new Date();

		System.out.println(date);
	}

}
