package Optional;

public class Optional {
	
	public static void main(String[] args) {
		
String str[] = new String[20];
		
		Optional<String> o = Optional.ofNullable(str[5]);
		
		if(o.isPresent()) {
			System.err.println("fine");
		}else{
			System.err.println("not fine");
	}
}
}
