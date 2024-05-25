package March3r;

import java.io.File;

// Task3: Write a Java program to check if a file or directory specified by pathname exists or not.

public class FileExistOrNot {

	
	       public static void main(String[] args) {
	        // Create a File object
	        File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo2.txt");
	         if (file.exists()) 
	           {
	            System.out.println("The directory or file exists.\n");
	           } 
	         else
	          {
	            System.out.println("The directory or file does not exist.\n");
	          }
	       }
	  }


