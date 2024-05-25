import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Details2 {
	
	public static void main(String[] args) {
		
		List<Details> list = new ArrayList<>();
		
		list.add(new Details(1,1));
		
		File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/names.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already present");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		FileWriter fw = new FileWriter(file);
		while(true) {
			for(int str : list) {
				fw.write(str);
			}
		}
	}

}
