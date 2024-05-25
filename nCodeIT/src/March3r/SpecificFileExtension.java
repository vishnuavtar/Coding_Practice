package March3r;

import java.io.File;
import java.io.FilenameFilter;

// Task2: Write a Java program to get specific files by extensions from a specified folder.

public class SpecificFileExtension {

	public static void main(String a[]) {
		File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File/");
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (String f : list) {
			System.out.println(f);
		}
	}
}
