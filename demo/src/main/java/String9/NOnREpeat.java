package String9;

public class NOnREpeat {

	public static void main(String[] args) {

		System.out.println("Fine");

		String str = "This is my job";
		char a[] = new char[256];

		for (int i = 0; i <str.length(); i++) {
			a[str.charAt(i)]++;
		}

		for (int i = 0; i < 256; i++) {
			if (a[i] == 1) {
				System.out.println((char) i);
			}
		}

	}
}
