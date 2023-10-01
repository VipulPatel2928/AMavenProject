package trycatchfinallypackage.com;

public class FinalizeMethodClass {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("We are on finalize method of FinalizeMethodClass statement 1");
		System.out.println("We are on finalize method of FinalizeMethodClass statement 2");
		super.finalize();
	}
	public static void main(String[] args) {
		FinalizeMethodClass finalizeMethodClass = new FinalizeMethodClass();
		
		try {
			finalizeMethodClass.finalize();
		} catch (Throwable e) {
			System.out.println(e);
		}
	}

}
