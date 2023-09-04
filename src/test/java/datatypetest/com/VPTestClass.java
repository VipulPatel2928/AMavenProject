package datatypetest.com;

public class VPTestClass {
    
	public static void main(String[] args) {
		int p = 123;
		
		System.out.println(p/10);
		System.out.println(p%10);
		
		String string = "$4,999.45";
		
		System.out.println(string.substring(1));
		System.out.println(string.replaceAll(",", "").substring(1));
		
	}

}
