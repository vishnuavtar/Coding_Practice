package com.avtar;

public class STringReverse {

	public static void main(String[] args) {

		String str = "welcome";

		String nstr = " ";

		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			nstr = ch + nstr;
		}

		System.out.println(nstr);

	}

}
