package March3r;

import java.io.File;

// Task1: Write a Java program to get a list of all file/directory names from the given specified folder.

public class getfile {
	
	public static void main(String a[]) {
		File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File/");
		String[] fileList = file.list();
		for (String name : fileList) {
			System.out.println(name);
		}
	}
}
