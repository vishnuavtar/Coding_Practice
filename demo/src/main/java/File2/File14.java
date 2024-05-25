package File2;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File14 {

	public static void main(String[] args) throws IOException {

		File file = new File("C://Users//Vishnu Avtar//Desktop//New folder//Practice//src//File//demo1.txt");

		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File is already present");
		}

		String str = "This is Bangalore";
		FileWriter fw = new FileWriter(file);

		for (int i = 0; i < str.length(); i++) {
			fw.write(str.charAt(i));
		}

		fw.close();

		int i = 0;
		FileReader r = new FileReader(file);

		while ((i = r.read()) != -1) {
			System.out.print((char) i);
		}

		Desktop d = Desktop.getDesktop();

		if (file.exists()) {
			d.open(file);
		}
	}

}
