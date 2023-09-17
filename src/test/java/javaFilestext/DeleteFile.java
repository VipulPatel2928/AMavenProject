package javaFilestext;

import java.io.File;

public class DeleteFile {

	public static void deleteFile(String filePath) {
		File file = new File(filePath); 
		if(file.delete()) {
			System.out.println("File is deleted successfully");
		}
		else {
			System.out.println("File is not deleted successfully");
		}
	}
	
	public static void main(String[] args) {
		deleteFile("Temp/t.txt");

	}
}
