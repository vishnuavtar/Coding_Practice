package String8;

public class Acending {

	public static void main(String[] args) {

		String str = "This is my job";
		String str2 = str.toLowerCase();
		char ch[] = str2.toCharArray();

		for (int i = 0; i < str2.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (Character.toLowerCase(ch[i]) > Character.toLowerCase(ch[j])) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}

		}

		System.out.println(String.valueOf(ch));

	}

}
