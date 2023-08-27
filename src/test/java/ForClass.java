
public class ForClass {

	public static void main(String[] args) {
		for (int i = 1; i <=10 ; i++) {
			System.out.println("Value of i :"+i);
		}
		System.out.println("<--------------------------------------------------------------->");
		for (int i = 1; i <=10 ; i=i+5) {
			System.out.println("Value of i :"+i);
		}
		System.out.println("<--------------------------------------------------------------->");
		// Use of Break , will terminate the for loop
		int flag = 7;
		for (int i = 1; i <= 10000; i++) {
			if(flag==i) {
				System.out.println("Your search match :"+i);
				break;
			}	
			System.out.println("Statement after if conditions :"+i);
		}
		System.out.println("<--------------------------------------------------------------->");
		// Use of Continue, Continue will move to the next iteration
		flag = 3;
		for (int i = 1; i <= 5; i++) {
			if(flag==i) {
				System.out.println("Your search match :"+i);
				continue;
			}	
			System.out.println("Statement after if conditions :"+i);
		}
		System.out.println("<--------------------------------------------------------------->");
		// Nested for loops
		// outer for loop 10 times execution and inner for loop 10 times execution, total iteration will be 10 * 10 = 100
		flag = 2;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=5; j++) {
				if(flag==j) {
					System.out.println("Your search match :"+j);
					break;
				}	
				System.out.println("Statement after if conditions :"+j);
			}//end of j
		} //end of i	
		System.out.println("<--------------------------------------------------------------->");
		
		
		String[] carString  = 
			   {"BMW",
				"Audi",
				"Benz",
				"Toyota"};
		
		for (int i = 0; i < carString.length; i++) {
			System.out.println("Car's Company Name :"+carString[i]);
		}
		System.out.println("<--------------------------------------------------------------->");
		
		for (String str : carString) {
			System.out.println("Car's Company Name :"+str);
		}
		
		System.out.println("<--------------------------------------------------------------->");
		//Initialization
		int i = 0;
		// Conditions
		for (; i < carString.length; ) {
			System.out.println("Value of i : "+i);
			//Increment 
			i++;
		}
		System.out.println("<--------------------------------------------------------------->");
		
		System.out.println("<--------------------------------------------------------------->");
		//Initialization
		i = carString.length-1;
		// Conditions
		for (; i >=0 ; ) {
			System.out.println("Value of i : "+i);
			System.out.println("Car's Company Name :"+carString[i]);
			//Decrement
			i--;
		}
		System.out.println("<--------------------------------------------------------------->");
	}//end of main function
}//end of main class
