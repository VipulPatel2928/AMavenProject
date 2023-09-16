package javaFilestext;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInToFileClass {

	public static void writeDataInToFile(String filePath, String data) throws IOException {
		FileWriter fileWriter = new FileWriter(filePath, true);
		fileWriter.write(data);
		fileWriter.write("\n");
		fileWriter.flush();
		fileWriter.close();
		System.out.println("Line is added into file");
	}
	
	public static void main(String[] args) throws IOException {
		writeDataInToFile("Temp/t.txt","We are learning Java");

	}

}
