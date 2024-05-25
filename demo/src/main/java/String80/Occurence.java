package String80;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {

		String str = "This is Banaglore";

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		System.out.println(ToOccurence(str, ch));
	}

	public static int ToOccurence(String str, char ch) {

		int count = 0;
		int a[] = new int[str.length()];

		for (int i = 0; i < a.length; i++) {
			a[i] = str.charAt(i);
			if (a[i] == ch) {
				count++;
			}
		}

		return count;
	}

}
