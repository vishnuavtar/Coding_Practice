package Exception;

class Abc extends Exception{
	
	Abc (int s){
		s = 10/0;
	}
	
}

public class Cust3 {
	
 

	public static void main(String[] args) {
			
		 int s = 0;
		 
		try {
			throw new Abc(s);
		}catch(Exception e) {
			System.out.println("Error By " + e.getMessage());
		}
	}
}
