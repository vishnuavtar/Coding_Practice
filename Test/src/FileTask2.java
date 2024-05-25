import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTask2 {
	
	public static void main(String[] args) {
		
		File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/names.txt");
		File file2 = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/sorted-names.txt");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileOutStream = new FileOutputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.print(fileInputStream.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 0;
		
		try {
			while((i=fileInputStream.read())!=-1) {
				fileOutStream.write(i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		finally {
			if(fileInputStream!=null) {
				try {
					fileOutStream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(fileOutStream!=null) {
				try {
					fileOutStream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

}
