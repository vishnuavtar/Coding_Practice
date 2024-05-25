package March3r;

import java.io.File;

// Task5: Write a Java program to check if given pathname is a directory or a file.

public class DirectoryOrFile {

	
	       public static void main(String[] args) {
	        // Create a File object
	        File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src/File//demo2.txt");
	     
	         if (file.isFile())	           {
	            System.out.println("It is a file.\n");
	           } 
	         else
	          {
	            System.out.println(" It is not a file.\n");
	          }  
	      }
	  }


