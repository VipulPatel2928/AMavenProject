package IfForWhileDowhile;

import javax.imageio.event.IIOReadWarningListener;

public class IfClass {

	public static void main(String[] args) {
		//if
		//if-else
		//if-else-if ladder
		//nested if statement
		
		// if-else
		int age = 17;
		if(age>=18) {
			System.out.println("Person can Vote");}
		else {
			System.out.println("Person can't vote");}
		
		//If
		int flag = 1;
		if(flag==0) {
			System.out.println("Flag is zero , Statements Execution start !!!");
		}
		
		// Exam Result < 40 Fail , >=40 && <=50 Pass Class, >50 and <60 Second Class, >=60 and <70 First Class
		
		int examResult = 71;
		
		if(examResult < 40) {
			System.out.println("Failed");
		}
		else if (examResult >=40 && examResult <=50) {
			System.out.println("Pass");
		}
		else if (examResult >50 && examResult <60) {
			System.out.println("Second");
		}
		else if (examResult >=60 && examResult <=70) {
			System.out.println("First");
		}
		else {
			System.out.println("Distinction");
		}
		
		// if with or conditions
		
		String colourString = "fgfdgblack";
		
		if(colourString.equals("blue") || colourString.equals("black")) {
			System.out.println("Color is either blue or black");
		}
		else {
			System.out.println("Color is neither blue nor black");
		}
		
		// To vote conditions , Citizenship : indian age >=18
		String citizenship = "Indian";
		int age1 = 6;
		if(citizenship.equals("Indian") && age1 >=18) {
			System.out.println("Person can Vote");
		}
		else {
			System.out.println("Person cann't Vote");
		}
		
		// Nested if condition
		if(citizenship.equals("Indian")) {
			if(age1>=18) {
			System.out.println("Person can Vote");}
			else {
				System.out.println("Your age is not over or equal 18");
			}
		}
		else {
			System.out.println("Your are not indian Citizen");
		}
	}
}
