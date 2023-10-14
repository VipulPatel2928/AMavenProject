package accessModifiers1;

public class AccessModifierClass2 {
	
	
	public static void main(String[] args) {
        AccessModifierClass1 objAccessModifierClass1 = new AccessModifierClass1();
		
		objAccessModifierClass1.display_Default();
		// Remove the comment to see  the compiler error
		// This ii private modifier
		//objAccessModifierClass1.display_private();
		objAccessModifierClass1.display_protected();
		objAccessModifierClass1.display_public();
		
		System.out.println(objAccessModifierClass1.var_default);
		// Remove the comment to see  the compiler error
		// This ii private instance variable
		//System.out.println(objAccessModifierClass1.var_private);
		System.out.println(objAccessModifierClass1.var_protected);
		System.out.println(objAccessModifierClass1.var_public);
	}
}
