package March4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Task9: Write a Java program to read a file content line by line.

public class Excercise9 {

	
	    public static void main(String a[]){
	        BufferedReader br = null;
	        String strLine = "";
	        try {
	            br = new BufferedReader( new FileReader("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo3.txt"));
	            while( (strLine = br.readLine()) != null){
	                System.out.println(strLine);
	            }
	            br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
	}

