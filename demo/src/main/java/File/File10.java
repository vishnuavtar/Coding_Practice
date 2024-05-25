package File;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File10 {

	public static void main(String[] args) throws IOException {
		
		File file  = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo100.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File is not created or File already present on your given location");
		}
		
	    String str = "This is Bangalore";
	    
	    FileWriter fw = new FileWriter(file);
	    
	    for(int i = 0; i<str.length(); i++) {
	    	fw.write(str.charAt(i));
	    }
	    
	    fw.close();
	    
	    
	    int i;
	    FileReader r = new FileReader(file);
	
	    while((i = r.read())!=-1) {
	    	System.out.print((char)i);
	    }
	    
	    Desktop dd = Desktop.getDesktop();
	    
	    if(file.exists()) {
	    	dd.open(file);
	    }

	}
}
