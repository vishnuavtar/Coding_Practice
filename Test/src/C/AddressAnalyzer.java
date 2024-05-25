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

public class AddressAnalyzer {
    public static void main(String[] args) throws IOException {
       
    	Scanner sc = new Scanner(System.in);
       
        File file = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/LOcal.txt");
        

		File file2 = new File("C:/Users/Vishnu Avtar/Desktop/New folder/Practice/src/File/sorted-Local.txt");

        if(file.createNewFile()) {
        	System.out.println("File is created");
        }else {
        	System.out.println("File is not created");
        }
        
        FileWriter writer = new FileWriter(file);
        
        
        ArrayList<Details> detail = new ArrayList<Details>();

        System.out.println("Enter  details:");
        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();
        
        System.out.print("Street Number: ");
        int StreetNumber = sc.nextInt();
        //sc.nextLine();
        
        System.out.print("Locality: ");
        String Locality = sc.nextLine();
        
        System.out.print("city: ");       //state , pin
         String city = sc.nextLine();
       // sc.nextLine();
         
         System.out.print("State: ");
         String state = sc.nextLine();
         
         System.out.print("Pin Number: ");
         int pincode = sc.nextInt();

        Details d1 = new Details(houseNumber, StreetNumber,Locality,city,state,pincode);
        detail.add(d1);

        System.out.print("Do you want to add more students? (y/n): ");
        String choice = sc.nextLine();

        while(choice.equals("y")){
        	
        	 System.out.print("Enter house number: ");
              houseNumber = sc.nextInt();
             
             System.out.print("Street Number: ");
              StreetNumber = sc.nextInt();
             sc.nextLine();
             
             System.out.print("Locality: ");
              Locality = sc.nextLine();
             
             System.out.print("city: ");       //state , pin
              city = sc.nextLine();
             sc.nextLine();
              
              System.out.print("State: ");
               state = sc.nextLine();
              
              System.out.print("Pin Number: ");
               pincode = sc.nextInt();

             Details d11 = new Details(houseNumber, StreetNumber,Locality,city,state,pincode);
             detail.add(d11);

            System.out.print("Do you want to add another Details? (y/n): " + "\n");
            choice = sc.nextLine();
        }

        Collections.sort(detail);

        for(Details detailit : detail){
            writer.write(detailit.toString());
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