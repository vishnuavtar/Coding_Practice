package March4;

// Task8: Write a Java program to read contents from a file into byte array and handle any exceptions related to file

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exercise8 {


  public static void main(String a[]){       
        String file_name = "C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo3.txt";
        InputStream fins = null;
        try {
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } catch(Exception ex){
                 
            }
        }
    }
}

