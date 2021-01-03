package modifiers.accessmodifiers.examples;

import modifiers.accessmodifiers.examples.publicaccess.Addition;

public class PublicMain {
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		System.out.println(a.addTwoNumbers(100, 1));
	}

}
