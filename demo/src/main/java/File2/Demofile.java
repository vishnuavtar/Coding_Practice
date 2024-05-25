package File2;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demofile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File//demo.txt");
		
		if(file.createNewFile()) {
			System.out.println("File created");
		}else {
			System.out.println("File Not created or File Already present ");
		}
		
		FileWriter fw  = new FileWriter(file);
		String str = "This is my job";
		for(int i = 0 ; i<str.length(); i++) {
			fw.write(str.charAt(i));
		}
		
		int i;
		FileReader r = new FileReader(file);
		if((i=r.read())!=-1) {
			System.out.println((char)i);
			
		}
		
		Desktop d = Desktop.getDesktop();
		if(file.exists()) {
			d.open(file);
		}
		fw.close();
		
		
		
		
	}
	
}
