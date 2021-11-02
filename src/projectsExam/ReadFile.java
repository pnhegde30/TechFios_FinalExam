package projectsExam;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ReadFile {
	public static void main(String args[]) {
		
		doesFileExist();
		try {
			Path path = Paths.get("C:\\Users\\ncheg\\eclipse-workspace\\FinalExam\\docs\\TestDocument.docx");
			
			//call toFile() to get File object from path 
			File obj = path.toFile();
			Scanner myRead = new Scanner(obj);
			while (myRead.hasNextLine()) {
				String data = myRead.nextLine();
				System.out.println(data);
			}
			myRead.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error has occured");
			e.printStackTrace();
		}

		
	}
	
	public static void doesFileExist() {
		//create object of Path
		Path path = Paths.get("C:\\Users\\ncheg\\eclipse-workspace\\FinalExam\\docs\\TestDocument.docx");
				
		//call toFile() to get File object from path 
		File file = path.toFile();
				
		//print file details
		if(file.exists()) {
			System.out.println("File Name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Writeable: " + file.canWrite());
			System.out.println("Readable: " + file.canRead());
			System.out.println("File size in bytes: " + file.length());
			System.out.println("File exists!");
			}
		else {
			System.out.println("The file does not exist!");
			 }
	}
	
	
}
