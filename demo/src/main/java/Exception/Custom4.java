package Exception;

class Abc extends Exception{
	
	Abc(int s2){
		int s = s2;
		s = 10/0;
	}
}

public class Custom4 {

	public static void main(String[] args) {
		int s=0;
		
		try {
		
			throw new Abc(s);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
