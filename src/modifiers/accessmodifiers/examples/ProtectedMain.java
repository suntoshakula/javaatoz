package modifiers.accessmodifiers.examples;

import modifiers.accessmodifiers.examples.protectedaccess.Addition;

public class ProtectedMain extends Addition{
	
	public static void main(String args[] ) {
		
		ProtectedMain pm  = new ProtectedMain();
		Addition a = new Addition();
		System.out.println(pm.addTwoNumbers(10, 23));
		
		
	}

}
