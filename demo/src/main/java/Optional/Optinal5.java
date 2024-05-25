package Optional;

public class Optinal5 {
	
	public static void main(String[] args) {
		
		String[] str = new String[20];
		
		Optional<String> o = Optional.ofNUllable(str[10]);
		
		if(o.isPresent()) {
			System.out.println("Fine");
		}else {
			System.out.println("not");
		}
		
	}

}
