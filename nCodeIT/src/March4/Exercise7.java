package March4;

import java.io.File;

// Task7: Write a Java program to get file size in bytes, kb, mb. Use length() method of File and apply formaula to get the result in kb, mb

public class Exercise7 {

      public static void main(String[] args) 
      {
        File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/demo3.txt");
        if(file.exists())
        {
        System.out.println(filesize_in_Bytes(file));
        System.out.println(filesize_in_kiloBytes(file));
        System.out.println(filesize_in_megaBytes(file));
        }
        else 
        System.out.println("File doesn't exist");
         
    }
 
    private static String filesize_in_megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
    }
 
    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
    }
 
    private static String filesize_in_Bytes(File file) {
        return file.length()+" bytes";
    }
 }
 
