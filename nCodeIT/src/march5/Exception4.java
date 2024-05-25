package march5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Task4: Write a method findFile add FileNotFoundException using throws and call the method from main method, handle the exception using try/catch

public class Exception4 {
	
	  public static void findFile() throws FileNotFoundException  {
	    // code that may produce IOException
		  System.out.println("fine");
	    File newFile=new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo4.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	    try{
	      findFile();
	    } catch(IOException e){
	      System.out.println(e);
	    }
	  }
	}




	
	
