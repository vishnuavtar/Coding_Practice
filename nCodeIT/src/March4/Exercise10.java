package March4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Task10: Write a Java program to append text to an existing file and print the data to the console.

public class Exercise10 {
	
	     public static void main(String a[]){
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        try
	          {
	             String filename= "C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo3.txt";
	             FileWriter fw = new FileWriter(filename,true); 
	             //appends the string to the file
	             fw.write("Java Exercises\n");
	             fw.close();
	             BufferedReader br = new BufferedReader(new FileReader("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo3.txt"));
	             //read the file content
	             while (strLine != null)
	             {
	                sb.append(strLine);
	                sb.append(System.lineSeparator());
	                strLine = br.readLine();
	                System.out.println(strLine);
	            }
	             br.close();
	           }
	           catch(IOException ioe)
	           {
	            System.err.println("IOException: " + ioe.getMessage());
	           }
	        }
	  }



	
	
