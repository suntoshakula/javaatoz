package modifiers.accessmodifiers.examples.privateaccess;

class PrivateVariables {
	
	private double num=100;
	private int square(int a) {
		return a*a;
	}

}

public class PrivateModifier{
	public static void main(String[] args) {
		PrivateVariables obj = new PrivateVariables();
		/*
		System.out.println(obj.double);
		System.out.println(obj.squre(10));
		*/
	}
}

