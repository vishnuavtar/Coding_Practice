package StreamApi;

public class PrintVowel {
	
	public static void main(String[] args) {
		
		
		String str = "This is Bangalore";
		
		printVowel(str);
		
	}
	
	public static void printVowel(String input) {
		 
		input = input.toLowerCase();
		
		input.chars().filter(i->"aeiou".indexOf(i)!=-1).mapToObj(c->(char)c).forEach(System.out::print);
	}

}
