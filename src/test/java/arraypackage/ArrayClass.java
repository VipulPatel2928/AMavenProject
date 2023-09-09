package arraypackage;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		String[] carCompanyLiString = {"Maruti","TATA","Mahindra","BMW","Benz","Audi"};
		
		String[] colorLiString = {"Blue","Black","Green","Yellow","Red","White", "Pink"};
		
		System.out.println("Size of Array :"+carCompanyLiString.length);
		
		for(int i =0; i<carCompanyLiString.length;i++) {
			System.out.println("Array Element :"+i+" :"+carCompanyLiString[i]);
		}
		System.out.println("<-------------------------------------------------->");
		//ArrayIndexOutOfBoundsException , Index 8 out of bounds for length 6
		//Remove the comment to get the run time Exception
		//System.out.println("Array Element :"+carCompanyLiString[8]);
		
		for(int i =0; i<carCompanyLiString.length;i++) {
			carCompanyLiString[i] = colorLiString[i];
		}
		
		System.out.println("<-------------------------------------------------->");
		for(int i =0; i<carCompanyLiString.length;i++) {
			System.out.println("Array Element :"+i+" :"+carCompanyLiString[i]);
		}
		System.out.println("<-------------------------------------------------->");
		
		carCompanyLiString[0] = "Vipul";
		for(int i =0; i<carCompanyLiString.length;i++) {
			System.out.println("Array Element :"+i+" :"+carCompanyLiString[i]);
		}
		System.out.println("<-------------------------------------------------->");
		
		System.out.println(carCompanyLiString[5]);
		
		// Sorting the Array but only Ascending Order
		Arrays.sort(carCompanyLiString);
		
		for(int i =0; i<carCompanyLiString.length;i++) {
			System.out.println("Array Element :"+i+" :"+carCompanyLiString[i]);
		}
		System.out.println("<-------------------------------------------------->");
		
		for(int i =carCompanyLiString.length-1; i>0 ;i--) {
			System.out.println("Array Element :"+i+" :"+carCompanyLiString[i]);
		}
		System.out.println("<-------------------------------------------------->");
		
		int intArray[];
		int sizeOfArray = 10;
		
		intArray = new int[sizeOfArray];
		
		for(int i = 0;i<10; i++) {
			intArray[i] = i+1;
		}
		System.out.println("<-------------------------------------------------->");
		for(int i = 0;i<10; i++) {
			System.out.println(intArray[i]);
		}
		
		String[][] carCompanyLiString1 = {
				{"ALTO","ARENA","EECO","SWIFT"},
				{"INIGO","INDICA"},
				{"THAR"},
				{"B320","E520"},
				{"BENz1","BENZ2","BENZ3"},
				{"Q7","Q5", "Q2", "Q1"}
				};
		System.out.println("<-------------------------------------------------->");
		System.out.println(carCompanyLiString1.length);
		
		System.out.println(carCompanyLiString1[0][0]);
		System.out.println(carCompanyLiString1[1][0]);
		System.out.println(carCompanyLiString1[2][0]);
		System.out.println(carCompanyLiString1[3][0]);
		System.out.println(carCompanyLiString1[4][0]);
		System.out.println(carCompanyLiString1[5][0]);
		System.out.println("<-------------------------------------------------->");
		
		int column = 0;
		for(int i = 0; i < carCompanyLiString1.length;i++) {
			switch(i) {
			case 0 : column = 4; break;
			case 1 : column = 2; break;
			case 2 : column = 1; break;
			case 3 : column = 2; break;
			case 4 : column = 3; break;
			case 5 : column = 4; break;
			}
			
			for(int j = 0; j<column;j++) {
				System.out.println(carCompanyLiString1[i][j]);
			}
		}
	}
}
