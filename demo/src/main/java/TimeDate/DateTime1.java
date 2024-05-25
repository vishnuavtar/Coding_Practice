package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTime1 {

	public static void main(String[] args) {

		DateTimeFormatter f = DateTimeFormatter.ofPattern("yy/mm/dd hh:mm:ss");
		LocalDateTime t = LocalDateTime.now();

		System.out.println(f.format(t));

		Date date = new Date();

		System.out.println(date);

	}

}
