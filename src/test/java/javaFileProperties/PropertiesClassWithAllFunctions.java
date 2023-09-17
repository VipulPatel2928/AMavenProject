package javaFileProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesClassWithAllFunctions {
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
	
	public static void createFile(String dir, String fileName) throws IOException {
		String filePathString = System.getProperty("user.dir");
		filePathString = filePathString +"/"+dir+"/"+fileName;
		File file = new File(filePathString);
		if(file.createNewFile()) {
			System.out.println("File is created Successfully");
		}
		else {
			System.out.println("File is not created Successfully");
		}
	}
	
	// Properties file having data in key and value pair
	public static void writeInToPropertiesFile(String fileName,String key, String value) throws IOException {
		Properties properties = new Properties();
		File file = new File("PropertiesDir"+"/"+fileName);
		FileInputStream fileInputStream = new FileInputStream(file);
		properties.load(fileInputStream);
		FileOutputStream fileOutStream = new FileOutputStream(file);
		properties.setProperty(key, value);
		properties.store(fileOutStream, "");
	}
	
	// We need a key to retrive the value, if key is not exist then return will be "null"
	public static String readFromPropertiesFile(String fileName,String key) throws IOException {
		Properties properties = new Properties();
		File file = new File("PropertiesDir"+"/"+fileName);
		FileInputStream fileInputStream = new FileInputStream(file);
		properties.load(fileInputStream);
		String datavalueString = properties.getProperty(key);
		return datavalueString;
	}
	
	public static void main(String[] args) throws IOException {
		createDirectory("PropertiesDir");
		createFile("PropertiesDir", "p.properties");
		writeInToPropertiesFile("p.properties", "Key4", "Value4");
		String dataFromFileString =readFromPropertiesFile("p.properties", "Key2");
		System.out.println(dataFromFileString);
	}

}
