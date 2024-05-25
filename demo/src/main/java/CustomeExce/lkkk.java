package CustomeExce;


class hyp extends Exception
{
	hyp(String str){
		super(str);
	}
}
public class lkkk {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws hyp {
		
		if(b==0) {
			throw new hyp("Not allowed");
		}
		
		return a/b;
	}
}
