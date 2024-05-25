package C;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the file name to save data: ");
        //String fileName = sc.nextLine();
        //BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/LOcal.txt" + fil));

        File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/LOcal.txt");
        

		File file2 = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/sorted-Local.txt");

        if(file.createNewFile()) {
        	System.out.println("File is created");
        }else {
        	System.out.println("File is not created");
        }
        
        FileWriter writer = new FileWriter(file);
        
        
        ArrayList<Student> students = new ArrayList<Student>();

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Student s1 = new Student(name, age, address, rollNo);
        students.add(s1);

        System.out.print("Do you want to add more students? (y/n): ");
        String choice = sc.nextLine();

        while(choice.equals("y")){
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Address: ");
            address = sc.nextLine();
            System.out.print("Roll No: ");
            rollNo = sc.nextInt();
            sc.nextLine();

            Student s = new Student(name, age, address, rollNo);
            students.add(s);

            System.out.print("Do you want to add more students? (y/n): " + "\n");
            choice = sc.nextLine();
        }

        Collections.sort(students);

        for(Student s : students){
            writer.write(s.toString());
            //writer.newLine();
            System.out.println(" " + " \n ");
        }

        writer.close();
        sc.close();

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
		}       System.out.println("Data saved successfully.");
    }
}