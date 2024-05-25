import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Copies;

public class AddressAnalyzer {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/property-addresses.csv");
	
		File file2 = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/property-addresses1111.csv");
		
		if(file2.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File is not created");
		}
		
		
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File is not created");
		}

		FileWriter fw = new FileWriter(file);

		List<String> list = new ArrayList<String>();
		list.add("[1],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[2],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[3],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[4],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[5],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[6],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[7],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[8],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[9],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");
		list.add("[10],[1],[AyyapaSociety],[Patna],[Bihar],[10]" + " \n ");

		for (String str10 : list) {
			fw.write(str10);
			
			Files.copy(Path.of("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/property-addresses.csv"), Path.of("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/property-addresses111.csv"));

		}
		
		
	
		// Files.copy(Path.of("C:/Users/Vishnu Avtar/Desktop/New
		// folder/Practice/src/File/property-addresses.csv"), Path.of("C:/Users/Vishnu
		// Avtar/Desktop/New folder/Practice/src/File/addresses-analysis.csv"));

		fw.close();

		FileReader r = new FileReader(file);
		int i;

		while ((i = r.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
