package Optional;

public class Op {
	
	public static void main(String[] args) {
		
		
		String str[] = new String[10];
		
		Optional oo = Optional.offNullable(str[5]);
		
		if(oo.isEmpty) {
			System.out.println("Empty");
		}else {
			System.out.println("Not Empty");
		}
		
	}

}
