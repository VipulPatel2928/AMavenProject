package javaFilestext;

import java.io.File;

public class DirectoryFolderClass {
	
	public static void createDirectory(String directoryName) {
		String currentPathString = System.getProperty("user.dir");
		System.out.println("currentPathString :"+currentPathString);
		currentPathString = currentPathString + "/"+directoryName;
		System.out.println("currentPathString :"+currentPathString);
		//file or folder or Directory path
		File file = new File(currentPathString);
		if(file.mkdir()) {
		System.out.println("Directory is created, Successfully");	
		}
		else {
			System.out.println("Directory is not created");	
		}
	}

	public static void main(String[] args) {
		
		createDirectory("Temp2");
	}

}
