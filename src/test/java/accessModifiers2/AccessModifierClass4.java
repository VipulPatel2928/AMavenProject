package accessModifiers2;

import accessModifiers1.AccessModifierClass1;

public class AccessModifierClass4 extends AccessModifierClass1{

	
	//Inheritence is know a IS A Relationship
	public static void main(String[] args) {
		AccessModifierClass1 objAccessModifierClass1 = new AccessModifierClass1();
		// Remove the comment to see the compiler error
		// This ii Default modifier
		// objAccessModifierClass1.display_Default();
		// Remove the comment to see the compiler error
		// This ii private modifier
		// objAccessModifierClass1.display_private();
		// Remove the comment to see the compiler error
		// This ii protected modifier
		//objAccessModifierClass1.display_protected();
		objAccessModifierClass1.display_public();

		// Remove the comment to see the compiler error
		// This ii Default instance variable
		// System.out.println(objAccessModifierClass1.var_default);
		// Remove the comment to see the compiler error
		// This ii private instance variable
		// System.out.println(objAccessModifierClass1.var_private);
		// Remove the comment to see the compiler error
		// This ii protected instance variable
		//System.out.println(objAccessModifierClass1.var_protected);
		System.out.println(objAccessModifierClass1.var_public);
		
		
		AccessModifierClass4 objAccessModifierClass4 = new AccessModifierClass4();
		// Remove the comment to see the compiler error
		// This ii Default modifier
		//objAccessModifierClass4.display_Default();
		// Remove the comment to see the compiler error
		// This ii private modifier
		//objAccessModifierClass4.display_private();
		// Remove the comment to see the compiler error
		// This ii protected modifier
		objAccessModifierClass4.display_protected();
		objAccessModifierClass4.display_public();

		// Remove the comment to see the compiler error
		// This ii Default instance variable
		//System.out.println(AccessModifierClass4.var_default);
		// Remove the comment to see the compiler error
		// This ii private instance variable
		//System.out.println(AccessModifierClass4.var_private);
		// Remove the comment to see the compiler error
		// This ii protected instance variable
		System.out.println(objAccessModifierClass4.var_protected);
		System.out.println(objAccessModifierClass4.var_public);
	}
}
