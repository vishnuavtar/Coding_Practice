package String18;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println("Enter character ");
		char str2 = sc.next().charAt(0);
		System.out.println(str2);
		System.out.println(ToOccurence(str, str2));
	}

	public static int ToOccurence(String str, char str2) {
		int count = 0;
		
		int ar[] = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			ar[i] = str.charAt(i);

			if (ar[i] == str2) {
				count++;
			}
		}
		
		return count;
	}

}
