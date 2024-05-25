package Optional;

public class Optional3 {
	
	public static void main(String[] args) {
		
		
		String[] word = new String[20];
		
		Optional<String> o = Optional.offNullable(word[10]);
		
		if(o.isPresent()) {
			System.out.println("Fine");
		}else {
			System.out.println("Not Fine");
		}
		
	}

}
