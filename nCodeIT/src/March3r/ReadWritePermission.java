package March3r;

// Task4: Write a Java program to check if a file or directory has read and write permission.

import java.io.File;

public class ReadWritePermission {

	       public static void main(String[] args) {
	        // Create a File object
	        File my_file_dir = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File//demo.txt");
	         if (my_file_dir.canWrite()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
	          }
	         if (my_file_dir.canRead()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
	          }  
	      }
	  }
	  
