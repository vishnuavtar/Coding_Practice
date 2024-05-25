package StreamApi;

public class PrintVowel18 {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		str.chars().filter(i->"aeiou".indexOf(i)!=-1).mapToObj(c->(char)c).forEach(System.out::print);
	}

}
