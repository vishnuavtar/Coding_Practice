package Polymorphism;

import java.awt.Desktop;

import java.io.*;

public class File1 {
	
	public static void main(String[] args) throws IOException {
		
		File ff = new File("C:/Users/Vishnu Avtar/Desktop/devfolder/demo1.txt");
		
		if(ff.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File is alredy present");
		}
		
		FileWriter fw = new FileWriter(ff);
		String str = "This is a car";
		
		for(int i = 0; i<str.length(); i++) {
			fw.write(str.charAt(i));
		}
		
		fw.close();
		
		
		int i;
		
		FileReader r = new FileReader(ff);
		
		while((i=r.read())!=-1) {
			System.out.print((char)i);
		}
		
		Desktop dd = Desktop.getDesktop();
		if(ff.exists()) {
			dd.open(ff);
		}
		
	}

}
