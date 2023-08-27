
public class WhileDoWhile {

	public static void main(String[] args) {
		// Not indexing base
		String str = "java1";
		int i = 1;
		while (str.equals("java")) {
			if(i>10) {
				break;
			}
			i++;
			System.out.println("Condition Matched");
		}//end of while
		System.out.println("<--------------------------------------------------------------->");
		
		i = 1;
	  do {
		  if(i>10) {
				break;
			}
			i++;
			System.out.println("Condition Matched");
	} while (str.equals("java"));
	  System.out.println("<--------------------------------------------------------------->");
		
	}
}
