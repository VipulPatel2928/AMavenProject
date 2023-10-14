package accessModifiers1;

public class AccessModifierClass1 {
	
	int var_default = 1;
	public int var_public = 10;
	private int var_private = 100;
	protected int var_protected = 1000;
	
	void display_Default() {
		System.out.println("Default");
	}
	
	public void display_public() {
		System.out.println("public");
	}
	
	private void display_private() {
		System.out.println("private");
	}
	
	protected void display_protected() {
		System.out.println("protected");
	}

	public static void main(String[] args) {
		AccessModifierClass1 objAccessModifierClass1 = new AccessModifierClass1();
		
		objAccessModifierClass1.display_Default();
		objAccessModifierClass1.display_private();
		objAccessModifierClass1.display_protected();
		objAccessModifierClass1.display_public();
		
		System.out.println(objAccessModifierClass1.var_default);
		System.out.println(objAccessModifierClass1.var_private);
		System.out.println(objAccessModifierClass1.var_protected);
		System.out.println(objAccessModifierClass1.var_public);
	}
}
