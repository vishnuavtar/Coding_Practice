package String3;

import java.util.Scanner;

public class COuntCharacter {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str;
		int count = 0;
		/*Taking user input*/
		System.out.println("Enter any string");
		str = in.nextLine();
		for (int i = 0; i < str.length(); i++) {
			/*incrementing the count*/
			count++;
		}
		System.out.println(
			"Total number of character in string is "
			+ count);
	}
}

