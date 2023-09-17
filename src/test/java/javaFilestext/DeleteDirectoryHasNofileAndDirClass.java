package javaFilestext;

import java.io.File;

public class DeleteDirectoryHasNofileAndDirClass {

	public static void deleteDirectoryHasNofileAndDirFunction(String filePath) {
		File file = new File(filePath); 
		if(file.delete()) {
			System.out.println("Directory/Folder is deleted successfully");
		}
		else {
			System.out.println("Directory/Folder not deleted successfully");
		}
	}
	
	public static void main(String[] args) {
		deleteDirectoryHasNofileAndDirFunction("Temp");

	}

}
