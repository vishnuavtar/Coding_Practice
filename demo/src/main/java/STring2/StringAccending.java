package STring2;

import java.util.*;
import java.io.*;

public class StringAccending {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		char ch[] = str.toCharArray();
		for(int i = 0; i<str.length(); i++) {
			for(int j = 0; j<str.length(); j++) {
				if(Character.toLowerCase(ch[i])>Character.toLowerCase(ch[j])) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			
			
			
		}
		
		System.out.println(String.valueOf(ch));
	}

}
