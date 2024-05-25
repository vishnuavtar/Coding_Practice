package String92;

import String31.forEach;

public class PrintVowel {

	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		String str2 = str.toLowerCase();
		
		str.chars().filter(i ->"aeiou".indexOf(i)!=-1).mapToObj(c->(char)c).forEach(System.out::print);
	}

}
