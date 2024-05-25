package Exception;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Task3: Write a method readFile from a specific location(C:/Users/source.txt) and print the exception

public class Exception3 {

	public static void main(String args[]) {
			readFile();
		}

		private static void readFile() {
			try {
				String fileName = "C:/Users/Vishnu Avtar/Desktop/devfolder/t.txt";
				Path path = Paths.get(fileName);
				    //read file to byte array
				 byte[] bytes = Files.readAllBytes(path);
				 System.out.println("Read text file using Files class");
				    //read file to String list
				 List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
				 System.out.println(new String(bytes));
			} catch (IOException e) {
				System.out.println(e);
			}
			
		}
	}
	

