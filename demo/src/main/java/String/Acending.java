package String;

import java.util.Arrays;

public class Acending {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		char[] str2 = str.toCharArray();
		
		for(int i = 0; i<str.length(); i++) {
			for(int j = i+1; j<str.length(); j++) {
				if(Character.toLowerCase(str2[i])>Character.toLowerCase(str2[j])) {
					char temp = str2[i];
					str2[i] = str2[j];
					str2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str2));
	}

}
