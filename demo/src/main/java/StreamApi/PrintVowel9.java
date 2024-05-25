package StreamApi;

public class PrintVowel9 {

	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		String str2 = str.toLowerCase();
		
		
		str2.chars().filter(i->"aeiou".indexOf(i)!=-1).mapToObj(c->(char)c).forEach(System.out::print);
	}
}
