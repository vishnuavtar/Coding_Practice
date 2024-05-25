import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class FileTask {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/names.txt");

		File file2 = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/sorted-names.txt");

		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File is already present");
		}

		FileWriter fw = new FileWriter(file);

		List<String> list = new ArrayList<String>();
		list.add("Patna" + "\n");
		list.add("Hyderabad" + "\n");
		list.add("Bihar" + "\n");
		list.add("Bihar" + "\n");
		list.add("Bihar2" + "\n");
		list.add("Patna1" + "\n");
		list.add("Hyderabad1" + "\n");
		list.add("Bihar1" + "\n");
		list.add("Bihar4" + "\n");
		list.add("Bihar2" + "\n");

//		HashSet<String> set = new HashSet<String>(list);
//		TreeSet<String> tree = new TreeSet<String>(set);

		Collections.sort(list);
		System.out.println(list);

		for (String str5 : list) {
			System.out.println(str5);
			fw.write(str5);

		}

		fw.close();

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutStream = null;

		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			fileOutStream = new FileOutputStream(file2);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			System.out.print(fileInputStream.available());
		} catch (IOException e) {

			e.printStackTrace();
		}

		int i = 0;

		try {
			while ((i = fileInputStream.read()) != -1) {
				fileOutStream.write(i);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {
			if (fileInputStream != null) {
				try {
					fileOutStream.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			if (fileOutStream != null) {
				try {
					fileOutStream.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

	}

}
