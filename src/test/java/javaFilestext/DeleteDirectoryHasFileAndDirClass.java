package javaFilestext;

import java.io.File;

public class DeleteDirectoryHasFileAndDirClass {

	public static void deleteDirectoryHasNofileAndDirFunction(File file) {
		File[] subFile = file.listFiles();
		
		System.out.println("Total files in folder : "+subFile.length);
		
		for (File file2 : subFile) {
			
			if(file2.isDirectory()) {
				File[] subOfSubFile = file2.listFiles();
				System.out.println("This is Derectory :"+file2.getName());
				System.out.println("Total files in folder : "+subOfSubFile.length);
				deleteDirectoryHasNofileAndDirFunction(file2);	
			}
			file2.delete();
		}
		if(file.delete()) {
			System.out.println("Directory/Folder is deleted successfully");
		}
		else {
			System.out.println("Directory/Folder not deleted successfully");
		}
	}
	
	public static void main(String[] args) {
		
		File objFile = new File(System.getProperty("user.dir")+"/"+"Temp2");
		deleteDirectoryHasNofileAndDirFunction(objFile);

	}

}
