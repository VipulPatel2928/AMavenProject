package arraypackage;

import java.sql.Driver;
import java.util.List;

public class JavaArraysClass {
	public static void main(String[] args) {
		//Single Dimensional Array
		String countryName1 = "Inidia";
		String countryName2 = "Pakistan";
		String countryName3 = "Nepal";
		
		String[] countryName = {"Inidia","Pakistan","Nepal"};
		int[]  gradeValues = {40,50,60,70};
		
		System.out.println("Size of the Country Name : "+countryName.length);
		System.out.println("Size of the gradeValues : "+gradeValues.length);
		
		System.out.println("1st Element of CountryName :"+countryName[0]);
		System.out.println("2nd Element of CountryName :"+countryName[1]);
		System.out.println("3rd Element of CountryName :"+countryName[2]);
		
		// Runtime Exception , Unchecked Exception
		//Index 3 out of bounds for length 3, User will get the Exception
		// Remove the comment ot check gthe run time EXception
		//System.out.println("4th Element of CountryName :"+countryName[3]);
		
		for (int i : gradeValues) {
			System.out.println(i);
		}
	
		//Multidimensional Array
		
		String[][] countryNameMulti = {
				{"Inidia1","Inidia2","Inidia3"},
				{"Pakistan1","Pakistan2","Pakistan3" },
				{"Nepal1","Nepal2","Nepal3"},	
		};
		
		System.out.println(countryNameMulti[0][0]);
		System.out.println(countryNameMulti[0][1]);
		System.out.println(countryNameMulti[0][2]);
		
		System.out.println(countryNameMulti[1][0]);
		System.out.println(countryNameMulti[1][1]);
		System.out.println(countryNameMulti[1][2]);
		
		System.out.println(countryNameMulti[2][0]);
		System.out.println(countryNameMulti[2][1]);
		System.out.println(countryNameMulti[2][2]);
	}
}
