package File2;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File2 {
	
	public static void main(String[] args) throws Exception{
		
		File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File//demo1.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is created");
			
		}else {
			System.out.println("File is not created or File is already present");
		}
		
		FileWriter fw = new FileWriter(file);
		String str = "This is my job";
		for(int i = 0; i<str.length(); i++) {
			fw.write(str.charAt(i));
		}
		
		fw.close();
		
		int i;
		FileReader r = new FileReader(file);
		
		
		while((i=r.read())!=-1) {
			System.out.print((char)i);
		}
		
		Desktop d = Desktop.getDesktop();
		if(file.exists()) {
			d.open(file);
		}
		
	}

}
