import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDate {
	
	public static void main(String[] args) {
		
		 DateTimeFormatter t = DateTimeFormatter.ofPattern("yy/mm/dd h:m:s");
		 LocalDateTime d = LocalDateTime.now();
		 System.out.println(t.format(d));
		 
		 Date date = new Date();
		 System.out.print(date);
		 
	}

}
