package File2;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File3 {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File//demo5.txt");
		
		if(file.createNewFile()) {
			System.out.println("File  is created");
		}else {
			System.out.println("File is not created or File is present");
		}
		
		FileWriter fw = new FileWriter(file);
		
		String str = "This is my job";
		
		for(int i = 0; i<str.length(); i++) {
			fw.write(str.charAt(i));
		}
		
		fw.close();
		
		int i;
		FileReader rr = new FileReader(file);
		
		while((i=rr.read())!=-1) {
			System.out.print((char)i);
		}
		
		
		Desktop d = Desktop.getDesktop();
		
		if(file.exists()) {
			d.open(file);
		}
		
	}
}
