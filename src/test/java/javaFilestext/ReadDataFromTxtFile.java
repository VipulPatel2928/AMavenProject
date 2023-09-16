package javaFilestext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTxtFile {

	public static String readDataFromTxtFile(String filePath, int readLineNo) throws FileNotFoundException {
		int lineNo = 1;
		String dataString ="";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			dataString =scanner.nextLine();
			if(lineNo==readLineNo) {
			System.out.println(dataString);
			break;
			}
			lineNo++;
			System.out.println("Line No :"+lineNo);
		}
		
		if(lineNo < readLineNo) {
			System.out.println("Line no is not available ");
			System.out.println("Total lines in the file are : "+lineNo);
		}
		return dataString;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		 readDataFromTxtFile("Temp/t.txt",300);
	}
}
