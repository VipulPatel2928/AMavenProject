package javaFilestext;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void createFile() throws IOException {
		String filePathString = System.getProperty("user.dir");
		filePathString = filePathString +"/"+"Temp"+"/"+"t1.txt";
		File file = new File(filePathString);
		if(file.createNewFile()) {
			System.out.println("File is created Successfully");
		}
		else {
			System.out.println("File is not created Successfully");
		}
	}

	public static void main(String[] args) throws IOException {
		createFile();

	}
}
