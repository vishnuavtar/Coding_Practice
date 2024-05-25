package File;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class File1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File//demo.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File is not created");
		}
		
		FileWriter w = new FileWriter(file);
		String str = "This job for me";
		
		for(int i = 0; i<str.length(); i++) {
			w.write(str.charAt(i));
		}
		
		
		
//		int i;
//		FileReader r = new FileReader(file);
//		
//		while((i=r.read())!=-1) {
//			System.out.print((char)i);
//		}
		int i;
		FileReader r = new FileReader(file);
		while((i=r.read())!=-1) {
			System.out.println((char)i);
		}
		
		
		Desktop d = Desktop.getDesktop();
		if(file.exists()) {
			d.open(file);
		}else {
			System.out.print("File not present");
		}
		
		
		w.close();
	}
	
}
